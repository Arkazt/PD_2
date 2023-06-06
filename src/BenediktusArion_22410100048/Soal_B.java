package BenediktusArion_22410100048;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Soal_B {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("---------------------");
        System.out.println("Program Kerja Hima SI");
        System.out.println("---------------------");

        int tpp, akp;
        String nd;

            System.out.print("Tahun Periode Proker : ");
            tpp = Integer.parseInt(br.readLine());
            System.out.print("Anggaran Keseluruhan Proker : ");
            akp = Integer.parseInt(br.readLine());

            System.out.println("---------------------");

        String[][] pkh = new String[3][3];

        int ja, ad, ak, cek;

        for (int i = 0; i < pkh.length; i++) {
            System.out.println("Data Divisi");
            System.out.print("Nama Divisi : ");
            pkh[i][0] = br.readLine();
            System.out.print("Jumlah Anggota : ");
            pkh[i][1] = br.readLine();
            ja = Integer.parseInt(pkh[i][1]);
            System.out.print("Anggaran Divisi : ");
            pkh[i][2] = br.readLine();
            ad = Integer.parseInt(pkh[i][2]);
        }

        System.out.println("---------------------");

        System.out.println("Memasukan Nama Divisi");
        nd = br.readLine();

            if (nd.equalsIgnoreCase("PDD")) {
                System.out.println("Melanjutkan mengisi data dan anggaran");
            }else if(nd.equalsIgnoreCase("SDM")) {
                System.out.println("Melanjutkan mengisi data dan anggrang");
            }else if(nd.equalsIgnoreCase("Humas")) {
                System.out.println("Melanjutkan mengisi data dan anggaran");
            }else {
                System.out.println("Data tidak ditemukan");
            }

        System.out.println("---------------------");

        System.out.println("Data Kegiatan");

        for (int i = 0; i < pkh.length; i++) {
            System.out.print("Nama Kegiatan : ");
            pkh[i][0] = br.readLine();
            System.out.print("Bulam Kegiatan : ");
            pkh[i][1] = br.readLine();
            System.out.print("Anggran Kegiatan : ");
            pkh[i][2] = br.readLine();
            ak = Integer.parseInt(pkh[i][2]);

        }



    }

}
