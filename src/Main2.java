import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n === TEST 1: department findById ====");
        Department dep = departmentDao.findById(4);
        System.out.println(dep);

        System.out.println("\n === TEST 2: department findAll ====");
        List<Department> deps = departmentDao.findAll();
        deps.forEach(System.out::println);

//        System.out.println("\n === TEST 3: department insert ====");
//        Department dep2 = new Department(null, "casa e cia");
//        departmentDao.insert(dep2);
//        System.out.println("Inserted! new id = "+dep2.getId());

        System.out.println("\n === TEST 4: department update ====");
        Department dep3 = new Department(6, "Festas");
        departmentDao.update(dep3);
        System.out.println("update complete ");

        System.out.println("\n === TEST 5: department delete ====");
        departmentDao.deleteById(6);
        System.out.println("department deleted");
    }
}
