package com.example.exerciciofixacaomatriz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
//Fazer um programa para ler dois números inteiros M e N,e depois ler uma matriz de M linhas por N colunas contendo,
// números inteiros, podendo gaver repetições. Em seguida, ler um número inteiro x que pertencen á matriz. Para cada
// ocorrência de X, motrar os valores á esquerda, acima, á difreita e abaixo de X, quando houver, confome exemplo.

@SpringBootApplication
public class ExercicioFixacaoMatrizApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de linhas na sua array");
        int n = sc.nextInt();

        System.out.println("Numero de colunas do seu array");
        int m = sc.nextInt();

        int[][] array = new int[n][m];
        System.out.println("Digite os numeros do array");
        for (int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(array[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println("Escolha um numero para procurar no array");
        int numero = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (array[i][j] == numero) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + array[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + array[i-1][j]);
                    }
                    if (j < array[i].length-1) {
                        System.out.println("Right: " + array[i][j+1]);
                    }
                    if (i < array.length-1) {
                        System.out.println("Down: " + array[i+1][j]);
                    }
                }
            }
        }

    }

}
