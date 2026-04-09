import entities.Department;
import entities.Seller;
import entities.dao.DaoFactory;
import entities.dao.SellerDao;

import java.sql.Date;

void main(){

    SellerDao sellerDao = DaoFactory.createSellerDao();

    Seller seller = sellerDao.findById(3);

    System.out.println(seller);
}