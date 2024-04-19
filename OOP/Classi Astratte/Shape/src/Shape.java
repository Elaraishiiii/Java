import java.awt.Graphics;

public abstract class Shape {
    // Attributi
    protected int x;
    protected int y;
    // Costruttori
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    abstract public void draw(Graphics g);
}
