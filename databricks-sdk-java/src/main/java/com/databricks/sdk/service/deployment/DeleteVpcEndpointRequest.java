// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

/** Delete VPC endpoint configuration */
public class DeleteVpcEndpointRequest {
  /** Databricks VPC endpoint ID. */
  private String vpcEndpointId;

  public DeleteVpcEndpointRequest setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }
}
