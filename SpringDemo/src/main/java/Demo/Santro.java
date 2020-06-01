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
public class Santro  implements Car{
    
    private String model;
    private String transmission;
    private int cc;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    
    
    @Override
    public String start() {
        return "I am Starting a Santro.";
    }

    @Override
    public String features() {
         return "Model:"+this.getModel()+", Transmission:"+this.getTransmission()+", CC:"+Integer.toString(this.getCc());
    }
    
}
