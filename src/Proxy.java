/**
 * Created by TheOriginMS7 on 24.12.2016.
 */
public class Proxy implements IOperations {
    private Operations oper;
    private User user;

    public Proxy(User user) {
        this.user = user;
    }

    private boolean checkPermissions() {
        if(user.getName().equals("Admin") && user.getPass().equals("12345678")) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void opers(){
        if(checkPermissions()){
            oper = new Operations();
            oper.opers();
        }
        else{
            System.out.println("Failed, you don't have permission");
        }
    }
}
