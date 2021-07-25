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
public class BillPughSingleton {
    private BillPughSingleton() {
    }
 
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
 
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}

