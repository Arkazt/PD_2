package latihan_SubProgram;

import java.io.*;
import java.util.*;

public class Queue_Class {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        //1. LinkedList
//        //deklarasi Queue
//        Queue<String> antri = new LinkedList<>();
//
//        //untuk memasukkan data menggunakan .add, jika ingin mengetahui data benar masuk menggunaka sout terlebih dahulu, tetapi bisa tidak menggunakan sout
//        //untuk menghapus dapat menggunakan .remove dan jika ingin data terakhir tidak eror/null hasilnya dapat menggunakan .poll
//        //untuk mengetahui data terdepan dapat menggunakan .element dan jika data pertama ingin menghasilkan null dapat menggunakan .peek
//        //https://www.geeksforgeeks.org/queue-interface-java/
//        System.out.println("Pelanggan : ");
//        antri.add("Adi");
//        antri.add("Dino");
//        System.out.println(antri.add("Andi"));
//        System.out.println(antri.remove());
//        System.out.println(antri.poll());
//
//        System.out.print("Jumlah Pelanggan : " + antri.size());

        //2. ArrayDeque
        Queue<Integer> nomer = new ArrayDeque<>();

        nomer.add(50000);
        nomer.add(1000);
        nomer.add(20000);
        nomer.add(5000);

        System.out.println("Nomer Pertama : " + nomer.peek());
        System.out.println("Penghapusan : " + nomer.poll());
        System.out.println("Perubahan : " + nomer.peek());

    }
}

