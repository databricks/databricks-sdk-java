package com.databricks.sdk.core.oauth;

public class CachedTokenSource implements TokenSource {
    private final TokenSource tokenSource;
    private Token cachedToken;

    public CachedTokenSource(TokenSource tokenSource) {
        this.tokenSource = tokenSource;
    }

    @Override
    public synchronized Token getToken() {
        if (cachedToken == null || !cachedToken.isValid()) {
            cachedToken = tokenSource.getToken();
        }
        return cachedToken;
    }
}
