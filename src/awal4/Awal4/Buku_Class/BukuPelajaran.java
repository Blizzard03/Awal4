/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal4.Awal4.Buku_Class;

/**
 *
 * @author mariq
 */
public class BukuPelajaran extends Buku_Class {
    private String penerbit;

    public BukuPelajaran(String penerbit, String judul, String penulis, int tahunTerbit, double harga,
            boolean tersedia) {
        super(judul, penulis, tahunTerbit, harga, tersedia);
        this.penerbit = penerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    @Override
    public void tampilkan() {
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Komik:");
        System.out.printf("%s %s %d %f %b %s ",
                getJudul(),
                getPenulis(),
                getTahunTerbit(),
                getHarga(),
                isTersedia(),
                penerbit);

    }
}
