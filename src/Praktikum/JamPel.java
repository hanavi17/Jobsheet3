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
class JamPel extends Mapel
{
    private int jamPel;
    
    public JamPel(int nip, String nama, String namaMapel, int jamPel) 
    {
        super(nip, nama, namaMapel);
        this.jamPel = jamPel;
    }

    @Override
    public void info() 
    {
        super.info();
        System.out.println("Jam Mapel Ke   : "+this.jamPel);
        System.out.println("================================");
    }
    
    
}
