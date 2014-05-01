/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author Tenzin Dhargye
 * Concept#3 Inheritance
 * Concept#1 Encapsulation/Data hiding
 */
public class Book extends LibraryMaterial{
    private String bookType;
    private int printEdit;
    private int numPage;
    
    
    /**
     * Default constructor
     * Concept#2 Default constructor
     */
    public Book(){
    }
    
    /**
     * Non default constructor
     * @param bType
     * @param pEdit
     * @param nPage 
     */
    public Book(String bType, int pEdit, int nPage)
    {
        bookType = bType;
        numPage = nPage;
        printEdit = pEdit;
    }
    
    /**
     * first Edition book constructor
     * @param firstEdit 
     */
    public Book(int firstEdit)
    {
        
    }

    /**
     * Gets book type
     * @return bookType
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
    
    /**
     * 
     * Concept #6 Method Override
     * @return String for results
     */
    @Override
    public String displayInfo() {
        return ("Title: " + getTitle() + "\n\nAuthor: " + getAuthor() + "\n\nYear: " +  getYear() + "\n\nBook Edition: " + getbkEdition() + "\n\nBook Type: " + getbkType()+
                "\n\nPages: "+ getbkPage() +"\n\nPrice: " + getPrice());
    }
}

