/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;
import Bidang.PersegiPanjang;

/**
 *
 * @author Anggita
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    public double tinggi;

    public Balok() {
        super();
        tinggi=0;
    }

    
    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double luaspermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    
}
