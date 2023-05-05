package com.databricks.sdk.client.oauth;

import com.databricks.sdk.support.DeveloperApi;

/** A resource which can produce an OAuth token. */
@DeveloperApi
public interface TokenSource {
  Token getToken();
}
