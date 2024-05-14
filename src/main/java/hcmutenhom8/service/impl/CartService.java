package hcmutenhom8.service.impl;

import hcmutenhom8.DAO.ICartDAO;
import hcmutenhom8.DAO.impl.CartDAO;
import hcmutenhom8.model.CartModel;
import hcmutenhom8.service.ICartService;

import java.util.List;

public class CartService implements ICartService {
    ICartDAO cartDAO = new CartDAO();

    @Override
    public List<CartModel> findAll(String username) {
        return cartDAO.findAll(username);
    }
    public void deleteCartById(String masp,String username){cartDAO.deleteCartById(masp,username);}

    public List<CartModel> findOne(String masp, int soluong) {
        return cartDAO.findOne(masp, soluong);
    }
}
