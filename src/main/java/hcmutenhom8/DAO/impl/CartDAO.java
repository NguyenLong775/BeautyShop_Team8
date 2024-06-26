package hcmutenhom8.DAO.impl;

import hcmutenhom8.DAO.DBConnectionSQL;
import hcmutenhom8.DAO.ICartDAO;
import hcmutenhom8.mapper.CartMapper;
import hcmutenhom8.model.CartModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CartDAO extends AbstractDAO<CartModel> implements ICartDAO {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public void deleteCartById(String masp,String username){
        String sql = "DELETE GioHang WHERE masp = ? and username = ? ";
        update(sql,masp,username);
    }
    public List<CartModel> findAll(String username) {
        String sql = "SELECT * FROM GioHang INNER JOIN SanPham ON GioHang.masp = SanPham.masanpham WHERE username = ?";
        return query(sql, new CartMapper(), username);
    }

    public List<CartModel> findOne(String masp, int soluong) {
        List<CartModel> list = new ArrayList<>();
        String sql = "SELECT * FROM SanPham WHERE masanpham=?";
        try {
            conn = new DBConnectionSQL().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, masp);
            rs = ps.executeQuery();
            while (rs.next()) {
                CartModel cart = new CartModel();
                cart.setMaSanPham(rs.getString("masanpham"));
                cart.setTenSP(rs.getString("tensanpham"));
                cart.setSoLuong(soluong);
                cart.setGia(rs.getInt("gia"));
                cart.setDescription(rs.getString("description"));
                cart.setImage(rs.getString("image"));
                list.add(cart);
            }
            conn.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
