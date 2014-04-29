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
public enum bookCoverType {
     H {
    public String toString() {
        return "Hard Cover";
    }
    },
     
      P {
    public String toString() {
        return "Paper Back";
    }
    },
    
       L {
    public String toString() {
        return "Large";
    }
    }
    
}
/*  
public static void main(String[] args) {
    System.out.println(bookCoverType.H);
    System.out.println(bookCoverType.P);
    System.out.println(bookCoverType.L);
}
}
*/