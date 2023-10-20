/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal4.Awal4.Buku_Class;

/**
 *
 * @author mariq
 */
public class Buku_Class {

    public String judul;
    public String penulis;
    public int tahunTerbit;
    public double harga;
    public boolean tersedia;
    public static double avg = 0;

    // Full Constructor
    public Buku_Class(String judul, String penulis, int tahunTerbit, double harga, boolean tersedia) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.tersedia = tersedia;
        ;
    }

    // Blank Constructor
    public Buku_Class() {
        this.judul = "Tittle";
        this.penulis = "Writer";
        this.tahunTerbit = 0;
        this.harga = 0.0;
        this.tersedia = true;
    }

    // Tittle, Writer and Price Only
    public Buku_Class(String tittle, String writer, double price) {
        this.judul = tittle;
        this.penulis = writer;
        this.harga = price;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public static double getAvg() {
        return avg;
    }

    public static double calculateavgprice(double avg) {
        return Buku_Class.avg = avg;
    }
    
    public void tampilkan(){
        System.out.print(judul);
    }

}
