import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : Rp " + totalHarga);
        System.out.println("Diskon : Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Uang kembali : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Status     : Uang Tunai Kurang!");
            System.out.println("Kekurangan : Rp " + kurang);
        }

        input.close();
    }
    
}
