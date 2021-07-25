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
public class ProxyImage extends Image {
    private Image realImage;
    private String url;
 
    public ProxyImage(String url) {
        this.url = url;
        System.out.println("Image unloaded: " + this.url);
    }
 
    @Override
    public void showImage() {
        if (realImage == null) {
            realImage = new RealImage(this.url);
        } else {
            System.out.println("Image already existed: " + this.url);
        }
        realImage.showImage();
    }
}
