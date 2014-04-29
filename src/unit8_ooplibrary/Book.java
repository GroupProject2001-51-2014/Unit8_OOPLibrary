
package unit8_ooplibrary;

/**
 *
 * @author namphan
 */
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class Book extends LibraryMaterial {
    
    private ImageIcon bookCoverImage;
    private BookCoverType bookCoverType;
    private final DecimalFormat formatter;    
    private int numberOfPages;
    private Byte printEdition;
    private String text;


    public Book() {
        super();
        this.bookCoverImage = null;
        this.bookCoverType = BookCoverType.U;
        this.formatter = new DecimalFormat("$##.00");
        this.numberOfPages = 0;
        this.printEdition = 0;
        this.text = "";
    }
        
    public Book(String author, String title, BigDecimal price, short publicationYear, BookCoverType type, 
                Byte printEdition, int numberOfPages, ImageIcon coverImage) {
        super(author, title, price, publicationYear, coverImage);
        this.bookCoverImage = coverImage;
        this.bookCoverType = type;
        this.formatter = new DecimalFormat("$##.00");
        this.numberOfPages = numberOfPages;
        this.printEdition = printEdition;
        this.text = "";
    }

    public void setBookCoverType(BookCoverType type)
    {
        this.bookCoverType = type; 
    }

    public BookCoverType getBookCoverType()
    {
        return this.bookCoverType;
    }

    public void setPrintEdition(Byte printEdition)
    {
        this.printEdition = printEdition;
    }

    public int getPrintEdition()
    {
        return this.printEdition;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages()
    {
        return this.numberOfPages;
    }

    public void setBookCoverImage(ImageIcon bookCoverImage)
    {
        super.setCoverImage(bookCoverImage);
        this.bookCoverImage = bookCoverImage;
    }

    public ImageIcon getImage()
    {
        return this.bookCoverImage;
    }

    @Override
    public String displayInfo()
    {
        text = (new StringBuilder())
                .append("Title: ").append(super.getTitle())
                .append("\nAuthor: ").append(super.getAuthor())
                .append("\nBook Cover: ").append(this.bookCoverType.toString())
                .append("\nEdition: ").append(this.printEdition)
                .append("\nYear of Published:  ").append(super.getPublicationYear())
                .append("\nNumber of Pages: ").append(this.numberOfPages)
                .append("\nBook Price: ").append(formatter.format(super.getPrice())).toString();
        return text;
    }

    public ImageIcon getCover()
    {
        return bookCoverImage;
    }
}
