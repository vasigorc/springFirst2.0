/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vgorcinschi.springfirst.model.Stories;

import com.vgorcinschi.springfirst.model.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author vgorcinschi
 */
@Component
@Qualifier("fourth")
public class FourthFloor implements Storey{
    private Office office;

    @Autowired
    public FourthFloor(
            @Qualifier("hexagon") Office office) {
        this.office = office;
    }
    @Override
    public Office getOffice() {
        return office;
    }
    
}
