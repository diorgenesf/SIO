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
public class Endereco {

    private String CNPJFornecedor;
    private int CodVendedor;
    private String CPFCliente;
    private String Rua;
    private int Numero;
    private String Cidade;
    private String Bairro;
    private String Pais;
    private String CEP;
    private String UF;

    public Endereco()
    {
        CNPJFornecedor = "";
        CodVendedor = 0;
        CPFCliente = "";
        Rua = "";
        Numero = 0;
        Cidade = "";
        Bairro = "";
        Pais = "";
        CEP = "";
        UF = "";
    }
    
    public boolean SalvarCliente() {
        if(CPFCliente.isEmpty() || Rua.isEmpty() || Numero ==0 
                || Bairro.isEmpty() || Cidade.isEmpty() || Pais.isEmpty() 
                || CEP.isEmpty() || UF.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO Endereco (CPFCliente,Rua,Numero, Bairro, Cidade,Pais,CEP,UF) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPFCliente);
            Query1.setString(2, Rua);
            Query1.setInt(3, Numero);
            Query1.setString(4, Bairro);
            Query1.setString(5, Cidade);
            Query1.setString(6, Pais);
            Query1.setString(7, CEP);
            Query1.setString(8, UF);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    private boolean IsThisSet()
    {
        if(Rua.isEmpty() || Numero ==0 || Bairro.isEmpty() || Cidade.isEmpty() 
                || Pais.isEmpty() || CEP.isEmpty() || UF.isEmpty() 
                || CPFCliente.isEmpty()) return false;
        else return true;
    }

    public boolean EditarCliente() {
        if(!IsThisSet()) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Endereco SET  Rua = ?, Numero = ?, Bairro = ?, Cidade = ?"
                + ",Pais = ?, CEP = ?, UF = ? WHERE CPFCliente = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, Rua);
            Query1.setInt(2, Numero);
            Query1.setString(3, Bairro);
            Query1.setString(4, Cidade);
            Query1.setString(5, Pais);
            Query1.setString(6, CEP);
            Query1.setString(7, UF);
            Query1.setString(8, CPFCliente);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean SalvarFornecedor() {
        if(!IsThisSet()) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO Endereco (CNPJFornecedor,Rua,Numero, Bairro, Cidade,Pais,CEP,UF) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJFornecedor);
            Query1.setString(2, Rua);
            Query1.setInt(3, Numero);
            Query1.setString(4, Bairro);
            Query1.setString(5, Cidade);
            Query1.setString(6, Pais);
            Query1.setString(7, CEP);
            Query1.setString(8, UF);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean EditarFornecedor() {
        if(!IsThisSet()) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Endereco SET  Rua = ?, Numero = ?, Bairro = ?, Cidade = ?"
                + ",Pais = ?, CEP = ?, UF = ? WHERE CNPJFornecedor = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, Rua);
            Query1.setInt(2, Numero);
            Query1.setString(3, Bairro);
            Query1.setString(4, Cidade);
            Query1.setString(5, Pais);
            Query1.setString(6, CEP);
            Query1.setString(7, UF);
            Query1.setString(8, CNPJFornecedor);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean SalvarVendedor() {
        if(!IsThisSet()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO Endereco (Codvendedor, Rua, Numero, Bairro, Cidade, Pais, CEP, UF) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodVendedor);
            Query1.setString(2, Rua);
            Query1.setInt(3, Numero);
            Query1.setString(4, Bairro);
            Query1.setString(5, Cidade);
            Query1.setString(6, Pais);
            Query1.setString(7, CEP);
            Query1.setString(8, UF);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean EditarVendedor() {
        if(!IsThisSet()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE Endereco SET  Rua = ?, Numero = ?, Bairro = ?, Cidade = ?"
                + ",Pais = ?, CEP = ?, UF = ? WHERE Codvendedor = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, Rua);
            Query1.setInt(2, Numero);
            Query1.setString(3, Bairro);
            Query1.setString(4, Cidade);
            Query1.setString(5, Pais);
            Query1.setString(6, CEP);
            Query1.setString(7, UF);
            Query1.setInt(8, CodVendedor);
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
        ConsultaSQL = "SELECT * FROM Endereco where CPFCliente = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CPF);
            rs = Query1.executeQuery();
            if (rs.next()) {
                Rua = rs.getString("Rua");
                Numero = rs.getInt("Numero");
                Bairro = rs.getString("Bairro");
                Cidade = rs.getString("Cidade");
                Pais = rs.getString("Pais");
                CEP = rs.getString("CEP");
                UF = rs.getString("UF");
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaVendedor(int Cod) {
        if(Cod == 0)return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM Endereco where CodVendedor = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, Cod);
            rs = Query1.executeQuery();
            if (rs.next()) {
                Rua = rs.getString("Rua");
                Numero = rs.getInt("Numero");
                Bairro = rs.getString("Bairro");
                Cidade = rs.getString("Cidade");
                Pais = rs.getString("Pais");
                CEP = rs.getString("CEP");
                UF = rs.getString("UF");
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
        ConsultaSQL = "SELECT * FROM Endereco where CNPJFornecedor = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJ);
            rs = Query1.executeQuery();
            if (rs.next()) {
                Rua = rs.getString("Rua");
                Numero = rs.getInt("Numero");
                Bairro = rs.getString("Bairro");
                Cidade = rs.getString("Cidade");
                Pais = rs.getString("Pais");
                CEP = rs.getString("CEP");
                UF = rs.getString("UF");
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

    public void setCodVendedor(int CodVendedores) {
        this.CodVendedor = CodVendedores;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
}
