/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton1;

/**
 *
 * @author PC
 */
public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
 
    private StaticBlockSingleton() {
    }
 
    // Static block initialization for exception handling
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
 
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
