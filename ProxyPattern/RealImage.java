/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern;

/**
 *
 * @author mtpsk
 */
public class RealImage extends Image {
    private String url;
 
    public RealImage(String url) {
        this.url = url;
        System.out.println("Image loaded: " + this.url);
    }
 
    
    public void showImage() {
        System.out.println("Image showed: " + this.url);
    }
}
