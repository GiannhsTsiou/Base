/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compression;

/**
 *
 * @author User
 */
public class Editor {

    private ZipInterface zipinterface;  // χρειαζεται για την υλοποιηση

    public Editor(ZipInterface c) {  //constructor
        this.zipinterface = c;
    }

    public void CompressFile() {  //τραβαει τη μεθοδο archive αναλογα με το τι εχεις δηλωσει
        this.zipinterface.archive();
    }

    public void setZipinterface(ZipInterface zipinterface) {
        this.zipinterface = zipinterface;
    }

}
