// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class HttpUrlSpecPb {
  @JsonProperty("authorization")
  private String authorization;

  @JsonProperty("enable_ssl_verification")
  private Boolean enableSslVerification;

  @JsonProperty("secret")
  private String secret;

  @JsonProperty("url")
  private String url;

  public HttpUrlSpecPb setAuthorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

  public String getAuthorization() {
    return authorization;
  }

  public HttpUrlSpecPb setEnableSslVerification(Boolean enableSslVerification) {
    this.enableSslVerification = enableSslVerification;
    return this;
  }

  public Boolean getEnableSslVerification() {
    return enableSslVerification;
  }

  public HttpUrlSpecPb setSecret(String secret) {
    this.secret = secret;
    return this;
  }

  public String getSecret() {
    return secret;
  }

  public HttpUrlSpecPb setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HttpUrlSpecPb that = (HttpUrlSpecPb) o;
    return Objects.equals(authorization, that.authorization)
        && Objects.equals(enableSslVerification, that.enableSslVerification)
        && Objects.equals(secret, that.secret)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, enableSslVerification, secret, url);
  }

  @Override
  public String toString() {
    return new ToStringer(HttpUrlSpecPb.class)
        .add("authorization", authorization)
        .add("enableSslVerification", enableSslVerification)
        .add("secret", secret)
        .add("url", url)
        .toString();
  }
}
