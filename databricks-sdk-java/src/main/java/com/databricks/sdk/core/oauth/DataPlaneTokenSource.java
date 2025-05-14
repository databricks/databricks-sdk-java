package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.http.HttpClient;
import java.util.concurrent.ConcurrentHashMap;

public class DataPlaneTokenSource {
    private final HttpClient httpClient;
    private DatabricksOAuthTokenSource cpTokenSource;
    private ConcurrentHashMap<String, DatabricksOAuthTokenSource> tokenCache;

    public DataPlaneTokenSource(HttpClient httpClient) {
        this.httpClient = httpClient;
        // It's good practice to initialize collections, even if empty initially.
        this.tokenCache = new ConcurrentHashMap<>(); 
    }

}
