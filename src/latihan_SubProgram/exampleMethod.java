package latihan_SubProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exampleMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        inputDataLuasSegitiga();

    }

    ///membuat fungsi dan prosedur
    //sebelum tipe data tambahakan statik
    //fungsi
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    //prosedur
    public static void cetakLuas() {
        //bisa memanggil fungsi, bisa menggunakan java.IO, bisa menggunakan array,dsb.
        System.out.println("Luas segitiga : " + luasSegitiga(5, 5));
    }

    //mengelompokkan inputan user ke dalam prosedur

    public static void inputDataLuasSegitiga() throws IOException {
        //jika dengan inputan user, perlu ada Bufferreader dan IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan alas : ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi : ");
        double t = Double.parseDouble(br.readLine());

        //hitung luas segitiga
//            double luas = 0.5*alas*tinggi;

        //memanggil fungsi
        luasSegitiga(a, t);

        //cetak luas dari fungsi
        System.out.println("luas segitiga adalah " + luasSegitiga(a, t));

        System.out.println();

        //cetak dari prosedur
        cetakLuas();

    }
}

