package com.kidding.frame;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kidding
 * Date: 2018-11-17
 * Time: 下午3:42
 */
public class GUIUtil {
    public static void toCenter(Component comp) {
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle rec=ge.getDefaultScreenDevice().getDefaultConfiguration().getBounds();
        comp.setLocation(((int)(rec.getWidth()-comp.getWidth())/2),
                ((int)(rec.getHeight()-comp.getHeight()))/2);

    }
}
