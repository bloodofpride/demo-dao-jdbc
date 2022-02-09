import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Department dp = new Department(1, "Books");
        Seller s = new Seller(21, "Bob", "bob@gamil.com", new Date(), 3000.0, dp);
        System.out.println(s);
    }
}
