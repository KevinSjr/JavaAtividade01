/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java01 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
      int vt;
      int nparcelas;      
      float pdesconto;
      float pmulta;
      float vtdesconto;
      float vpmulta;
      float vpmulta2;
     
      System.out.println("digite o valor total da fatura");
      vt = leia.nextInt();
      System.out.println("digite o numero de parcelas");
      nparcelas = leia.nextInt();
      System.out.println("digite o percentual de desconto por pagamento antecipado");
      pdesconto = leia.nextFloat();
      System.out.println("digite o percentualde multa por atraso");
      pmulta = leia.nextFloat();
      
      vtdesconto = (float)(vt/100) * (100-pdesconto);
      vpmulta = (float) (vt/100) * (100+pmulta);
      vpmulta2 = (float) (vpmulta - vt) /(nparcelas);
      
      System.out.println("o valor total com desconto para pagamento antecipado"+vtdesconto);
      System.out.println("valor de multa em cada parcela"+vpmulta2);
    
    }
}
