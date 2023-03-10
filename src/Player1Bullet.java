import java.awt.*;

public class Player1Bullet {
    private double x, y;

    public Player1Bullet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(String face) {
        switch (face) {
            case "right" -> x += 5;
            case "left" -> x -= 5;
            case "up" -> y -= 5;
            case "down" -> y += 5;
        }
    }
    public void draw(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval((int) x, (int) y, 10, 10);
    }

    public int getX() {
        return (int) x;
    }

    public int getY() {
        return (int) y;
    }

}
