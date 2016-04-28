package rectangle.model;

/**
 * Model class
 *
 * @author Serhii Kisilchuk
 */
public class Model {
    /**
     * Side a of rectangle
     */
    private int a;
    /**
     * Side b of rectangle
     */
    private int b;

    // The Program logic

    /**
     * Calculation diagonal rectangle: d = sqrt(a^2 + b^2)
     *
     * @return diagonal of rectangle
     */
    public double diagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    /**
     * Calculation perimeter rectangle: p = 2*(a+b)
     *
     * @return perimeter of rectangle
     */
    public int perimeter() {
        return 2 * (a + b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a < 0)
            throw new IllegalArgumentException("a should be > 0");
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b < 0)
            throw new IllegalArgumentException("b should be > 0");
        this.b = b;
    }
}
