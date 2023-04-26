// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>VpcEndpoint class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class VpcEndpoint {
  /** The Databricks account ID that hosts the VPC endpoint configuration. */
  @JsonProperty("account_id")
  private String accountId;

  /** The AWS Account in which the VPC endpoint object exists. */
  @JsonProperty("aws_account_id")
  private String awsAccountId;

  /**
   * The ID of the Databricks [endpoint service] that this VPC endpoint is connected to. For a list
   * of endpoint service IDs for each supported AWS region, see the [Databricks PrivateLink
   * documentation].
   *
   * <p>[Databricks PrivateLink documentation]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   * [endpoint service]: https://docs.aws.amazon.com/vpc/latest/privatelink/endpoint-service.html
   */
  @JsonProperty("aws_endpoint_service_id")
  private String awsEndpointServiceId;

  /** The ID of the VPC endpoint object in AWS. */
  @JsonProperty("aws_vpc_endpoint_id")
  private String awsVpcEndpointId;

  /** The Google Cloud specific information for this Private Service Connect endpoint. */
  @JsonProperty("gcp_vpc_endpoint_info")
  private GcpVpcEndpointInfo gcpVpcEndpointInfo;

  /** The AWS region in which this VPC endpoint object exists. */
  @JsonProperty("region")
  private String region;

  /**
   * The current state (such as `available` or `rejected`) of the VPC endpoint. Derived from AWS.
   * For the full set of values, see [AWS DescribeVpcEndpoint documentation].
   *
   * <p>[AWS DescribeVpcEndpoint documentation]:
   * https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html
   */
  @JsonProperty("state")
  private String state;

  /**
   * This enumeration represents the type of Databricks VPC [endpoint service] that was used when
   * creating this VPC endpoint.
   *
   * <p>[endpoint service]: https://docs.aws.amazon.com/vpc/latest/privatelink/endpoint-service.html
   */
  @JsonProperty("use_case")
  private EndpointUseCase useCase;

  /**
   * Databricks VPC endpoint ID. This is the Databricks-specific name of the VPC endpoint. Do not
   * confuse this with the `aws_vpc_endpoint_id`, which is the ID within AWS of the VPC endpoint.
   */
  @JsonProperty("vpc_endpoint_id")
  private String vpcEndpointId;

  /** The human-readable name of the storage configuration. */
  @JsonProperty("vpc_endpoint_name")
  private String vpcEndpointName;

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>awsAccountId</code>.</p>
   *
   * @param awsAccountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsAccountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAwsAccountId() {
    return awsAccountId;
  }

  /**
   * <p>Setter for the field <code>awsEndpointServiceId</code>.</p>
   *
   * @param awsEndpointServiceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setAwsEndpointServiceId(String awsEndpointServiceId) {
    this.awsEndpointServiceId = awsEndpointServiceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsEndpointServiceId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAwsEndpointServiceId() {
    return awsEndpointServiceId;
  }

  /**
   * <p>Setter for the field <code>awsVpcEndpointId</code>.</p>
   *
   * @param awsVpcEndpointId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setAwsVpcEndpointId(String awsVpcEndpointId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setGcpVpcEndpointInfo(GcpVpcEndpointInfo gcpVpcEndpointInfo) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setRegion(String region) {
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
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setState(String state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>useCase</code>.</p>
   *
   * @param useCase a {@link com.databricks.sdk.service.provisioning.EndpointUseCase} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setUseCase(EndpointUseCase useCase) {
    this.useCase = useCase;
    return this;
  }

  /**
   * <p>Getter for the field <code>useCase</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.EndpointUseCase} object
   */
  public EndpointUseCase getUseCase() {
    return useCase;
  }

  /**
   * <p>Setter for the field <code>vpcEndpointId</code>.</p>
   *
   * @param vpcEndpointId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  /**
   * <p>Getter for the field <code>vpcEndpointId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  /**
   * <p>Setter for the field <code>vpcEndpointName</code>.</p>
   *
   * @param vpcEndpointName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint setVpcEndpointName(String vpcEndpointName) {
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
    VpcEndpoint that = (VpcEndpoint) o;
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(VpcEndpoint.class)
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
