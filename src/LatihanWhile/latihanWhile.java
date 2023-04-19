package LatihanWhile;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class latihanWhile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    //while
//    //menjumlahkan setiap angka yang dientrikan
//    //kondisi: pengulangan penjumlahan akan dilakukan apabila angka yang diinputkan >=0
//    //output: angka hasil jumlah
//    int number = 0, jumlah = 0;
//    while (number >=){
//        jumlah += number; //untuk setiap angka yang diinputkan
//        System.out.print("Entri angka : ");
//        number = Integer.parseInt(br.readLine());
//    }
//        System.out.println("Jumlah : " + jumlah);

    //mengentrikan nim dan nama apabila kondisinya true (dua data diisi dengan benar, dimana tipe datanya sesuai)
    boolean b;
    int i = 0;
    while (i < 5) {
        System.out.print("Entri NIM : ");
        int nim = Integer.parseInt(br.readLine());
        System.out.print("Entri Nama : ");
        String nama = br.readLine();
        i++;
    }
    }

}
