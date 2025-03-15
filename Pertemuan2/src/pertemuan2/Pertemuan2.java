/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author windudharma
 * Tgl : 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nama = "Fufufafa";
        String nim = "12312312" ;
        double ipk = 4.99;
        String input;
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Input Nama Mahasiswa : ");
            nama = dtain.readLine();
            
            
            System.out.print("Input NIM Mahasiswa : ");
            nim = dtain.readLine();
            
            
            System.out.print("Input IPK Mahasiswa : ");
            
            input = dtain.readLine();
            ipk = Double.parseDouble(input);
            
            
        }catch(IOException e){
            System.out.println("Eror Pembacaan Data");
        }
        
        
        
        System.out.println("Nama = " + nama);
        System.out.println("Nim = " + nim);
        System.out.printf("Nim saya adalah %s dengan nim %s dengan ipk %.2f ",nama,nim,ipk);

        
        
    }  
    
}
