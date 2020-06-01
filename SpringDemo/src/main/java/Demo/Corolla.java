/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author pc
 */
public class Corolla implements Car {
    
    private String model;
    private String transmission;
    private int cc;

    public String getModel() {
        return model;
    }

    public String getTransmission() {
        return transmission;
    }

    
    public int getCc() {
        return cc;
    }

    public Corolla(String model, String transmission, int cc) {
        this.model = model;
        this.transmission = transmission;
        this.cc = cc;
    }

    
    @Override
    public String start() {
        return "I am Corolla Starting Up.";
    }

    @Override
    public String features() {
        return "Model:"+this.getModel()+", Transmission:"+this.getTransmission()+", CC:"+Integer.toString(this.getCc());
    }
    
}
