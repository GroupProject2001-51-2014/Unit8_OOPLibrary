/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarygroup1;

/**
 *
 * @author namphan
 */
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class book extends LibraryMaterial
{

    private String coverType;
    private int bookEd;
    private int numPages;
    ImageIcon bookCover;
    String text;
    DecimalFormat formatter;

    

    public Book(String author, String title, double price, int year, String type, int edition, 
            int pages)
    {
        super(author, title, Double.valueOf(price), year);
        text = "";
        formatter = new DecimalFormat("$##.00");
        coverType = type;
        bookEd = edition;
        numPages = pages;
    }

    public void setCoverType(String type)
    {
        coverType = type; 
    }

    public String getBookType()
    {
        return coverType;
    }

    public void setEd(int edition)
    {
        bookEd = edition;
    }

    public int getEd()
    {
        return bookEd;
    }

    public void setPages(int pages)
    {
        numPages = pages;
    }

    public int getPages()
    {
        return numPages;
    }

    public void setImage(ImageIcon image)
    {
        bookCover = image;
    }

    public ImageIcon getImage()
    {
        return bookCover;
    }

    public String displayInfo()
    {
        text = (new StringBuilder()).append("\nTitle: ").append(titleName).append("\n\nAuthor: ").append(authorName).append("\n\n Book Cover: ").append(bookType).append("\n\nEdition: ").append(bookEd).append("\n\nYear of Published:  ").append(yearPrinted).append("\n\nNumber of Pages: ").append(bookPages).append("\n\nBook Price: ").append(formatter.format(price)).toString();
        return text;
    }

    public ImageIcon getCover()
    {
        return bookCover;
    }
}
