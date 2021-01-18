/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;

import java.util.Scanner;

/**
 *
 * @author Fiskah Syela 29 RPL
 */
public class atmTabungan {
    
    //membuat attribute
    int tabunganAwal, menabung, mengambil;
    Scanner masuk = new Scanner(System.in);
    
    //method void menabung untuk menyimpan banyaknya uang yang user tabung
    void menabung () {
        System.out.println("Menabung Tabungan Anda");
        System.out.print("Masukkan Jumlah Uang :");
        menabung = masuk.nextInt();
         //operator untuk mengurangi menambah
        tabunganAwal += menabung;
        System.out.println("Tabungan anda : " +" Rp "+tabunganAwal);
    }
    //method void mengambil  untuk menyimpan banyaknya uang yang user tabung
    void mengambil (){
        System.out.println("Mengambil Tabungan Anda");
        System.out.print("Masukkan Jumlah Uang :");
        mengambil = masuk.nextInt();
        //operator untuk mengurangi tabungan awal
        tabunganAwal -= mengambil;
        System.out.println("Tabungan Anda : " +" Rp "+tabunganAwal );
    }
    
    int TabunganAwal() {
        return tabunganAwal;
    }
    
    
}
