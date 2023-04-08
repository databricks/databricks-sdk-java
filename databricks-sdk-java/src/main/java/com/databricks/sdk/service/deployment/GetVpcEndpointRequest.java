// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

/** Get a VPC endpoint configuration */
public class GetVpcEndpointRequest {
  /** Databricks VPC endpoint ID. */
  private String vpcEndpointId;

  public GetVpcEndpointRequest setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }
}
