package code.java.design.principle.single_responsibility_principle;

public class UserSettingService_Problem {
    public void changeEmail(User user) {
        if (checkAccess(user)) {
            // allowed to change user email
        }
    }

    public boolean checkAccess(User user) {
        return true;
    }
}
// instead of change email responsibility, it also handling validation of user
// in above implementation user have code reuse issue
