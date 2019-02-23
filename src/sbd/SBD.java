/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author geryn
 */
public class SBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CSVReader csv=new CSVReader();
        ArrayList<Tabel> datatabel= csv.buatTabel();
        Scanner s1=new Scanner(System.in);
        String query=s1.nextLine();
        boolean valid=false;
        s1.close();
        query=query.trim();
        
        if (query.charAt(query.length()-1)==';') {
            valid=true;
            for (int i=0;i<query.length()-1;i++) {
                if (query.charAt(i)==';') {
                    valid=false;
                }
            }
        }
        if (valid==true) {
            String[] q=query.split(" ");
            String[] x=q[q.length-1].split(";");
            q[q.length-1]=x[0];
            for (int i=0;i<q.length;i++) {
                q[i]=q[i].toLowerCase();
            }
            if (q[0].equals("select") && q[2].equals("from")) {
                int i=0;
                while (i<datatabel.size() && !(datatabel.get(i).getNama().equals(q[3]))){
                    i++;
                }
                if (datatabel.get(i).getNama().equals(q[3])) {
                    int j=0;
//                    while (j<=datatabel.get(i).jum() && !(datatabel.get(i).kolom.get(j).equals(q[1]))) {
//                        j++;
//                    } 
//                    if (datatabel.get(i).kolom.get(j).equals(q[1])) {
//                        System.out.println("Tabel : "+datatabel.get(i).getNama());
//                        System.out.println("Kolom : "+datatabel.get(i).kolom.get(j));
//                    }
                      if (q[1].equals("*")) {
                          System.out.println("Tabel : "+datatabel.get(i).getNama());
                        datatabel.get(i).view();
                          
                      }
                }
            }
        } else {
            System.out.println("SQL Error (Missing ; )");
        }
        
    }
}
    
    

