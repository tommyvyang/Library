/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author Tenzin Dhargye
 */
public class Book extends LibraryMaterial{
    private String bookType;
    private int printEdit;
    private int numPage;
    
    
    /**
     * Default constructor
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
     * Displays the information about the book
     */
    public void displayInfo()
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
    private void setbkEdition(int bkEdition)
    {
        printEdit = bkEdition;
    }
    
    /**
     * Gets book page number
     * @return numPage
     */
    private int getbkPage()
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
}

