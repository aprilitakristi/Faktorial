/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belahketupat;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class BelahKetupat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil;
        System.out.println("Masukkan Bilangan: ");
        Scanner scn = new Scanner(System.in);
        bil = scn.nextInt();
        for (int l = 0; l < bil; l+=2) {
            for (int m = 0; m < bil-1; m+=2) {
                System.out.println(" ");
                
            }
            for (int n = 0; n <=l; n++) {
                System.out.println("*");
            }
            
        }
        bil=bil-2;
        for (int l = 0; l < bil; l+=2) {
            for (int m = 0; m <= l+2; m+=2) {
                System.out.println(" ");
                
            }
            for (int n = 1; n <=bil-1; n++) {
                System.out.println("*");
            }
            
        }
    }
    
}
