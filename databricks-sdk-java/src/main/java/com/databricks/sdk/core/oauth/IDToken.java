package com.databricks.sdk.core.oauth;

/**
 * Represents an ID Token provided by an identity provider from an OAuth flow.
 * IDToken is a token that can be exchanged for an access token.
 */
public class IDToken {
    // The string value of the ID Token
    private final String value;

    /**
     * Constructs an IDToken with a value.
     * @param value The ID Token string.
     */
    public IDToken(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}