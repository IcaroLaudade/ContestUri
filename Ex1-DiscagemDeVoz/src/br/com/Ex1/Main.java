/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String antesSplit;
        while ((antesSplit = br.readLine()) != null) {
            String[] letras = antesSplit.split("");
            String texto = "";
            for (int i = 0; i < letras.length; i++) {
                String a = letras[i].toUpperCase();
                switch (a) {
                    case "A":
                        texto += "2";
                        break;
                    case "B":
                        texto += "2";
                        break;
                    case "C":
                        texto += "2";
                        break;
                    case "D":
                        texto += "3";
                        break;
                    case "E":
                        texto += "3";
                        break;
                    case "F":
                        texto += "3";
                        break;
                    case "G":
                        texto += "4";
                        break;
                    case "H":
                        texto += "4";
                        break;
                    case "I":
                        texto += "4";
                        break;
                    case "J":
                        texto += "5";
                        break;
                    case "K":
                        texto += "5";
                        break;
                    case "L":
                        texto += "5";
                        break;
                    case "M":
                        texto += "6";
                        break;
                    case "N":
                        texto += "6";
                        break;
                    case "O":
                        texto += "6";
                        break;
                    case "P":
                        texto += "7";
                        break;
                    case "Q":
                        texto += "7";
                        break;
                    case "R":
                        texto += "7";
                        break;
                    case "S":
                        texto += "7";
                        break;
                    case "T":
                        texto += "8";
                        break;
                    case "U":
                        texto += "8";
                        break;
                    case "V":
                        texto += "8";
                        break;
                    case "W":
                        texto += "9";
                        break;
                    case "X":
                        texto += "9";
                        break;
                    case "Y":
                        texto += "9";
                        break;
                    case "Z":
                        texto += "9";
                        break;
                    case "0":
                        texto += "0";
                        break;
                    case "1":
                        texto += "1";
                        break;
                    case "2":
                        texto += "2";
                        break;
                    case "3":
                        texto += "3";
                        break;
                    case "4":
                        texto += "4";
                        break;
                    case "5":
                        texto += "5";
                        break;
                    case "6":
                        texto += "6";
                        break;
                    case "7":
                        texto += "7";
                        break;
                    case "8":
                        texto += "8";
                        break;
                    case "9":
                        texto += "9";
                        break;
                    case "*":
                        texto += "*";
                        break;
                    case "#":
                        texto += "#";
                        break;
                    default:
                        break;
                }
            }
            System.out.println(texto);
        }
    }
}
