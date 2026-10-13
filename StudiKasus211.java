import java.util.Scanner;
import java.util.Locale;

public class StudiKasus211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print(
            "Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : "
        );
        String jenis = input.nextLine().trim().toUpperCase(Locale.ROOT);

        if (jenis.equals("BELMAWA")
                || jenis.equals("BAKORMA")
                || jenis.equals("MANDIRI")) {

            System.out.print("Peringkat juara (0 jika bukan juara) : ");
            int juara = Integer.parseInt(input.nextLine());

            if (juara >= 1 && juara <= 3) {
                System.out.print("Jumlah dokumen (0-4) : ");
                int dokumen = Integer.parseInt(input.nextLine());

    }
}