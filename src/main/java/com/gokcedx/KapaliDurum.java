package com.gokcedx;

/**
 * state-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class KapaliDurum implements Durum {

    private final TelefonDurumu telefonDurumu;

    public KapaliDurum(TelefonDurumu telefonDurumu) {
        this.telefonDurumu = telefonDurumu;
    }

    @Override
    public void ac() {
        System.out.println("Telefon açılıyor.");
        telefonDurumu.setDurum(telefonDurumu.getTelefonAc());
    }

    @Override
    public void ara() {
        System.out.println("Kapalı durumda arama yapılamaz!");
    }

    @Override
    public void kapat() {
        System.out.println("Telefon kapalı.");
    }
}
