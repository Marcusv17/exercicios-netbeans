/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoes.matematicas2;

/**
 *
 * @author MARCUS
 */
public class OperacoesMatematicas2 {

    public static void main(String[] args) {
        //Valores das variáveis do triângulo:
     double basetriangulo = 10.5;
     double alturatriangulo = 7.2;
     //Variáveis do quadrado:
     double ladoquadrado = 2.5;
     // Variáveis do retângulo:
     double baseretangulo = 15.5;
     double ladoretangulo = 7.5;
     // Variáveis losango:
     double diagonalmaior = 15;
     double diagonalmenor = 5;        
    // Variáveis circuferência:
    double raio = 8.5;
    //Números para operações matem´sticas:
    double num1 = 20.5;
    double num2 = 35;
    // Calculando as variáveis :
    double areatriangulo = basetriangulo * alturatriangulo /2;
    double areaquadrado = ladoquadrado * Math.pow(9.4, 2);
    double arearetangulo = baseretangulo * ladoretangulo;
    double arealosango = diagonalmaior * diagonalmenor /2;
    double areadacircuferencia = Math.PI * Math.pow(raio ,2);
    double soma = num1 + num2;
    double subtracao = num1 - num2;
    double multiplicacao = num1 * num2;
    double divisao = num2 !=0 ? num1 / num2 : Double.NaN;
     double media = num1 + num2 /2;  
    //Exibindo os resultados:
    System.out.println("area do triangulo" + areatriangulo);
    System.out.println("area do quadrado" + areaquadrado);
    System.out.println("area do retangulo" + arearetangulo);
    System.out.println("area do losango" + arealosango);
    System.out.println("area da circuferencia" + areadacircuferencia);
    System.out.println("resultados das operaçoes");
    System.out.println("soma:" + soma);
    System.out.println("subtraçao:" + subtracao);
    System.out.println("multiplicaçao:"+ multiplicacao);
    System.out.println("divisão: " + (num2 != 0 ? divisao : "indefinida (divisão por zero)"));
    System.out.println("média" + media);
    
    
    }
    
}
