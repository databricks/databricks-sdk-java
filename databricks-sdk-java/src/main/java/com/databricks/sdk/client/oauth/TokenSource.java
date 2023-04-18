package com.databricks.sdk.client.oauth;

import java.util.function.Function;

/** A resource which can produce an OAuth token. */
public interface TokenSource {
  Token getToken();
}
