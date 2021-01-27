
package studikasus25januari;

import java.util.Random;
import java.util.Scanner;

/*  class 3 yang berisi game tic tac toe
    dengan penerapan minimal dua method static
    logika program melihat tutorial youtube milik TheBlueprint*/
public class Class3 {
        //membuat fields poin pemain dan komputer
    //juga membuat objek in dari class scanner    
     int poinPemain = 0;
     int poinKomputer = 0;
    Scanner in = new Scanner(System.in);

    //membuat method menyapa yag berisi apakah user mau melanjutkan game atau tidak
    void menyapa (){
    //membuat objek sehingga nama user diawal bisa dipanggil
    System.out.println(" ");
    System.out.println("Halo Apakah kamu mau bermain game tic tac toe?");
    System.out.println("1. Ya 2. Tidak");
    int pilihan;
    System.out.println(" ");
                System.out.print("Masukkan pilihan Anda: ");
                pilihan = in.nextInt();
                System.out.println(" ");
                
    do {
        System.out.print("Masukkan angka 1 atau 2");
        while (!in.hasNextInt()) {
            System.out.println("Tolong masukkan angka");
            in.nextInt(); 
             }
            pilihan= in.nextInt();
            } while (pilihan>3);
    switch (pilihan){
        case 1 :
            game();
            break;
        case 2 :
            System.out.println("Selamat melanjutkan hidup!");
    }
    
    }
       
    //membuat method void bernama game untuk mengumpulkan semua method dibawahnya menjadi game
    //method ini berfungsi juga sebegai looping game
    void game (){
        //membuat papan atau garis pemisah dari game tic tac toe dengan array 2d
        char [][] papanGame = {{'_','|','_','|','_'},{'_', '|', '_','|','_'},{' ','|',' ','|',' '}};
        //memanggil method papan agar papan di print
        papan(papanGame);        
        
        //setelah game berakhir dan menampilkan poin dan juga looping apabila user ingin bermain lagi
        boolean gameOver = false;
        boolean mainLagi = true;
        //untuk melihat pergerakan pemain dan komputer
        while(mainLagi) {
            while (!gameOver) {
                //apabila gerakan terakhir adalah pemain
                gerakanPemain(papanGame);
                gameOver = gameOver(papanGame);
                if (gameOver) {
                    break;
                }
                //apabila gerakan terakhir adakah komputer
                gerakanKomputer(papanGame);
                gameOver = gameOver(papanGame);
                if (gameOver) {
                    break;
                }
            }
            System.out.println("Poin Anda adalah : " +poinPemain);
            System.out.println("Poin Komputer adalah : "+ poinKomputer);
            //
            System.out.println("Mau bermain lagi? Y/N");
            String pilihan = in.nextLine();
            switch (pilihan){
                case "Y":
                case "y":
                    mainLagi = true;
                     System.out.println("Selamat Datang di Game Tic Tac Toe ");
                    System.out.println("+===============================+");
                    resetPapan(papanGame);
                    gameOver = false;
                    papan(papanGame);
                    break;

                case "N":
                case "n":
                    mainLagi = false;
                    System.out.println("Thanks for playing");
                    break;
                default:
                    break;
            }

        }
    }
    //method untuk membuat papan berbentuk seperti game
    void papan(char [][] papanGame){
        //setiap char dibaris papan game, akan di print
        for(char[] baris : papanGame){
            for( char i : baris){
            System.out.print(i);
            }
            System.out.println();
        }
    }
    
    //agar membuat posisi pion dapat diakses dengan angka 1-9
    void papanBermain( int posisi, int pemain, char [][] papanGame){
        char pion;
        if(pemain==1){
            pion = 'X';
        }else{
            pion = 'O';
        }       
        switch (posisi){
            case 1:
                papanGame[0][0] = pion;
                papan(papanGame);
                break;
            case 2 :
                papanGame[0][2] = pion;
                papan(papanGame);
                break;
            case 3 :
                papanGame[0][4] = pion;
                papan(papanGame);
                break;    
            case 4 :
                papanGame[1][0] = pion;
                papan(papanGame);
                break;        
             case 5 :
                papanGame[1][2] = pion;
                papan(papanGame);
                break;   
            case 6 :
                papanGame[1][4] = pion;
                papan(papanGame);
                break;
            case 7 :
                papanGame[2][0] = pion;
                papan(papanGame);
                break;
            case 8 :
                papanGame[2][2] = pion;
                papan(papanGame);
                break;   
            case 9 :
                papanGame[2][4] = pion;
                papan(papanGame);
                break;
            default :
                break;
        }
    }

    //method agar peman dapat memilih antara 1-9
    void gerakanPemain(char[][] papanGame){
        System.out.println("Untuk bergerak silahkan piilih angka 1-9, sesuai dengan lokasi kotak");
        int gerakan = in.nextInt();
        boolean hasil = validasiGerakan(gerakan,papanGame);
        while(!hasil){
            System.out.println("Masukkan angka dengan benar");
            //agar gerakan tetap dilakukan meskipun pilihan sudah ditempati
            gerakan = in.nextInt();
            hasil = validasiGerakan(gerakan,papanGame);
        }
        System.out.println("Anda bergerak ke " + gerakan);
        papanBermain(gerakan,1,papanGame);
        }
    
