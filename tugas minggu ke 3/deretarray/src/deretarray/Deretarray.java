/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretarray;

/**
 *
 * @author asus
 */
import java.util.*;
public class Deretarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int jumlahderet = 0;
        
        System.out.print("masukkan jumlah deret");
        jumlahderet = input.nextInt();
        
        int[]deretarray = new int[jumlahderet];
        
        for(int i =0; i<jumlahderet; i++){
            deretarray[i]=(int)(Math.random()*5);
            
        }
        for(int j =0; j<jumlahderet; j++){
            System.out.print(deretarray[j]+"\t");
        }
    }
    
}
