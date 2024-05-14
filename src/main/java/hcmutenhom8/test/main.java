package hcmutenhom8.test;

import hcmutenhom8.DAO.impl.CartDAO;
import hcmutenhom8.DAO.impl.ProductDAO;
import hcmutenhom8.model.CartModel;
import hcmutenhom8.model.ProductModel;
import hcmutenhom8.model.ProductTypeModel;
import hcmutenhom8.model.SupplierModel;

import java.util.List;
public class main {
    public static void main(String[] arg) {
        ProductDAO dao = new ProductDAO();
        SupplierModel p = dao.getDetailProduct("1");
        System.out.println(p.getTenNcc());
    }
}
