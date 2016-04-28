package rectangle.model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author Serhii Kisilchuk
 */
@RunWith(Parameterized.class)
public class ModelTest {
    public static final double ACCURACY = 0.1;

    private static Model model;
    private int a;
    private int b;
    private double resultDiagonal;
    private int resultPerimeter;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, 4, 5, 14},
                {4, 3, 5, 14},
                {15, 20, 25, 70},
                {10, 15, 18.02, 50},
                {100, 180, 205.91, 560},
        });
    }

    public ModelTest(int a, int b, double resultDiagonal, int resultPerimeter) {
        this.a = a;
        this.b = b;
        this.resultDiagonal = resultDiagonal;
        this.resultPerimeter = resultPerimeter;
    }

    @BeforeClass
    public static void beforeClass() {
        model = new Model();
    }

    @Before
    public void before() throws Exception {
        model.setA(this.a);
        model.setB(this.b);
    }

    @Test
    public void diagonal() throws Exception {
        assertEquals(model.diagonal(), resultDiagonal, ACCURACY);
    }

    @Test
    public void perimeter() throws Exception {
        assertEquals(model.perimeter(), resultPerimeter);
    }

}