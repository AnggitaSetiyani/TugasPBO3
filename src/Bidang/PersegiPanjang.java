/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidang;

/**
 *
 * @author Anggita
 */
public class PersegiPanjang implements MenghitungBidang {
    public double panjang, lebar;

    public PersegiPanjang() {
        panjang =0;
        lebar=0;
    }

    
    
    
    @Override
    public double luas() {
       return panjang*lebar;
    }

    @Override
    public double keliling() {
       return 2*(panjang+lebar);
    }
    
    
}
