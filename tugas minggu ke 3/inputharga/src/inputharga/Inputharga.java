/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputharga;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Inputharga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String nama_pembeli;
        int Barang1, Barang2, Barang3, Barang4, Barang5;
        double totalBayar;
        
        System.out.println("           Kharisma Agung plaza         ");
        System.out.println("          Promo Belanja Berhadiah       ");
        System.out.println("      Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("      Dengan Harga Minimum Rp 10000,00         ");
        
        System.out.println("=================================================");
        System.out.print("Masukkan Nama Pembeli :");
        nama_pembeli=s.nextLine();
        System.out.print("\n");
        
        System.out.print("Masukkan harga barang ke-1 :");
        Barang1=s.nextInt();
        System.out.print("Masukkan harga barang ke-2 :");
        Barang2=s.nextInt();
        System.out.print("Masukkan harga barang ke-3 :");
        Barang3=s.nextInt();
        System.out.print("Masukkan harga barang ke-4 :");
        Barang4=s.nextInt();
        System.out.print("Masukkan harga barang ke-5 :");
        Barang5=s.nextInt();
        
        System.out.print("\n");
        totalBayar=Barang1+Barang2+Barang3+Barang4+Barang5;
        System.out.println("Total harga pembelian atas nama "
        +nama_pembeli +" adalah RP"+totalBayar);
        System.out.print("\n");
        
         if(totalBayar >= 100000){
        System.out.println("Selamat....\nAnda mendapat hadiah 1 buah mug cantik");
        }
        
        System.out.print("\n");
        System.out.println("==================================================");
        System.out.println("                 Terimakasih                      ");
        System.out.println("  Anda Sudah Berbelanja di Kharisma Agung Plaza   ");
    }
    
}
