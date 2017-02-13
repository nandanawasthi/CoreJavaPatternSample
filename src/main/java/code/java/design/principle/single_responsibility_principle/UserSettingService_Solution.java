package code.java.design.principle.single_responsibility_principle;

public class UserSettingService_Solution {
    public void changeEmail(User user) {
        if (SecurityService.checkAccess(user)) {
            //Grant option to change
        }
    }
}

class SecurityService {
    public static boolean checkAccess(User user) {
        //check the access.
        return true;
    }
}