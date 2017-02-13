package code.java.design.pattern.structural.facade.sample01;


public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(5, hd.read(5l, 2));
        processor.jump(5);
        processor.execute();
    }
}
