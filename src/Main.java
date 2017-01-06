/**
 * Created by TheOriginMS7 on 24.12.2016.
 */
public class Main {

    public static void main(String[] args){
        User user_acc = new User("Admin", "12345678");
        Proxy proxy = new Proxy(user_acc);
        proxy.opers();

        User user_acc2 = new User("Adm", "123");
        Proxy proxy2 = new Proxy(user_acc2);
        proxy2.opers();
    }
}
