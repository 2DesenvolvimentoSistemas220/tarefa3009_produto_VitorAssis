/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Vitor Assis
 */
public class jurosSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int op;
        float taxa, capital, tempo, juros;

        Scanner entrada = new Scanner(System.in);

        // commite João Vitor Pereira
             do {
                //apresentação
                System.out.println("\n\t\t\t -- Calculadora de Juros Simples -- \n");

                //Menu
                System.out.println("O que você deseja calcular?");
                System.out.println("[1] - Capital");
                System.out.println("[2] - Juros");
                System.out.println("[3] - Taxa");
                System.out.println("[4] - Tempo");
                System.out.println("[5] - Sair");

                //opção escolhida
                op = Integer.parseInt(entrada.nextLine());

                if (op == 1) {
                    System.out.println("Digite o Juros");
                    juros = Float.parseFloat(entrada.nextLine());

                    System.out.println("Digite a taxa");
                    taxa = Float.parseFloat(entrada.nextLine());

                    System.out.println("Digite o tempo");
                    tempo = Float.parseFloat(entrada.nextLine());

                    //transformando tempo de dias para (meses)
                    if (tempo >= 30) {
                        //para não precisar criar outra variavel, usei a mesma anterior 
                        tempo = tempo / 30;
                    }
                    //multiplicando tempo e taxa
                    float tempTax = tempo * taxa;

                    juros = juros * 100;

                    capital = juros / tempTax;

                    System.out.println("o Capital é de " + capital);

                   //juros Vitor

                } else if (op == 2) {
                    System.out.println("Digite a Capital");
                    capital = Float.parseFloat(entrada.nextLine());

                    System.out.println("Digite a taxa");
                    taxa = Float.parseFloat(entrada.nextLine());

                    System.out.println("Digite o tempo");
                    tempo = Float.parseFloat(entrada.nextLine());

                    //transformando tempo de dias para (meses)
                    if (tempo >= 30) {
                        //para não precisar criar outra variavel, usei a mesma anterior 
                        tempo = tempo / 30;
                    }
                    //transformando porcentual em indice
                    taxa = taxa / 100;

                    juros = capital * tempo * taxa;

                    System.out.println("O seu Juros é de: " + juros);
                    
                    //taxa Erasmo Batista (repassado/aperfeiçoado por Vitor Assis)
                     
                    } else if (op == 3) {
                        System.out.println("Digite o Valor do Capital(c)");
                        capital = Float.parseFloat(entrada.nextLine());

                        System.out.println("Digite em Quantos meses o capital ficara aplicado(t)");
                        tempo = Float.parseFloat(entrada.nextLine());

                        System.out.println("Digite o juros");
                        juros = Float.parseFloat(entrada.nextLine());
                    
                    
                        tempo = tempo / 12;
                    
                        taxa = ( juros /(  capital * tempo ) );

                        System.out.println("A taxa de juros é de " + taxa);
                        }
                         // tempo/prazo Giovanna (repassado/aperfeiçoado por joão)

                        else if( op == 4){
                        System.out.println("Digite o  Capital ");
                        capital = Float.parseFloat(entrada.nextLine());

                        System.out.println("Digite o  juros");
                        juros = Float.parseFloat(entrada.nextLine());

                        System.out.println("Digite a Taxa");
                        taxa= Float.parseFloat(entrada.nextLine());

                        float test = capital * (taxa / 100);
                        
                        tempo = juros / test;
                                
                       System.out.println("O tempo aplicado é de: " + tempo + " meses ou " + tempo * 30 + " dias");

                
                    }else if (op == 5) {
                  System.out.println("Obrigado, até a próxima!");
                }
                else{             
                   System.out.println("O numero digitado não corresponde a nenhuma das opções.");
                    }
                } while(op != 5);

        }
    }

   


