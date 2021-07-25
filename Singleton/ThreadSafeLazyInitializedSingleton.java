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
public class ThreadSafeLazyInitializedSingleton {
      private static volatile ThreadSafeLazyInitializedSingleton instance;
 
    private ThreadSafeLazyInitializedSingleton() {
    }
 
    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }
}
