/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vgorcinschi.springfirst.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author vgorcinschi
 */
@Component
@Qualifier("rectangle")
public class RectangularOffice extends Office{
    private final String shape;

    public RectangularOffice() {
        super();
        this.shape = "Rectangle";
    }
    
    @Override
    public String getShape() {
        return shape;
    }
    
}
