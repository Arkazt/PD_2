package Praktikum;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Praktikum4_P2_22410100048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jData, nTugas, nUTS, nUAS;
        String nama;
        double nAkhir;

        System.out.print("Masukkan Data yang akan dimasukkan = ");
        jData = Integer.parseInt(br.readLine());

        String [][] data = new String [jData][4];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke " + (i+1));
            System.out.print("Nama : ");
            data[i][0] = br.readLine();
            System.out.print("Nilai Tugas : ");
            data[i][1] = br.readLine();
            nTugas = Integer.parseInt(data[i][1]);
            System.out.print("Nilai UTS : ");
            data[i][2] = br.readLine();
            nUTS = Integer.parseInt(data[i][2]);
            System.out.print("Nilai UAS : ");
            data[i][3] = br.readLine();
            nUAS = Integer.parseInt(data[i][3]);
            System.out.println();
            System.out.println("--------------------");
        }

        System.out.print("Pencarian berdasarkan Nama = ");
        nama = br.readLine();

        for (int k = 0; k < data.length; k++) {
            if (nama.equalsIgnoreCase(data[k][0]));
            System.out.println("Data ke " + (k+1));
            System.out.println("Nama : " + data[k][0]);
            System.out.println("Nilai Tugas : " + data[k][1]);
            nTugas = Integer.parseInt(data[k][1]);
            System.out.println("Nilai UTS : " + data[k][2]);
            nUTS = Integer.parseInt(data[k][2]);
            System.out.println("Nilai UAS : " + data[k][3]);
            nUAS = Integer.parseInt(data[k][3]);
            System.out.println("--------------------");
            nAkhir = ((nTugas*0.4) + (nUTS*0.3) + (nUAS*0.3));
            System.out.println("Nilai Akhir :" + nAkhir);
            System.out.println("--------------------");
            System.out.println();

        }

    }
}
