package com.gokcedx;

/**
 * state-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class TelefonDurumuEskiHali {

    private String durum="";

    public void setDurum(String durum){
        this.durum=durum;
    }

    public void durumAyarla(){
        if(durum.equalsIgnoreCase("aç")){
            System.out.println("Telefon açılıyor.");
        }else if(durum.equalsIgnoreCase("ara")){
            System.out.println("Arama yapılıyor.");
        }else if(durum.equalsIgnoreCase("kapat")){
            System.out.println("Telefon kapanıyor.");
        }
    }

    public static void main(String args[]){
        TelefonDurumuEskiHali telefonDurumu = new TelefonDurumuEskiHali();

        telefonDurumu.setDurum("Aç");
        telefonDurumu.durumAyarla();

        telefonDurumu.setDurum("Ara");
        telefonDurumu.durumAyarla();

        telefonDurumu.setDurum("Kapat");
        telefonDurumu.durumAyarla();

        // burada tekrar kapatılacaktır ama normalde yapmamalıdır.
        // ayrıca kapandıktan sonra arama yapmamalıdır.
        // bu yüzden hepsinde durumAyarla() içinde önceki durumunu da kontrol etmemiz gerekir.
        telefonDurumu.setDurum("Kapat");
        telefonDurumu.durumAyarla();

        telefonDurumu.setDurum("Ara");
        telefonDurumu.durumAyarla();

    }
}
