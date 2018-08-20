/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Esteban
 */
public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private int license;
    private int min;
    
    public ParkedCar(String make, String model, String color, int license, int min)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.license = license;
        this.min = min;
    }
    public String getMake()
    {
        return make;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getLicense()
    {
        return license;
    }
    public void setLicense(int lic)
    {
        this.license = lic;
    }
    public int getMinutes()
    {
        return min;
    }
    public void setMinutes(int m)
    {
        this.min = m;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String c)
    {
        color = c;
    }
            
}
