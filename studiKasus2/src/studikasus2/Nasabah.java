import java.util.*;

public class Nasabah {
    Scanner in = new Scanner(System.in);
    private String rekening;
    private String pin;
    protected int saldo;
    private int tahun;
    private double bunga;
    public int jumlah;
    //gak wajib boss
    int transaksi;

    public Nasabah () {

    }

    public boolean cek(String rekening, String pin) {
        return Objects.equals(this.rekening, rekening) && Objects.equals(this.pin, pin);
    }

    public void tabung () {
        System.out.println("Masukkan jumlah uang Anda : ");
        jumlah = in.nextInt();
        this.saldo += jumlah;
        System.out.println("Saldo anda : " +getSaldo());
    }

    public void tarik () {
        System.out.println("Masukkan jumlah uang yang ingin Anda tarik ");
        jumlah = in.nextInt();
        miskin();
        this.saldo -= jumlah;
        System.out.println("Saldo anda : " +getSaldo());
    }

    public void transfer () {
        System.out.println("Masukkan jumlah uang yang ingin Anda Transfer ");
        jumlah = in.nextInt();
        miskin();
        this.saldo -= jumlah;
        System.out.println("Saldo anda : " +getSaldo());
    }

    public void miskin () {
        Atm a = new Atm();
        if ( saldo > 0 ){
            System.out.println("Terima Kasih atas transaksinya");
            a.menuB();
        } else if ( saldo > jumlah ) {
            System.out.println("Isi rekening Anda");
            System.out.println("Mau menabung ? y/n");
            String pilihan = in.nextLine();
            if (pilihan.equalsIgnoreCase("y")){
                tabung();
            } else if (pilihan.equalsIgnoreCase("n")){
                a.menuA();
            }
        } else {
            System.out.println("Maaf transaksi tidak bisa dilakukan, mohon isi saldo Anda");
            a.menuA();
        }
    }

    public String getPin() {
        return pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getRekening() {
        return rekening;
    }
}
