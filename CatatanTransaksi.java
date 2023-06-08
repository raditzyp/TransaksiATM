public class CatatanTransaksi extends Menu {
    public static void catatanTransaksi(int[] tambah_saldo, int index, int[] tarik_saldo, int index2, int saldo) {
        System.out.println("");
        System.out.println("+-------------- CATATAN TRANSAKSI --------------+");
        System.out.println("+-----------------------------------------------+");
        System.out.println("Transaksi Penambahan Saldo:");
        int totalTambah = 0;
        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + ". +Rp. " + tambah_saldo[i]);
            totalTambah += tambah_saldo[i];
        }

        System.out.println("\nTransaksi Pengambilan Saldo:");
        int totalTarik = 0;
        for (int i = 0; i < index2; i++) {
            System.out.println((i + 1) + ". -Rp. " + tarik_saldo[i]);
            totalTarik += tarik_saldo[i];
        }

        int saldoAkhir = saldo;

        System.out.println("");
        System.out.println("Saldo Akhir Anda adalah Rp. " + saldoAkhir);
        System.out.println("+-----------------------------------------------+");
    }

    public void catatSimpanUang(int jumlahSimpan, int saldoSebelumnya, int index) {
        System.out.println("+-------------- CATATAN TRANSAKSI --------------+");
        System.out.println("+-----------------------------------------------+");
        System.out.println("Transaksi Penambahan Saldo:");
        System.out.println((index + 1) + ". +Rp. " + jumlahSimpan);

        int saldoAkhir = saldoSebelumnya + jumlahSimpan;

        System.out.println("");
        System.out.println("Saldo Akhir Anda adalah Rp. " + saldoAkhir);
        System.out.println("+-----------------------------------------------+");

        // Perbarui nilai saldo
        setSaldo(saldoAkhir);
    }

    public void catatAmbilUang(int jumlahAmbil, int saldoSebelumnya, int index) {
        System.out.println("+-------------- CATATAN TRANSAKSI --------------+");
        System.out.println("+-----------------------------------------------+");
        System.out.println("Transaksi Pengambilan Saldo:");
        System.out.println((index + 1) + ". -Rp. " + jumlahAmbil);

        int saldoAkhir = saldoSebelumnya - jumlahAmbil;

        System.out.println("");
        System.out.println("Saldo Akhir Anda adalah Rp. " + saldoAkhir);
        System.out.println("+-----------------------------------------------+");

        // Perbarui nilai saldo
        setSaldo(saldoAkhir);
    }
}