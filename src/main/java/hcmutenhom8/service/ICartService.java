package hcmutenhom8.service;

import hcmutenhom8.model.CartModel;

import java.util.List;

public interface ICartService {
    List<CartModel> findAll(String username);
    void deleteCartById(String masp,String username);
    List<CartModel> findOne(String masp, int soluong);
}
