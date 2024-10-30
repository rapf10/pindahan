class Bangun_Datar {
    double panjang;
    double lebar;

    Bangun_Datar(double Panjang, double Lebar) {
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    double HitungLuas() {
        return panjang * lebar;
    }

    double HitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    void cetakHasil() {
        System.out.println("Luas = " + HitungLuas());
        System.out.println("Keliling = " + HitungKeliling());
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Bangun_Datar bangun = new Bangun_Datar(3, 6);
        bangun.cetakHasil();
    }
}