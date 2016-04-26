package rectangle.view;

/**
 * View class
 *
 * @author Serhii Kisilchuk
 */
public class View {
    // Text's constants
    public static final String INPUT_SIDE_MESSAGE = "Input side %s of rectangle (INT value): ";
    public static final String SIDE_A = "A";
    public static final String SIDE_B = "B";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String RECTANGLE_MESSAGE = "Rectangle: side a = %d; side b = %d\n";
    public static final String DIAGONAL_MESSAGE = "Diagonal = %f\n";
    public static final String PERIMETER_MESSAGE = "Perimeter = %d\n";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void formatMessage(String message, Object... args) {
        System.out.format(message, args);
    }

}
