package latihan_SubProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class convertPraktikum4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        inputData();

    }

    public static double nAkhir (double nTugas, double nUTS, double nUAS){
        return (nTugas*0.4) + (nUTS*0.3) + (nUAS*0.3);
    }

    public static void inputData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Data yang akan dimasukkan = ");
        int jData, Tugas, UTS, UAS;
        String nama;
        jData = Integer.parseInt(br.readLine());

        String [][] data = new String [jData][4];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke " + (i+1));
            System.out.print("Nama : ");
            data[i][0] = br.readLine();
            System.out.print("Nilai Tugas : ");
            data[i][1] = br.readLine();
            Tugas = Integer.parseInt(data[i][1]);
            System.out.print("Nilai UTS : ");
            data[i][2] = br.readLine();
            UTS = Integer.parseInt(data[i][2]);
            System.out.print("Nilai UAS : ");
            data[i][3] = br.readLine();
            UAS = Integer.parseInt(data[i][3]);
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
            Tugas = Integer.parseInt(data[k][1]);
            System.out.println("Nilai UTS : " + data[k][2]);
            UTS = Integer.parseInt(data[k][2]);
            System.out.println("Nilai UAS : " + data[k][3]);
            UAS = Integer.parseInt(data[k][3]);
            System.out.println("--------------------");
            nAkhir (Tugas, UTS, UAS);
            System.out.println("Nilai Akhir :" + nAkhir (Tugas, UTS, UAS));
            System.out.println("--------------------");
            System.out.println();

        }
    }

}

