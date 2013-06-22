package ch.k42.auroracliclient.net;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 22.06.13
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
public class SetRequestBuilder implements RequestBuilder {
    private static final Request.Command cmd = Request.Command.SETQUORG;

    private Serializable[] args = new Serializable[3];

    public SetRequestBuilder(){
        args[0] = new Integer(0);
        args[1] = "ClassnameMissing";
        args[2] = new String[0];
    }

    public SetRequestBuilder setMatrix(int m){
        args[0] = new Integer(m);
        return this;
    }

    public SetRequestBuilder setClassname(String c){
        args[1] = c;
        return this;
    }

    public SetRequestBuilder setSettings(String[] s){
        args[2] = s;
        return this;
    }

    @Override
    public Request getRequest() {
        return new Request(cmd,args);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
