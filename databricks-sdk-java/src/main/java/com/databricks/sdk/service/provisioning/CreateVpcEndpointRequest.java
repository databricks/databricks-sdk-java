// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateVpcEndpointRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateVpcEndpointRequest {
  /** The ID of the VPC endpoint object in AWS. */
  @JsonProperty("aws_vpc_endpoint_id")
  private String awsVpcEndpointId;

  /** The Google Cloud specific information for this Private Service Connect endpoint. */
  @JsonProperty("gcp_vpc_endpoint_info")
  private GcpVpcEndpointInfo gcpVpcEndpointInfo;

  /** The AWS region in which this VPC endpoint object exists. */
  @JsonProperty("region")
  private String region;

  /** The human-readable name of the storage configuration. */
  @JsonProperty("vpc_endpoint_name")
  private String vpcEndpointName;

  /**
   * <p>Setter for the field <code>awsVpcEndpointId</code>.</p>
   *
   * @param awsVpcEndpointId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateVpcEndpointRequest} object
   */
  public CreateVpcEndpointRequest setAwsVpcEndpointId(String awsVpcEndpointId) {
    this.awsVpcEndpointId = awsVpcEndpointId;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsVpcEndpointId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAwsVpcEndpointId() {
    return awsVpcEndpointId;
  }

  /**
   * <p>Setter for the field <code>gcpVpcEndpointInfo</code>.</p>
   *
   * @param gcpVpcEndpointInfo a {@link com.databricks.sdk.service.provisioning.GcpVpcEndpointInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateVpcEndpointRequest} object
   */
  public CreateVpcEndpointRequest setGcpVpcEndpointInfo(GcpVpcEndpointInfo gcpVpcEndpointInfo) {
    this.gcpVpcEndpointInfo = gcpVpcEndpointInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>gcpVpcEndpointInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.GcpVpcEndpointInfo} object
   */
  public GcpVpcEndpointInfo getGcpVpcEndpointInfo() {
    return gcpVpcEndpointInfo;
  }

  /**
   * <p>Setter for the field <code>region</code>.</p>
   *
   * @param region a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateVpcEndpointRequest} object
   */
  public CreateVpcEndpointRequest setRegion(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>Getter for the field <code>region</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRegion() {
    return region;
  }

  /**
   * <p>Setter for the field <code>vpcEndpointName</code>.</p>
   *
   * @param vpcEndpointName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateVpcEndpointRequest} object
   */
  public CreateVpcEndpointRequest setVpcEndpointName(String vpcEndpointName) {
    this.vpcEndpointName = vpcEndpointName;
    return this;
  }

  /**
   * <p>Getter for the field <code>vpcEndpointName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVpcEndpointName() {
    return vpcEndpointName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVpcEndpointRequest that = (CreateVpcEndpointRequest) o;
    return Objects.equals(awsVpcEndpointId, that.awsVpcEndpointId)
        && Objects.equals(gcpVpcEndpointInfo, that.gcpVpcEndpointInfo)
        && Objects.equals(region, that.region)
        && Objects.equals(vpcEndpointName, that.vpcEndpointName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(awsVpcEndpointId, gcpVpcEndpointInfo, region, vpcEndpointName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateVpcEndpointRequest.class)
        .add("awsVpcEndpointId", awsVpcEndpointId)
        .add("gcpVpcEndpointInfo", gcpVpcEndpointInfo)
        .add("region", region)
        .add("vpcEndpointName", vpcEndpointName)
        .toString();
  }
}
