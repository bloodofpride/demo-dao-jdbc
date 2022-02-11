import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("\n === TEST 1: department findById ====");
        Department dep = departmentDao.findById(4);
        System.out.println(dep);
    }
}
