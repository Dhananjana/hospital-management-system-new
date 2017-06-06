package hms;

public class cEmployee {
    
    public int empID;
    public String name;
    private String address;
    private int teleNumber;
    public String gender;
    public String emptype;
    
    public cEmployee(int empId, String name, String address, int teleNumber, String gender, String emptype)
    {
        this.empID = empId;
        this.name = name;
        this.address = address;
        this.teleNumber = teleNumber;
        this.gender = gender;
        this.emptype = emptype;
    }
    
    public int getEmpId()
    {
        return empID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int gettele()
    {
        return teleNumber;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public String getEmpType()
    {
        return emptype;
    }
    
    
    
    
}
