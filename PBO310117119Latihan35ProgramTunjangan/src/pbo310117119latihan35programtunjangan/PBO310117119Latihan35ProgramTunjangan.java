/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan35programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * NAMA : ARDITYA YOGAPUTRA S
 * NIM : 10117119
 * KELAS : PBO3 / IF-3
 * Deskripsi Program : Membuat Program Tunjangan dengan cara objek
 */
public class PBO310117119Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Tunjangan tung = new Tunjangan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        tung.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        tung.status = scn.next();

        tung.HasilHitung(tung.status, tung.gajiPokok);

    }

}
