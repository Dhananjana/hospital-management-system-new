
package hms;


public class extPhyClass {
    private String name;
    private int nic, count;
    private java.sql.Date dte;

    public extPhyClass(String name,  java.sql.Date dte, int nic, int count) {
        this.name = name;
        this.nic =  nic;
        this.dte = dte;
        this.count = count;
    }
    public String getName()
    {
        return name;
    }
    
    public int getNIC()
    {
        return nic;
    }
    
    public java.sql.Date getDate()
    {
        return dte;
    }
    
    public int getCount()
    {
        return count;
    }
    
    
}
