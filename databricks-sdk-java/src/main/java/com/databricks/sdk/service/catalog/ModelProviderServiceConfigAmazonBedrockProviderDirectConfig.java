// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct form of Amazon Bedrock provider config.
 *
 * <p>Authentication is one of two mutually exclusive modes, exactly one of which must be supplied
 * on Create: - Access keys: set `aws_access_key`, leave `service_credential` unset. - UC service
 * credential: set `service_credential.name` to the AIP-122 resource-name form `credentials/{name}`,
 * leave `aws_access_key` unset. The credential value lives in UC and is referenced by name, not
 * held on this message. Setting more than one mode is rejected.
 */
@Generated
public class ModelProviderServiceConfigAmazonBedrockProviderDirectConfig {
  /** AWS access-key-pair auth. Mutually exclusive with `service_credential`. */
  @JsonProperty("aws_access_key")
  private ModelProviderServiceConfigAwsAccessKey awsAccessKey;

  /** AWS region where the Bedrock endpoint is hosted (e.g., `us-east-1`). Required on Create. */
  @JsonProperty("region")
  private String region;

  /**
   * Reference to a UC service credential authorizing Bedrock requests. On Create the caller
   * supplies `service_credential.name` in the AIP-122 resource-name form `credentials/{name}`.
   * Required on Create when using UC-service-credential auth; mutually exclusive with
   * `aws_access_key`. The credential is referenced by name; its value is not carried here. On read
   * the resolved `id` and `is_deleted` are also populated. Only supported on AWS-hosted workspaces;
   * Create requests from other clouds are rejected with INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("service_credential")
  private ModelProviderServiceConfigServiceCredential serviceCredential;

  public ModelProviderServiceConfigAmazonBedrockProviderDirectConfig setAwsAccessKey(
      ModelProviderServiceConfigAwsAccessKey awsAccessKey) {
    this.awsAccessKey = awsAccessKey;
    return this;
  }

  public ModelProviderServiceConfigAwsAccessKey getAwsAccessKey() {
    return awsAccessKey;
  }

  public ModelProviderServiceConfigAmazonBedrockProviderDirectConfig setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public ModelProviderServiceConfigAmazonBedrockProviderDirectConfig setServiceCredential(
      ModelProviderServiceConfigServiceCredential serviceCredential) {
    this.serviceCredential = serviceCredential;
    return this;
  }

  public ModelProviderServiceConfigServiceCredential getServiceCredential() {
    return serviceCredential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAmazonBedrockProviderDirectConfig that =
        (ModelProviderServiceConfigAmazonBedrockProviderDirectConfig) o;
    return Objects.equals(awsAccessKey, that.awsAccessKey)
        && Objects.equals(region, that.region)
        && Objects.equals(serviceCredential, that.serviceCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccessKey, region, serviceCredential);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAmazonBedrockProviderDirectConfig.class)
        .add("awsAccessKey", awsAccessKey)
        .add("region", region)
        .add("serviceCredential", serviceCredential)
        .toString();
  }
}
