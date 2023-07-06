package implementation_2;

public class Database {
    private  static Database databaseInstance = new Database();

    private Database(){}

    public static Database getInstance(){
        return databaseInstance;
    }
}
