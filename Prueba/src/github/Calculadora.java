/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        /*String pruebaGit = "Esto es una prueba de git de v2 a v3";
        
        String[] pruebaDesordenada = new String[pruebaGit.length()];*/
        
            String pruebaGit = "Esto es una prueba de git de v2 a v3";

        // Convertir el String original en un array de caracteres
        char[] chars = pruebaGit.toCharArray();

        // Mezclar los caracteres aleatoriamente
        List<Character> charList = new ArrayList<Character>();
        for (char c : chars) {
            charList.add(c);
        }
        Collections.shuffle(charList);

        // Convertir el array de caracteres mezclados de nuevo en un String
        StringBuilder sb = new StringBuilder(charList.size());
        for (Character c : charList) {
            sb.append(c);
        }
        String pruebaDesordenada = sb.toString();

        // Separar las palabras del String mezclado y almacenarlas en un array de String resultado
        String[] resultado = pruebaDesordenada.split("  ");

        // Imprimir el resultado en líneas separadas
        for (String s : resultado) {
            System.out.println(s);
        }
    }
}
