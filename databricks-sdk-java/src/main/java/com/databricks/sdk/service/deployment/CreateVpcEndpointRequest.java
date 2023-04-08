// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateVpcEndpointRequest {
  /** The ID of the VPC endpoint object in AWS. */
  @JsonProperty("aws_vpc_endpoint_id")
  private String awsVpcEndpointId;

  /** The AWS region in which this VPC endpoint object exists. */
  @JsonProperty("region")
  private String region;

  /** The human-readable name of the storage configuration. */
  @JsonProperty("vpc_endpoint_name")
  private String vpcEndpointName;

  public CreateVpcEndpointRequest setAwsVpcEndpointId(String awsVpcEndpointId) {
    this.awsVpcEndpointId = awsVpcEndpointId;
    return this;
  }

  public String getAwsVpcEndpointId() {
    return awsVpcEndpointId;
  }

  public CreateVpcEndpointRequest setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public CreateVpcEndpointRequest setVpcEndpointName(String vpcEndpointName) {
    this.vpcEndpointName = vpcEndpointName;
    return this;
  }

  public String getVpcEndpointName() {
    return vpcEndpointName;
  }
}
