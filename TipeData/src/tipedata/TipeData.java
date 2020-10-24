/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedata;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class TipeData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masuk=new Scanner(System.in);
    String NamaBarang;
    int hargabarang ,jumlahbarang,Pembayaran;
    double Total;
    
    
    
    
System.out.print("Masukkan Nama Barang     :");
NamaBarang =masuk.next();
System.out.print("\n");

System.out.print("harga satu barang        :");
hargabarang=masuk.nextInt();
System.out.print("\n");

System.out.print("jumlah yang dibeli       :");
jumlahbarang =masuk.nextInt();
Total = hargabarang*jumlahbarang;
System.out.print("\n");
System.out.println(Total+" Rupiah");
System.out.print("\n");





}}

