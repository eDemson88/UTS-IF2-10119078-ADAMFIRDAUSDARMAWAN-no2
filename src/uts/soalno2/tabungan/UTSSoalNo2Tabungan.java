/*
Nama : Adam Firdaus Darmawan
NIM : 10119078
Kelas : IF-2
 */
package uts.soalno2.tabungan;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class UTSSoalNo2Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan t = new Tabungan(0);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal: ");
        int awal = scanner.nextInt();
        
        t.ambilUang(awal);
    }
    
}
