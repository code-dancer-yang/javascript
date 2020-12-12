package smart.apps.factory.smart.apps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "dao2")
@Scope(value = "prototype")
public class AccountDAOImpl2 implements AccountDAO{
    @PostConstruct
    public void init(){
        System.out.println("init....");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }


    @Override
    public void sayHello() {
        System.out.println("调用了dao2");
    }
}
