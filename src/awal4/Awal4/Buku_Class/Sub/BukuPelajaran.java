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
public class BukuPelajaran extends Buku_Class {
    private final String penerbit;
    private final String kelas;
    
    public BukuPelajaran(String judul, String penulis, int tahunTerbit, double harga, boolean tersedia, String penerbit,
            String kelas) {
        super(judul, penulis, tahunTerbit, harga, tersedia);
        this.penerbit = penerbit;
        this.kelas = kelas;
    }


    public String getKelas() {
        return kelas;
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
                penerbit,
                kelas);

    }

}
