package ch.k42.auroracliclient.client;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 22.06.13
 * Time: 03:25
 * To change this template use File | Settings | File Templates.
 */
public class ColorQuorgProperties implements QuorgProperties {
    private static final String CLASSNAME = "ColorQuorg";

    private String[] settings = {"0xFF0000"};

    /**
     * Specifies the Color of this Color quorg
     * @param c a color, most likely this will converted to RGB 1bit color-depth
     * @return this, for methodchaining
     */
    public ColorQuorgProperties setColor(Color c){
        settings[1]= String.format("%#02X%02X%02X",c.getRed(),c.getGreen(),c.getBlue());
        return this;
    }

    @Override
    public String getClassname() {
        return CLASSNAME;
    }

    @Override
    public String[] getSettings() {
        return settings;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
