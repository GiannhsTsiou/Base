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
public class Compression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZipInterface test = new CompressChooser();
        Editor asd = new Editor(test);
        asd.CompressFile();
        ZipInterface test2 = new CompressChooser2();
        asd.setZipinterface(test2);
        asd.CompressFile();
    }

}
