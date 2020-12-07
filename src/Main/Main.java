/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Bidang.PersegiPanjang;
import Ruang.Balok;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Anggita
 */
public class Main {
    public static void main(String[] args) {
        GUI g = new GUI();
        
        
    }
}

class GUI extends JFrame implements ActionListener {
    JTextField txpanjang, txlebar, txtinggi, txluas, txkeliling, txvolume, txluaspermukaan;
    JButton btnHitung, btnReset;
    DecimalFormat angka;
    
    public GUI(){
        
        
        PersegiPanjang pp = new PersegiPanjang();
        Balok balok = new Balok();
       
        
        setTitle("Menghitung Balok");
	setDefaultCloseOperation(3);
	setSize(350,450);
        
        final JTextField fpanjang = new JTextField((int) pp.panjang);
        JLabel lpanjang = new JLabel(" Panjang ");
        txpanjang = new JTextField(11);
        
        final JTextField flebar = new JTextField((int) pp.lebar);
        JLabel llebar = new JLabel(" Lebar ");
        txlebar = new JTextField(11);

        final JTextField ftinggi = new JTextField((int) balok.tinggi);
        JLabel ltinggi = new JLabel(" Tinggi ");
        txtinggi = new JTextField(11);
        
        JLabel lhasil = new JLabel("Hasil : ");
        JLabel luas = new JLabel("Luas Persegi : ");
        txluas = new JTextField(11);
        JLabel keliling = new JLabel("Keliling Persegi : "+pp.keliling());
        txkeliling = new JTextField(11);
        JLabel volume = new JLabel("Volume Balok : "+balok.volume());
        txvolume = new JTextField(11);
        JLabel luaspermukaan = new JLabel("Luas Permukaan : "+balok.luaspermukaan());
        txluaspermukaan = new JTextField(11);
        
        JButton btnHitung = new JButton("Hitung");
        JButton btnReset = new JButton("Reset");
        
        
        
        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);

        setLayout(null);
	add(lpanjang);
	add(fpanjang);
        add(llebar);
	add(flebar);
        add(ltinggi);
	add(ftinggi);
        add(lhasil);
        add(luas);
        add(keliling);
        add(volume);
        add(luaspermukaan);
        add(btnHitung);
        add(btnReset);

        
        lpanjang.setBounds(10,10,120,20);
        fpanjang.setBounds(130,10,150,20);
        llebar.setBounds(10,30,120,40);
        flebar.setBounds(130,40,150,20);
        ltinggi.setBounds(10,50,120,60);
        ftinggi.setBounds(130,70,150,20);
        lhasil.setBounds(10,70,120,80);
        luas.setBounds(10,100,120,100);
        keliling.setBounds(10,115,120,120);
        volume.setBounds(10,130,120,140);
        luaspermukaan.setBounds(10,145,120,160);
        btnHitung.setBounds(40,300,120,20);
        btnReset.setBounds(180,300,120,20);
        
        angka= new DecimalFormat("0.00");
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btnHitung) {
        double panjang = Double.parseDouble(txpanjang.getText());
        double lebar = Double.parseDouble(txlebar.getText());
        double tinggi = Double.parseDouble(txtinggi.getText());

        PersegiPanjang pp = new PersegiPanjang();
        Balok balok = new Balok();
        txluas.setText("Luas Persegi = "+angka.format(pp.luas()));
        txkeliling.setText("Keliling Persegi = "+angka.format(pp.keliling()));
        txvolume.setText("Volume Balok = "+angka.format(balok.volume()));
        txluaspermukaan.setText("Luas Permukaan = "+angka.format(balok.luaspermukaan()));

        add(txluas);
        add(txkeliling);
        add(txvolume);
        add(txluaspermukaan);

        txluas.setBounds(10,100,120,100);
        txkeliling.setBounds(10,115,120,120);
        txvolume.setBounds(10,130,120,140);
        txluaspermukaan.setBounds(10,145,120,160);
      }
 
      if(e.getSource() == btnReset){
          txpanjang.setText("");
          txlebar.setText("");
          txtinggi.setText("");
      }
        }
}

