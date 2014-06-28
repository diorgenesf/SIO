/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Marcos Vinicius
 */
public class ItemCompra {
    
    private int CodConta;
    private int Quantidade;
    private int CodProduto;
    
    public ItemCompra()
    {
        CodConta = 0;
        Quantidade = 0;
        CodProduto = 0;
    }
    
    public boolean IsThisSet()
    {
        if(CodConta==0 || CodProduto ==0) return false;
        else return true;
    }
    
    public boolean Salvar() {
        if(!IsThisSet()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO ItensCompra (CodConta, Codproduto, Quantidade) values (?, ?, ?)";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodConta);
            Query1.setInt(2, CodProduto);
            Query1.setInt(3, Quantidade);

            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public int getCodConta() {
        return CodConta;
    }

    public void setCodConta(int CodConta) {
        this.CodConta = CodConta;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getCodProduto() {
        return CodProduto;
    }

    public void setCodProduto(int CodProduto) {
        this.CodProduto = CodProduto;
    }
}
