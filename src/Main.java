import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ====");
        Seller seller1 = sellerDao.findById(10);
        System.out.println(seller1);

        System.out.println("\n === TEST 2: seller findByDepartment ====");
        Department dep = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(dep);
        sellers.forEach(System.out::println);

        System.out.println("\n === TEST 3: seller findAll ====");
        List<Seller> sellersAll = sellerDao.findAll();
        sellersAll.forEach(System.out::println);

        System.out.println("\n === TEST 4: seller insert ====");
        Seller sellers2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.insert(sellers2);
        System.out.println("Inserted! new id = "+sellers2.getId());

        System.out.println("\n === TEST 5: seller update ====");
        Seller sellers3 = sellerDao.findById(9);
        sellers3.setName("Martha waine");
        sellerDao.update(sellers3);
        System.out.println("Update completed");

        System.out.println("\n === TEST 6: seller delete ====");
        sellerDao.deleteById(17);
        System.out.println("seller deleted");
    }
}
