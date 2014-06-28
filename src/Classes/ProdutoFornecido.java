/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.clsDataBase;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Diorgenes
 */
public class ProdutoFornecido {

    private String CNPJFornecedor;
    private int CodProduto;
    private Date DataFornecimento;
    private int idProdutoFornecido;
    
    public ProdutoFornecido()
    {
        CNPJFornecedor = "";
        CodProduto = 0;
        idProdutoFornecido = 0;
    }
    

    public boolean Inserir() {
        if(CNPJFornecedor.isEmpty() || CodProduto ==0 ||idProdutoFornecido==0) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO produtofornecido (CNPJFornecedor,CodProduto,DataFornecimento) values (?,?,?)";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJFornecedor);
            Query1.setInt(2, CodProduto);
            Query1.setDate(3, DataFornecimento);

            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean AlterarCNPJ() {
        if(CNPJFornecedor.isEmpty() || CodProduto==0) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "UPDATE ProdutoFornecido SET  CNPJFornecedor = ?"
                + " WHERE CodProduto = ?";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, CNPJFornecedor);
            Query1.setInt(2, CodProduto);

            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaCodigoProduto() {
        if(CodProduto==0) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM ProdutoFornecido WHERE CodProduto = ?";

        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodProduto);
            rs = Query1.executeQuery();
            if (rs.next()) {

                CNPJFornecedor = rs.getString("CNPJFornecedor");
                DataFornecimento = rs.getDate("DataFornecimento");
                idProdutoFornecido = rs.getInt("idProdutoFornecido");
                return true;
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }

    public boolean PesquisaIDProdutoFornecido() {
        if(CodProduto==0 || CNPJFornecedor.isEmpty()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM ProdutoFornecido WHERE CodProduto = ? and CNPJFornecedor = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodProduto);
            Query1.setString(2, CNPJFornecedor);
            rs = Query1.executeQuery();
            if (rs.next()) {

                DataFornecimento = rs.getDate("DataFornecimento");
                idProdutoFornecido = rs.getInt("idProdutoFornecido");
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

    public int getCodProduto() {
        return CodProduto;
    }

    public void setCodProduto(int CodProduto) {
        this.CodProduto = CodProduto;
    }

    /*
     public boolean setDados(int CodProd) {
     this.CodProduto = CodProd;      
     Connection c = clsDataBase.getconexao();

     String ConsultaSQL = "";
     String R;
     ConsultaSQL = "SELECT * FROM produtofornecido WHERE CodProduto = ?";
     ResultSet rs;
     try {
     PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
     Query1.setInt(1, CodProd);
            
     rs = Query1.executeQuery();
     CodProduto = CodProd;
     CNPJFornecedor = rs.getString("CNPJFornecedor");
     DataFornecimento = rs.getDate("DataFornecimento");
            
     } catch (java.sql.SQLException e) {
     System.out.println(e.getMessage());
     return false;
     }
     return true;
     }
    
     public boolean setDados(String CNPJ) {
     this.CNPJFornecedor = CNPJ;      
     Connection c = clsDataBase.getconexao();

     String ConsultaSQL = "";
     String R;
     ConsultaSQL = "SELECT * FROM produtofornecido WHERE CNPJFornecedor = ?";
     ResultSet rs;
     try {
     PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
     Query1.setInt(1, CodProd);
            
     rs = Query1.executeQuery();
     CodProduto = CodProd;
     CNPJFornecedor = rs.getString("CNPJFornecedor");
     DataFornecimento = rs.getDate("DataFornecimento");
            
     } catch (java.sql.SQLException e) {
     System.out.println(e.getMessage());
     return false;
     }
     return true;
     }
     */
    public Date getDataFornecimento() {
        return DataFornecimento;
    }

    public void setDataFornecimento(Date DataFornecimento) {
        this.DataFornecimento = DataFornecimento;
    }

    public int getIdProdutoFornecido() {
        return idProdutoFornecido;
    }

    public void setIdProdutoFornecido(int idProdutoFornecido) {
        this.idProdutoFornecido = idProdutoFornecido;
    }
}
