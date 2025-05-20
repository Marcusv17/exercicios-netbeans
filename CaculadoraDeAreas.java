/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caculadoradeareas;

/**
 *
 * @author MARCUS
 */
public class CaculadoraDeAreas {

    public static void main(String[] args) {
         //Definação de dois números
double num1 = 12.4;
double num2 = 6.2;

//Realizando as operações matem´sticas
double soma = num1 + num2;
double subtracao = num1 - num2;
double multiplicacao = num1 * num2;
double divisao = num2 !=0 ? num1 / num2 : Double.NaN;
double resto = num1 % num2;

//Exibindo os resultados
System.out.println("resultados das operaçoes");
System.out.println("soma:" + soma);
System.out.println("subtraçao:" + subtracao);
System.out.println("multiplicaçao:"+ multiplicacao);
System.out.println("divisão: " + (num2 != 0 ? divisao : "indefinida (divisão por zero)"));
System.out.println("reato de divisão:" + resto);



    }
    
}
 