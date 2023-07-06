package implementation_3;

public class Database {
    private static Database databaseInstance = null;

    private Database(){}

    public static Database getInstance(){

        if(databaseInstance == null){
            synchronized(Database.class){
                if(databaseInstance == null){
                    databaseInstance = new Database();
                }
            }
        }

        return databaseInstance;
    }
}
