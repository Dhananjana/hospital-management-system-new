
package hms;


public class testClass {
    private int testno, nic, atndno;
    private String testn, result;
    
    public testClass(int no, int NIC, int atNo, String test, String res)
    {
        this.testno = no;
        this.nic = NIC;
        this.atndno = atNo;
        this.testn = test;
        this.result = res;
    }
    
    public int getNIC()
    {
        return this.nic;
    }
    public int getTID()
    {
        return this.testno;
    }
    public int getatdID()
    {
        return this.atndno;
    }
    public String gettest()
    {
        return this.testn;
    }
    public String getresult()
    {
        return this.result;
    }
    
}
