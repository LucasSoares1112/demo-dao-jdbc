import entities.Department;
import entities.Seller;
import entities.dao.DaoFactory;
import entities.dao.SellerDao;

import java.sql.Date;

void main(){

    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("=== TEST 1: seller findById ===");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);

    System.out.println("\n=== TEST 1: seller findByDepartment ===");
    Department department = new Department(3, null);
    List<Seller> list = sellerDao .findByDepartment(department);
    for (Seller obj : list) {
        System.out.println(obj);
    }

    System.out.println("\n=== TEST 1: seller findAll ===");
    list = sellerDao .findAll();
    for (Seller obj : list) {
        System.out.println(obj);
    }
}