/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosaula2;
import java.util.Scanner;
/**
 *
 * @author MARCUS
 */
public class ExerciciosAula2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);     
    //Exercicio 4
    
            double nota1, nota2, nota3, nota4, media;
            
            // Lendo as 4 notas
            
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            System.out.print("Digite a terceira nota: ");
            nota3 = scanner.nextDouble();
            System.out.print("Digite a quarta nota: ");
            nota4 = scanner.nextDouble();
            // Calculo
            
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            // Resultado
            
            System.out.println("A média é: " + media);
            
            //Fim Exercicio 4
            
            
            //Exercicio 5
            
            System.out.print("Digite um número: ");
        int Numero = scanner.nextInt();

        System.out.println("Tabuada de " + Numero + ":");
        System.out.println(Numero + " x 1 = " + (Numero * 1));
        System.out.println(Numero + " x 2 = " + (Numero * 2));
        System.out.println(Numero + " x 3 = " + (Numero * 3));
        System.out.println(Numero + " x 4 = " + (Numero * 4));
        System.out.println(Numero + " x 5 = " + (Numero * 5));
        System.out.println(Numero + " x 6 = " + (Numero * 6));
        System.out.println(Numero + " x 7 = " + (Numero * 7));
        System.out.println(Numero + " x 8 = " + (Numero * 8));
        System.out.println(Numero + " x 9 = " + (Numero * 9));
        System.out.println(Numero + " x 10 = " + (Numero * 10));
        
        //Fim Exercicio 5
        
        //Exercicio 6
        
        // Lendo os dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        String var = scanner.nextLine();
        System.out.print("Digite sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Digite o nome do seu curso: ");
        String curso = scanner.nextLine();
        System.out.print("Digite sua série: ");
        String serie = scanner.nextLine();
        System.out.print("Digite sua altura : ");
        double altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie + " ano");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");

        }
    
    }
