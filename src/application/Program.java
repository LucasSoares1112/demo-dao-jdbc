import entities.Department;
import entities.Seller;
import entities.dao.DaoFactory;
import entities.dao.SellerDao;

import java.sql.Date;

void main(){
    Department obj = new Department(1, "Books");

    Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new DateTimeFormatterBuilder().toFormatter(), 3000.00, obj);

    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println(seller);
}