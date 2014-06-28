/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.clsDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author Diorgenes
 */
public class Fornecedor {

    private String CNPJ;
    private String RazaoSocial;
    private String Email;
    
    public Fornecedor()
    {
        CNPJ = "";
        RazaoSocial = "";
        Email = "";
    }
    public boolean IsThisSet()
    {
        if(CNPJ.isEmpty() || RazaoSocial.isEmpty() || Email.isEmpty()) return false;
        else return true;
    }

    public boolean Excluir() {
        if(!IsThisSet()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "DELETE from Fornecedor WHERE CNPJ = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);
            Query1.execute();
            //c.commit();
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean carregaTabela(JTable Tabela) {
        if(Tabela==null) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM fornecedor order by RazaoSocial";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);

            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("CNPJ"), rs.getString("RazaoSocial"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaTabelaRazao(JTable Tabela) {
        if(!IsThisSet()) return false;
        if(Tabela == null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM fornecedor WHERE RazaoSocial LIKE ? order by RazaoSocial";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, RazaoSocial);

            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("CNPJ"), rs.getString("RazaoSocial"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaTabelaCNPJ(JTable Tabela) {
        if(!IsThisSet()) return false;
        if(Tabela == null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM fornecedor WHERE CNPJ = ? order by RazaoSocial";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);

            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("CNPJ"), rs.getString("RazaoSocial"), rs.getString("Email")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaPorRazao() {
        if(!IsThisSet()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM fornecedor WHERE RazaoSocial = ?";
        ResultSet rs;

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, RazaoSocial);

            rs = Query1.executeQuery();
            if (rs.next()) {

                CNPJ = rs.getString("CNPJ");
                Email = rs.getString("Email");

            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaPorCNPJ() {
        if(!IsThisSet()) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM fornecedor WHERE CNPJ = ?";
        ResultSet rs;

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);

            rs = Query1.executeQuery();
            if (rs.next()) {
                RazaoSocial = rs.getString("RazaoSocial");
                Email = rs.getString("Email");
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean carregaCombo(javax.swing.JComboBox combo) {
        if(combo == null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM fornecedor ORDER BY RazaoSocial";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            rs = Query1.executeQuery();

            while ((rs.next())) {
                combo.addItem(rs.getString("RazaoSocial"));
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean Alterar() {
        if(!IsThisSet()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "UPDATE fornecedor SET RazaoSocial = ?, Email = ?"
                + " WHERE CNPJ = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, RazaoSocial);
            Query1.setString(2, Email);
            Query1.setString(3, CNPJ);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean Inserir() {
        if(!IsThisSet()) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO fornecedor (CNPJ,RazaoSocial,Email) values (?,?,?)";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);
            Query1.setString(2, RazaoSocial);
            Query1.setString(3, Email);

            Query1.execute();
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
