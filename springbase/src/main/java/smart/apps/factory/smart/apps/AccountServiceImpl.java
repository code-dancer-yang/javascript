package smart.apps.factory.smart.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "accountService")
@Scope(value = "singleton")
public class AccountServiceImpl implements AccountService {

    @Autowired//按照类型注入，如果匹配到多个对象
    @Qualifier(value = "dao2")
    private AccountDAO dao;
    @Override
    public void sayHello() {
        dao.sayHello();

    }

}
