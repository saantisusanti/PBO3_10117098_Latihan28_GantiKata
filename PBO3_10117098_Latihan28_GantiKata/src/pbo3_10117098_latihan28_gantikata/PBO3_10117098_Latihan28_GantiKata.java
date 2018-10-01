/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan28_gantikata;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk mengganti kata tertentu
 *                     dari kalimat yang di input oleh user
 */
public class PBO3_10117098_Latihan28_GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        String kata;
        String kataB;
        
        Scanner scn = new Scanner (System.in);
        System.out.println("====== PROGRAM MENGGANTI KATA ======");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kalimat =scn.nextLine();
        
        System.out.print("Ganti Kata\t : ");
        kata =scn.nextLine();
        
        System.out.print("Menjadi Kata\t : ");
        kataB = scn.nextLine();
        
        System.out.println("");
        String gantiKata = kalimat.replace(kata,kataB);
        System.out.println("========== HASIL FORMATING ==========");
        System.out.println("Kalimat Awal\t : " +kalimat);
        System.out.println("Kalimat Baru\t : " +gantiKata);
        
    }
    
}
