package com.databricks.sdk.client.oauth;

/** A resource which can produce an OAuth token. */
public interface TokenSource {
  Token getToken();
}
