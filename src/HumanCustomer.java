import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class HumanCustomer extends Customer {

    public String spouseName;
    public ArrayList<String> childrenName;


    public HumanCustomer (String newCustomerName, String newSpouseName, ArrayList<String> childrenNames){
        super(newCustomerName);
        this.spouseName = newSpouseName;
        this.childrenName = childrenNames;

    }

    public HumanCustomer (String newCustomerName, String newSpouseName) {
        this(newCustomerName, newSpouseName, null);
    }

    public HumanCustomer(String newCustomerName) {
        this(newCustomerName, null, null);
    }
    public String getSpouse() {
        return this.spouseName;
    }

    public ArrayList<String> getChildren() {
        return this.childrenName;
    }

     /**
     * get child in the order they were added where the index is there position
     * @param index
     * @return String
     */
    public String getChild(int index) {
        return this.childrenName.get(index);
    }

    /**
     * add child to the end of the number of child
     * @param childName
     * @return void
     */
    public void addChild(String childName) {
        this.childrenName.add(childName);

    }

    public static void main(String[] args) {

    }
}
