package Praktikum;

import java.io.*;
public class Peaktikum6_P2_22410100048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HslPerhitunganAritmatika();
        System.out.print("Pilih no 1-3 = ");
        int nom = Integer.parseInt(br.readLine());
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Hasilnya adalah " +hasil(nom));
    }

    public static void HslPerhitunganAritmatika () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Pilih nomer 1-3 yang anda inginkan untuk Perhitungan Aritmatika : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");

    }

    public static int hasil(int nomer) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int jml=0;

        System.out.print("Bilangan 1 = ");
        int bil1 = Integer.parseInt(br.readLine());
        System.out.print("Bilangan 2 = ");
        int bil2 = Integer.parseInt(br.readLine());

        switch (nomer) {
            case 1:
                jml = bil1 + bil2;
                break;

            case 2:
                jml = bil1 - bil2;
                break;

            case 3:
                jml = bil1 * bil2;
                break;

            default:
                System.out.println("Salah");
        }

        return jml;
    }
}
