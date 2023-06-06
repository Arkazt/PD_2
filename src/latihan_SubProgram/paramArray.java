package latihan_SubProgram;
import java.io.*;

public class paramArray {
    //parameter : variabel tampung sementara di sebuah fungsi/ prosedur
    //fungsi berparameter array untuk menghitung rata-rata nilai (angka)

    public static int AvgArray(int[] data){
        //deklarasi variabel tampung lain untuk memproses suatu hitungan
        int jml=0, rata=0;
        //rata-rata (jumlah nilai/jumlah data)
        for (int i = 0; i < data.length; i++) {
            //lakukan penjumlahan nilai
            jml = jml + data[i];
        }
        rata = jml/data.length;

        return rata;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        AvgTotal();

    }

    public static void AvgTotal () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int d[] = {1,2,4,7}; //data statis

        //data dinamis
        int d1[]= new int[3];
        for (int j = 0; j < d1.length; j++) {
            System.out.print("Isi Angka : ");
            d1[j] = Integer.parseInt(br.readLine());
        }

        System.out.println(AvgArray(d1));
//        System.out.println(AvgArray(d));
    }

}
