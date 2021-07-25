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
public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;
 
    private DoubleCheckLockingSingleton() {
    }
 
    public static DoubleCheckLockingSingleton getInstance() {
        // Do something before get instance ...
        if (instance == null) {
            
            synchronized (DoubleCheckLockingSingleton.class) {
                
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
