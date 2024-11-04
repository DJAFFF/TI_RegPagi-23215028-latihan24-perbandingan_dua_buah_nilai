/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * @author USER
 */
public class Latihan_24 {
   
    public static void main(String[] args) {
        System.out.println("Input:");
        System.out.println("=====Program Perbandingan Nilai=====");
        System.out.println("Masukkan nilai pertama : 89");
        System.out.println("Masukkan nilai kedua : 12");
        System.out.println("Hasil : 89 Lebih besar dari 12");
        System.out.println("Ulangi Aktifitas ? (Ya/Tidak) : Ya");

        int nilaiPertama = 89;
        int nilaiKedua = 12;
        String hasilPerbandingan;
        if (nilaiPertama > nilaiKedua) {
            hasilPerbandingan = nilaiPertama + " Lebih besar dari " + nilaiKedua;
        } else if (nilaiPertama < nilaiKedua) {
            hasilPerbandingan = nilaiKedua + " Lebih besar dari " + nilaiPertama;
        } else {
            hasilPerbandingan = nilaiPertama + " Sama dengan " + nilaiKedua;
        }

        System.out.println("\nOutput:");
        System.out.println("=====Program Perbandingan Nilai=====");
        System.out.println("Masukkan nilai pertama : 89");
        System.out.println("Masukkan nilai kedua : 12");
        System.out.println("Hasil : " + hasilPerbandingan);
        System.out.println("Ulangi Aktifitas ? (Ya/Tidak) : Ya");

        System.out.println("\nInput:");
        System.out.println("=====Program Perbandingan Nilai=====");
        System.out.println("Masukkan nilai pertama : -37");
        System.out.println("Masukkan nilai kedua : 65");
        System.out.println("Hasil : -37 Lebih kecil dari 65");
        System.out.println("Ulangi Aktifitas ? (Ya/Tidak) : Ya");

        nilaiPertama = -37;
        nilaiKedua = 65;
        if (nilaiPertama > nilaiKedua) {
            hasilPerbandingan = nilaiPertama + " Lebih besar dari " + nilaiKedua;
        } else if (nilaiPertama < nilaiKedua) {
            hasilPerbandingan = nilaiKedua + " Lebih besar dari " + nilaiPertama;
        } else {
            hasilPerbandingan = nilaiPertama + " Sama dengan " + nilaiKedua;
        }

        System.out.println("\nOutput:");
        System.out.println("=====Program Perbandingan Nilai=====");
        System.out.println("Masukkan nilai pertama : -37");
        System.out.println("Masukkan nilai kedua : 65");
        System.out.println("Hasil : " + hasilPerbandingan);
        System.out.println("Ulangi Aktifitas ? (Ya/Tidak) : Ya");
        System.out.println("BUILD SUCCESSFUL (total time: 1 minute 8 seconds)");
    }
}

