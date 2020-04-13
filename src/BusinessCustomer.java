public class BusinessCustomer extends Customer {

        public int Size;

        public BusinessCustomer (String newCustomerName, int newBusinessSize){
            super(newCustomerName);
            this.Size = newBusinessSize;
        }

        public void setSize(int Size) {
            this.Size = Size;
        }

        public int getSize() {
            return this.Size;
        }
    }

