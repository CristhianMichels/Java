package systethings;

import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemResolution {
    public static void main(String[] args) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    
       int width = screen.width;
       int height = screen.height;

       System.out.println("The Screen Resolution is: " + width + " x " + height);
    }
}
