package Tugas2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.SocketHandler;


public class Datamahasiswa {

    public static void main(String[] args){
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> NIM = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        Scanner input =new Scanner(System.in);

        int pilihan;

        do{
            System.out.println("\n Program Data Mahasiswa");
            System.out.println("=========================");
            System.out.println("1.Tambahkan");
            System.out.println("2.Tampilkan");
            System.out.println("3.Cari");
            System.out.println("4.Hapus");
            System.out.println("5.Keluar");
            System.out.println("\nPilihan Menu:");
            pilihan=input.nextInt();

            if(pilihan==1){
                System.out.print("Masukan nama :");
                String nm =input.next();
                nama.add(nm);

                System.out.print("Masukan nim :");
                String nim =input.next();
                NIM.add(nim);

                System.out.print("Masukan alamat :");
                String alm =input.next();
                alamat.add(alm);

            } else if(pilihan== 2) {
                System.out.println("Data mahasiswa");
                System.out.println("=============");

                for (int i =0; i<NIM.size(); i++){
                    System.out.println(i + 1 + "." + NIM.get(i));
                }
                System.out.println("Untuk melihat data lengkap,Cari Data (3)");
            } else if (pilihan== 3){
                System.out.print("Masukan data nomor berapa yang ingin di cari :");
                int cari = input.nextInt();
                if(cari == 1){
                    System.out.println("Nama:" + nama.get(0));
                    System.out.println("Nim:" + NIM.get(0));
                    System.out.println("Alamat:" + alamat.get(0));
                }
                System.out.println("===============");

                if (cari == 2) {
                    System.out.println("Nama:" + nama.get(1));
                    System.out.println("Nim:" + NIM.get(1));
                    System.out.println("Alamat:" + alamat.get(1));
                }
            } else if(pilihan == 4){
                System.out.println("data Mahasiswa");
                System.out.println("======================");

                for(int i=0; i<NIM.size() ; i++){
                    System.out.println(i + 1 + "." + NIM.get(i));

                }
                System.out.println("Masukan Nim yang akan di Hapus :");
                String nim= input.next();
                NIM.remove(nim);
            }
            else if (pilihan == 5){
                System.out.println("Selesai");
            }else {
                System.err.println("mennu tidak tersedia");
            }

        }while (pilihan != 5);

    }
}
