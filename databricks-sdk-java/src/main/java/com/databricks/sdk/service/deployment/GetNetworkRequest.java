// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

/** Get a network configuration */
public class GetNetworkRequest {
  /** Databricks Account API network configuration ID. */
  private String networkId;

  public GetNetworkRequest setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }
}
