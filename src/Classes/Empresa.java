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
public class Empresa {

    private String CNPJ;
    private float Saldo;
    private float ValorPagar;
    private String RazaoSocial;
    
    public Empresa()
    {
        CNPJ = "";
        Saldo = 0;
        ValorPagar = 0;
        RazaoSocial = "";
    }

    public boolean Salvar() {
        if(CNPJ == "" || RazaoSocial == "") return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        DateTime Dt = new DateTime();

        ConsultaSQL = "INSERT INTO empresa (CNPJ,RazaoSocial) values (?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);
            Query1.setString(2, RazaoSocial);
            Query1.execute();
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean Pesquisa() {
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Empresa";

        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            rs = Query1.executeQuery();

            if (rs.next()) {
                Saldo = rs.getFloat("Saldo");
                RazaoSocial = rs.getString("RazaoSocial");
                CNPJ = rs.getString("CNPJ");
                ValorPagar = rs.getFloat("ValorPagar");
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean EditarRazao(String CNPJ) {
        if(CNPJ.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Empresa SET RazaoSocial = ? WHERE CNPJ = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, RazaoSocial);
            Query1.setString(2, CNPJ);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    public boolean EditarSaldo() {
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Empresa SET Saldo = ? WHERE CNPJ = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setFloat(1, Saldo);
            Query1.setString(2, CNPJ);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
        public boolean EditarDebito(String CNPJ, float Valor) {
        if(CNPJ.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ResultSet rs;
        try {
            ConsultaSQL = "SELECT *FROM empresa WHERE CNPJ = ?";

            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);
            rs = Query1.executeQuery();

            if (rs.next()) {
                ValorPagar = rs.getFloat("ValorPagar");
            }
            ConsultaSQL = "UPDATE Empresa SET ValorPagar = ? WHERE CNPJ = ? ";
            PreparedStatement Query2 = c.prepareStatement(ConsultaSQL);
            Query2.setFloat(1, ValorPagar + Valor);
            Query2.setString(2, CNPJ);
            Query2.execute();

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

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public float getValorPagar() {
        return ValorPagar;
    }

    public void setValorPagar(float ValorPagar) {
        this.ValorPagar = ValorPagar;
    }
    
}
