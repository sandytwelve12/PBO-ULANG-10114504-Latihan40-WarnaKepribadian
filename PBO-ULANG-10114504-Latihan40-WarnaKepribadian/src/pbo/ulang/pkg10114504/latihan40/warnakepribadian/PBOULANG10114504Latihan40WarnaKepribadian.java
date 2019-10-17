/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi warna kepribadian
 */
public class PBOULANG10114504Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String color;
        String Nama;
        
        warnaKepribadian warna = new warnaKepribadian();
        Scanner scan = new Scanner(System.in);
        
        System.out.println(warnaKepribadian.ANSI_RED+"YUK "+warnaKepribadian.ANSI_RESET);
            System.out.print(warnaKepribadian.ANSI_GREEN+"CEK "+warnaKepribadian.ANSI_RESET);
            System.out.print(warnaKepribadian.ANSI_YELLOW+"KEPRIBADIANMU "+warnaKepribadian.ANSI_RESET);
            System.out.print(warnaKepribadian.ANSI_CYAN+"DARI "+warnaKepribadian.ANSI_RESET);
            System.out.print(warnaKepribadian.ANSI_PURPLE+"WARNA "+warnaKepribadian.ANSI_RESET);
            System.out.print(warnaKepribadian.ANSI_BLUE+"FAVORITMU "+warnaKepribadian.ANSI_RESET);
            
            System.out.println("");
            System.out.println(warnaKepribadian.ANSI_RED_BACKGROUND+warnaKepribadian.ANSI_WHITE+"\t MERAH \t\t"+warnaKepribadian.ANSI_RESET);
            System.out.println(warnaKepribadian.ANSI_GREEN_BACKGROUND+warnaKepribadian.ANSI_WHITE+"\t HIJAU \t\t"+warnaKepribadian.ANSI_RESET);
            System.out.println(warnaKepribadian.ANSI_YELLOW_BACKGROUND+warnaKepribadian.ANSI_WHITE+"\tKUNING \t\t"+warnaKepribadian.ANSI_RESET);
            System.out.println(warnaKepribadian.ANSI_BLUE_BACKGROUND+warnaKepribadian.ANSI_WHITE+"\t BIRU \t\t"+warnaKepribadian.ANSI_RESET);
            System.out.println(warnaKepribadian.ANSI_PURPLE_BACKGROUND+warnaKepribadian.ANSI_WHITE+"\t UNGU \t\t" +warnaKepribadian.ANSI_RESET);
    
            System.out.print("Pilih Warna Favoritmu : ");
            color = scan.next();
            
            //output
            System.out.println("");
            System.out.println("===========HASIL TEST KEPRIBADIANMU=============");
            warnaKepribadian.kepribadian(color);
    }
    
}
