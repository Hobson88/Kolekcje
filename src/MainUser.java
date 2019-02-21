import Controller.UserController;

public class MainUser {


    public static void main(String[] args) {
        UserController uc = new UserController();

        uc.addNewUser("hobson", "FFFF1234");
       // uc.addNewUser("hobson", "4334");
        uc.addNewUser("john", "aasdfasd444FFF");
        uc.addNewUser("gregor", "1F4gdhg204");
        // uc.showAllUser();
//
//        uc.deleteUser("john");
//        uc.deleteUser("john2");
        uc.changePassword("hobson", "FFFF1234", "A23232323", "A23232323");

    }
}
