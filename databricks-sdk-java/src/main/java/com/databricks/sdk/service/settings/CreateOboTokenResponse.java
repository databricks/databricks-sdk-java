// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateOboTokenResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateOboTokenResponse {
  /** */
  @JsonProperty("token_info")
  private TokenInfo tokenInfo;

  /** Value of the token. */
  @JsonProperty("token_value")
  private String tokenValue;

  /**
   * <p>Setter for the field <code>tokenInfo</code>.</p>
   *
   * @param tokenInfo a {@link com.databricks.sdk.service.settings.TokenInfo} object
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenResponse} object
   */
  public CreateOboTokenResponse setTokenInfo(TokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokenInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo getTokenInfo() {
    return tokenInfo;
  }

  /**
   * <p>Setter for the field <code>tokenValue</code>.</p>
   *
   * @param tokenValue a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenResponse} object
   */
  public CreateOboTokenResponse setTokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokenValue</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTokenValue() {
    return tokenValue;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOboTokenResponse that = (CreateOboTokenResponse) o;
    return Objects.equals(tokenInfo, that.tokenInfo) && Objects.equals(tokenValue, that.tokenValue);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo, tokenValue);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateOboTokenResponse.class)
        .add("tokenInfo", tokenInfo)
        .add("tokenValue", tokenValue)
        .toString();
  }
}
