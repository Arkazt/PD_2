package arrays;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class programPenjualan {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] jual = new String[5][4];

        int qty, harga, total, grandTotal = 0, uangBayar, kembali;

        try {
            for (int i = 0; i < jual.length; i++) {
                System.out.print("Nama Barang : ");
                jual[i][0] = br.readLine();
                System.out.print("Masukkan Quantity : ");
                jual[i][1] = br.readLine();
                qty = Integer.parseInt(jual[i][1]);
                System.out.print("Harga Barang : ");
                jual[i][2] = br.readLine();
                harga = Integer.parseInt(jual[i][2]);

                total = qty * harga;

                jual[i][3] = String.valueOf(total);
                System.out.println("Total = " + jual[i][3]);

                grandTotal = grandTotal + total;

            }

            System.out.println("Grand Total = " + grandTotal);

            System.out.print("Uang yang Dibayarkan : ");
            uangBayar =  Integer.parseInt(br.readLine());
            kembali = uangBayar - grandTotal;

            System.out.println("Uang Kembalian = " + kembali);

            System.out.println("Terima Kasih Telah Berbelanja");

        }catch (Exception e){

        }
    }
}