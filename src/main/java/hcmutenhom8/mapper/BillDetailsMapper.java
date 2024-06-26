package hcmutenhom8.mapper;

import hcmutenhom8.model.BillDetailsModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BillDetailsMapper implements RowMapper<BillDetailsModel> {

    @Override
    public BillDetailsModel mapRow(ResultSet rs) {
        try {
            BillDetailsModel bill = new BillDetailsModel();
            bill.setMaSp(rs.getInt("masanpham"));
            bill.setTenSP(rs.getString("tensanpham"));
            bill.setPhanTramGiam(rs.getFloat("phantramgiam"));
            bill.setGia(rs.getInt("gia"));
            bill.setSoLuong(rs.getInt("soluong"));
            return bill;
        } catch (SQLException e) {
            return null;
        }
    }
}
