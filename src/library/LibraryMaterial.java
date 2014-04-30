/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.applet.AudioClip;
import javax.sound.sampled.Clip;

/**
 *
 * @author Tommy Yang
 */
public abstract class LibraryMaterial {
    
    private String bookAuthor;
    private String bookTitle;
    private double bookPrice;
    private int publicationYear;
    private String bookType;
    private int printEdit;
    private int numPage;
    private Clip avSound;
    
    /**
     * Default Constructor
     */
    public LibraryMaterial() {
    }
    
    /**
     * 
     * @param author The author of the library item
     * @param title The title of the library item
     * @param price The price of the library item
     * @param year The year of publication of the library item
     * @param bType
     * @param nPage
     * @param pEdit
     * @param _avSound
     */
    public LibraryMaterial(String author, String title, double price, int year, String bType, int nPage, int pEdit, Clip _avSound ) {
        author = bookAuthor;
        title = bookTitle;
        price = bookPrice;
        year = publicationYear;
        bookType = bType;
        numPage = nPage;
        printEdit = pEdit;
        avSound = _avSound;
    }
    
    /**
     * 
     * @return Author of the library item
     */
    public String getAuthor() {
        return bookAuthor;
    }
    
    /**
     * 
     * @return Title of library item
     */
    public String getTitle() {
        return bookTitle;
    }
    
    /**
     * 
     * @return Price of library item
     */
    public double getPrice() {
        return bookPrice;
    }
    
    /**
     * 
     * @return Publication Year of library item
     */
    public int getYear() {
        return publicationYear;
    }
    
    /**
     * 
     * @param author
     */
    public void setAuthor(String author) {
        bookAuthor = author;
    }
    
    /**
     * 
     * @param title
     */
    public void setTitle(String title) {
        bookTitle = title;
    }
    
    /**
     * 
     * @param year
     */
    public void setYear(int year) {
        publicationYear = year;
    }
    
    /**
     * 
     * @param price
     */
    public void setPrice(double price) {
        bookPrice = price;
    }
    
    /**
     *  
     * @return 
     */
    
    public String getbkType()
    {
        return bookType;
    }
    
    /**
     * Sets book type
     * @param bkType 
     */
    public void setbkType(String bkType)
    {
        bookType = bkType;
    }
    
    /**
     * Gets book edition
     * @return printEdit
     */
    public int getbkEdition()
    {
        return printEdit;
        
    }
    
    /**
     * Sets book edition
     * @param bkEdition 
     */
    public void setbkEdition(int bkEdition)
    {
        printEdit = bkEdition;
    }
    
    /**
     * Gets book page number
     * @return numPage
     */
    public int getbkPage()
    {
        return numPage;
    }
    
    /**
     * Sets book page number
     * @param bkPage 
     */
    public void setbkPage(int bkPage)
    {
        numPage = bkPage;
    }
    public void playSound ()
    {
        avSound.start();
    }
    
    /**
     * Sets the sound of the audio and visual material.
     * @param _sound the sound clip
     */
    public void setSound (Clip _sound)
    {
        avSound = _sound;
    }
    public String displayInfo() {
        return ("Title: " + getTitle() + "\n\nAuthor: " + getAuthor() + "\n\nYear: " +  getYear() + "\n\nBook Edition: " + getbkEdition() + "\n\nBook Type: " + getbkType()+
                "\n\nPages: "+ getbkPage() +"\n\nPrice: " + getPrice());
    }
    
}
