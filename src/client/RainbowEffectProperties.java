package client;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 22.06.13
 * Time: 03:47
 * To change this template use File | Settings | File Templates.
 */
public class RainbowEffectProperties implements QuorgProperties {

    private static final String CLASSNAME = "RainbowEffect";
    private String[] settings = {"true"};

    public RainbowEffectProperties setRaining(boolean raining){
        settings[0] = raining ? "true" : "false";
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
