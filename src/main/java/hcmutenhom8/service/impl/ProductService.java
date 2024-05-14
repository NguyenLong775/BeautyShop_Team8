package hcmutenhom8.service.impl;

import hcmutenhom8.DAO.IProductDAO;
import hcmutenhom8.DAO.impl.ProductDAO;
import hcmutenhom8.model.ProductModel;
import hcmutenhom8.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    IProductDAO productDAL = new ProductDAO();
    @Override
    public List<ProductModel> findAll(int pageSize, int index) {
        return productDAL.findAll(pageSize, index);
    }

    @Override
    public void updateProduct(ProductModel product) {
        productDAL.updateProduct(product);
    }

    @Override
    public ProductModel findOneByProduct(int maSP) {
        return productDAL.findOneByProduct(maSP);
    }

    @Override
    public void deleteProduct(ProductModel product) {
        productDAL.deleteProduct(product);
    }

    @Override
    public void insertPro(ProductModel product) {
        productDAL.insertPro(product);
    }

    @Override
    public List<ProductModel> findAllByProperties(int maChiNhanh, String status, int maSP, int maLoaiSP, int pageSize, int index) {
        return productDAL.findAllByProperties(maChiNhanh, status, maSP, maLoaiSP, pageSize, index);
    }

    @Override
    public int getNumOfProduct() {
        return productDAL.getNumOfProduct();
    }

    @Override
    public ProductModel findExistProduct(String tenSP, int maChiNhanh) {
        return productDAL.findExistProduct(tenSP, maChiNhanh);
    }
}