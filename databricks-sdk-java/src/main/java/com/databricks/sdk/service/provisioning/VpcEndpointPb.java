// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class VpcEndpointPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("aws_account_id")
  private String awsAccountId;

  @JsonProperty("aws_endpoint_service_id")
  private String awsEndpointServiceId;

  @JsonProperty("aws_vpc_endpoint_id")
  private String awsVpcEndpointId;

  @JsonProperty("gcp_vpc_endpoint_info")
  private GcpVpcEndpointInfo gcpVpcEndpointInfo;

  @JsonProperty("region")
  private String region;

  @JsonProperty("state")
  private String state;

  @JsonProperty("use_case")
  private EndpointUseCase useCase;

  @JsonProperty("vpc_endpoint_id")
  private String vpcEndpointId;

  @JsonProperty("vpc_endpoint_name")
  private String vpcEndpointName;

  public VpcEndpointPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public VpcEndpointPb setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  public String getAwsAccountId() {
    return awsAccountId;
  }

  public VpcEndpointPb setAwsEndpointServiceId(String awsEndpointServiceId) {
    this.awsEndpointServiceId = awsEndpointServiceId;
    return this;
  }

  public String getAwsEndpointServiceId() {
    return awsEndpointServiceId;
  }

  public VpcEndpointPb setAwsVpcEndpointId(String awsVpcEndpointId) {
    this.awsVpcEndpointId = awsVpcEndpointId;
    return this;
  }

  public String getAwsVpcEndpointId() {
    return awsVpcEndpointId;
  }

  public VpcEndpointPb setGcpVpcEndpointInfo(GcpVpcEndpointInfo gcpVpcEndpointInfo) {
    this.gcpVpcEndpointInfo = gcpVpcEndpointInfo;
    return this;
  }

  public GcpVpcEndpointInfo getGcpVpcEndpointInfo() {
    return gcpVpcEndpointInfo;
  }

  public VpcEndpointPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public VpcEndpointPb setState(String state) {
    this.state = state;
    return this;
  }

  public String getState() {
    return state;
  }

  public VpcEndpointPb setUseCase(EndpointUseCase useCase) {
    this.useCase = useCase;
    return this;
  }

  public EndpointUseCase getUseCase() {
    return useCase;
  }

  public VpcEndpointPb setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  public VpcEndpointPb setVpcEndpointName(String vpcEndpointName) {
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
    VpcEndpointPb that = (VpcEndpointPb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsAccountId, that.awsAccountId)
        && Objects.equals(awsEndpointServiceId, that.awsEndpointServiceId)
        && Objects.equals(awsVpcEndpointId, that.awsVpcEndpointId)
        && Objects.equals(gcpVpcEndpointInfo, that.gcpVpcEndpointInfo)
        && Objects.equals(region, that.region)
        && Objects.equals(state, that.state)
        && Objects.equals(useCase, that.useCase)
        && Objects.equals(vpcEndpointId, that.vpcEndpointId)
        && Objects.equals(vpcEndpointName, that.vpcEndpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        awsAccountId,
        awsEndpointServiceId,
        awsVpcEndpointId,
        gcpVpcEndpointInfo,
        region,
        state,
        useCase,
        vpcEndpointId,
        vpcEndpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(VpcEndpointPb.class)
        .add("accountId", accountId)
        .add("awsAccountId", awsAccountId)
        .add("awsEndpointServiceId", awsEndpointServiceId)
        .add("awsVpcEndpointId", awsVpcEndpointId)
        .add("gcpVpcEndpointInfo", gcpVpcEndpointInfo)
        .add("region", region)
        .add("state", state)
        .add("useCase", useCase)
        .add("vpcEndpointId", vpcEndpointId)
        .add("vpcEndpointName", vpcEndpointName)
        .toString();
  }
}
