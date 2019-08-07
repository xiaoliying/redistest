package com.example.redistest.bean;

import java.io.Serializable;

/**
 * Created by sang on 2017/12/30.
 */
public class MenuMeta implements Serializable {

    public boolean keepAlive;
    public boolean requireAuth;

    public boolean isKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public boolean isRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
