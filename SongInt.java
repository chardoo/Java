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
public interface SongInt {
    public String getName();
    public double getPrice();
    public String getReleasedDate();
    public void setName(String name);
    public Artist getArtist();
    public void setArtist(Artist author);
     
}
