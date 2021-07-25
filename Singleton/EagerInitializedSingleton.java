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
public class EagerInitializedSingleton {
     private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
 
    // Private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
         
    }
 
    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
