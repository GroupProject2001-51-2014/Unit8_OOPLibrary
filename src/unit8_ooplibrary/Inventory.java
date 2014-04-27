
package unit8_ooplibrary;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author John Mambo <john.mambo@gmail.com>
 */
public class Inventory {

    private final ConcurrentHashMap<Integer, Inventory> libraryMaterials = new ConcurrentHashMap(5,0.9f,3);  
    private int libraryMaterialID;
    private LibraryMaterial libraryMaterial;
    private Librarian librarian;
    private Date checkOut;
    private Date checkin;
    private boolean depricated;
    
    private Inventory(){}
    
    public Inventory(LibraryMaterial libraryMaterial){
        this.libraryMaterial = libraryMaterial;
    }
            
    public Inventory(LibraryMaterial libraryMaterial, Librarian librarian, Date checkOut, Date checkin, boolean depricated) {
        this.libraryMaterialID = this.libraryMaterials.size() + 1;
        this.libraryMaterial = libraryMaterial;
        this.librarian = librarian;
        this.checkOut = checkOut;
        this.checkin = checkin;
        this.depricated = depricated;
    }

    protected int getLibraryMaterialID() {
        return this.libraryMaterialID;
    }

    private void setLibraryMaterialID(int libraryMaterialID) {
        // TODO: Implement functionality for setLibraryMaterialID to get Id from HashMap
        throw new UnsupportedOperationException();
    }
    
    // TODO: Add method to UML
    protected ConcurrentHashMap<Integer, Inventory> getLibraryMaterials() {
        return this.libraryMaterials;
    }

    // add method to add Inventory item addToInventory
    protected LibraryMaterial getLibraryMaterial() {
        return this.libraryMaterial;
    }

    protected void setLibraryMaterial(LibraryMaterial libraryMaterial) {
        this.libraryMaterial = libraryMaterial;
    }

    protected Librarian getLibrarian() {
        return this.librarian;
    }

    protected void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    protected Date getCheckOut() {
        return checkOut;
    }

    protected void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    protected Date getCheckin() {
        return this.checkin;
    }

    protected void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    protected boolean isDepricated() {
        return this.depricated;
    }

    protected void setDepricated(boolean depricated) {
        this.depricated = depricated;
    }
}
