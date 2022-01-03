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

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TableController {
    input ip = new input();
    compute cp = new compute();
    
    @RequestMapping("/input")
    @ResponseBody
    public String getHasil(HttpServletRequest data){
        ip.getData(data);
        cp.getDiskon(ip.getHarga, ip.getJumlah);
        cp.getKembali(ip.getBayar);
        
        
        
        //nama sayur, harga perkilo, jumlah beli, jumlah bayar awal, jumlah diskon, total harga diskon, harga yang harus dibayar
        
        return "Nama sayur : " + ip.getNama + "<br>" +" Harga perkilo : " +  ip.getHarga + "<br>" +" Jumlah beli: " + ip.getJumlah +"<br>" + " Jumlah bayar : " +ip.getBayar + "<br>" +
                " Harga Awal: " + cp.totalAwal +"<br>" + "  Diskon : " + cp.persen + "<br>" +" Total Diskon : " + cp.diskon + "<br>" +" Kembali : " + cp.kembali;
    }
}
