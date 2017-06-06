
package hms;

import java.text.SimpleDateFormat;


public class discharge {
    
    private int nic, atndNo, wno, rno;
    private String name, remark;
    private java.sql.Date SQldate;
    
    
    public discharge(int nic, String name, int atndNo, int wno, int rno, String dte, String remark)
    {
        this.nic = nic;
        this.name = name;
        this.atndNo = atndNo;
        this.wno = wno;
        this.rno = rno;
        this.remark = remark;
        
        String date = dte;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date textDate = null;
        try{
            textDate = sdf.parse(date);
            SQldate = java.sql.Date.valueOf(sdf.format(textDate));
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
    
    public int getNIC()
    {
        return this.nic;
    }
    
    public int getatdID()
    {
        return this.atndNo;
    }
    
    public int getwardNo()
    {
        return this.wno;
    }
    
    public int getroomNo()
    {
        return this.rno;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public String getRemark()
    {
        return this.remark;
    }
    
    public java.sql.Date getDate()
    {
        return this.SQldate;
    }
    
}
