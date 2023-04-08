// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get a share activation URL */
public class GetActivationUrlInfoRequest {
  /** The one time activation url. It also accepts activation token. */
  private String activationUrl;

  public GetActivationUrlInfoRequest setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }
}
