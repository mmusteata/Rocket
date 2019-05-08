//Task:
//    1)	Having an input txt file with user’s order details (attached)
//    2)	Read file itself
//    3)	Parse data from it in java objects:
//    a.	User
//    b.	Product (enum with id + name)
//    c.	Order Details
//    4)	Check if order (input file) was made before 10.30.2018
//

package solid_Task;

import java.text.ParseException;

public class Main {
    private static final String FILEPATH = "C:\\zInternship_Tasks\\Rocket\\src\\main\\resoruce\\Sample.txt";
    private static CSV_Parser csvParser = new CSV_Parser();

    public static void main(String[] args) throws ParseException {

        Order order = new Order(csvParser.getOrderDate(FILEPATH),csvParser.getOrderId(FILEPATH));
        User user = new User(csvParser.getUserId(FILEPATH));
        Product product = new Product(csvParser.getProductsList(FILEPATH));
        order.toString();
        user.toString();
    }



}
