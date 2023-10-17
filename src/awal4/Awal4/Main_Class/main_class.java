/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal4.Awal4.Main_Class;

import awal4.Awal4.Buku_Class.Buku_Class;

/**
 *
 * @author mariq
 */
public class main_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku_Class buku1 = new Buku_Class("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, 20.5, true);
        Buku_Class buku2 = new Buku_Class("To Kill a Mockingbird", "Harper Lee", 1960, 15.2, false);
        Buku_Class buku3 = new Buku_Class("The Great Gatsby", "F. Scott Fitzgerald", 1925, 18.0, true);

        System.out.println("Buku 1:");
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());
        System.out.println("Harga: " + buku1.getHarga());
        System.out.println("Tersedia: " + buku1.isTersedia());

        System.out.println("\nBuku 2:");
        System.out.println("Judul: " + buku2.getJudul());
        System.out.println("Penulis: " + buku2.getPenulis());
        System.out.println("Tahun Terbit: " + buku2.getTahunTerbit());
        System.out.println("Harga: " + buku2.getHarga());
        System.out.println("Tersedia: " + buku2.isTersedia());

        System.out.println("\nBuku 3:");
        System.out.println("Judul: " + buku3.getJudul());
        System.out.println("Penulis: " + buku3.getPenulis());
        System.out.println("Tahun Terbit: " + buku3.getTahunTerbit());
        System.out.println("Harga: " + buku3.getHarga());
        System.out.println("Tersedia: " + buku3.isTersedia());
    }

}
