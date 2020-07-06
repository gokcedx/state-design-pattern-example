package com.gokcedx;

/**
 * state-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class TelefonDurumu implements Durum{
    private Durum telefonAc;
    private Durum telefonAra;
    private Durum telefonKapat;

    private Durum durum;

    public TelefonDurumu() {
        this.telefonAc = new AcikDurum(this);
        this.telefonAra = new AramaDurum(this);
        this.telefonKapat = new KapaliDurum(this);

        this.durum = telefonAc;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    @Override
    public void ac() {
        durum.ac();
    }

    @Override
    public void ara() {
        durum.ara();
    }

    @Override
    public void kapat() {
        durum.kapat();
    }

    public Durum getTelefonAc() {
        return telefonAc;
    }

    public Durum getTelefonAra() {
        return telefonAra;
    }

    public Durum getTelefonKapat() {
        return telefonKapat;
    }
}
