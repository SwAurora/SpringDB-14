package hello.itemservice;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class mouseMacro
{
    @Test
    void test1()
    {
        try
        {
            Robot robot = new Robot();
            while(true)
            {
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(10);
            }
        }
        catch(AWTException e)
        {
            e.printStackTrace();
        }
    }
}
