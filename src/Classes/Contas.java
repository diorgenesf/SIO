/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Marcos Vinicius
 */
public abstract class Contas {
    
    private int CodConta;
    private float Valor;
    private String Data;
    private String Descricao;
    
    public Contas()
    {
        CodConta = 0;
        Valor = 0;
        Data = "";
        Descricao = "";
    }
    
    public abstract boolean Salvar();
    
    public abstract boolean Editar(String C);
    
    
}
