package tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas3SKS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String NIM;
        int matkul, SKS, n1, n2, n3, n4, n5, n6;
        double IPS;

        matkul = 6;
        SKS = 3;

        System.out.print("Masukkan NIM anda : ");
        NIM = br.readLine();

        System.out.print("Masukkan Nilai 0-4 \nNilai Matematika Dasar = ");
        n1 = Integer.parseInt(br.readLine());
        System.out.print("Nilai Logika dan Algoritma Pemrograman = ");
        n2 = Integer.parseInt(br.readLine());
        System.out.print("Nilai Organisasi dan Manajemen = ");
        n3 = Integer.parseInt(br.readLine());
        System.out.print("Nilai Dasar Infrastruktur Teknologi Informmasi = ");
        n4 = Integer.parseInt(br.readLine());
        System.out.print("Nilai Statistik dan Probabilitas = ");
        n5 = Integer.parseInt(br.readLine());
        System.out.print("Nilai Bahasa Indonesia");
        n6 = Integer.parseInt(br.readLine());

        IPS = ((n1*SKS)+(n2*SKS)+(n3*SKS)+(n4*SKS)+(n5*SKS)+(n6*SKS))/18;
        System.out.print("Nilai Indeks Prestasi Semester = " + IPS);

        if (NIM.equalsIgnoreCase("22410100048")
                && IPS <= 4.00){
            System.out.print("SKS 24");
        }else if (NIM.equalsIgnoreCase("22410100048")
                && IPS >= 3.50){
            System.out.print("SKS 24");
        }else if (NIM.equalsIgnoreCase("22410100048")
                && IPS >= 3.00){
            System.out.print("SKS 22");
        }else if (NIM.equalsIgnoreCase("22410100048")
                && IPS >= 2.00){
            System.out.print("SKS 20");
        }else{
            System.out.print("SKS 18");

        }
    }
}