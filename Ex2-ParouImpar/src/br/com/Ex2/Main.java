/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int numero;
        int par=0;
        while (true) {
            numero = Integer.parseInt(br.readLine());
            if (numero == 0) {
                break;
            } else {
                String[] numeros = br.readLine().split(" ");
                int meio=numeros.length-1;
                for (int c = 0; c < numeros.length / 2; c++) {
                    if (Integer.parseInt(numeros[c]) % 2 == 0 ||Integer.parseInt(numeros[meio]) % 2 == 0) {
                    par++;
                    meio--;
                    }

                }
                System.out.println(par);
                par=0;
            }
        }
    }
}
