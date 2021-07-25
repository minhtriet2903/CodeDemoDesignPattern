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
public class Client {
    public static void main(String[] args) {
        System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("https://gpcoder.com/favicon.ico");
         
        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();
         
        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}
