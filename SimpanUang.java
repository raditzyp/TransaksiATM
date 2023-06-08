import java.io.BufferedReader;
import java.io.IOException;

public class SimpanUang extends Menu {
    public static void simpanUang(BufferedReader br, int saldo, int[] tambah_saldo, int index) throws IOException {
        int tabung;
        System.out.println("");
        System.out.println("+------------------- NABUNG --------------------+");
        System.out.println("+-----------------------------------------------+");
        System.out.print("                  Rp. ");
        tabung = Integer.parseInt(br.readLine());
        tambah_saldo[index] = tabung;
        saldo += tabung;
        System.out.println("     Saldo Anda sekarang adalah Rp. " + saldo);
        System.out.println("+-----------------------------------------------+");

        // Memperbarui nilai saldo saat menyimpan uang
        setSaldo(saldo);
    }
}