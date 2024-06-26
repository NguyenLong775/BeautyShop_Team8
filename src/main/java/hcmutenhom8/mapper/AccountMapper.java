package hcmutenhom8.mapper;

import hcmutenhom8.model.AccountModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper<AccountModel> {
    @Override
    public AccountModel mapRow(ResultSet rs) {
        try {
            AccountModel account = new AccountModel();
            account.setId(rs.getInt("id"));
            account.setUserName(rs.getString("username"));
            account.setFullName(rs.getString("fullname"));
            account.setPassWord(rs.getString("password"));
            account.setStatus(rs.getString("status"));
            account.setRoleId(rs.getInt("roleid"));
            account.setSdt(rs.getString("sdt"));
            return account;
        } catch (SQLException e) {
            return null;
        }
    }
}