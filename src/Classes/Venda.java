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
public class Venda {

    private int CodVenda;
    private String CPFClinte;
    private int CodVendedor;
    private String DataVenda;
    
    public Venda()
    {
        CodVenda = 0;
        CPFClinte = "";
        CodVendedor = 0;
        DataVenda = "";
    }

    public boolean Salvar() {
        if(CPFClinte.isEmpty() || CodVendedor==0) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO venda (CPFCliente,CodVendedor, DataVenda) values (?, ?, ?)";

        DateTime Dt = new DateTime();
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            //Codigo venda é auto Incrementavel;
            Query1.setString(1, CPFClinte);
            Query1.setInt(2, CodVendedor);
            DataVenda = Dt.GetDateString();
            Query1.setString(3, Dt.SetDataSql(DataVenda));

            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean ExisteCod() {
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "SELECT max(CodVenda) as Maior FROM venda";

        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            rs = Query1.executeQuery();

            if (rs.next()) {
                CodVenda = rs.getInt("Maior");

            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaData(String Data, JTable Tabela) {
        if(Data.isEmpty() || Tabela == null) return false;
        
        boolean T = false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "SELECT V.CodVenda, C.nome, T.Nome, V.DataVenda from ((venda V join Cliente C on"
                + " V.cpfCliente = C.CPf) join Vendedor T on V.CodVendedor = T.CodVendedor) WHERE datavenda = ?";

        ResultSet rs;
        try {
            DateTime Dt = new DateTime();
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, Dt.SetDataSql(Data));
            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {
                T = true;
                dtm.addRow(new Object[]{rs.getInt("CodVenda"),Dt.GetDataSql(rs.getString("DataVenda")),
                    rs.getString("C.Nome"), rs.getString("T.Nome")});
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return T;
    }
    
    public boolean PesquisaEntreData(String Data1,String Data2, JTable Tabela) {
        if(Data1.isEmpty() || Data2.isEmpty() || Tabela == null) return false;
        boolean T = false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "SELECT V.CodVenda, C.nome, T.Nome, V.DataVenda from ((venda V join Cliente C on"
                + " V.cpfCliente = C.CPf) join Vendedor T on V.CodVendedor = T.CodVendedor) WHERE datavenda >= ?"
                + " and DataVenda <= ?";

        ResultSet rs;
        try {
            DateTime Dt = new DateTime();
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, Dt.SetDataSql(Data1));
            Query1.setString(2, Dt.SetDataSql(Data2));
            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {
                T = true;
                dtm.addRow(new Object[]{rs.getInt("CodVenda"),Dt.GetDataSql(rs.getString("DataVenda")),
                    rs.getString("C.Nome"), rs.getString("T.Nome")});
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return T;
    }

    public String getCPFClinte() {
        return CPFClinte;
    }

    public void setCPFClinte(String CPFClinte) {
        this.CPFClinte = CPFClinte;
    }

    public int getCodVendedor() {
        return CodVendedor;
    }

    public void setCodVendedor(int CodVendedor) {
        this.CodVendedor = CodVendedor;
    }

    public int getCodVenda() {
        return CodVenda;
    }
}
