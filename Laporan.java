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
public class Laporan {
 public void laporan(JenisLaundry jenisLaundry){
  int x=jenisLaundry.getJmlJenisLaundry();

  System.out.println();
  System.out.println("Tabel Jenis Laundry");
  System.out.println();
  System.out.println("ID \tNama Jenis Laundry \tDurasi(hr) \tHarga/kg");
  for (int i = 0; i < x; i++) {
   System.out.println((i) +"\t"+ jenisLaundry.getNamaJenisLaundry(i)+"\t"+
           jenisLaundry.getDurasi(i)+ "hr" + "\t" +"\t"+jenisLaundry.getHarga(i) + "/kg");
  }
 }
 public void laporan(Client client){
  int x=client.getJumlahClient();

  System.out.println();
  System.out.println("Tabel Client");
  System.out.println();
  System.out.println("ID \tNama \tAlamat \t\tTelepon \tSaldo");

  for (int i = 0; i < x; i++) {
   System.out.println(i + "\t"+ client.getNama(i)+"\t"+
           client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+
           client.getSaldo(i));
  }
 }

 public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry){
  int x=transaksi.getJmlTransaksi();
  
  System.out.println();
  System.out.println("Laporan Transaksi");
  System.out.println();
  System.out.println("ID \tNama Jenis Laundry\tJumlah(kg) \tHarga/kg \tJumlah");

  int total=0;
  for (int i = 0; i < x; i++) {
   int jumlah=transaksi.getBanyaknya(i)*jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
   total+=jumlah;

   System.out.println((i+1) + "\t" + jenisLaundry.getNamaJenisLaundry(transaksi.getIdJenisLaundry(i))+"\t"+
           transaksi.getBanyaknya(i)+ "kg"+ "\t" +"\t"+jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i))+ "/kg" + "\t" + "\t"
           + jumlah);
  }
  System.out.println("Total Omset ="+total);
 }
}
