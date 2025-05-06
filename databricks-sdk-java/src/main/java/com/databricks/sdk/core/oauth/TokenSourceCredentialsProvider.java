package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.HeaderFactory;
import java.util.HashMap;
import java.util.Map;

/** Base class for token-based credentials providers. */
public class TokenSourceCredentialsProvider implements CredentialsProvider {
  private final TokenSource tokenSource;
  private final String authType;

  /**
   * Creates a new TokenSourceCredentialsProvider with the specified token source and auth type.
   *
   * @param tokenSource The token source to use for token exchange
   * @param authType The authentication type string
   */
  public TokenSourceCredentialsProvider(TokenSource tokenSource, String authType) {
    this.tokenSource = tokenSource;
    this.authType = authType;
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {

    return () -> {
      Map<String, String> headers = new HashMap<>();
      try {
        String accessToken = tokenSource.getToken().getAccessToken();
        headers.put("Authorization", "Bearer " + accessToken);
        return headers;
      } catch (Exception e) {
        return null;
      }
    };
  }

  @Override
  public String authType() {
    return authType;
  }
}
