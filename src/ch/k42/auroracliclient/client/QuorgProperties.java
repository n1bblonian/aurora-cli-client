package ch.k42.auroracliclient.client;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 21.06.13
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */
public interface QuorgProperties {
    /**
     *
     * @return the static classname of this Quorg
     */
    public String getClassname();

    /**
     * Compiles the properties for the specific Quorg to the
     * format used with the Requests
     * @return compiled properties of a quorg
     */
    public String[] getSettings();
}
