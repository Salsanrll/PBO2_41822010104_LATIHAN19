/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan19;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        double saldoAwal = 2500000;
        double bungaPerBulan = 0.15; // 15% bunga per bulan
        int lamaBulan = 6;

        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double saldo = saldoAwal + (saldoAwal * bungaPerBulan);
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + saldo);
            saldoAwal = saldo; // Perbarui saldo awal untuk bulan berikutnya
        }
        System.out.println("\nDeveloped by: Salsa Nurul Laeli");
    }}
  

    

