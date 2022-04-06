/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int pilihan, menu;
        double nik, tulis, coding, wawancara;
        String nama, ket;
        System.out.println("Nama : Nur Rosydatun Nafiah");
        System.out.println("NIM  : 123200001\n\n\n");
        System.out.println("FORM PENDAFTARAN PT. UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("=== FORM PENDAFTARAN === ");
                System.out.print(" Input NIK : ");
                nik = input.nextDouble();
                System.out.print(" Input Nama : ");
                nama = input.next();
                System.out.print(" Input Nilai Tes Tulis : ");
                tulis = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                coding = input.nextDouble();
                System.out.print(" Input Nilai Tes Wawancara : ");
                wawancara = input.nextDouble();
                PesertaAndro Andro = new PesertaAndro(nama, tulis, coding, wawancara);
                do{
                    System.out.println("\n\n=== Menu ===");
                    System.out.println(" 1. Tampil");
                    System.out.println(" 2. Edit");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu = input.nextInt();
                    switch(menu) {
                        case 1:
                            double hasil = Andro.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            if (hasil < 85){
                                ket = "GAGAL";
                            }
                            else{
                                ket = "LOLOS";
                            }
                            System.out.println(" Keterangan     : " + ket); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf, "+ Andro.nama + " telah ditolak sebagai Android Development");
                            }else {
                                System.out.println(" Selamat, "+ Andro.nama + " telah diterima sebagai Android Development");
                            }
                            break;
                        case 2: 
                            System.out.println(" === FORM EDIT ===");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            tulis = input.nextDouble();
                            Andro.setTulis(tulis);
                            System.out.print(" Input Nilai Tes Coding : ");
                            coding = input.nextDouble();
                            Andro.setCoding(coding);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            wawancara = input.nextDouble();
                            Andro.setWawancara(wawancara);
                            break;
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                        }
                }while(menu != 3);
                break;
            case 2: 
                System.out.println("=== Form Pendaftaran === ");
                System.out.print(" Input NIK : ");
                nik = input.nextDouble();
                System.out.print(" Input Nama : ");
                nama = input.next();
                System.out.print(" Input Nilai Tes Tulis : ");
                tulis = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                coding = input.nextDouble();
                System.out.print(" Input Nilai Tes Wawancara : ");
                wawancara = input.nextDouble();
                PesertaWeb Web = new PesertaWeb(nama, tulis, coding, wawancara);
                do{
                    System.out.println("\n\n=== Menu ===");
                    System.out.println(" 1. Tampil");
                    System.out.println(" 2. Edit");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu = input.nextInt();
                    switch(menu) {
                        case 1:
                            double hasil = Web.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            if (hasil < 85){
                                ket = "GAGAL";
                            }
                            else{
                                ket = "LOLOS";
                            }
                            System.out.println(" Keterangan     : " + ket); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf, "+ Web.nama + " telah diteolak sebagai Web Development");
                            }else {
                                System.out.println(" Selamat, "+ Web.nama  + " telah diterima sebagai Web Development");
                            }
                            break;
                        case 2: 
                            System.out.println(" === FORM EDIT ===");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            tulis = input.nextDouble();
                            Web.setTulis(tulis);
                            System.out.print(" Input Nilai Tes Coding : ");
                            coding = input.nextDouble();
                            Web.setCoding(coding);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            wawancara = input.nextDouble();
                            Web.setWawancara(wawancara);
                            break;
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                        }
                }while(menu != 3);
                break;
        }
    }
}
