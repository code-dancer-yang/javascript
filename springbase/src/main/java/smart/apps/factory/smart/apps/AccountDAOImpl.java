package smart.apps.factory.smart.apps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "dao1")
@Scope(value = "prototype")
public class AccountDAOImpl  implements AccountDAO{

    @Override
    public void sayHello() {
        System.out.println("调用了dao1");
    }
}
