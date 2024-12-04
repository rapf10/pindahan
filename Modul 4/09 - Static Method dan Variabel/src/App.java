import java.util.ArrayList;

class Player {
    //variabel untuk objek
    private String nama;

    //Static Variabel
    private static int numberPlayer;

    //static variabel menampung nama
    private static ArrayList<String> namaList = new ArrayList<String>();

    
    //constructor
    Player (String nama){
        this.nama = nama;
        Player.numberPlayer++; //add object menambah objek
        Player.namaList.add(this.nama);
    }

    // method untuk membaca variabel private
    void cetak(){
        System.out.println("Nama : " + this.nama);
    }

    //static method
    static void shownumberPlayer(){
        System.out.println("Jumlah Player : " + Player.numberPlayer);
    }
    
    static ArrayList<String> getNama(){
       return Player.namaList;
    }
}


public class App {
    public static void main(String[] args) throws Exception { //static method punya class
        System.out.println("Hello, World!");
        // Membuat object baru
        Player player1 = new Player("Hinata Shoyo");
        Player player2 = new Player("Yoshimura");
        Player player3 = new Player("Saitama");
        Player player4 = new Player("Luffy");
        Player player5 = new Player("Haruto");
        
        // menerapkan static variabel dan method
        Player.shownumberPlayer();

        // menampilkan semua nama player
        System.out.println(Player.getNama());
    }
}
