/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpcoder.patterns.creational.abstractfactory.factory;
 
import com.gpcoder.patterns.creational.abstractfactory.MaterialType;
import com.gpcoder.patterns.creational.abstractfactory.factory.impl.FlasticFactory;
import com.gpcoder.patterns.creational.abstractfactory.factory.impl.WoodFactory;
 
/**
 *
 * @author PC
 */
public class FurnitureFactory {
      private FurnitureFactory() {
 
    }
 
    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
        case FLASTIC:
            return new FlasticFactory();
        case WOOD:
            return new WoodFactory();
        default:
            throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
