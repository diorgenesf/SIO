/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Diorgenes
 */
public class Produto {

    private int CodProduto;
    private String DescProduto;
    private float ValorUnitario;
    private String Observacao;
    private int QtdProduto;
    private int EstoqueMinimo;
    
    public Produto()
    {
        CodProduto = 0;
        DescProduto = "";
        ValorUnitario = 0;
        Observacao = "";
        QtdProduto = 0;
        EstoqueMinimo = 0;
    }
    public boolean IsThisSet()
    {
        if(CodProduto==0 || DescProduto.equals("") || ValorUnitario ==0 
                || Observacao.equals("") || QtdProduto==0 || EstoqueMinimo==0) return false;
        else return true;
    }

    public boolean Excluir() {
        if(CodProduto == 0 ) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "DELETE from Produto WHERE CodProduto = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodProduto);
            Query1.execute();
            //c.commit();
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaCodigo() {
        if(CodProduto==0) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM produto WHERE CodProduto = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodProduto);
            rs = Query1.executeQuery();
            rs.next();

            ValorUnitario = rs.getFloat("ValorUnitario");
            DescProduto = rs.getString("DescProduto");
            Observacao = rs.getString("Observacao");
            QtdProduto = rs.getInt("QtdProduto");
            EstoqueMinimo = rs.getInt("EstoqueMinimo");
            System.out.println(DescProduto);

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    public int PesquisaQuantidade() {
        if(CodProduto==0) return 0;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT COUNT(*) AS quantidade FROM produto WHERE CodProduto = ?";
        ResultSet rs;
        int R=0;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodProduto);
            rs = Query1.executeQuery();
            rs.next();
            R = rs.getInt("quantidade");

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        }
        return R;
    }

    public boolean PesquisaDesc() {
        if(DescProduto.isEmpty() || DescProduto.equals("")) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM produto WHERE DescProduto = ?";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, DescProduto);
            rs = Query1.executeQuery();
            rs.next();

            ValorUnitario = rs.getFloat("ValorUnitario");
            CodProduto = rs.getInt("CodProduto");
            Observacao = rs.getString("Observacao");
            QtdProduto = rs.getInt("QtdProduto");
            EstoqueMinimo = rs.getInt("EstoqueMinimo");

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean Alterar() {
        if(DescProduto.isEmpty() || ValorUnitario ==0 || QtdProduto == 0 || CodProduto == 0) return false;
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "UPDATE produto SET  DescProduto = ?, ValorUnitario = ?, Observacao = ?, QtdProduto = ?, EstoqueMinimo = ?"
                + " WHERE CodProduto = ?";

        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, DescProduto);
            Query1.setFloat(2, ValorUnitario);
            Query1.setString(3, Observacao);
            Query1.setInt(4, QtdProduto);
            Query1.setInt(5, EstoqueMinimo);
            Query1.setInt(6, CodProduto);
            Query1.execute();
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean carregaCombo(JComboBox combo) {
        if(combo==null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM produto ORDER BY DescProduto";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            rs = Query1.executeQuery();
            combo.removeAllItems();

            while ((rs.next())) {
                combo.addItem(rs.getString("DescProduto"));
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean carregaTabela(JTable Tabela) {
        if(Tabela==null) return false;
        return carregaTabela(Tabela, false);
    }

    public static boolean carregaTabela(JTable Tabela, boolean TemEstoque) {
        if(Tabela==null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        if (!TemEstoque) {
            ConsultaSQL = "SELECT * FROM produto order by DescProduto";
        } else {
            ConsultaSQL = "SELECT * FROM produto where QtdProduto>0 order by DescProduto";
        }
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
                dtm.addRow(new Object[]{rs.getInt("CodProduto"), rs.getString("DescProduto"), rs.getFloat("ValorUnitario"), rs.getInt("QtdProduto"), rs.getInt("EstoqueMinimo")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaTabelaDescricao(JTable Tabela) {
        if(Tabela==null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM produto WHERE DescProduto LIKE ? order by DescProduto";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setString(1, DescProduto);

            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getInt("CodProduto"), rs.getString("DescProduto"), rs.getFloat("ValorUnitario"), rs.getString("Observacao"), rs.getInt("QtdProduto"), rs.getInt("EstoqueMinimo")});
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean PesquisaTabelaCodigo(JTable Tabela) {
        if(Tabela==null) return false;
        
        Connection c = clsDataBase.getconexao();

        String ConsultaSQL = "";
        ConsultaSQL = "SELECT * FROM produto WHERE CodProduto = ? order by DescProduto";
        ResultSet rs;
        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodProduto);

            rs = Query1.executeQuery();

            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) Tabela.getModel();
            int cont = dtm.getRowCount();
            for (int i = 0; i < cont; i++) {
                dtm.removeRow(0);
            }
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getInt("CodProduto"), rs.getString("DescProduto"), rs.getFloat("ValorUnitario"), rs.getString("Observacao"), rs.getInt("QtdProduto"), rs.getInt("EstoqueMinimo")});
            }

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

        ConsultaSQL = "INSERT INTO produto(CodProduto,DescProduto,ValorUnitario,Observacao,QtdProduto,EstoqueMinimo) values (?,?,?,?,?,?)";

        try {
            PreparedStatement Query1 = c.prepareStatement(ConsultaSQL);
            Query1.setInt(1, CodProduto);
            Query1.setString(2, DescProduto);
            Query1.setFloat(3, ValorUnitario);
            Query1.setString(4, Observacao);
            Query1.setInt(5, QtdProduto);
            Query1.setInt(6, EstoqueMinimo);

            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public int getCodProduto() {
        return CodProduto;
    }

    public void setCodProduto(int CodProduto) {
        this.CodProduto = CodProduto;
    }

    public String getDescProduto() {
        return DescProduto;
    }

    public void setDescProduto(String DescProduto) {
        this.DescProduto = DescProduto;
    }

    public float getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public int getQtdProduto() {
        return QtdProduto;
    }

    public void setQtdProduto(int QtdProduto) {
        this.QtdProduto = QtdProduto;
    }

    public int getEstoqueMinimo() {
        return EstoqueMinimo;
    }

    public void setEstoqueMinimo(int EstoqueMinimo) {
        this.EstoqueMinimo = EstoqueMinimo;
    }
}
