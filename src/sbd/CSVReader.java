/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author geryn
 */
public class CSVReader {

    public ArrayList<Tabel> buatTabel() {
                String csvFile="c://Users/geryn/Documents/SBD/tabel.txt";
        String line="#";
       String split1=";";
       ArrayList<Tabel> tabel = new ArrayList<Tabel>();
       
       
       
       
       try (BufferedReader br=new BufferedReader(new FileReader(csvFile))) {
           while ((line=br.readLine())!=null) {
               String[] tabelName=line.split(split1);
               Tabel a= new Tabel(tabelName[0]);
               for (int i=1;i<tabelName.length;i++) {
                   if (i==tabelName.length-1) {
                       String[] z=tabelName[i].split("#");
                       a.add(z[0]);
                   } else {
                       a.add(tabelName[i]);
                   }
                   
               }
               tabel.add(a);
               
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
       return tabel;
    }
    
}

