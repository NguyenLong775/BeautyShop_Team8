package hcmutenhom8.DAO;

import hcmutenhom8.model.RevenueModel;

import java.util.List;

public interface IRevenueDAO {
    List<RevenueModel> findAll();
    List<RevenueModel> findAllByProperties(int maChiNhanh, String ngayBatDau, String ngayKetThuc);
}
