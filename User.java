public class User {
     // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String Customer;
    public void setCustomer(String customer) {
        Customer = customer;
    }
    int PhoneNumber;
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public void registeruser(){
        System.out.println("Customer Name: "+ Customer);
        System.out.println("Phone Number: " + PhoneNumber);
    }

}
