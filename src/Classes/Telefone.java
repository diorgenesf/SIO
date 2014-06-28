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
public class Telefone {

    private String CNPJFornecedor;
    private int CodVendedor;
    private String CPFCliente;
    private String DDD;
    private String NTel;
    
    public Telefone()
    {
        CNPJFornecedor = "";
        CodVendedor = 0;
        CPFCliente = "";
        DDD = "";
        NTel = "";
    }

    public boolean SalvarCliente() {
        if(CPFCliente.isEmpty() || DDD.isEmpty() || NTel.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO Telefone (CPFCliente,DDD,Numero) values (?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPFCliente);
            Query1.setString(2, DDD);
            Query1.setString(3, NTel);

            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean EditarCliente() {
        if(CPFCliente.isEmpty() || DDD.isEmpty() || NTel.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Telefone SET  DDD = ?, Numero = ? WHERE CPFCliente = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, DDD);
            Query1.setString(2, NTel);
            Query1.setString(3, CPFCliente);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean SalvarFornecedor() {
        if(CNPJFornecedor.isEmpty() || DDD.isEmpty() || NTel.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO Telefone (CNPJFornecedor,DDD,Numero) values (?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJFornecedor);
            Query1.setString(2, DDD);
            Query1.setString(3, NTel);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean EditarFornecedor() {
        if(CNPJFornecedor.isEmpty() || DDD.isEmpty() || NTel.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Telefone SET  DDD = ?, Numero = ? WHERE CNPJfornecedor = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, DDD);
            Query1.setString(2, NTel);
            Query1.setString(3, CNPJFornecedor);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean SalvarVendedor() {
        if(CodVendedor==0 || DDD.isEmpty() || NTel.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO Telefone (CodVendedor,DDD,Numero) values (?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodVendedor);
            Query1.setString(2, DDD);
            Query1.setString(3, NTel);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean EditarVendedor() {
        if(CodVendedor==0 || DDD.isEmpty() || NTel.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Telefone SET  DDD = ?, Numero = ? WHERE Codvendedor = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, DDD);
            Query1.setString(2, NTel);
            Query1.setInt(3, CodVendedor);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaCliente(String CPF) {
        if(CPF.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Telefone where CPFCliente = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            rs = Query1.executeQuery();
            if (rs.next()) {
                DDD = rs.getString("DDD");
                NTel = rs.getString("Numero");
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
        ConsultaSQL = "SELECT * FROM Telefone where CodVendedor = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, Cod);
            rs = Query1.executeQuery();
            if (rs.next()) {
                DDD = rs.getString("DDD");
                NTel=  rs.getString("Numero");
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaFornecedor(String CNPJ) {
        if(CNPJ.isEmpty()) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Telefone where CNPJFornecedor = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);
            rs = Query1.executeQuery();
            if (rs.next()) {
                DDD = rs.getString("DDD");
                NTel = rs.getString("Numero");
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public String getCNPJFornecedor() {
        return CNPJFornecedor;
    }

    public void setCNPJFornecedor(String CNPJFornecedor) {
        this.CNPJFornecedor = CNPJFornecedor;
    }

    public int getCodVendedor() {
        return CodVendedor;
    }

    public void setCodVendedor(int CodVendedor) {
        this.CodVendedor = CodVendedor;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNTel() {
        return NTel;
    }

    public void setNTel(String NTel) {
        this.NTel = NTel;
    }
    
}
