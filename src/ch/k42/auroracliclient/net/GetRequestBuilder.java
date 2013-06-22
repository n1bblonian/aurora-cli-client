package ch.k42.auroracliclient.net;

import ch.k42.auroracliclient.net.Request;
import ch.k42.auroracliclient.net.RequestBuilder;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 22.06.13
 * Time: 16:27
 * TODO: JAVADOC!
 */
public class GetRequestBuilder implements RequestBuilder {
    private static final Request.Command cmd = Request.Command.GETUPDATE;

    @Override
    public Request getRequest() {
        return new Request(cmd,null);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
