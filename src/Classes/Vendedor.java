/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author Marcos Vinicius
 */
public class Vendedor {

    private Endereco E;
    private int CodVendedor;
    private String Nome;
    private float Salario;
    private String Email;
    private String Data;
    
    public Vendedor()
    {
        CodVendedor = 0;
        E = null;
        Nome = "";
        Salario = 0;
        Email = "";
        Data = "";
    }

    public boolean Salvar() {
        if(CodVendedor==0 || Nome.isEmpty() || Salario == 0 || Email.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO Vendedor (CodVendedor, Nome, Datanas, Salario, Email) values (?, ?, ?, ?, ?)";
        
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodVendedor);
            Query1.setString(2, Nome);
            Query1.setString(3,Dt.SetDataSql(Data));
            Query1.setFloat(4, Salario);
            Query1.setString(5, Email);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
     public boolean EditarVendedor(int Cod) {
        if(Cod==0) return false;
        if(Nome.isEmpty() || Email.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Vendedor SET  Nome = ?, Datanas = ?, Email = ? WHERE CodVendedor = ?";
        DateTime Dt = new DateTime();
        
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, Nome);
            Query1.setString(2, Dt.SetDataSql(Data));
            Query1.setString(3, Email);
            Query1.setInt(4, Cod);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean ExcluirVendedor(int Cod) {
        if(Cod==0) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "DELETE from vendedor WHERE CodVendedor = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, Cod);
            Query1.execute();
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public static boolean carregaTabelaVendedor(JTable jTableMedida) {
        if(jTableMedida == null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Vendedor V join Telefone T on V.CodVendedor = T.CodVendedor order by Nome";
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
                dtm.addRow(new Object[]{rs.getString("CodVendedor"), rs.getString("Nome"), 
                    Dt.GetDataSql(rs.getString("Datanas")),rs.getFloat("Salario"),rs.getString("DDD"),
                    rs.getString("Numero"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean PesquisaVendedor(int Cod) {
        if(Cod==0) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Vendedor where CodVendedor = ?";
        ResultSet rs;
        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, Cod);
            rs = Query1.executeQuery();
            if (rs.next()) {
                Nome = rs.getString("Nome");
                CodVendedor = rs.getInt("CodVendedor");
                Email = rs.getString("Email");
                Salario = rs.getFloat("Salario");
                Data = ""+Dt.GetDataSql(rs.getString("Datanas"));
                return true;
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }

    public boolean PesquisaNome(String N, JTable Tabela) {
        if(N.isEmpty() || Tabela == null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM vendedor V join Telefone T on V.CodVendedor = T.CodVendedor where Nome like ?";
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
                
                dtm.addRow(new Object[]{rs.getString("CodVendedor"), rs.getString("Nome"), 
                    Dt.GetDataSql(rs.getString("Datanas")),rs.getFloat("Salario"),rs.getString("DDD"),
                    rs.getString("Numero"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean pesquisaCod(String CPF, JTable Tabela) {
        if(CPF.isEmpty() || Tabela==null) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Vendedor V join Telefone T on V.CodVendedor = T.CodVendedor where V.Codvendedor = ?";
        ResultSet rs;
        DateTime Dt = new DateTime();
        
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            dtm.setNumRows(0);
            if (rs.next()) {
                
                dtm.addRow(new Object[]{rs.getString("CodVendedor"), rs.getString("Nome"), 
                    Dt.GetDataSql(rs.getString("Datanas")),rs.getFloat("Salario"),rs.getString("DDD"),
                    rs.getString("Numero"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public int getCodVendedor() {
        return CodVendedor;
    }

    public void setCodVendedor(int CodVendedor) {
        this.CodVendedor = CodVendedor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    
    
}
