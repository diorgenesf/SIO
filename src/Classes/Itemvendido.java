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
public class Itemvendido {
    private int CodVenda;
    private int Quantidade;
    private int CodProduto;
    
    public Itemvendido()
    {
        CodVenda = 0;
        Quantidade = 0;
        CodProduto = 0;
    }
    
    public boolean IsThisSet()
    {
        if(CodVenda==0 || CodProduto ==0) return false;
        else return true;
    }
    public boolean Salvar() {
        if(!IsThisSet()) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";

        ConsultaSQL = "INSERT INTO ItemVendido (CodVenda, Codproduto, Quantidade) values (?, ?, ?)";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodVenda);
            Query1.setInt(2, CodProduto);
            Query1.setInt(3, Quantidade);

            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public int getCodVenda() {
        return CodVenda;
    }

    public void setCodVenda(int CodVenda) {
        this.CodVenda = CodVenda;
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
