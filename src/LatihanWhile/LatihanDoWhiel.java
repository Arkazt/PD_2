package LatihanWhile;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class LatihanDoWhiel {
    public static void main(String[] args) {
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));

//        //letakkan integer dll sebelum blok try catch
//        int nim, i=0;
//        String nama;
//
//        //eror handling yg bisa custom
//        try {
//            do {
//                System.out.print("Entri NIM : ");
//                nim = Integer.parseInt(br.readline());
//                System.out.print("Entri Nama : ");
//                nama = br.readLine();
//                i++;
//            }while (i < 5);
//        }catch (Exception e) {
//
//        }

        //deklarasikan variabel
        String nimMhs = "", namaMhs = "", prodi = "", mk = "", cari = "";
        int uts, uas, tugas, menu, nilaiAkhir = 0;

        try {
            /*membuat program dengan menu
            1. Entri mahasiswa (nim, nama, prodi, mk)
            2. Hitung nilai mahasiswa (uts, uas, tugas)
            3. Lihat rapor mahasiswa
            4. Keluar program
             */
            do {
                System.out.println("==== Program Akademik Mahasiswa ====");
                System.out.println("1. Entri Mahasiswa");
                System.out.println("2. Hitung Nilai MK Mahasiswa");
                System.out.println("3. Lihat Rapor Mahasiswa");
                System.out.println("4. Keluar Program");
                menu = Integer.parseInt(be.readLine());

                //mengisi logika setiap menu (percabangan:if,switch-case)
                switch (menu) {
                    /*
                    if (menu == 1){
                    }else if (menu == 2){
                    }else
                     */
                    case 1:
                        System.out.println("==== Menu Entri Mahasiswa ====");
                        System.out.print("Entri NIM : ");
                        nimMhs = be.readLine();
                        System.out.print("Entri Nama : ");
                        namaMhs = be.readLine();
                        System.out.print("Entri Progam Studi : ");
                        prodi = be.readLine();
                        System.out.print("Entri Nama Mata Kuiah : ");
                        mk = be.readLine();
                        System.out.println();
                        break;//artinya berhenti proses case 1, dan mengembalikkan ke perulangan awal (menu awal)
                    case 2:
                        System.out.println("==== Menu Hitung Nilai MK Mahasiswa");
                        //hitung nilai akhir (30% * UTS + 30% * UAS + tugas)
                        System.out.print("Cari berdasarkan NIM : ");
                        cari = be.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            //jika sesuai maka entry nilai, jika tidak maka ada pesan "data tidak ditemukan"

                            System.out.print("Entri nilai UTS : ");
                            uts = Integer.parseInt(be.readLine());
                            System.out.print("Entri nilai UAS : ");
                            uas = Integer.parseInt(be.readLine());
                            System.out.print("Entri nilai tugas : ");
                            tugas = Integer.parseInt(be.readLine());

                            nilaiAkhir = (uts * 30 / 100) + (uas * 30 / 100) + (tugas * 40 / 100);

                            //cetak nilai akhir
                            System.out.println("Nilai Akhir = " + nilaiAkhir);
                            System.out.println();

                        } else {
                            System.out.println("Data tidak ditemukan ");
                        }

                        break;
                    case 3:
                        System.out.println("==== Menu Lihat Rapor ====");
                        //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.println(nimMhs + " " + nilaiAkhir);
                        System.out.println("Nilai AKhir MK " + mk + ": " + nilaiAkhir);

                        /*
                        A = 80-100
                        B+ = 75-79
                        B = 65-74
                        C+ = 60-64
                        C = 55-59
                        Nilai < 55 == D/E */

                        if (nilaiAkhir >= 80 && nilaiAkhir <=100) {
                            System.out.println("Nilai Huruf = A");
                        } else if (nilaiAkhir >= 75 && nilaiAkhir <=79) {
                            System.out.println("Nilai Huruf = B+");
                        } else if (nilaiAkhir >=65 && nilaiAkhir <=74) {
                            System.out.println("Nilai Huruf = B");
                        } else if (nilaiAkhir >=60 && nilaiAkhir <=64) {
                            System.out.println("Nilai Huruf = C+");
                        } else if (nilaiAkhir >=55 && nilaiAkhir <=59) {
                            System.out.println("Nilai Huruf = C");
                        } else {
                            System.out.println("Nilai Huruf = D/E");
                        }
                        System.out.println();
                        break;
                    default: //jika yang dipilih diluar 1-3, maka menjalankan apa
                        System.out.println("Selamat Berjuang");
                        System.exit(0);
                }

            } while (menu != 4);
        } catch (Exception e) {
            System.out.println("Status EROR !!!" + e.getMessage());
        }
    }
}
