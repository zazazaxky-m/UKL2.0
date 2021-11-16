/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry2;

/**
 *
 * @author Zacky
 */
public class LaundryRun {
        public static void main(String[] args) {
        JenisLaundry daftarJenisLaundry = new JenisLaundry();
        Client daftarClient = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Laporan laporanLaundry = new Laporan();

        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(daftarJenisLaundry);
        System.out.println();
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        System.out.println();
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        
    }
}
