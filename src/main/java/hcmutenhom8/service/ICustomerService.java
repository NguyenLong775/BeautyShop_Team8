package hcmutenhom8.service;

import hcmutenhom8.model.CustomerModel;

import java.util.List;

public interface ICustomerService {
    List<CustomerModel> findAll(int pageSize, int index);

    public void updateCustomer(CustomerModel customer);

    public CustomerModel findOneByCustomer(int maKh);

    public void deleteCustomer(CustomerModel customer);

    void insertCus(CustomerModel customer);

    List<CustomerModel> findAllByProperties(String name, String total, int pageSize, int index);

    public int getNumOfCustomer();
    int findId(String name);
}





