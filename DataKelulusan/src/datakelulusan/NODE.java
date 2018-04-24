/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakelulusan;

/**
 *
 * @author Ellricadhj
 */
public class NODE {
    
    String nama,nim,nilai;
  
    NODE next;


    public NODE (String txt1, String txt2, String txt3) {
        
        nama=txt1;
        nim=txt2;
        nilai=txt3;
        next=null;
    }
}
