package advanced_practice.practice07;

import java.time.LocalDate;

public class Market {

    String urunAdi;
    Double urunfiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double fiyat, int aySonra){
        this.urunAdi = urunAdi;
        if (fiyat>99){
            fiyat =fiyat*0.9;
        }
        urunfiyati = fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    Market(String urunAdi, double urunfiyati) {
        this.urunAdi = urunAdi;
        if (urunfiyati>99){
            urunfiyati =urunfiyati*0.9;
        }
        this.urunfiyati = urunfiyati;
        sonKullanmaTarihi = "bu ürünün son kullanma tarihi yoktur";
    }

    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunfiyati=" + urunfiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }

    Market(){

    }
}
