package code.java.design.pattern.structural.facade.sample01;

/**
 * Created by edevawa on 15/02/2017.
 */
public class CPU {
    public void freeze() {
        System.out.println("Received the command to freeze operation");
    }
    public void jump(long position) {
        System.out.println("Received the command to jump to label "+ position);
    }
    public void execute() {
        System.out.println("Received the command to start execution");
    }
}
