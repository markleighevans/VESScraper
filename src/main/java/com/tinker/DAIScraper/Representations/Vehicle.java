package com.tinker.DAIScraper.Representations;
import java.util.Date;
/**
 * Created by root on 06/12/15.
 */
public class Vehicle {
    private String VRM;
    private String Make;
    private String Model;
    private String Colour;
    private Date FirstReg;
    private Date MOTDate;
    private Date TaxDate;
    private int  Weight;

    public String GetVRM()
    {
        return this.VRM;
    }
    public void SetVRM(String VRM)
    {
        this.VRM = VRM;
    }
    public String GetMake()
    {
        return this.Make;
    }
    public void SetMake(String Make)
    {
        this.Make = Make;
    }
}
