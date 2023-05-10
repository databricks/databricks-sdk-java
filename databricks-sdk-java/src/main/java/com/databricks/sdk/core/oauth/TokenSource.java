package com.databricks.sdk.core.oauth;

/** A resource which can produce an OAuth token. */
public interface TokenSource {
  Token getToken();
}
