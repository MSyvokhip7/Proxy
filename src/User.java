/**
 * Created by TheOriginMS7 on 24.12.2016.
 */
public class User {

    String name;
    String pass;

    public User(String name, String pass){
        this.name = name;
        this.pass = pass;
    }

    public String getName(){
        return name;
    }

    public String getPass(){
        return pass;
    }
}
