package Default;


/**
 * Created by Bilal on 09-12-2016.
 */
public class Customer{

    private int custID;
    private String fName;
    private String lName;
    private int cPhone;

    public Customer(int custID, String fName, String lName, int cPhone) {
        this.custID = custID;
        this.fName = fName;
        this.lName = lName;
        this.cPhone = cPhone;
    }

    public int getCustID() { return custID; }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getcPhone() {
        return cPhone;
    }

}
