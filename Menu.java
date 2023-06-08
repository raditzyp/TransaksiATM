import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private static int saldo = 50000;
    private static int[] tambah_saldo = new int[20];
    private static int[] tarik_saldo = new int[20];
    private static int index = 0;
    private static int index2 = 0;

    public static int getIndex2() {
        return index2;
    }

    public static void setIndex2(int newIndex2) {
        index2 = newIndex2;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int newSaldo) {
        saldo = newSaldo;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <= 2; i++) {
            System.out.println("+----------------+ PINDIT BANK +----------------+");
            System.out.println();
            System.out.println("+-----------+");
            System.out.print("| USER      : ");
            String user = br.readLine();
            System.out.println("+-----------+");
            System.out.print("| PASSWORD  : ");
            int password = Integer.parseInt(br.readLine());

            if ((user.equalsIgnoreCase("admin")) && (password == 12345)) {
                System.out.println("+-----------+");
                System.out.println("\nLOGIN BERHASIL");
                i = 5;

                boolean kembali = false;

                while (!kembali) {
                    System.out.println("");
                    System.out.println("+----------------+ PINDIT BANK +----------------+");
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("| 1. CEK SALDO                                  |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("| 2. SIMPAN UANG                                |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("| 3. AMBIL UANG                                 |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("| 4. CATATAN TRANSAKSI                          |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("| 5. BANTUAN                                    |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("| 6. KELUAR                                     |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.print("\nPilih Menu : ");
                    int pilihan;
                    try {
                        pilihan = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Mohon masukkan angka sebagai pilihan.");
                        continue;
                    }

                    switch (pilihan) {
                        case 1:
                            CekSaldo.cekSaldo(saldo);
                            break;
                        case 2:
                            SimpanUang.simpanUang(br, saldo, tambah_saldo, index);
                            saldo = Menu.getSaldo(); // Mengupdate saldo setelah menyimpan uang
                            index++;
                            break;
                        case 3:
                            saldo = AmbilUang.ambilUang(br, saldo, tarik_saldo, index2);
                            index2++;
                            break;
                        case 4:
                            CatatanTransaksi.catatanTransaksi(tambah_saldo, index, tarik_saldo, index2, saldo);
                            break;
                        case 5:
                            Bantuan.bantuan();
                            break;
                        case 6:
                            System.out.println("\nAnda telah keluar dari Pindit Bank.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            continue;
                    }

                    if (pilihan >= 1 && pilihan <= 5) {
                        System.out.print("\nKembali ke menu utama? (y/n) : ");
                        String kembali_menu = br.readLine();
                        if (kembali_menu.equalsIgnoreCase("y")) {
                            kembali = false;
                        } else {
                            System.out.println("\nAnda telah keluar dari Pindit Bank.");
                            System.exit(0);
                        }
                    } else {
                        kembali = true;
                    }
                }
            } else if (i == 2) {
                System.out.println("+-----------+");
                System.out.println("\nAnda telah 3x memasukkan user dan password yang salah.");
                System.out.println("Maaf, akses Anda ditolak.");
                System.exit(0);
            } else {
                System.out.println("\nUser atau password yang Anda masukkan salah.");
                System.out.println("Silakan coba lagi.");
                System.out.println("Kesempatan mencoba: " + (2 - i) + " kali lagi");
            }
        }
    }
}
