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


@Controller
public class TableController {
    input ip = new input();
    compute cp = new compute();
    

    
    @RequestMapping("/input")
    //@ResponseBody
    public String getHasil(HttpServletRequest data,Model model){
        ip.getData(data);
        cp.getDiskon(ip.getHarga, ip.getJumlah);
        cp.getKembali(ip.getBayar);
        
            ip.getData(data);
            cp.getDiskon(ip.getHarga, ip.getJumlah);
            cp.getKembali(ip.getBayar);
            //nama sayur, harga perkilo, jumlah beli, jumlah bayar awal, jumlah diskon, total harga diskon, harga yang harus dibayar
        
            model.addAttribute("namasayur", ip.getNama );
            model.addAttribute("hargaperkilo", ip.getHarga );
            model.addAttribute("jumlahbeli", ip.getJumlah );
            model.addAttribute("jumlahbayar", ip.getBayar );
            model.addAttribute("hargaawal", cp.totalAwal );
            model.addAttribute("diskon", cp.persen );
            model.addAttribute("hargadiskon", cp.diskon );
            model.addAttribute("kembali", cp.kembali );
            
            return "viewer";
    }
}
    

