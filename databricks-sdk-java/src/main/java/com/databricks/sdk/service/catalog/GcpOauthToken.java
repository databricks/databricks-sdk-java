// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * GCP temporary credentials for API authentication. Read more at
 * https://developers.google.com/identity/protocols/oauth2/service-account
 */
@Generated
public class GcpOauthToken {
  /** */
  @JsonProperty("oauth_token")
  private String oauthToken;

  public GcpOauthToken setOauthToken(String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  public String getOauthToken() {
    return oauthToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpOauthToken that = (GcpOauthToken) o;
    return Objects.equals(oauthToken, that.oauthToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpOauthToken.class).add("oauthToken", oauthToken).toString();
  }
}
