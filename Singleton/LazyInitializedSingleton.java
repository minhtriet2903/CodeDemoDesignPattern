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
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
 
    private LazyInitializedSingleton() {
    }
 
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
