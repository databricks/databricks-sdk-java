// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class BearerTokenAuthPb {
  @JsonProperty("token")
  private String token;

  @JsonProperty("token_plaintext")
  private String tokenPlaintext;

  public BearerTokenAuthPb setToken(String token) {
    this.token = token;
    return this;
  }

  public String getToken() {
    return token;
  }

  public BearerTokenAuthPb setTokenPlaintext(String tokenPlaintext) {
    this.tokenPlaintext = tokenPlaintext;
    return this;
  }

  public String getTokenPlaintext() {
    return tokenPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BearerTokenAuthPb that = (BearerTokenAuthPb) o;
    return Objects.equals(token, that.token) && Objects.equals(tokenPlaintext, that.tokenPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokenPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(BearerTokenAuthPb.class)
        .add("token", token)
        .add("tokenPlaintext", tokenPlaintext)
        .toString();
  }
}
