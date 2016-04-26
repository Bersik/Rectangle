package rectangle.controller;

import rectangle.model.Model;
import rectangle.view.View;

import java.util.Scanner;

/**
 * Controller class
 *
 * @author Serhii Kisilchuk
 */
public class Controller {
    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setA(inputIntValueWithScanner(sc, View.SIDE_A));
        model.setB(inputIntValueWithScanner(sc, View.SIDE_B));
        view.formatMessage(View.RECTANGLE_MESSAGE, model.getA(), model.getB());
        view.formatMessage(View.DIAGONAL_MESSAGE, model.diagonal());
        view.formatMessage(View.PERIMETER_MESSAGE, model.perimeter());
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc, String side) {
        view.formatMessage(View.INPUT_SIDE_MESSAGE, side);
        while (!sc.hasNextInt()) {
            view.formatMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_SIDE_MESSAGE, side);
            sc.next();
        }
        return sc.nextInt();
    }
}
