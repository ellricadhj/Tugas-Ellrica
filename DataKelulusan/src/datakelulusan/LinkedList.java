/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakelulusan;
import javax.swing.JOptionPane;

/**
 *
 * @author Ellricadhj
 */
public class LinkedList {
    NODE first;
    public LinkedList () {
        first=null;
    }

    public void InsertFirst(String txt1, String txt2, String txt3){
        NODE Baru = new NODE(txt1,txt2,txt3);
        Baru.next=first;
        first=Baru;
    }
    
    public void InsertLast(String txt1, String txt2, String txt3){
        NODE Baru = new NODE(txt1,txt2,txt3);
        if(first==null)
            InsertFirst(txt1,txt2,txt3);
        else {
            NODE Pointer=first;
            while(Pointer.next!=null) {
                Pointer=Pointer.next;
            }
            Baru.next=Pointer.next;
            Pointer.next=Baru;
        }
    }
    public NODE DeleteFirst(){
        NODE Pointer=first;
        if(Pointer!=null) {
            first=first.next;
        }
        return Pointer;
    }
    
    public NODE DeleteLast(){
        NODE Pointer=first;
        if(Pointer!=null) {
            NODE last=first, precLast=null;
            while(last.next!=null) {
                precLast=last;
                last=last.next;
            }
            Pointer=last;
            if(precLast==null) 
                first=null;
            else precLast.next=null;
        }
        return Pointer;
    }
    
    public NODE searchnama(String key) {
        NODE Pointer=first;
         
        if(Pointer!=null) {
           
            while(!(Pointer.nama).equals(key) ){
                if(Pointer.next==null)
                    return null;
                else{
                    Pointer=Pointer.next;}
                }
            }
        return Pointer;
    }
    
    public NODE searchnim(String key) {
        NODE Pointer=first;
         
        if(Pointer!=null) {
           
            while(!(Pointer.nim).equals(key) ){
                if(Pointer.next==null)
                    return null;
                else{
                    Pointer=Pointer .next;}
                }
            }
        return Pointer;
    }
    
    
    public void InsertAfter(String txt1, String txt2, String txt3, String key) {
        NODE Baru = new NODE(txt1,txt2,txt3);
        NODE Pointer=first;
        if(Pointer!=null) {
            while(Pointer!=null) {
                if(Pointer.nim.equals(key)) {
                    Baru.next=Pointer.next;
                    Pointer.next=Baru;
                    break;
                }                
                Pointer=Pointer.next;            
            }
        }
    }
        
    public void InsertBefore(String txt1, String txt2, String txt3, String key) {
        NODE Baru = new NODE(txt1,txt2,txt3);
        NODE Pointer=first;
        if(Pointer!=null) {
            while(Pointer!=null) {
                if(Pointer.nim==key && Pointer==first) {
                    InsertFirst(txt1,txt2,txt3);
                    break;
                } else if(Pointer.next.nim==key) {
                    Baru.next=Pointer.next;
                    Pointer.next=Baru;
                    break;
                }                 
                Pointer=Pointer.next;            
            }
        }
    }
    
    public NODE DeleteAfter(String key) {
        NODE Pointer=first;
        if(Pointer!=null) {
            while(Pointer!=null) {
                if(Pointer.nim.equals(key) && Pointer.next==null) {
                    JOptionPane.showMessageDialog(null,"Data Tidak Ada");
                } else if(Pointer.nim.equals(key)) {
                    Pointer.next=Pointer.next.next;
                    break;
                } 
                Pointer=Pointer.next;            
            }
        }
        return Pointer;
    }
}
    
    
