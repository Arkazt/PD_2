package Latihan_Percabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //if-else
    //cek syarat pembuatan KTP
    int usia=0;
    System.out.print("Masukkan usia anda : ");
    usia = Integer.parseInt(br.readLine());
    if (usia >= 17) {
        System.out.println("Sudah memenuhi syarat");
    } else {
        System.out.println("Belum memenuhi syarat");
    }

    //if-else-if
    //cek status kelulusan MK berdasarkan nim dan nilai UAS
    String nim;
    int nilaiUAS;
    System.out.println("Masukkan NIM anda : ");
    nim = br.readLine();
    System.out.println("Masukkan nilai UAS anda : ");
    nilaiUAS = Integer.parseInt(br.readLine());

    //jika nilai 80, 70, 65 = lulus, di bawah 65 tidak lulus
    if (nim.equalsIgnoreCase( "22410100048")
            && nilaiUAS == 80){
        System.out.println("lULUS");
    }else if (nim.equalsIgnoreCase("22410100048")
            && nilaiUAS == 70){
        System.out.println("LULUS");
    }else if (nim.equalsIgnoreCase("22410100048")
            && nilaiUAS == 65){
        System.out.println("LULUS");
    }else if (nim.equalsIgnoreCase("22410100048")
            && nilaiUAS < 65){
        System.out.println("TIDAK LULUS");
    }else {
        System.out.println("Nilai Tidak Ditemukan");
    }
    //equals : memperhatikan detil besar-kecil hurufnya (case sensitive)
    //equalsIgnoreCase : case non-sensitive

    //nested if
    //cek menu yang dipilih (makanan/minuman)
    //makanan = snack, nasi bungkus
    //minuman = kopi, teh, air mineral

    String menu, jenis;
    System.out.print("Masukkan menu (Makanan/Minuman) : ");
    menu = br.readLine();
    System.out.print("Masukkan jenis menu \n Makanan:Snack, Nasi bungkus \n" + "Minuman: kopi, teh, air mineral. Pilih : ");
    jenis = br.readLine();

    if (menu.equalsIgnoreCase("makanan")) {
        if (jenis.equalsIgnoreCase("snack")){
            System.out.println("harga 2000");
        }else {
            System.out.println("harga 5000");
        }
    }else if (menu.equalsIgnoreCase("minuman")){
        if (jenis.equalsIgnoreCase("kopi")){
            System.out.println("harga 3000");
        }else if (jenis.equalsIgnoreCase("teh")){
            System.out.println("harga 2000");
        }else if (jenis.equalsIgnoreCase("air mineral")){
            System.out.println("harga 5000");
        }
    }

    }
}
