package com.example.uts_faclah_191011402546;

import java.io.Serializable;

public class ModelWisata implements Serializable {

    private String idWisata, txtNamaWisata, GambarWisata, KategoriWisata;

    public String getIdWisata() {
        return idWisata;
    }

    public void setIdWisata(String idWisata) {
        this.idWisata = idWisata;
    }

    public String getTxtNamaWisata() {
        return txtNamaWisata;
    }

    public void setTxtNamaWisata(String txtNamaWisata) {
        this.txtNamaWisata = txtNamaWisata;
    }

    public String getGambarWisata() {
        return GambarWisata;
    }

    public void setGambarWisata(String gambarWisata) {
        GambarWisata = gambarWisata;
    }

    public String getKategoriWisata() {
        return KategoriWisata;
    }

    public void setKategoriWisata(String kategoriWisata) {
        KategoriWisata = kategoriWisata;
    }
}