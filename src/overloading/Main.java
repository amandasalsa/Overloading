/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Amanda
 */
public class Main {
    public static void main(String[] args) {
        Luas htg = new Luas();
        
        htg.hitung("== HITUNG 3 LUAS PERSEGI PANJANG ==");
        htg.hitung("= 1 : PANJANG 10 LEBAR 14         =");
        htg.hitung("= 2 : PANJANG 8  LEBAR 12         =");
        htg.hitung("= 3 : PANJANG 14 LEBAR 10         =");
        htg.hitung("===================================");
        htg.hitungluas(10, 14);
        htg.hitungluasa(8, 12);
        htg.hitungluasb(14, 10);
    }
    
}
