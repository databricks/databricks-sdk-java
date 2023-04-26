package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response from an OAuth token request.
 *
 * <p>The first four attributes (error, errorCode, errorSummary, errorDescription) are populated in
 * case of a failed request, and the other attributes are not set. The last attributes (expiresIn,
 * accessToken, tokenType) are set after successful authentication. refreshToken is set when
 * grant_type includes refresh_token (for U2M authentication).
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OAuthResponse {
  @JsonProperty("error")
  private String error;

  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("errorSummary")
  private String errorSummary;

  @JsonProperty("error_description")
  private String errorDescription;

  /**
   * <p>Getter for the field <code>errorCode</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorCode() {
    if (errorCode != null) {
      return errorCode;
    }
    return error;
  }

  /**
   * <p>Getter for the field <code>errorSummary</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorSummary() {
    if (errorSummary != null) {
      return errorSummary;
    }
    return errorDescription;
  }

  @JsonProperty("expires_in")
  private int expiresIn;

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("token_type")
  private String tokenType;

  /**
   * <p>Getter for the field <code>expiresIn</code>.</p>
   *
   * @return a int
   */
  public int getExpiresIn() {
    return expiresIn;
  }

  /**
   * <p>Getter for the field <code>accessToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * <p>Getter for the field <code>refreshToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * <p>Getter for the field <code>tokenType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTokenType() {
    return tokenType;
  }
}
