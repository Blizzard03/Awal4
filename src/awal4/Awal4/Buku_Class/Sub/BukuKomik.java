/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal4.Awal4.Buku_Class.Sub;

import awal4.Awal4.Buku_Class.Master.Buku_Class;

/**
 *
 * @author mariq
 */
public class BukuKomik extends Buku_Class {
    private int series;
    private String dimention;

    public BukuKomik(String judul, String penulis, int tahunTerbit, double harga, boolean tersedia, int series,
            String dimention) {
        super(judul, penulis, tahunTerbit, harga, tersedia);
        this.series = series;
        this.dimention = dimention;
    }

    public String getDimention() {
        return dimention;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public void tampilkan() {
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Komik:");
        System.out.printf("%s %s %d %f %b %d %s ",
                getJudul(),
                getPenulis(),
                getTahunTerbit(),
                getHarga(),
                isTersedia(),
                series,
                dimention);

    }

}
