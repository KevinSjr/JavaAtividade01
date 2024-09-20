/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java02;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java02 {

    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
 
       int idade;
       int idade2 = 21;
       float salario;
       float salario2 = (float) 7060.00; 
       float altura;
       float altura2 = (float) 1.75;
       int peso;
       int peso2 = 70;
       String sobrenome;
       String sobrenome2 = "Sergio";
       char genero;
       char genero2 = 'f';
       
       System.out.println("digite sua idade");
       idade = leia.nextInt();
       System.out.println("Digitye seu salario");
       salario = leia.nextFloat();
       System.out.println("Digite sua altura");
       altura = leia.nextFloat();
       System.out.println("Digite seu peso");
       peso = leia.nextInt();
       System.out.println("digite seu sobrenome");
       sobrenome = leia.next();
       System.out.println("Digite seu gênero");
       genero = leia.next().charAt(0);
      
       if (idade>idade2)
       {System.out.println("a idade é maior que 21");}
       else
       {System.out.println("a idade é menor que 21");}
       if (salario>salario2)
       {System.out.println("O salario é maior que 5 salarios minimos");   }
       else
       {System.out.println("O salario não é maior que 5 salarios minimos"); }
       if (altura>altura2)
       {System.out.println("A altura é maior que 1.75m");}
       else
       {System.out.println("A altura não é maior que 1.75m");}
       if (peso>peso2)
       {System.out.println("O peso é maior que 70Kg");}
       else
       {System.out.println("O peso não é maior que 70Kg");} 
       if (sobrenome.equals(sobrenome2))
       {System.out.println("Os sobrenomes são iguais");}
       else
       {System.out.println("Os sobrenomes não são iguais");}
       if ( genero == genero2)
       {System.out.println("o gênero é igual a f");}
       else
       {System.out.println("O gênero não é igual a f");}

         leia.close(); 
    }
}
