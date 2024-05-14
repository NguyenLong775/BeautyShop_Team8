package hcmutenhom8.mapper;

import hcmutenhom8.model.RevenueModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RevenueMapper implements RowMapper<RevenueModel>{
    @Override
    public RevenueModel mapRow(ResultSet rs) {
        try {
            RevenueModel revenue = new RevenueModel();
            revenue.setMaHD(rs.getString("mahd"));
            revenue.setMaChiNhanh(rs.getInt("machinhanh"));
            revenue.setNgayIn(rs.getTimestamp("ngayin"));
            revenue.setMaKH(rs.getString("makh"));
            revenue.setTongTien(rs.getFloat("tongtien"));
            return revenue;
        }
        catch (SQLException e) {
            return null;
        }
    }

}
