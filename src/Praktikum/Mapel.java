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
public class Mapel extends Guru
{
    private String namaMapel;
    
    
    public Mapel(int nip, String nama, String namaMapel) 
    {
        super(nip, nama);
        this.namaMapel = namaMapel;
    }

    @Override
    public void info() 
    {
        super.info();
        System.out.println("Mengajar Mapel : "+this.namaMapel);
    }

    
    
}
