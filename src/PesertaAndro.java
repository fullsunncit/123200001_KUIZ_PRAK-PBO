/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class PesertaAndro extends Peserta implements Seleksi{

    public PesertaAndro(String nama, double tulis, double coding, double wawancara) {
        super(nama, tulis, coding, wawancara);
    }
    
    @Override
    public double nilaiTulis() {
        // TODO Auto-generated method stub
        this.tulis = this.tulis * 0.20;
        return this.tulis;
    }
    @Override
    public double nilaiCoding() {
        // TODO Auto-generated method stub
        this.coding = this.coding * 0.50;
        return this.coding;
    }
    @Override
    public double nilaiWawancara() {
        // TODO Auto-generated method stub
        this.wawancara = this.wawancara * 0.30;
        return this.wawancara;
    }
    
    public double getHasil(){
        double nilaiAkhir = nilaiTulis() + nilaiCoding() + nilaiWawancara();
        return nilaiAkhir;
    }

}
