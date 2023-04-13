package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.HttpClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientCredentials extends RefreshableTokenSource {
  private String clientId;
  private String clientSecret;
  private String tokenUrl;
  private Map<String, String> endpointParams;
  private List<String> scopes;
  private boolean useParams;
  private boolean useHeader;

  public ClientCredentials(
      HttpClient hc,
      String clientId,
      String clientSecret,
      String tokenUrl,
      Map<String, String> endpointParams,
      List<String> scopes,
      boolean useParams,
      boolean useHeader) {
    super(hc);
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.tokenUrl = tokenUrl;
    this.endpointParams = endpointParams;
    this.scopes = scopes;
    this.useParams = useParams;
    this.useHeader = useHeader;
  }

  @Override
  public Token refresh() {
    Map<String, String> params = new HashMap<>();
    params.put("grant_type", "client_credentials");
    if (scopes != null) {
      params.put("scope", String.join(" ", scopes));
    }
    if (endpointParams != null) {
      params.putAll(endpointParams);
    }
    return retrieveToken(
        clientId, clientSecret, tokenUrl, params, useParams, useHeader, new HashMap<>());
  }
}
