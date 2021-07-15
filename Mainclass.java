/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Rich
 */
public class Mainclass {
    
    
  public static void main(String[]args){
  Songs jesus = new Songs("brighter day",23.2,"20/02/2019");    
  Artist don = new Artist("don meon", "don@1212gmail.com", jesus, 'M');
  Artist mercy = new Artist("mercy","mercy@gmail.com",jesus,'F');
 System.out.println(don.toString());
 System.out.println(mercy.toString());
  
  }
}
