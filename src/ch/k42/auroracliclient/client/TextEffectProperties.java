package ch.k42.auroracliclient.client;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 22.06.13
 * Time: 00:04
 * To change this template use File | Settings | File Templates.
 */
public class TextEffectProperties implements QuorgProperties {
    private static String CLASSNAME = "TextEffect";
    /*
     * @param settings text | foregroundcolor| backgroundcolor | speed
     */
    private String[] settings = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz .,?;: -+=(){}","0xFF0000","0x000000","1"};

    /**
     * Defines the text which will be displayed.
     * @param text a Text, support are A-Z,a-z,0-9, punctuation, 'umlaute'
     * @return
     */
    public TextEffectProperties setText(String text){
        settings[0] = text;
        return this;
    }

    /**
     * Sets the texts foregroundcolor, you might want to
     * use Color.RED or similar
     * @param c Textcolor
     * @return this, for methodchaining
     */
    public TextEffectProperties setForegroundColor(Color c){
        settings[1]= String.format("%#02X%02X%02X",c.getRed(),c.getGreen(),c.getBlue());
        return this;
    }

    /**
     * Sets the texts backgroundcolor, you might want to
     * use Color.RED or similar
     * @param c Background of the text
     * @return this, for methodchaining
     */
    public TextEffectProperties setBackgroundColor(Color c){
        settings[2]= String.format("%#02X%02X%02X",c.getRed(),c.getGreen(),c.getBlue());
        return this;
    }

    /**
     * Defines the scrolling speed of the Text
     * @param speed 0=slow, 1=fast,2=super fast
     * @return this, for methodchaining
     */
    public TextEffectProperties setSpeed(int speed){
        settings[3]= Integer.toString(speed);
        return this;
    }


    @Override
    public String getClassname() {
        return CLASSNAME;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public String[] getSettings() {
        return settings;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
