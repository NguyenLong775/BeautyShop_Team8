package hcmutenhom8.DAO;

import hcmutenhom8.model.CartModel;

import java.util.List;

public interface ICartDAO {
    List<CartModel> findAll(String username);
    public void deleteCartById(String masp,String username);
    List<CartModel> findOne(String masp, int soluong);
}
