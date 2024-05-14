package hcmutenhom8.service;

import hcmutenhom8.model.RevenueModel;

import java.util.List;

public interface IRevenueService {
    List<RevenueModel> findAll();
    List<RevenueModel> findAllByProperties(int maChiNhanh, String ngayBatDau, String ngayKetThuc);
}
