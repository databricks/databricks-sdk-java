package com.databricks.sdk.client;

/**
 * Simplified REST API client with retries, JSON POJO SerDe through Jackson and exception POJO
 * guessing
 */
public class ApiClient {

  private final HttpClient hc;

  public ApiClient() {
    this(ConfigLoader.getDefault());
  }

  public ApiClient(DatabricksConfig config) {
    Integer httpTimeoutSeconds = config.getHttpTimeoutSeconds();
    if (httpTimeoutSeconds == null) {
      httpTimeoutSeconds = 300;
    }

    Integer rateLimit = config.getRateLimit();
    if (rateLimit == null) {
      rateLimit = 15;
    }

    Integer debugTruncateBytes = config.getDebugTruncateBytes();
    if (debugTruncateBytes == null) {
      debugTruncateBytes = 96;
    }

    HttpClient.RequestPreparer rp = config::authenticate;

    hc =
        new HttpClient(
            config.getConnectionManager(),
            httpTimeoutSeconds,
            rateLimit,
            debugTruncateBytes,
            config.getHost(),
            rp);
  }

  public <O> O GET(String path, Class<O> target) {
    return hc.GET(path, target);
  }

  public <I, O> O GET(String path, I in, Class<O> target) {
    return hc.GET(path, in, target);
  }

  public <I, O> O POST(String path, I in, Class<O> target) {
    return hc.POST(path, in, target);
  }

  public <I, O> O PUT(String path, I in, Class<O> target) {
    return hc.PUT(path, in, target);
  }

  public <I, O> O PATCH(String path, I in, Class<O> target) {
    return hc.PATCH(path, in, target);
  }

  public <I, O> O DELETE(String path, I in, Class<O> target) {
    return hc.DELETE(path, in, target);
  }
}
