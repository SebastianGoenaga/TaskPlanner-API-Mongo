package eci.cosw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import eci.cosw.config.AppConfiguration;
import eci.cosw.data.CustomerRepository;
import eci.cosw.data.TodoRepository;
import eci.cosw.data.UserRepository;
import eci.cosw.data.model.Customer;
import eci.cosw.data.model.Todo;
import eci.cosw.data.model.User;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");
        customerRepository.deleteAll();
        todoRepository.deleteAll();
        userRepository.deleteAll();

        customerRepository.save(new Customer("Alice", "Smith"));
        customerRepository.save(new Customer("Bob", "Marley"));
        customerRepository.save(new Customer("Jimmy", "Page"));
        customerRepository.save(new Customer("Freddy", "Mercury"));
        customerRepository.save(new Customer("Michael", "Jackson"));

        todoRepository.save(new Todo("description1", 1, "2001", "responsible1", "status1"));
        todoRepository.save(new Todo("description2", 1, "2002", "responsible2", "status2"));
        todoRepository.save(new Todo("description3", 1, "2003", "responsible3", "status3"));
        todoRepository.save(new Todo("description4", 1, "2004", "responsible4", "status4"));
        todoRepository.save(new Todo("description5", 1, "2005", "responsible5", "status5"));
        todoRepository.save(new Todo("description6", 1, "2006", "responsible6", "status6"));
        todoRepository.save(new Todo("description7", 1, "2007", "responsible7", "status7"));
        todoRepository.save(new Todo("description8", 1, "2008", "responsible8", "status8"));
        todoRepository.save(new Todo("description9", 1, "2009", "responsible9", "status9"));
        todoRepository.save(new Todo("description10", 1, "2010", "responsible10", "status10"));
        todoRepository.save(new Todo("description11", 1, "2011", "responsible11", "status11"));
        todoRepository.save(new Todo("description12", 1, "2012", "responsible12", "status12"));
        todoRepository.save(new Todo("description13", 1, "2013", "responsible13", "status13"));
        todoRepository.save(new Todo("description14", 1, "2014", "responsible14", "status14"));
        todoRepository.save(new Todo("description15", 1, "2015", "responsible15", "status15"));
        todoRepository.save(new Todo("description16", 1, "2016", "responsible16", "status16"));
        todoRepository.save(new Todo("description17", 1, "2017", "responsible17", "status17"));
        todoRepository.save(new Todo("description18", 1, "2018", "responsible18", "status18"));
        todoRepository.save(new Todo("description19", 1, "2019", "responsible19", "status19"));
        todoRepository.save(new Todo("description20", 1, "2020", "responsible20", "status20"));
        todoRepository.save(new Todo("description21", 1, "2021", "responsible21", "status21"));
        todoRepository.save(new Todo("description22", 1, "2022", "responsible22", "status22"));
        todoRepository.save(new Todo("description23", 1, "2023", "responsible23", "status23"));
        todoRepository.save(new Todo("description24", 1, "2024", "responsible24", "status24"));
        todoRepository.save(new Todo("description25", 1, "2025", "responsible25", "status25"));

        userRepository.save(new User("name1", "email1"));
        userRepository.save(new User("name2", "email2"));
        userRepository.save(new User("name3", "email3"));
        userRepository.save(new User("name4", "email4"));
        userRepository.save(new User("name5", "email5"));
        userRepository.save(new User("name6", "email6"));
        userRepository.save(new User("name7", "email7"));
        userRepository.save(new User("name8", "email8"));
        userRepository.save(new User("name9", "email9"));
        userRepository.save(new User("name10", "email10"));
        
                

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

    }

}