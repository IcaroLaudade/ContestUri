/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int primo;
        int superP;
        while (br.ready()) {
            int numero = Integer.parseInt(br.readLine());
            primo = 0;
            superP = 0;
            if (numero == 1) {
                primo++;
                superP++;
            } else {
                for (int i = 2; i < numero; i++) {
                    if (numero == 1) {
                        primo++;
                        break;
                    }
                    if (numero % i == 0) {
                        primo++;
                        break;
                    }
                }
                if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
                    superP++;
                } else {
                    while (numero > 0) {
                        int num = numero % 10;
                        numero = numero / 10;
                        if (num == 1) {
                            superP++;
                        }
                        if (superP == 1) {
                            break;
                        } else {
                            for (int j = 2; j < num; j++) {
                                if (num == 1) {
                                    superP++;
                                    break;
                                }
                                if (num % j == 0) {
                                    superP++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (primo == 0 && superP == 0) {
                System.out.println("Super");
            } else if (primo == 0 && superP > 0) {
                System.out.println("Primo");
            } else {
                System.out.println("Nada");
            }
        }
    }
}
