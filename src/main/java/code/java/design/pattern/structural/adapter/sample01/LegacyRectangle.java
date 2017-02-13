package code.java.design.pattern.structural.adapter.sample01;

public class LegacyRectangle
{
    public void draw(int x, int y, int w, int h)
    {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w
                + " and height " + h);
    }
}