    //untuk menampilkan gerakan user, dan juga memberi posisi pion
    boolean validasiGerakan(int gerakan, char[][] papanGame){
        switch (gerakan){
        case 1:
            if(papanGame[0][0] == '_'){
                return true;
            } else{
                return false;
            }
        case 2:
            if(papanGame[0][2] == '_'){
                return true;
            } else{
                return false;
            }
        case 3:
            if(papanGame[0][4] == '_'){
                return true;
            } else{
                return false;
            }

        case 4:
            if(papanGame[1][0] == '_'){
                return true;
            } else{
                return false;
            }
        case 5:
            if(papanGame[1][2] == '_'){
                return true;
            } else{
                return false;
            }
        case 6:
            if(papanGame[1][4] == '_'){
                return true;
            } else{
                return false;
            }
        case 7:
            if(papanGame[2][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 8:
            if(papanGame[2][2] == ' '){
                return true;
            } else{
                return false;
            }
        case 9:
            if(papanGame[2][4] == ' '){
                return true;
            } else{
                return false;
            }

        default:
            return false;
        }

    }
    //method gerakan komputer
    void gerakanKomputer(char [][] papanGame){
        //agar gerakan komputer dilakukan otomatis, mengimport java claass random
        Random in = new Random();
        int gerakan = in.nextInt(9)+1;
        boolean hasil = validasiGerakan(gerakan,papanGame);
        
        while(!hasil){
            gerakan = in.nextInt(9)+1;
            hasil = validasiGerakan(gerakan, papanGame);
        }
        System.out.println("Komputer bergerak ke"+ gerakan);
        //gerakan dua, karen komputer bergerak setelah user
        papanBermain(gerakan,2,papanGame);
}

   
    //method static untuk mengecek apakah game dimenangkan
    boolean gameOver (char [ ] [ ] papanGame){
        
        //sejajar secara horizontal
        if(papanGame[0][0] == 'X'&& papanGame[0][2] == 'X' && papanGame [0][4] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[0][0] == 'O'&& papanGame[0][2] == 'O' && papanGame[0][4] == 'O' ){
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }
        if(papanGame[1][0] == 'X'&& papanGame[1][2] == 'X' && papanGame[1][4] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[1][0] == 'O'&& papanGame[1][2] == 'O' && papanGame[1][4] == 'O' ){
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }
        if(papanGame[2][0] == 'X'&& papanGame[2][2] == 'X' && papanGame [2][4] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[2][0] == 'O'&& papanGame[2][2] == 'O' && papanGame [2][4] == 'O' ) {
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }
    //sejajar secara vertical
        if(papanGame[0][0] == 'X'&& papanGame[1][0] == 'X' && papanGame [2][0] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[0][0] == 'O'&& papanGame[1][0] == 'O' && papanGame [2][0] == 'O' ){
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }

        if(papanGame[0][2] == 'X'&& papanGame[1][2] == 'X' && papanGame [2][2] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[0][2] == 'O'&& papanGame[1][2] == 'O' && papanGame [2][2] == 'O' ){
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }

        if(papanGame[0][4] == 'X'&& papanGame[1][4] == 'X' && papanGame [2][4] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[0][4] == 'O'&& papanGame[1][4] == 'O' && papanGame [2][4] == 'O' ){
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }

        //sejajar secraa diagonal
        if(papanGame[0][0] == 'X'&& papanGame[1][2] == 'X' && papanGame [2][4] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[0][0] == 'O'&& papanGame[1][2] == 'O' && papanGame [2][4] == 'O' ){
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }

        if(papanGame[2][0] == 'X'&& papanGame[1][2] == 'X' && papanGame [0][4] == 'X' ){
            System.out.println("ANDA MENANG");
            poinPemain++;
            return true;
        }
        if(papanGame[2][0] == 'O'&& papanGame[1][2] == 'O' && papanGame [0][4] == 'O' ){
            System.out.println("ANDA KALAH");
            poinPemain++;
            return true;
        }

        if(papanGame[0][0] != '_' && papanGame[0][2] != '_' && papanGame[0][4] != '_' && papanGame[1][0] !='_'&&
            papanGame[1][2] != '_' && papanGame[1][4] != '_' && papanGame[2][0] != ' ' && papanGame[2][2] != ' ' && papanGame[2][4] != ' '){
            System.out.println("Game seri");
            return true;
        }
        return false;
        
    }

    //method agar papan seperti sebelum bermain game
    void resetPapan (char papanGame [ ] [ ]){
        papanGame [0][0] = '_';
        papanGame [0][2] = '_';
        papanGame [0][4] = '_';
        papanGame [1][0] = '_';
        papanGame [1][2] = '_';
        papanGame [1][4] = '_';
        papanGame [2][0] = ' ';
        papanGame [2][2] = ' ';
        papanGame [2][4] = ' ';        
    }
}
