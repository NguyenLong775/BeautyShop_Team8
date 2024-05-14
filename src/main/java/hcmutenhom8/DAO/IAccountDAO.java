package hcmutenhom8.DAO;

import hcmutenhom8.model.AccountModel;
import hcmutenhom8.model.CustomerModel;

import java.util.List;

public interface IAccountDAO {
    AccountModel findOneByUsername(String username);

    void insert(AccountModel account);

    void insertCus(CustomerModel customer);

    List<AccountModel> findAll(int fetch, int offset);

    void deleteAccount(AccountModel account);

    void insertAcc(AccountModel account);

    void update(AccountModel account);

    List<AccountModel> findAllByProperties(String roleName, String status, String username, int pageSize, int index);

    int getNumOfAccount();
}
