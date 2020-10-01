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
public class Produto {
    
    //Atributos 
    int codigo;
    String descricao;
    char setor;
    double preco;
    boolean disponivel;
    
    //Metodos
    public void imprimirProduto(){
        System.out.println("Codigo: " + codigo);
        System.out.println("descricao: " + descricao);
        System.out.println("setor: " + setor);
        System.out.println("Preco: " + preco);
        System.out.println(disponivel? "-- Disponivel -- ":"--Indisponivel--");

    }
    
    public void calcularDesconto(){
        //calculando desconto do produto
        preco = preco * 0.9;

    }
    
}
