/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton1;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public class SerializedSingleton implements Serializable {
     private static final long serialVersionUID = 1741825395699241705L;
 
    private SerializedSingleton() {
    }
 
    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
 
    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
     
    
    
}
