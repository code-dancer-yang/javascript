package smart.apps.factory;

import smart.apps.factory.smart.apps.AccountDAO;
import smart.apps.factory.smart.apps.AccountDAOImpl;
import smart.apps.factory.smart.apps.AccountService;
import smart.apps.factory.smart.apps.AccountServiceImpl;

public class InstanceFactory {
    public AccountService getInstance(){
        return  new AccountServiceImpl();
    }

    public static AccountDAO getDAO(){
        return  new AccountDAOImpl();
    }
}
