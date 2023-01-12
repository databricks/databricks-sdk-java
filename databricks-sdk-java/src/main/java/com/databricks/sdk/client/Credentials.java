package com.databricks.sdk.client;

import org.apache.http.HttpMessage;

public interface Credentials {
    String name();

    boolean isConfigured();

    void visit(HttpMessage request);
}
