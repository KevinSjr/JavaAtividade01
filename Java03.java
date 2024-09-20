/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java03;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Java03 {

    public static void main(String[] args) {
     Scanner leia  =  new Scanner(System.in);
         
   int contador = 0;
   String nome;
   String nome2 = "Kevin";
   int idade;
   int idade2 = 22;
   int peso;
   int peso2 = 90;
   float altura;
   float altura2 = (float) 1.70;
   String favgame;
   String favgame2 = "xadrez";
   String favserie;
   String favserie2 = "game of thrones";
   String favcolor;
   String favcolor2 = "azul";
   
   System.out.println("Digite seu nome");
   nome = leia.next();
   System.out.println("Digite sua idade");
   idade = leia.nextInt();
   leia.nextLine();
   System.out.println("Digite seu peso");
   peso = leia.nextInt();
   leia.nextLine();
   System.out.println("Digite sua altura");
   altura = leia.nextFloat();
   leia.nextLine();
   System.out.println("Digite seu jogo favorito");
   favgame = leia.nextLine();
   System.out.println("Digite sua serie favorita");
   favserie = leia.nextLine();
   System.out.println("Digite sua cor favorita");
   favcolor = leia.nextLine();
   
   if (nome.equals(nome2))
   {System.out.println("Pessoa com nome igual");
     contador = contador+1; }
   else
   {System.out.println("Pessoa com o nome diferente"); }
    if (idade == idade2)
   {System.out.println("Pessoa com idade igual");
    contador = contador+1;}
   else
   {System.out.println("Pessoa com a idade diferente"); }
   if (peso == peso2)
   {System.out.println("Pessoa com peso igual");
    contador = contador + 1;
   if (altura == altura2)
   {System.out.println("Pessoa com altura igual");
    contador = contador + 1;} 
   else
   {System.out.println("Pessoa com a altura diferente");}} 
   else
   {System.out.println("Pessoa com o peso diferente");}
   if (favgame.equals(favgame2))
   {System.out.println("Pessoa com jogo favorito igual");
   contador = contador+1;}
   else
   {System.out.println("Pessoa com jogo favorito diferente"); }
     if (favserie.equals(favserie2))
   {System.out.println("Pessoa com serie favorita igual");
   contador = contador+1;}
   else
   {System.out.println("Pessoa com serie favorita diferente"); }
    if (favcolor.equals( favcolor2))
   {System.out.println("Pessoa com cor favorita igual");
   contador = contador+1;}
   else
   {System.out.println("Pessoa com cor favorita diferente"); }  
    if (contador >= 3) 
    {System.out.println("Esta pessoa é bem parecida comigo!");}

      leia.close();    
    }
}
