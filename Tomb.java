/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomb;

import java.util.Scanner;

/**
 *
 * @author Lonezsi
 */
public class Tomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tTombmuveletek\n");
        Scanner bemenet = new Scanner(System.in);
        int num = bemenet.nextInt();
        int osszeg1 = 0;
        int osszeg2 = 0;
        int[] tomb1 = new int[num];
        int[] tomb2 = new int[num];
        
        System.out.println("Hány elemet tartalmaznak a tömbök: " + tomb1.length);
        
        System.out.println("A tömb elemei:");
        
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 999) + 1;
            tomb2[i] = (int) (Math.random() * 999) + 1;
            osszeg1 += tomb1[i];
            osszeg2 += tomb2[i];
            System.out.println(String.format("%,3d", tomb1[i]) + " + " + (String.format("%,3d", tomb2[i]) + " = ") + (String.format("%,5d", (tomb2[i]+tomb1[i]))));
        } 
        System.out.println("\nA első tömb szamai összege: " + osszeg1);
        System.out.println("A számok átlaga: " + (double) osszeg1 / tomb1.length);
        
        System.out.println("\nA második tömb számai összege: " + osszeg2);
        System.out.println("A számok átlaga: " + (double) osszeg2 / tomb2.length);
    }
}
