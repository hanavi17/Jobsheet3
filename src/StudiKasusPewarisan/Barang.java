/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasusPewarisan;

import java.util.Scanner;



/**
 *
 * @author USER
 */
class Barang {
    private int idBarang;
    private String namaBarang;
    public static int harga;
    private String merk;
    
public Barang(int idBarang, String namaBarang,int harga,String merk){
    this.idBarang = idBarang;
    this.namaBarang = namaBarang;
    this.harga = harga;
    this.merk = merk;
}

public void tampilkan(){
    Scanner masukan = new Scanner(System.in);
    System.out.println("Nama Kasir = Mas Kasir");
    System.out.println("Tgl = 02-08-2018");
    System.out.println(" ");
    System.out.println("<+=============================+>");
    System.out.print("ID Barang    : ");
    idBarang = masukan.nextInt();
    System.out.print("Nama Barang  : ");
    namaBarang = masukan.next();
    System.out.print("Harga        : ");
    harga = masukan.nextInt();
    System.out.print("Merk         : ");
    merk = masukan.next();
}

}
