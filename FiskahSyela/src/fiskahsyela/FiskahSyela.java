/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiskahsyela;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class FiskahSyela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masuk=new Scanner(System.in);
    int mawar, melati, matahari,TotalBunga;
    double harga, Total;
    harga = 4500;
    System.out.print("Jumlah Bunga Matahari\t\t\t\t:");
    matahari=masuk.nextInt();
    System.out.print("\n");
    
    System.out.print("Jumlah Bunga Melati\t\t\t\t:");
    melati=masuk.nextInt();
    System.out.print("\n");
    
    System.out.print("Jumlah Bunga Mawar\t\t\t\t:");
    mawar=masuk.nextInt();
    System.out.print("\n");
    TotalBunga = matahari+melati+mawar;
    Total = harga*TotalBunga;
    System.out.println("Total Bunga yang dibeli\t\t\t\t:"+matahari+"+"+melati+"+"+mawar+"="+TotalBunga);
    
    System.out.print("Total Yang Dibayar \t\t\t\t:"+ Total +"Rupiah");
    System.out.print("\n");

}}

   

