package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Praktikum5_P2_22410100048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] name = new String[7];
        int[] pilih = new int[3];

        System.out.print("UNDIAN");
        System.out.println();

        for (int i = 0; i < name.length; i++) {
            System.out.print("Masukkan nama undian ke- " + (i+1) + " : ");
            name[i] = br.readLine();
            System.out.println();
        }

        for (int j = 0; j < 3; j++) {
            Random random = new Random();
            pilih[j] = random.nextInt(7);
            System.out.print("Pemenang urutan ke- " + (j+1) + " : " + name[pilih[j]]);
        }
    }
}
