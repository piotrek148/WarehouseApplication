package util;

import model.Manager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Scanner;

public class ManagerService {

    public Manager createManager(){
        Manager manager=new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide manager name");
        manager.setName(scanner.nextLine());
        System.out.println("Password is automatically setted - '1111'!");

        return manager;
    }
    public void addNewManager(Manager manager){
        final StandardServiceRegistry standardServiceRegistry=
                new StandardServiceRegistryBuilder().configure().build();

        try (SessionFactory sessionFactory=new MetadataSources(standardServiceRegistry)
                .buildMetadata().buildSessionFactory()){
            Session session=sessionFactory.openSession();
            Transaction transaction=session.beginTransaction();
            session.save(manager);
            transaction.commit();


            session.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getManagersList(){

    }
}
