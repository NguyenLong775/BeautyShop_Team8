package hcmutenhom8.service;

import hcmutenhom8.model.AccountModel;
import hcmutenhom8.model.CustomerModel;

import java.util.List;

public interface IAccountService {
    public AccountModel login(String username, String password);

    public AccountModel findOneByUsername(String username);

    public void insert(AccountModel account);

    void insertAcc(AccountModel account);

    void insertCus(CustomerModel customer);

    List<AccountModel> findAll(int fetch, int offset);

    public void deleteAccount(AccountModel account);

    public void update(AccountModel account);

    List<AccountModel> findAllByProperties(String roleName, String status, String username, int pageSize, int index);

    int getNumOfAccount();
}