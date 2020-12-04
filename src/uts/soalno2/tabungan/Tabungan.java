/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.soalno2.tabungan;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class Tabungan {
    private int saldo;
    Scanner scanner = new Scanner(System.in);
    
    public Tabungan(int saldo){
        this.saldo=saldo;
    }
    
    public int ambilUang(int jumlah){
        System.out.print("Jumlah Uang yang diambil : ");
        int ambil = scanner.nextInt();
        saldo = jumlah - ambil;
        System.out.println("Saldo Anda Sekarang : " + saldo);
        return saldo;
        
    }
}
