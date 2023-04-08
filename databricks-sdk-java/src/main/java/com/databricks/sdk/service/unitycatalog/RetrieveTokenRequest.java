// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get an access token */
public class RetrieveTokenRequest {
  /** The one time activation url. It also accepts activation token. */
  private String activationUrl;

  public RetrieveTokenRequest setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }
}
