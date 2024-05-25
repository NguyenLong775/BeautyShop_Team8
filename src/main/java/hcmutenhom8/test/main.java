package hcmutenhom8.test;

import hcmutenhom8.DAO.impl.ProductDAO;
import hcmutenhom8.model.SupplierModel;

public class main {
    public static void main(String[] arg) {
        ProductDAO dao = new ProductDAO();
        SupplierModel p = dao.getDetailProduct("1");
        System.out.println(p.getTenNcc());
    }
}
