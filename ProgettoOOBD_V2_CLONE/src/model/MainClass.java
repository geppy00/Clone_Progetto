package model;
import dao.DataAccessObject;


public class MainClass {
    
    public static void main(String[] args) {
        DataAccessObject d1 = new DataAccessObject();
        d1.connectionToDatabase();
    }
}
