/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpcoder.patterns.creational.abstractfactory.factory;
import com.gpcoder.patterns.creational.abstractfactory.chair.Chair;
import com.gpcoder.patterns.creational.abstractfactory.chair.WoodChair;
import com.gpcoder.patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import com.gpcoder.patterns.creational.abstractfactory.table.Table;
import com.gpcoder.patterns.creational.abstractfactory.table.WoodTable;
 
/**
 *
 * @author PC
 */
public class WoodFactory extends FurnitureAbstractFactory {
     @Override
    public Chair createChair() {
        return new WoodChair();
    }
 
    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
