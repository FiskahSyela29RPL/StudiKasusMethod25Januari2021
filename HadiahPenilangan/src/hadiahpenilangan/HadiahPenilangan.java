package hadiahpenilangan;

import java.util.Scanner;

/**
 *
 * @author Fiskah Syela 29 RPL
 */
public class HadiahPenilangan {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pengecekan Berkendara Selama Pandemi");
        System.out.println("Apakah Anda Membawa SIM ?");
        System.out.println("1. Ya 2. Tidak");
        int pilihan = input.nextInt();

        if (pilihan==1){
            System.out.println("Lanjutkan Pengecekan");
        }
        else  {
            System.out.println("Berhenti, Anda Tertilang");
        }
        
        System.out.println("Apakah Anda Membawa STNK ?");
        System.out.println("1. Ya 2. Tidak");
        int pilihan2 = input.nextInt();

        if (pilihan2==1){
            System.out.println("Lanjutkan Pengecekan");
        }
        else if (pilihan2==2){
            System.out.println("Berhenti, Anda Tertilang");
        }
        System.out.println("Apakah Anda Memakai Masker ?");
        System.out.println("1. Ya 2. Tidak");
        int pilihan3 = input.nextInt();

        if (pilihan3==1){
            System.out.println("Lanjutkan Pengecekan");
        }
        else if (pilihan3==2){
            System.out.println("Berhenti, Anda Tertilang");
        }
        
        
    }
    
}
