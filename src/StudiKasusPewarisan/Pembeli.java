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
class Pembeli extends Barang{
    private int idPembeli;
    private String namaPembeli;
    private String alamat;
    private String notelp;
    
    
    public Pembeli(int idBarang, String namaBarang, int harga, String merk, int idPembeli, 
            String namaPembeli, String alamat, String notelp) {
        super(idBarang, namaBarang, harga, merk);
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
    public void tampilkan(){
        Scanner masukan = new Scanner(System.in);
        super.tampilkan();
        System.out.print("ID pembeli   : ");
        idPembeli = masukan.nextInt();
        System.out.print("Nama Pembeli : ");
        namaPembeli = masukan.next();
        System.out.print("Alamat       : ");
        alamat = masukan.next();
        System.out.print("No Telepon   : ");
        notelp = masukan.next();
    }
}
