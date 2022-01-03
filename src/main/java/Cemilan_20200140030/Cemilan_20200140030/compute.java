/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cemilan_20200140030.Cemilan_20200140030;

/**
 *
 * @author JAYA
 */
public class compute {
    int totalAwal, diskon;
    String persen;
   
    public void getDiskon(int Harga, int Jumlah){
        totalAwal = Harga * Jumlah; 
        if (totalAwal < 16000){
            persen = "0%";
            diskon = totalAwal - 0;
        }
        else if (totalAwal > 16000){
            persen = "10%";
            diskon = totalAwal - (totalAwal * 10 / 100);
        }
        else if (totalAwal > 25000){
            persen = "15%";
            diskon = totalAwal - (totalAwal * 15 / 100);
        }
    }
    
    int kembali;
    public void getKembali(int Bayar){
       kembali = Bayar - diskon; 
    }
}
