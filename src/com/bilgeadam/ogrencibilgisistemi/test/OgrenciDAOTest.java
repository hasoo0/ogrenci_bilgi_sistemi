package com.bilgeadam.ogrencibilgisistemi.test;

import com.bilgeadam.ogrencibilgisistemi.dao.OgrenciDAO;
import com.bilgeadam.ogrencibilgisistemi.dto.Ogrenci;

public class OgrenciDAOTest {

    public static void main(String[] args) {

        
        try {
            Ogrenci ogr = null;
            ogr = new Ogrenci();

            ogr.setAd("Tanju");
            ogr.setSoyad("Colak");
            ogr.setKredi(100);

            boolean sonuc = OgrenciDAO.ekle(ogr);

            if (sonuc)
                System.out.println("Basariyla Eklendi");
            else
                System.out.println("Basarisiz Eklenmedi");


        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
