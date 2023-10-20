/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal4.Awal4.Buku_Class;

/**
 *
 * @author mariq
 */
public class BukuKomik extends Buku_Class {
    private int series;

    public BukuKomik(int series, String judul, String penulis, int tahunTerbit, double harga, boolean tersedia) {
        super(judul, penulis, tahunTerbit, harga, tersedia);
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public void tampilkan() {
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Komik:");
        System.out.printf("%s %s %d %f %b %d ",
                getJudul(),
                getPenulis(),
                getTahunTerbit(),
                getHarga(),
                isTersedia(),
                series);

    }

}
