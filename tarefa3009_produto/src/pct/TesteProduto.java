/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Vitor Assis
 */
public class TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instancia e criação de objeto da 
        Produto produto = new Produto();
        
        //Construção de objeto
        produto.codigo = 943;
        produto.descricao = "Café Pelé";
        produto.setor = 'M';
        produto.preco = 14.00;
        produto.disponivel = true;
        
        //Imprimindo Porduto
        System.out.println("\n\t\t\t -- Produto -- \n");
        produto.imprimirProduto();
   
        
        
        //Calcular Desconto
        produto.calcularDesconto();
        
        //Imprimindo Porduto com 25% de desconto
        System.out.println("\n\t\t\t -- Produto com 25% de desconto -- \n");
        produto.imprimirProduto();

    }
    
}
