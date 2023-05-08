package com.databricks.sdk.client;

import com.databricks.sdk.support.DeveloperApi;

import java.util.Map;

@DeveloperApi
public interface HeaderFactory {
  /**
   * Part of the Unified Client Authentication framework.
   *
   * <p>HeaderFactory is supposed to be returned from CredentialsProvider, once it's configured.
   *
   * @return a map of HTTP headers with refreshed tokens
   */
  Map<String, String> headers();
}
