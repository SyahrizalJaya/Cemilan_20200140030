/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cemilan_20200140030.Cemilan_20200140030;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author JAYA
 */
public class input {
    String getNama;
    int getHarga, getJumlah, getBayar;
    public void getData(HttpServletRequest data){
        getNama = data.getParameter("nmSayur");
        getHarga = Integer.parseInt(data.getParameter("harga"));
        getJumlah = Integer.parseInt(data.getParameter("jumlah"));
        getBayar = Integer.parseInt(data.getParameter("bayar"));
    }
}

