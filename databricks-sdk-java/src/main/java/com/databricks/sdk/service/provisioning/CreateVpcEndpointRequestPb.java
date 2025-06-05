// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateVpcEndpointRequestPb {
  @JsonProperty("aws_vpc_endpoint_id")
  private String awsVpcEndpointId;

  @JsonProperty("gcp_vpc_endpoint_info")
  private GcpVpcEndpointInfo gcpVpcEndpointInfo;

  @JsonProperty("region")
  private String region;

  @JsonProperty("vpc_endpoint_name")
  private String vpcEndpointName;

  public CreateVpcEndpointRequestPb setAwsVpcEndpointId(String awsVpcEndpointId) {
    this.awsVpcEndpointId = awsVpcEndpointId;
    return this;
  }

  public String getAwsVpcEndpointId() {
    return awsVpcEndpointId;
  }

  public CreateVpcEndpointRequestPb setGcpVpcEndpointInfo(GcpVpcEndpointInfo gcpVpcEndpointInfo) {
    this.gcpVpcEndpointInfo = gcpVpcEndpointInfo;
    return this;
  }

  public GcpVpcEndpointInfo getGcpVpcEndpointInfo() {
    return gcpVpcEndpointInfo;
  }

  public CreateVpcEndpointRequestPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public CreateVpcEndpointRequestPb setVpcEndpointName(String vpcEndpointName) {
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
    CreateVpcEndpointRequestPb that = (CreateVpcEndpointRequestPb) o;
    return Objects.equals(awsVpcEndpointId, that.awsVpcEndpointId)
        && Objects.equals(gcpVpcEndpointInfo, that.gcpVpcEndpointInfo)
        && Objects.equals(region, that.region)
        && Objects.equals(vpcEndpointName, that.vpcEndpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsVpcEndpointId, gcpVpcEndpointInfo, region, vpcEndpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVpcEndpointRequestPb.class)
        .add("awsVpcEndpointId", awsVpcEndpointId)
        .add("gcpVpcEndpointInfo", gcpVpcEndpointInfo)
        .add("region", region)
        .add("vpcEndpointName", vpcEndpointName)
        .toString();
  }
}
