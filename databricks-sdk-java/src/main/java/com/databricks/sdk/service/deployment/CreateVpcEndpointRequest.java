// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVpcEndpointRequest that = (CreateVpcEndpointRequest) o;
    return Objects.equals(awsVpcEndpointId, that.awsVpcEndpointId)
        && Objects.equals(region, that.region)
        && Objects.equals(vpcEndpointName, that.vpcEndpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsVpcEndpointId, region, vpcEndpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVpcEndpointRequest.class)
        .add("awsVpcEndpointId", awsVpcEndpointId)
        .add("region", region)
        .add("vpcEndpointName", vpcEndpointName)
        .toString();
  }
}
