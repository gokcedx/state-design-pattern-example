package com.gokcedx;

/**
 * state-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class App 
{
    public static void main( String[] args )
    {
        // durumları ayrı ayrı kontrol etmemize gerek kalmaz.
        // önceki state tutulur, yeni state ona göre belirlenir.
        TelefonDurumu telefonDurumu = new TelefonDurumu();
        telefonDurumu.ac();
        telefonDurumu.ara();
        telefonDurumu.kapat();
        telefonDurumu.ara();
        telefonDurumu.ac();
        telefonDurumu.ac();
        telefonDurumu.ara();
        telefonDurumu.ara();
        telefonDurumu.ac();
        telefonDurumu.kapat();
    }
}
