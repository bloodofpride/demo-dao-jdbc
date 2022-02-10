import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(10);
        System.out.println(seller);

        System.out.println("\n === TEST 2: department findById ====");
        Department dep = departmentDao.findById(4);
        System.out.println(dep);

        System.out.println("\n === TEST 3: seller findByDepartment ====");
        List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
        sellers.forEach(System.out::println);
    }
}
