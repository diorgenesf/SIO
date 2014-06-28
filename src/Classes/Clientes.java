/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;

public class Clientes {

    private String Nome;
    private String CPF;
    private Float ValorDevido;
    private String Email;
    private String Data;
    
    public Clientes()
    {
        Nome="";
        CPF="";
        ValorDevido = null;
        Email="";
        Data="";
    }
    
    public boolean Salvar() {
        if(CPF.isEmpty() || Nome.isEmpty() || Email.isEmpty()) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";
        DateTime Dt = new DateTime();

        ConsultaSQL = "INSERT INTO Cliente (CPF,Nome,ValorDevido,Email,Datanas) values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            Query1.setString(2, Nome);
            Query1.setFloat(3, 0);
            Query1.setString(4, Email);
            Query1.setString(5, Dt.SetDataSql(Data));
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean EditarCliente(String CPF) {
        if(CPF.isEmpty()) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Cliente SET  Nome = ?, Datanas = ?, Email = ? WHERE CPF = ?";
        DateTime Dt = new DateTime();

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, Nome);
            Query1.setString(2, Dt.SetDataSql(Data));
            Query1.setString(3, Email);
            Query1.setString(4, CPF);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean EditarDebito(String CPF, float Valor) {
        if(CPF.isEmpty()) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";
        ResultSet rs;
        try {
            ConsultaSQL = "SELECT *FROM Cliente where CPF = ?";

            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            rs = Query1.executeQuery();

            if (rs.next()) {
                ValorDevido = rs.getFloat("ValorDevido");
            }
            ConsultaSQL = "UPDATE Cliente SET ValorDevido = ? WHERE CPF = ? ";
            PreparedStatement Query2 = c.prepareStatement(ConsultaSQL);
            Query2.setFloat(1, ValorDevido + Valor);
            Query2.setString(2, CPF);
            Query2.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean ExcluirCliente(String CPF) {
        if(CPF.isEmpty()) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "DELETE from Cliente WHERE CPF = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            Query1.execute();
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean carregaTabelaCliente(JTable jTableMedida) {
        if(jTableMedida == null) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";
        String ConsultaSQL2 = "";
        ConsultaSQL = "SELECT * FROM Cliente C join Telefone T on  C.CPF = T.CPFCliente order by Nome";
        ResultSet rs;
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTableMedida.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("CPF"), rs.getString("Nome"),
                    Dt.GetDataSql(rs.getString("Datanas")), rs.getFloat("ValorDevido"),
                    rs.getString("DDD"), rs.getString("Numero"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean pesquisa(String CPF) {
        if(CPF.isEmpty()) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Cliente where CPF = ?";
        ResultSet rs;
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            rs = Query1.executeQuery();
            if (rs.next()) {
                Nome = rs.getString("Nome");
                this.CPF = rs.getString("CPF");
                Email = rs.getString("email");
                ValorDevido = rs.getFloat("ValorDevido");
                Data = "" + Dt.GetDataSql(rs.getString("Datanas"));
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaNome(String N, JTable Tabela) {
        if(N.isEmpty() || Tabela==null) return false;
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Cliente C join Telefone T on C.CPF = T.CPFCliente where Nome like ?";
        ResultSet rs;
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, "%" + N + "%");
            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }

            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("CPF"), rs.getString("Nome"),
                    Dt.GetDataSql(rs.getString("Datanas")), rs.getFloat("ValorDevido"),
                    rs.getString("DDD"), rs.getString("Numero"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean pesquisaCPF(String CPF, JTable Tabela) {
        if(CPF.isEmpty() || Tabela == null) return false;
        
        Connection c = null;
        try {
            c = clsDataBase.getconexao();
        } catch (Exception e) {
            System.out.println("Erro na classe de banco de dados");
        }

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Cliente C join Telefone T on C.CPF = T.CPFCliente where CPF = ?";
        ResultSet rs;
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            dtm.setNumRows(0);
            if (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("CPF"), rs.getString("Nome"),
                    Dt.GetDataSql(rs.getString("Datanas")), rs.getFloat("ValorDevido"),
                    rs.getString("DDD"), rs.getString("Numero"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        if(Nome.isEmpty()) return;
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        
        this.CPF = CPF;
    }

    public Float getValorDevido() {
        return ValorDevido;
    }

    public void setValorDevido(Float ValorDevido) {
        if(ValorDevido == null) return;
        this.ValorDevido = ValorDevido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.isEmpty()) return;
        this.Email = Email;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        if(Data.isEmpty()) return;
        this.Data = Data;
    }
}
