import java.util.*;

public class Atm extends Nasabah {
        int pilih;
        public Scanner in = new Scanner(System.in);
        static String cekRek = null;
        static String cek =null;
        static int option;

        public Atm (){

        }
        public Atm (String rekening, String pin, int saldo) {
            rekening = getRekening();
            pin = getPin();
            saldo = getSaldo();
        }

    //method menu pertama
        public void menuA () {
            String[] a = {"Tarik Cepat", "1. 50.000 ", "2. 200.000 ", "3. 500.000 ", "4. 1.000.000 ", "5. Menu Lainnya"};
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
            int b;
            b = in.nextInt();
            if (b == 1) {
                jumlah = 50_000;
                saldo -= jumlah;
                miskin();
                System.out.println(getSaldo());
            } else if (b == 2) {
                jumlah = 200_000;
                saldo -= jumlah;
                miskin();
                System.out.println(getSaldo());
            } else if (b == 3) {
                jumlah = 500_000;
                saldo -= jumlah;
                miskin();
                System.out.println(getSaldo());
            } else if (b == 4) {
                jumlah = 1_000_000;
                saldo -= jumlah;
                miskin();
                System.out.println(getSaldo());
            } else if (b == 5) {
                menuB();
            } else {
                System.out.println("Tidak ada angka");
                menuA();
            }
        }

        public void menuB () {
            do {
                String[] a = {"1. Menarik Uang", "2. Menabung", "3. Transfer", "4. Periksa Saldo", "5. Keluar"};
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
                pilih = in.nextInt();
                switch (pilih) {
                    case 1:
                        tarik();
                        break;
                    case 2:
                        tabung();
                        break;
                    case 3:
                        transfer();
                        break;
                    case 4:
                        System.out.println(getSaldo());
                        break;
                    case 5:
                        System.out.println("Terima kasih");
                        break;
                    default:
                        System.out.println("Masukkan angka yang benar");
                        break;
                }
            } while (pilih != 5);
        }

        public int getSaldo () {
            System.out.print(" Saldo Anda Adalah ");
            return super.saldo;
        }
    }
