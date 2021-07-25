/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpcoder.patterns.creational.abstractfactory.factory;
import com.gpcoder.patterns.creational.abstractfactory.chair.Chair;
import com.gpcoder.patterns.creational.abstractfactory.chair.PlasticChair;
import com.gpcoder.patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import com.gpcoder.patterns.creational.abstractfactory.table.PlasticTable;
import com.gpcoder.patterns.creational.abstractfactory.table.Table;
 
/**
 *
 * @author PC
 */
public class FlasticFactory extends FurnitureAbstractFactory {
     @Override
    public Chair createChair() {
        return new PlasticChair();
    }
 
    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
