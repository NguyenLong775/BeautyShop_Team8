package hcmutenhom8.service.impl;

import hcmutenhom8.DAO.IRevenueDAO;
import hcmutenhom8.DAO.impl.RevenueDAO;
import hcmutenhom8.model.RevenueModel;
import hcmutenhom8.service.IRevenueService;

import java.util.List;

public class RevenueService implements IRevenueService {
    IRevenueDAO revenueDAL = new RevenueDAO();
    @Override
    public List<RevenueModel> findAll() {
        return revenueDAL.findAll();
    }

    @Override
    public List<RevenueModel> findAllByProperties(int maChiNhanh, String ngayBatDau, String ngayKetThuc) {
        return revenueDAL.findAllByProperties(maChiNhanh, ngayBatDau, ngayKetThuc);
    }

}
