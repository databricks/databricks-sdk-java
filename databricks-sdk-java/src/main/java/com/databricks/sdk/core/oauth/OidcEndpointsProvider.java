package com.databricks.sdk.core.oauth;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.ConfigLoader;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Provider of Open ID Connect endpoints from a given Databricks config.
 */
class OidcEndpointsProvider {

  private static final Duration CACHE_MAX_STALENESS = Duration.ofMinutes(5);

  // Shorthand for Pair<T, Time>.
  private static class CacheEntry<T> {

    private T entry;
    private Instant insertionTime;

    public CacheEntry(T entry, Instant insertionTime) {
      this.entry = entry;
      this.insertionTime = insertionTime;
    }

    public CacheEntry(T entry) {
      this(entry, Instant.now());
    }

    public T getEntry() {
      return this.entry;
    }

    public Instant getInsertionTime() {
      return this.insertionTime;
    }

    public Duration getAge() {
      return Duration.between(getInsertionTime(), Instant.now());
    }
  }

  private static ConcurrentHashMap<String, CacheEntry<OpenIDConnectEndpoints>> cache = new ConcurrentHashMap<>();

  private final DatabricksConfig config;

  public OidcEndpointsProvider(DatabricksConfig config) {
    this.config = config;
  }

  public OpenIDConnectEndpoints getOidcEndpoints() throws IOException {
    if (this.config.getDiscoveryUrl() != null) {
      return getEndpoints(this.config.getDiscoveryUrl());
    }

    if (this.config.getHost() == null) {
      return null;
    }

    if (this.config.isAzure() && this.config.getAzureClientId() != null) {
      return fetchAzureEndpoints();
    }

    if (this.config.isAccountClient() && this.config.getAccountId() != null) {
      return fetchAccountClientEndpoints();
    }

    return getEndpoints(this.config.getHost() + "/oidc/.well-known/oauth-authorization-server");
  }

  private OpenIDConnectEndpoints fetchAccountClientEndpoints() {
    String prefix = this.config.getHost() + "/oidc/accounts/" + this.config.getAccountId();
    return new OpenIDConnectEndpoints(prefix + "/v1/token", prefix + "/v1/authorize");
  }

  private OpenIDConnectEndpoints fetchAzureEndpoints() {
    OpenIDConnectEndpoints resp = getEndpoints(this.config.getHost()
        + "/oidc/oauth2/v2.0/authorize");
    String realAuthUrl = resp.getAuthorizationEndpoint();
    return new OpenIDConnectEndpoints(realAuthUrl.replaceAll("/authorize", "/token"), realAuthUrl);
  }

  // Gets the endpoints from the cache or through http request.
  private OpenIDConnectEndpoints getEndpoints(String url) {
    return cache.compute(url, (key, val) -> {
      if (val != null && val.getAge().compareTo(CACHE_MAX_STALENESS) < 0) {
        return val;
      }

      return new CacheEntry<OpenIDConnectEndpoints>(makeHttpGetEndpointsRequest(key));
    }).getEntry();
  }

  private OpenIDConnectEndpoints makeHttpGetEndpointsRequest(String url) {
    try {
      Request request = new Request("GET", url);
      if (this.config.isAzure()) {
        request.setRedirectionBehavior(false);
      }
      Response resp = this.config.getHttpClient().execute(request);
      if (resp.getStatusCode() == 200) {
        return new ObjectMapper().readValue(resp.getBody(),
            OpenIDConnectEndpoints.class);
      } else {
        // LOG some error
        return null;
      }
    } catch (IOException e) {
      throw ConfigLoader.makeNicerError(e.getMessage(), e, this.config);
    }
  }
}