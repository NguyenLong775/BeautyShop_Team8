package hcmutenhom8.DAO;

import hcmutenhom8.model.BillDetailsModel;
import hcmutenhom8.model.BillModel;

import java.util.List;

public interface IBillDAO {
    List<BillModel> findAllBillByMaKH(int makh);

    List<BillModel> findAll(int pageSize, int index);

    List<BillDetailsModel> findAllById(int maHD);

    List<BillModel> findAllByProperties(int maChiNhanh, int maHD, int pageSize, int index);

    int getNumOfBill();
    void addBill(String ngay, int makh, int maCN, String tongTien);
    int findCodeBill(int maKH);
    void AddBillDetails(int maHD, int maSP, int soLuong);
    void AddPay(int maKH, int maVC, int maHD);
    void DeleteCart(String name);
}
