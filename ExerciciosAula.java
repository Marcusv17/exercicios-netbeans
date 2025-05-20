/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosaula;

/**
 *
 * @author MARCUS
 */
import java.util.Scanner;

public class ExerciciosAula {

   //Exercicio 1
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);     
    
   System.out.print("Digite o primeiro número:");
   double n1 = scanner.nextDouble();
   
   System.out.print("Digite o segundo número:");
   double n2 = scanner.nextDouble();
   
   double soma = n1 + n2;
   double subtracao = n1 - n2;
   double multiplicacao = n1 * n2;
   double divisao = n1 / n2;
   
   System.out.println("soma:" + soma);
   System.out.println("subtração:" + subtracao);
   System.out.println("multiplicaçao:" + multiplicacao);
   System.out.println("divisão:" + divisao);           
  //Fim Exercicio 1  
  
  
  
  //Exercicio 2
  
  System.out.print("Digite os graus celsius");
   double celsius = scanner.nextDouble();
   
   double  fahrenheit = celsius * 1.8 + 32;
   double kelvin = celsius + 237.15;
   System.out.println("o numero em  fahrenheit e:" +  fahrenheit);
   System.out.println("o numero em kelvin e:" + kelvin);
   
//Fim Exercicio 2 



   //Exercicio 3 
   
   System.out.print("Digite um número inteiro:");
   int numero = scanner.nextInt();
   
   boolean ePrimo = true;
   
   if (numero <= 1) {
            ePrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ePrimo = false; // Caso exista um divisor, não é primo
                    break;     
        
        
                }
            }
   }
   
   if (ePrimo) {
       System.out.println("o número" + numero + "é primo");
   } else {
       System.out.println("o número" + numero + "não é primo");
   }
          //Fim Exercicio 3
          
    }
    
}
