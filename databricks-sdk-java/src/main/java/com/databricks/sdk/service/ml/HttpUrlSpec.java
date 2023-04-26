// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>HttpUrlSpec class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class HttpUrlSpec {
  /**
   * Value of the authorization header that should be sent in the request sent by the wehbook. It
   * should be of the form `"<auth type> <credentials>"`. If set to an empty string, no
   * authorization header will be included in the request.
   */
  @JsonProperty("authorization")
  private String authorization;

  /**
   * Enable/disable SSL certificate validation. Default is true. For self-signed certificates, this
   * field must be false AND the destination server must disable certificate validation as well. For
   * security purposes, it is encouraged to perform secret validation with the HMAC-encoded portion
   * of the payload and acknowledge the risk associated with disabling hostname validation whereby
   * it becomes more likely that requests can be maliciously routed to an unintended host.
   */
  @JsonProperty("enable_ssl_verification")
  private Boolean enableSslVerification;

  /**
   * Shared secret required for HMAC encoding payload. The HMAC-encoded payload will be sent in the
   * header as: { "X-Databricks-Signature": $encoded_payload }.
   */
  @JsonProperty("secret")
  private String secret;

  /** External HTTPS URL called on event trigger (by using a POST request). */
  @JsonProperty("url")
  private String url;

  /**
   * <p>Setter for the field <code>authorization</code>.</p>
   *
   * @param authorization a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.HttpUrlSpec} object
   */
  public HttpUrlSpec setAuthorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * <p>Getter for the field <code>authorization</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAuthorization() {
    return authorization;
  }

  /**
   * <p>Setter for the field <code>enableSslVerification</code>.</p>
   *
   * @param enableSslVerification a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.ml.HttpUrlSpec} object
   */
  public HttpUrlSpec setEnableSslVerification(Boolean enableSslVerification) {
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
   * <p>Setter for the field <code>secret</code>.</p>
   *
   * @param secret a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.HttpUrlSpec} object
   */
  public HttpUrlSpec setSecret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * <p>Getter for the field <code>secret</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSecret() {
    return secret;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.HttpUrlSpec} object
   */
  public HttpUrlSpec setUrl(String url) {
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
    HttpUrlSpec that = (HttpUrlSpec) o;
    return Objects.equals(authorization, that.authorization)
        && Objects.equals(enableSslVerification, that.enableSslVerification)
        && Objects.equals(secret, that.secret)
        && Objects.equals(url, that.url);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(authorization, enableSslVerification, secret, url);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(HttpUrlSpec.class)
        .add("authorization", authorization)
        .add("enableSslVerification", enableSslVerification)
        .add("secret", secret)
        .add("url", url)
        .toString();
  }
}
