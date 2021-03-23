/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputmenu;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Inputmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int pilih;
        String nama;
        System.out.println("                 CAFE CERIA                   ");
        System.out.println("                ANEKA MINUMAN                 ");
        System.out.println("----------------------------------------------");
        System.out.print("SPECIAL MENU :\n 1. Soft Drink)\n 2. Mix Juice)\n 3. Nescafe\n 4. Soda Milk\n 5. Tea \n");
        System.out.println("----------------------------------------------");
        System.out.print("Masukkan nama pembeli :");
        nama = input.nextLine();
        System.out.print("\n");
        System.out.print("Silahkan masukkan pilihan anda :");
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Minuman yang anda psan adalah : Soft Drink");
            break;
            case 2:
                System.out.println("Minuman yang anda psan adalah : Mix Juice");
            break;
            case 3:
                System.out.println("Minuman yang anda psan adalah : Nescafe");
            break;
            case 4:
                System.out.println("Minuman yang anda psan adalah : Soda Milk");
            break;
            case 5:
                System.out.println("Minuman yang anda psan adalah : Tea");
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
        System.out.println("Pesanan akan segera kami antar       ");
        System.out.println("Terimakasih "+nama+" telah berkunjung di Cafe Ceria");
    }
}
