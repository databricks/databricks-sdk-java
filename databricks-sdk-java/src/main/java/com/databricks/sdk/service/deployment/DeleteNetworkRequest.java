// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

/** Delete a network configuration */
public class DeleteNetworkRequest {
  /** Databricks Account API network configuration ID. */
  private String networkId;

  public DeleteNetworkRequest setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }
}
