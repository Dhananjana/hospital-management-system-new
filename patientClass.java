package hms;

import java.sql.*;
import javax.swing.JOptionPane;

public class patientClass {
    
    private int nic;
    private String name;
    private int age;
    private String address;
    private int telephone;
    private String Bgroup;
    
    public patientClass(int nic, String name, int age, String address, int telephone, String Bgroup)
    {
        this.nic = nic;
        this.name = name;
        this.age = age;
        this.address = address;
        this.telephone = telephone;
        this.Bgroup = Bgroup;
        
    }
    
    public int getNIC()
    {
        return nic;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getNumber()
    {
        return telephone;
    }
    
    public String getBgroup()
    {
        return Bgroup;
    }
}
