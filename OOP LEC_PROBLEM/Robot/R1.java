import java.awt.Robot;
import java.awt.event.*;

public class R1 {
    public static void main(String[] args) {

        try {
            Robot r1 = new Robot();

            r1.mouseMove(420, 870);

            Thread.sleep(500);

            r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(2000);

            r1.mouseMove(470, 300);

            Thread.sleep(500);

            r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(5000);

            r1.mouseMove(725, 800);

            r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}