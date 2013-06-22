package ch.k42.auroracliclient.client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 22.06.13
 * Time: 04:03
 * To change this template use File | Settings | File Templates.
 */
public class MailQuorgProperties implements QuorgProperties {
    private static final String CLASSNAME = "MailQuorg";
    private String[] settings = {"example@gmail.com","1234"}; // username | password

    /**
     * The GMAIL address of the mailaccount which should be
     * checked
     * @param username a Gmail account
     * @return this, for methodchaining
     */
    public MailQuorgProperties setUsername(String username){
        username.trim();
        Pattern p = Pattern.compile("\b[a-z0-9+.]+@gmail.com\b");
        Matcher m = p.matcher(username);
        boolean b = m.matches();
        if(!b) username = "InvalidGmailAddress";
        settings[0] = username;
        return this;
    }

    /**
     * The password to the mailaccount which should be
     * checked
     * @param password a Gmail account password
     * @return this, for methodchaining
     */
    public MailQuorgProperties setPassword(String password){
        settings[1] = password;
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
