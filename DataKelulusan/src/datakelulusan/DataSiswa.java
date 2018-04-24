/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakelulusan;
import java.util.LinkedList;
/**
 *
 * @author Ellricadhj
 */
public class DataSiswa {
//    static LinkedList listSiswa = new LinkedList();
    static LinkedList<Siswa> listSiswa = new LinkedList<>();
    public static void tambahBelakang(String nama){
        Siswa siswa = new Siswa(nama);
        listSiswa.addLast(siswa);
    }
    public static void tambahDepan(String nama) {
        Siswa siswa = new Siswa(nama);
        listSiswa.addFirst(siswa);
    }
    
    
}
