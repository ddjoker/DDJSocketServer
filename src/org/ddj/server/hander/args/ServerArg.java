package org.ddj.server.hander.args;

/**
 * Created by dong on 2016/8/4.
 */
public class ServerArg implements Arg<Boolean> {
    public static final String name = "server";
    @Override
    public Boolean value() {
        return true;
    }
}
