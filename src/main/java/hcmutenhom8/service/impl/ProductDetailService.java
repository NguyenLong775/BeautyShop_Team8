package hcmutenhom8.service.impl;

import hcmutenhom8.DAO.IProductDAO;
import hcmutenhom8.DAO.impl.ProductDAO;
import hcmutenhom8.model.ProductModel;
import hcmutenhom8.model.ProductTypeModel;
import hcmutenhom8.model.SupplierModel;
import hcmutenhom8.service.IProductDetailService;

import java.util.List;

public class ProductDetailService implements IProductDetailService {
    IProductDAO productDAL = new ProductDAO();

    @Override
    public SupplierModel getDetailProduct(String maSP) {
        return productDAL.getDetailProduct(maSP);
    }

    public List<ProductModel> getListProDuctByProductType(String maLoaiSP, String maSP) {return productDAL.getListProDuctByProductType(maLoaiSP,maSP);}
    public List<ProductTypeModel> getAllProductType(){return  productDAL.getAllProductType();}
    public List<ProductModel> getListProductByNCC (String mancc, String maSP){return  productDAL.getListProductByNCC(mancc,maSP);}
    public List<ProductModel> getListProDuctViewed(String maSP, String username){return productDAL.getListProDuctViewed(maSP,username);}
    public void insertviewed(String username, String masp){productDAL.insertviewed(username,masp);}
    public void inserttoCart(String username, String masp, int Soluong){productDAL.inserttoCart(username, masp, Soluong);}
    public List<SupplierModel> getAllSuppliers(){return productDAL.getAllSuppliers();}
    public List<ProductModel> getAllProductByNCC(String mancc) {return  productDAL.getAllProductByNCC(mancc);}
    public List<ProductModel> getTop3(){return productDAL.getTop3();}
    public List<ProductModel> getNext3Product(int amount){return productDAL.getNext3Product(amount);}
    public List<ProductModel> getAllProDuctByProductType(String maLoaiSP){return productDAL.getAllProDuctByProductType(maLoaiSP);}
}
