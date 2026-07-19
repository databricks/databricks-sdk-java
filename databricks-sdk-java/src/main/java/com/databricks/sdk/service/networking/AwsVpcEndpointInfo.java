// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AwsVpcEndpointInfo {
  /** The AWS account ID in which this VPC endpoint lives. */
  @JsonProperty("aws_account_id")
  private String awsAccountId;

  /** The ID of the Databricks VPC endpoint service that this endpoint connects to. */
  @JsonProperty("aws_endpoint_service_id")
  private String awsEndpointServiceId;

  /**
   * The ID of the underlying VPC endpoint in AWS. Provided by the customer when registering an
   * existing AWS VPC endpoint.
   */
  @JsonProperty("aws_vpc_endpoint_id")
  private String awsVpcEndpointId;

  public AwsVpcEndpointInfo setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  public String getAwsAccountId() {
    return awsAccountId;
  }

  public AwsVpcEndpointInfo setAwsEndpointServiceId(String awsEndpointServiceId) {
    this.awsEndpointServiceId = awsEndpointServiceId;
    return this;
  }

  public String getAwsEndpointServiceId() {
    return awsEndpointServiceId;
  }

  public AwsVpcEndpointInfo setAwsVpcEndpointId(String awsVpcEndpointId) {
    this.awsVpcEndpointId = awsVpcEndpointId;
    return this;
  }

  public String getAwsVpcEndpointId() {
    return awsVpcEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsVpcEndpointInfo that = (AwsVpcEndpointInfo) o;
    return Objects.equals(awsAccountId, that.awsAccountId)
        && Objects.equals(awsEndpointServiceId, that.awsEndpointServiceId)
        && Objects.equals(awsVpcEndpointId, that.awsVpcEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccountId, awsEndpointServiceId, awsVpcEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsVpcEndpointInfo.class)
        .add("awsAccountId", awsAccountId)
        .add("awsEndpointServiceId", awsEndpointServiceId)
        .add("awsVpcEndpointId", awsVpcEndpointId)
        .toString();
  }
}
