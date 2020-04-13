import java.util.ArrayList;

public class Customer {

    public String name;

    public Customer(String newCustomerName ){

        this.name = newCustomerName;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName( ) {
        return this.name;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Adam Swain");
        System.out.println("customer: " + customer.getName());
        ArrayList<String> childrenNames = new ArrayList<String>();
        childrenNames.add("Max");
        childrenNames.add("Sam");
        childrenNames.add("Bill");
        childrenNames.add("Jan");
        childrenNames.add("Liz");
        childrenNames.add("Tom");
        HumanCustomer customer1 = new HumanCustomer(customer.getName(), "Wife", childrenNames);
        System.out.println("customer1: " +  customer1.getName());
        System.out.println("children: " +  customer1.getChildren());
        System.out.println("spouse: " +  customer1.getSpouse());
        System.out.println("Child 5: " + customer1.getChild(4));
        System.out.println("Child 3: " + customer1.getChild(2));
        System.out.println("Child 1: " + customer1.getChild(0));
        System.out.println("Child 6: " + customer1.getChild(5));
        customer1.addChild("Sally");
        System.out.println("Added new Child to array " + customer1.getChildren());
        System.out.println("Child 7: " + customer1.getChild(6));


        BusinessCustomer customer2 = new BusinessCustomer(customer.getName(), 5);
        System.out.println("customer2: " +  customer2.getName());
        System.out.println("name: " +  customer2.getName());
        System.out.println("businessSize: " +  customer2.getSize());

        Oval Oval = new Oval(5,6,7,4);
        System.out.println("Oval Height: " +  Oval.getHeight());
        System.out.println("Oval Width: " +  Oval.getWidth());
        System.out.println("Oval X: " +  Oval.getX());
        System.out.println("Oval Y: " +  Oval.getY());
        Oval.setHeight(10);
        Oval.setWidth(20);
        Oval.setX(30);
        Oval.setY(40);
        System.out.println("Oval Height: " +  Oval.getHeight());
        System.out.println("Oval Width: " +  Oval.getWidth());
        System.out.println("Oval X: " +  Oval.getX());
        System.out.println("Oval Y: " +  Oval.getY());
    }
}

