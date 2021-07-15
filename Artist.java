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
public class Artist implements ArtistInt {
   private  String name;
  private   String email;
  private   Songs aseda;
  private   char gender;

    public Artist(String name, String email, Songs aseda, char gender) {
        this.name = name;
        this.email = email;
        this.aseda = aseda;
        this.gender = gender;
    }
  
  

    public String getName() {
        return name;
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public Songs getAseda(){
         return aseda;
  }
    public void setAseda(Songs aseda){
         this.aseda = aseda;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail( String email) {
        this.email =  email;
    }


    public char getGender() {
        return gender;
    }
   public void setGender(char gender) {
         this.gender = gender;
    }



    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", aseda='" + aseda + '\'' + 
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }


}
