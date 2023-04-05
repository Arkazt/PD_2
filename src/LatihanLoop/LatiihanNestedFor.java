package LatihanLoop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LatiihanNestedFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //nested for (for bertingkat)
        //outer loop = baris (i)
        //inner loop = kolom (j)
        
//        //variabel
//        int minggu, hari;
//
//        //input
//        System.out.print("Jumlah minggu : ");
//        minggu = Integer.parseInt(br.readLine());
//        System.out.print("Jumlah hari : ");
//        hari = Integer.parseInt(br.readLine());
//
//        //perulangan + output
//        //outer loop
//        for (int i = 1; i <= minggu ; i++) {
//            System.out.println("Minggu ke - " + i);
//
//            //inner loop
//            for (int j = 1; j <= hari ; j++) {
//                //jika tidak ada hari pada minggu ke 4 atau minggu" lain yang dapat dipilih
//                if (i==4){
//                    break;
//                }
//                System.out.println("Hari : " + j);
//
//            }
//
//        }

            //persegi
//        int s;
//
//        System.out.print("jumlah : ");
//        s = Integer.parseInt(br.readLine());
//
//
//        for (int i = 1; i <= s ; i++) {
//
//            for (int j = 1; j <= s ; j++) {
//                System.out.print(" *");
//
//            }
//            System.out.println("");
//        }

//        //segitiga
//        int b;
//
//        System.out.print("jumlah : ");
//        b = Integer.parseInt(br.readLine());
//
//        //baris
//        for (int i = 1; i <= b ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" *");
//
//            }
//            System.out.println("");
//        }
    
        //segitiga terbalik tugas
        int a;

        System.out.print("jumlah : ");
        a = Integer.parseInt(br.readLine());

        for (int i = 0; i <= a ; i++) {
            for (int j = 1; j <= a-i ; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    
}
