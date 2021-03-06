package com.gokcedx;

/**
 * state-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class AcikDurum implements Durum {

    private final TelefonDurumu telefonDurumu;

    public AcikDurum(TelefonDurumu telefonDurumu) {
        this.telefonDurumu = telefonDurumu;
    }

    @Override
    public void ac() {
        System.out.println("Telefon Açık.");
    }

    @Override
    public void ara() {
        System.out.println("Arama yapılıyor.");
        telefonDurumu.setDurum(telefonDurumu.getTelefonAra());
    }

    @Override
    public void kapat() {
        System.out.println("Telefon kapanıyor.");
        telefonDurumu.setDurum(telefonDurumu.getTelefonKapat());
    }
}
