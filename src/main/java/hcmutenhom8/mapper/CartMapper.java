package hcmutenhom8.mapper;

import hcmutenhom8.model.CartModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CartMapper implements RowMapper<CartModel> {
    @Override
    public CartModel mapRow(ResultSet rs) {
        try {
            CartModel cart = new CartModel();
            cart.setMaSanPham(rs.getString("masp"));
            cart.setTenSP(rs.getString("tensanpham"));
            cart.setMaSp(rs.getInt("masanpham"));
            cart.setSoLuong(rs.getInt("soluong"));
            cart.setGia(rs.getInt("gia"));
            cart.setDescription(rs.getString("description"));
            cart.setImage(rs.getString("image"));
            return cart;
        } catch (SQLException e) {
            return null;
        }
    }
}
