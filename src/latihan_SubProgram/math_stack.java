package latihan_SubProgram;

import java.io.*;
import java.util.*;
public class math_stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //class math : int, float, double, bukan String
        //sqrt : akar kuadrat
        System.out.println(Math.sqrt(4.0));

        //pow : pangkat
        System.out.println(Math.pow(5.0, 3));

        //randow
        System.out.println(Math.random());

        /*
            item jurusan:
            1. SI
            2. DKV
            3. Manajemen

            Stack: urutan LIFO
            Ketentuan:
            - import java util
            - deklarasi stack
            - push data (tambah data)
            - pop (ambil data/item)
            - size (lihat jumlah urutan stack)
         */

        Stack<String> stack = new Stack<>();
        //isi data --> push
        System.out.println("Nama Prodi 1 " + stack.push("SI"));
        System.out.println("Nama Prodi 2 " + stack.push("DKV"));
        System.out.println("Nama Prodi 3 " + stack.push("Manajemen"));

        //lihat isi stack (penggunaan while karena data lebih dari satu)
        //! = notasi tidak sama dengan
        while (!stack.empty()){
            System.out.println("Cetak Nama Urutan : " + stack.pop());
            System.out.println("Jumlah Urutan sekarang: " + stack.size());
        }
    }
}
