/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpcoder.patterns.creational.abstractfactory.factory;
import com.gpcoder.patterns.creational.abstractfactory.chair.Chair;
import com.gpcoder.patterns.creational.abstractfactory.table.Table;
/**
 *
 * @author PC
 */
public abstract class FurnitureAbstractFactory {
     public abstract Chair createChair();
 
    public abstract Table createTable();
}
