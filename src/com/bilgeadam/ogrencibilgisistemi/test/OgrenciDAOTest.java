package com.bilgeadam.ogrencibilgisistemi.test;

import com.bilgeadam.ogrencibilgisistemi.dao.OgrenciDAO;
import com.bilgeadam.ogrencibilgisistemi.dto.Ogrenci;

import java.sql.SQLException;

public class OgrenciDAOTest {

    public static void main(String[] args) {


        try {
            Ogrenci ogr = new Ogrenci();


            ogr.setAd("Tanju");
            ogr.setSoyad("Colak");
            ogr.setKredi(100);

            boolean sonuc = OgrenciDAO.ekle(ogr);

            if (sonuc)
                System.out.println("Basariyla Eklendi");
            else
                System.out.println("Basarisiz Eklenmedi");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
