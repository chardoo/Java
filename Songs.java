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
public class Songs implements SongInt {
    
    private String name;
    private double price;
    private  String releasedDate;

    public Songs(String name,  double price, String date) {
        this.name = name;
        this.price = price;
        this.releasedDate = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleasedDate() {
        return releasedDate;
    }
 public void setReleasedDate(String releasedate) {
        this.releasedDate = releasedate;
    }
//    
    

    @Override
    public String toString() {
        return "Songs{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date=" + releasedDate +
                '}';
    }
}
