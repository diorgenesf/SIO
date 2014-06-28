/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Marcos Vinicius
 */
public class ContasReceber extends Contas {

    private int CodConta;
    private int CodParcela;
    private float ValorCompra;
    private String Data;
    private String DataPrevista;
    private String DataPag;
    private String CPF;
    private int QtdParcelas;
    private boolean Status;
    private float ValorParcela;
    private int ParcelaPendentes;

    public ContasReceber() {
        CodConta = 0;
        CodParcela = 0;
        ValorCompra = 0;
        Data = "";
        DataPrevista = "";
        DataPag = "";
        CPF = "";
        QtdParcelas = 0;
        Status = false;
        ValorParcela = 0;
        ParcelaPendentes = 0;
    }

    public boolean Salvar() {
        if(CPF.isEmpty() || ValorCompra == 0 || QtdParcelas==0) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";
        DateTime Dt = new DateTime();

        ConsultaSQL = "INSERT INTO ContaReceber (CPFCliente,Valor,Data, QtdParcelas) values ( ?, ?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            Query1.setFloat(2, ValorCompra);
            Query1.setString(3, Dt.SetDataSql(Data));
            Query1.setInt(4, QtdParcelas);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return true;
    }

    public boolean Editar(String CPF) {
        if(CPF.isEmpty()) return false;

        return true;
    }

    public boolean ExisteCod() {
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";

        ConsultaSQL = "SELECT max(CodConta) as Maior FROM ContaReceber";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            rs = Query1.executeQuery();

            if (rs.next()) {
                CodConta = rs.getInt("Maior");
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean SalvarPacelas() {
        if(CodParcela ==0 || CodConta == 0 || ValorParcela==0) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO ParcelasCR (CodParcela,CodContaReceber,ValorParcela,dataPrevista, Status) values (?, ?, ?, ?, ?)";
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodParcela);
            Query1.setInt(2, CodConta);
            Query1.setFloat(3, ValorParcela);
            Query1.setString(4, Dt.SetDataSql(DataPrevista));
            Query1.setBoolean(5, Status);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return true;
    }

    public boolean BuscaParcela(int C, int CP) {
        if(C==0 || CP ==0) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        ResultSet rs;

        String ConsultaSQL = "";

        DateTime Dt = new DateTime();
        try {
            // verificar se existe uma conta anterior sem pagar
            if (CP > 1) {
                ConsultaSQL = "SELECT Status FROM ParcelasCR WHERE"
                        + " CodContaReceber = ? and CodParcela = ?";

                PreparedStatement Query0 = c.prepareStatement(ConsultaSQL);
                Query0.setInt(1, C);
                Query0.setInt(2, CP - 1);
                rs = Query0.executeQuery();

                if (rs.next()) {
                    Status = rs.getBoolean("Status");
                    if (!Status) {
                        return false;
                    }
                }
            }
            //Buscar dados da parcela
            ConsultaSQL = "SELECT P.ValorParcela, P.DataPrevista, P.Status, C.QtdParcelas, C.CPFCliente"
                    + " FROM ParcelasCR P join  ContaReceber C on C.CodConta = P.CodContaReceber WHERE"
                    + " CodContaReceber = ? and CodParcela = ?";

            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, C);
            Query1.setInt(2, CP);
            rs = Query1.executeQuery();

            if (rs.next()) {
                ValorParcela = rs.getFloat("ValorParcela");
                DataPrevista = "" + Dt.GetDataSql(rs.getString("DataPrevista"));
                QtdParcelas = rs.getInt("QtdParcelas");
                CPF = rs.getString("CPFCliente");
                Status = rs.getBoolean("Status");
            }
            // quantidade de parcelas a pagar
            ConsultaSQL = "SELECT Count(Status) as quant FROM ParcelasCR WHERE"
                    + " Status = 0 and CodContaReceber = ? ";
            PreparedStatement Query2 = c.prepareStatement(ConsultaSQL);
            Query2.setInt(1, C);
            rs = Query2.executeQuery();

            if (rs.next()) {
                ParcelaPendentes = rs.getInt("quant");
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Listar as percelas em pendencias
     */
    public boolean MostrarParcela(int CodC) {
        if(CodC==0) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";

        ConsultaSQL = "SELECT ValorParcela, DataPrevista FROM ParcelasCR WHERE CodContaReceber = ? and Status = ?";
        ResultSet rs;
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodC);
            Query1.setBoolean(2, false);
            rs = Query1.executeQuery();

            if (rs.next()) {
                ValorParcela = rs.getFloat("ValorParcela");
                DataPrevista = "" + Dt.GetDataSql(rs.getString("DataPrevista"));
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean BuscaParcela(int CodC, boolean STT) {
        if(CodC == 0) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";

        ConsultaSQL = "Select CodParcela, valorParcela, dataPrevista from ParcelasCR Where CodContaReceber = ? and status = ?";
        //ConsultaSQL = "SELECT ValorParcela, Dataprevista, Status FROM Parcelas WHERE CodContaReceber = ? and CodParcelas = ?";
        ResultSet rs;
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodC);
            Query1.setBoolean(2, STT);
            rs = Query1.executeQuery();

            while (rs.next()) {
                CodParcela = rs.getInt("CodParcela");
                ValorParcela = rs.getFloat("ValorParcela");
                DataPrevista = "" + Dt.GetDataSql(rs.getString("DataPrevista"));
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PagarParcelas(int C, int CP) {
        if(C == 0 || CP ==0 ) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE ParcelasCR SET  Status = true, DataPag = ? WHERE CodContaReceber = ? and CodParcela = ?";

        try {
            DateTime Dt = new DateTime();
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            DataPag = Dt.GetDateString();
            Query1.setString(1, Dt.SetDataSql(DataPag));
            Query1.setInt(2, C);
            Query1.setInt(3, CP);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public int getCodParcela() {
        return CodParcela;
    }

    public void setCodParcela(int CodParcela) {
        this.CodParcela = CodParcela;
    }

    public int getCodConta() {
        return CodConta;
    }

    public void setCodConta(int CodConta) {
        this.CodConta = CodConta;
    }

    public float getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(float ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getQtdParcelas() {
        return QtdParcelas;
    }

    public void setQtdParcelas(int QtdParcelas) {
        this.QtdParcelas = QtdParcelas;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public float getValorParcela() {
        return ValorParcela;
    }

    public void setValorParcela(float ValorParcela) {
        this.ValorParcela = ValorParcela;
    }

    public String getDataPrevista() {
        return DataPrevista;
    }

    public void setDataPrevista(String DataPrevista) {
        this.DataPrevista = DataPrevista;
    }

    public String getDataPag() {
        return DataPag;
    }

    public void setDataPag(String DataPag) {
        this.DataPag = DataPag;
    }

    public int getParcelaPendentes() {
        return ParcelaPendentes;
    }

    public void setParcelaPendentes(int ParcelaPendentes) {
        this.ParcelaPendentes = ParcelaPendentes;
    }
}
