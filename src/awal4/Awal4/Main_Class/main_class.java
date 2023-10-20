/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal4.Awal4.Main_Class;

import java.text.NumberFormat;
import java.util.Locale;

import awal4.Awal4.Buku_Class.Master.Buku_Class;
import awal4.Awal4.Buku_Class.Sub.BukuKomik;
import awal4.Awal4.Buku_Class.Sub.BukuPelajaran;

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
        // Curency Formatter
        Locale Indonesia = new Locale("in", "ID");
        NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);

        // BOOKS 1 - Full Constructors
        final Buku_Class buku1 = new Buku_Class(
                "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling",
                1997,
                20500.00,
                true);

        final Buku_Class buku2 = new Buku_Class(
                "To Kill a Mockingbird",
                "Harper Lee",
                1960,
                15200.00,
                false);
        final Buku_Class buku3 = new Buku_Class(
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                1925,
                18000.00,
                true);

        // BOOK 2 - Blank Constructors
        final Buku_Class buku4 = new Buku_Class();
        buku4.judul = "Wolves: Behavior, Ecology, and Conservation";
        buku4.penulis = " L. David Mech and Luigi Boitani";
        buku4.tahunTerbit = 2003;
        buku4.harga = 500000.00;
        buku4.tersedia = true;

        final Buku_Class buku5 = new Buku_Class();
        buku4.judul = "The Beast Within: A History of the Werewolf";
        buku4.penulis = "  Adam Douglas";
        buku4.tahunTerbit = 2005;
        buku4.harga = 400000.00;
        buku4.tersedia = true;

        final Buku_Class buku6 = new Buku_Class();
        buku6.judul = "The Lion in the Living Room: How House Cats Tamed Us and Took Over the World";
        buku6.penulis = " Abigail Tucker";
        buku6.tahunTerbit = 2016;
        buku6.harga = 400000.00;
        buku6.tersedia = false;

        // BOOK 3 - Tittle, Writer and Price Only
        final Buku_Class buku7 = new Buku_Class(
                "Last Child in the Woods: Saving Our Children from Nature-Deficit Disorder",
                "Richard Louv",
                316200.00);
        final Buku_Class buku8 = new Buku_Class(
                "The Werewolf in Lore and Legend",
                "Montague Summers",
                474300.00);
        final Buku_Class buku9 = new Buku_Class(
                "The Company of Wolves",
                "Angela Carter",
                316200.00);

        // Book 4
        final BukuKomik komik = new BukuKomik(
                "",
                "",
                0,
                0.0,
                false,
                0,
                "");
        final BukuPelajaran edu = new BukuPelajaran(
                "",
                "",
                0,
                0,
                false,
                "",
                "");
        System.out.println("==============================================================");
        System.out.println("======================= AWAL 4 Program =======================");
        System.out.println("==============================================================" + "\n");
        System.out.println("==============================================================");
        System.out.println("======================= - Books 1 - ==========================");
        System.out.println("==============================================================");
        System.out.println("Buku 1:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());
        System.out.println("Harga: " + formater.format(buku1.getHarga()));
        if (buku2.isTersedia() == true) {
            System.out.println("Buku" + " " + buku1.getJudul() + " " + "Tersedia");
        } else {
            System.out.println("Buku" + " " + buku1.getJudul() + " " + "Tidak Tersedia");
        }
        System.out.println("==============================================================");
        System.out.println("Buku 2:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku2.getJudul());
        System.out.println("Penulis: " + buku2.getPenulis());
        System.out.println("Tahun Terbit: " + buku2.getTahunTerbit());
        System.out.println("Harga: " + formater.format(buku2.getHarga()));
        if (buku2.isTersedia() == true) {
            System.out.println("Buku" + " " + buku2.getJudul() + " " + "Tersedia");
        } else {
            System.out.println("Buku" + " " + buku2.getJudul() + " " + "Tidak Tersedia");
        }
        System.out.println("==============================================================");
        System.out.println("Buku 3:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku3.getJudul());
        System.out.println("Penulis: " + buku3.getPenulis());
        System.out.println("Tahun Terbit: " + buku3.getTahunTerbit());
        System.out.println("Harga: " + formater.format(buku3.getHarga()));
        if (buku3.isTersedia() == true) {
            System.out.println("Buku" + " " + buku3.getJudul() + " " + "Tersedia");
        } else {
            System.out.println("Buku" + " " + buku3.getJudul() + " " + "Tidak Tersedia" + "\n");
        }
        System.out.println("==============================================================" + "\n");
        System.out.println("==============================================================");
        System.out.println("======================= - Books 2 - ==========================");
        System.out.println("==============================================================");
        System.out.println("Buku 4:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku4.getJudul());
        System.out.println("Penulis: " + buku4.getPenulis());
        System.out.println("Tahun Terbit: " + buku4.getTahunTerbit());
        System.out.println("Harga: " + formater.format(buku4.getHarga()));
        if (buku4.isTersedia() == true) {
            System.out.println("Buku" + " " + buku4.getJudul() + " " + "Tersedia");
        } else {
            System.out.println("Buku" + " " + buku4.getJudul() + " " + "Tidak Tersedia");
        }
        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("Buku 5:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku5.getJudul());
        System.out.println("Penulis: " + buku5.getPenulis());
        System.out.println("Tahun Terbit: " + buku5.getTahunTerbit());
        System.out.println("Harga: " + formater.format(buku5.getHarga()));
        if (buku4.isTersedia() == true) {
            System.out.println("Buku" + " " + buku5.getJudul() + " " + "Tersedia");
        } else {
            System.out.println("Buku" + " " + buku5.getJudul() + " " + "Tidak Tersedia");
        }
        System.out.println("==============================================================");
        System.out.println("Buku 6:");
        System.out.println("Judul: " + buku6.getJudul());
        System.out.println("Penulis: " + buku6.getPenulis());
        System.out.println("Tahun Terbit: " + buku6.getTahunTerbit());
        System.out.println("Harga: " + formater.format(buku6.getHarga()));
        if (buku6.isTersedia() == true) {
            System.out.println("Buku" + " " + buku6.getJudul() + " " + "Tersedia");
        } else {
            System.out.println("Buku" + " " + buku6.getJudul() + " " + "Tidak Tersedia" + "\n");
        }
        System.out.println("==============================================================");
        System.out.println("======================= - Books 3 - ==========================");
        System.out.println("==============================================================");
        System.out.println("Buku 7:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku7.getJudul());
        System.out.println("Penulis: " + buku7.getPenulis());
        System.out.println("Harga: " + formater.format(buku7.getHarga()));
        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("Buku 8:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku8.getJudul());
        System.out.println("Penulis: " + buku8.getPenulis());
        System.out.println("Harga: " + formater.format(buku8.getHarga()));
        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("Buku 9:");
        System.out.println("==============================================================");
        System.out.println("Judul: " + buku9.getJudul());
        System.out.println("Penulis: " + buku9.getPenulis());
        System.out.println("Harga: " + formater.format(buku9.getHarga()));
        System.out.println("==============================================================");
        System.out.println("=========================Average Price========================");
        System.out.println(formater.format(Buku_Class.calculateavgprice((buku1.getHarga()
                + buku2.getHarga()
                + buku3.getHarga()
                + buku4.getHarga()
                + buku5.getHarga()
                + buku6.getHarga()
                + buku7.getHarga()
                + buku8.getHarga()
                + buku9.getHarga()
                + komik.getHarga()
                + edu.getHarga())
                / 11)));
        System.out.println("============================== END ===========================");
        System.out.println("Made by WPA TEAM");
    }

}
