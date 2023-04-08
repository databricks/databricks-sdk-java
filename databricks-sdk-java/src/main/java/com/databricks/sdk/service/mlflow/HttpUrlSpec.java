// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public HttpUrlSpec setAuthorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

  public String getAuthorization() {
    return authorization;
  }

  public HttpUrlSpec setEnableSslVerification(Boolean enableSslVerification) {
    this.enableSslVerification = enableSslVerification;
    return this;
  }

  public Boolean getEnableSslVerification() {
    return enableSslVerification;
  }

  public HttpUrlSpec setSecret(String secret) {
    this.secret = secret;
    return this;
  }

  public String getSecret() {
    return secret;
  }

  public HttpUrlSpec setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }
}
