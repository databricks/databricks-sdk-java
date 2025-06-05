// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class HttpUrlSpecWithoutSecretPb {
  @JsonProperty("enable_ssl_verification")
  private Boolean enableSslVerification;

  @JsonProperty("url")
  private String url;

  public HttpUrlSpecWithoutSecretPb setEnableSslVerification(Boolean enableSslVerification) {
    this.enableSslVerification = enableSslVerification;
    return this;
  }

  public Boolean getEnableSslVerification() {
    return enableSslVerification;
  }

  public HttpUrlSpecWithoutSecretPb setUrl(String url) {
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
    HttpUrlSpecWithoutSecretPb that = (HttpUrlSpecWithoutSecretPb) o;
    return Objects.equals(enableSslVerification, that.enableSslVerification)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableSslVerification, url);
  }

  @Override
  public String toString() {
    return new ToStringer(HttpUrlSpecWithoutSecretPb.class)
        .add("enableSslVerification", enableSslVerification)
        .add("url", url)
        .toString();
  }
}
