package smart.apps.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smart.apps.factory.smart.apps.AccountDAOImpl;
import smart.apps.factory.smart.apps.AccountServiceImpl;

public class TestSpringContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        AccountDAOImpl accountDAO = ac.getBean("dao1", AccountDAOImpl.class);
        AccountServiceImpl accountService=ac.getBean("accountService", AccountServiceImpl.class);
//        accountDAO.sayHello();
        accountService.sayHello();
        ac.close();

    }
}
