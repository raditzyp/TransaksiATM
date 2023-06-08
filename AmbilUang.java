import java.io.BufferedReader;
import java.io.IOException;

public class AmbilUang extends Menu {
    public static int ambilUang(BufferedReader br, int saldo, int[] tarik_saldo, int index2) throws IOException {
        int ambil;

        System.out.println("");
        System.out.println("+----------------- Ambil Uang ------------------+");
        System.out.println("+-----------------------------------------------+");
        System.out.print("                   Rp. ");
        ambil = Integer.parseInt(br.readLine());

        int sisaSaldo = saldo - ambil;
        if (sisaSaldo < 50000) {
            System.out.println("Saldo minimal harus Rp. 50.000");
        } else {
            saldo -= ambil;
            tarik_saldo[index2] = ambil; // Menyimpan jumlah uang yang diambil ke array tarik_saldo
            index2++; // Menambah index histori pengambilan saldo
            setSaldo(saldo);
            System.out.println("          Saldo Anda adalah Rp. " + saldo);
        }

        System.out.println("+-----------------------------------------------+");
        return saldo;
    }
}