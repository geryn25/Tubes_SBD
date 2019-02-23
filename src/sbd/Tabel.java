/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;

import java.util.ArrayList;

/**
 *
 * @author geryn
 */
public class Tabel {
    private String nama;
    ArrayList<String> kolom;
    

    public Tabel(String nama) {
        this.nama = nama;
        this.kolom = new ArrayList<String>();
    }
    public void add(String nama) {
        kolom.add(nama);
    }
    public int jum() {
        return kolom.size()-1;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.print("Kolom : ");
        for (int i=0;i<=this.jum();i++) {
            System.out.print(kolom.get(i)+",");
        }
        System.out.println("");
    }
    
    
}
