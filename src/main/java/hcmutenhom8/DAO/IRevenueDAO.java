package hcmutenhom8.DAO;

import hcmute.team5.model.RevenueModel;

import java.util.List;

public interface IRevenueDAO {
    List<RevenueModel> findAll();
    List<RevenueModel> findAllByProperties(int maChiNhanh, String ngayBatDau, String ngayKetThuc);
}
