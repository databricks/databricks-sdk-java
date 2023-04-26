// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>HttpUrlSpecWithoutSecret class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class HttpUrlSpecWithoutSecret {
  /**
   * Enable/disable SSL certificate validation. Default is true. For self-signed certificates, this
   * field must be false AND the destination server must disable certificate validation as well. For
   * security purposes, it is encouraged to perform secret validation with the HMAC-encoded portion
   * of the payload and acknowledge the risk associated with disabling hostname validation whereby
   * it becomes more likely that requests can be maliciously routed to an unintended host.
   */
  @JsonProperty("enable_ssl_verification")
  private Boolean enableSslVerification;

  /** External HTTPS URL called on event trigger (by using a POST request). */
  @JsonProperty("url")
  private String url;

  /**
   * <p>Setter for the field <code>enableSslVerification</code>.</p>
   *
   * @param enableSslVerification a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.ml.HttpUrlSpecWithoutSecret} object
   */
  public HttpUrlSpecWithoutSecret setEnableSslVerification(Boolean enableSslVerification) {
    this.enableSslVerification = enableSslVerification;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableSslVerification</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableSslVerification() {
    return enableSslVerification;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.HttpUrlSpecWithoutSecret} object
   */
  public HttpUrlSpecWithoutSecret setUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HttpUrlSpecWithoutSecret that = (HttpUrlSpecWithoutSecret) o;
    return Objects.equals(enableSslVerification, that.enableSslVerification)
        && Objects.equals(url, that.url);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(enableSslVerification, url);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(HttpUrlSpecWithoutSecret.class)
        .add("enableSslVerification", enableSslVerification)
        .add("url", url)
        .toString();
  }
}
