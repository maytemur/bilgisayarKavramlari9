/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maytemur Java 26 - Dosyalar ve API - Java, Programlamaya Giriş serisinin son videosu
 */
public class Bilgisayarkavramlari9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File f = new File("a.txt");
            fr = new FileReader(f);
            int c= fr.read();
            while(c!=-1){
                char k= (char)c;
                System.out.print(k+" ");
                c= fr.read();
                
            }
            fr.close();
            f = new File("a.txt");
            BufferedReader br= new BufferedReader(new FileReader(f));
            System.out.println(br.readLine());
            br.close(); //filereader da satır satır okuma yok. sadece byte byte veya karakter
            //karakter okuyabiliyoruz. FileReader'a BufferedReader stream'i ekledik
            //yazma işini FileWriter ile yapıyoruz
            File cikti= new File("ciktiDosyasi.txt");
            FileWriter fw = new FileWriter(cikti);
            fw.write("Bilgisayar Kavramları Deneme mesajı olarak dosya yazdık");
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
//        finally {
//            try {
//                fr.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Bilgisayarkavramlari9.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        
        
    }
    
}
