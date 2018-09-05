/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author USER
 */
class Guru 
{
    private int nip;
    private String nama;

    public Guru(int nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    
    public void info(){
        System.out.println("================================");
        System.out.println("NIP            : "+this.nip);
        System.out.println("Nama Guru      : "+this.nama);
    }
}
