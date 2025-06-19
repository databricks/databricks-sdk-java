// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = VpcEndpoint.VpcEndpointSerializer.class)
@JsonDeserialize(using = VpcEndpoint.VpcEndpointDeserializer.class)
public class VpcEndpoint {
  /** The Databricks account ID that hosts the VPC endpoint configuration. */
  private String accountId;

  /** The AWS Account in which the VPC endpoint object exists. */
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
  private String awsEndpointServiceId;

  /** The ID of the VPC endpoint object in AWS. */
  private String awsVpcEndpointId;

  /** The Google Cloud specific information for this Private Service Connect endpoint. */
  private GcpVpcEndpointInfo gcpVpcEndpointInfo;

  /** The AWS region in which this VPC endpoint object exists. */
  private String region;

  /**
   * The current state (such as `available` or `rejected`) of the VPC endpoint. Derived from AWS.
   * For the full set of values, see [AWS DescribeVpcEndpoint documentation].
   *
   * <p>[AWS DescribeVpcEndpoint documentation]:
   * https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html
   */
  private String state;

  /**
   * This enumeration represents the type of Databricks VPC [endpoint service] that was used when
   * creating this VPC endpoint.
   *
   * <p>[endpoint service]: https://docs.aws.amazon.com/vpc/latest/privatelink/endpoint-service.html
   */
  private EndpointUseCase useCase;

  /**
   * Databricks VPC endpoint ID. This is the Databricks-specific name of the VPC endpoint. Do not
   * confuse this with the `aws_vpc_endpoint_id`, which is the ID within AWS of the VPC endpoint.
   */
  private String vpcEndpointId;

  /** The human-readable name of the storage configuration. */
  private String vpcEndpointName;

  public VpcEndpoint setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public VpcEndpoint setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  public String getAwsAccountId() {
    return awsAccountId;
  }

  public VpcEndpoint setAwsEndpointServiceId(String awsEndpointServiceId) {
    this.awsEndpointServiceId = awsEndpointServiceId;
    return this;
  }

  public String getAwsEndpointServiceId() {
    return awsEndpointServiceId;
  }

  public VpcEndpoint setAwsVpcEndpointId(String awsVpcEndpointId) {
    this.awsVpcEndpointId = awsVpcEndpointId;
    return this;
  }

  public String getAwsVpcEndpointId() {
    return awsVpcEndpointId;
  }

  public VpcEndpoint setGcpVpcEndpointInfo(GcpVpcEndpointInfo gcpVpcEndpointInfo) {
    this.gcpVpcEndpointInfo = gcpVpcEndpointInfo;
    return this;
  }

  public GcpVpcEndpointInfo getGcpVpcEndpointInfo() {
    return gcpVpcEndpointInfo;
  }

  public VpcEndpoint setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public VpcEndpoint setState(String state) {
    this.state = state;
    return this;
  }

  public String getState() {
    return state;
  }

  public VpcEndpoint setUseCase(EndpointUseCase useCase) {
    this.useCase = useCase;
    return this;
  }

  public EndpointUseCase getUseCase() {
    return useCase;
  }

  public VpcEndpoint setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  public VpcEndpoint setVpcEndpointName(String vpcEndpointName) {
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

  VpcEndpointPb toPb() {
    VpcEndpointPb pb = new VpcEndpointPb();
    pb.setAccountId(accountId);
    pb.setAwsAccountId(awsAccountId);
    pb.setAwsEndpointServiceId(awsEndpointServiceId);
    pb.setAwsVpcEndpointId(awsVpcEndpointId);
    pb.setGcpVpcEndpointInfo(gcpVpcEndpointInfo);
    pb.setRegion(region);
    pb.setState(state);
    pb.setUseCase(useCase);
    pb.setVpcEndpointId(vpcEndpointId);
    pb.setVpcEndpointName(vpcEndpointName);

    return pb;
  }

  static VpcEndpoint fromPb(VpcEndpointPb pb) {
    VpcEndpoint model = new VpcEndpoint();
    model.setAccountId(pb.getAccountId());
    model.setAwsAccountId(pb.getAwsAccountId());
    model.setAwsEndpointServiceId(pb.getAwsEndpointServiceId());
    model.setAwsVpcEndpointId(pb.getAwsVpcEndpointId());
    model.setGcpVpcEndpointInfo(pb.getGcpVpcEndpointInfo());
    model.setRegion(pb.getRegion());
    model.setState(pb.getState());
    model.setUseCase(pb.getUseCase());
    model.setVpcEndpointId(pb.getVpcEndpointId());
    model.setVpcEndpointName(pb.getVpcEndpointName());

    return model;
  }

  public static class VpcEndpointSerializer extends JsonSerializer<VpcEndpoint> {
    @Override
    public void serialize(VpcEndpoint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VpcEndpointPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VpcEndpointDeserializer extends JsonDeserializer<VpcEndpoint> {
    @Override
    public VpcEndpoint deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VpcEndpointPb pb = mapper.readValue(p, VpcEndpointPb.class);
      return VpcEndpoint.fromPb(pb);
    }
  }
}
