package ch.k42.auroracliclient.net;


import ch.k42.auroracliclient.client.QuorgProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 22.06.13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
public interface RequestBuilder {
    /**
     * Builds a Request, ready to send
     * @return a Request ready to send
     */
    public Request getRequest();
}
