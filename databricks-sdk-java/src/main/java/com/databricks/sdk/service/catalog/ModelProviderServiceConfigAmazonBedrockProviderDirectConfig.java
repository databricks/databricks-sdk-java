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
 * on Create: - Access keys: set both `aws_access_key_id` and `aws_secret_access_key`, leave
 * `service_credential` unset. - UC service credential: set `service_credential.name` to the AIP-122
 * resource-name form `credentials/{name}`, leave both access-key fields unset. The credential value
 * lives in UC and is referenced by name, not held on this message. Setting `service_credential`
 * alongside either access-key field is rejected by service-side validation on Create; the proto
 * itself allows any combination on the wire.
 */
@Generated
public class ModelProviderServiceConfigAmazonBedrockProviderDirectConfig {
  /**
   * AWS access key ID for Bedrock authentication. Required on Create when using access-key auth;
   * must be paired with `aws_secret_access_key` and is mutually exclusive with
   * `service_credential`. Treated as username-equivalent (not a secret value): round-trips on reads
   * and is scrubbed from audit logs.
   */
  @JsonProperty("aws_access_key_id")
  private String awsAccessKeyId;

  /**
   * AWS secret access key paired with `aws_access_key_id`. Required on Create when using access-key
   * auth; mutually exclusive with `service_credential`. Supplied as inline plaintext via
   * `ProviderSecret.plaintext`.
   */
  @JsonProperty("aws_secret_access_key")
  private ModelProviderServiceConfigProviderSecret awsSecretAccessKey;

  /** AWS region where the Bedrock endpoint is hosted (e.g., `us-east-1`). Required on Create. */
  @JsonProperty("region")
  private String region;

  /**
   * Reference to a UC service credential authorizing Bedrock requests. On Create the caller
   * supplies `service_credential.name` in the AIP-122 resource-name form `credentials/{name}`.
   * Required on Create when using UC-service-credential auth; mutually exclusive with the
   * aws_access_key_id + aws_secret_access_key pair. The credential is referenced by name; its value
   * is not carried here. On read the resolved `id` and `is_deleted` are also populated. Only
   * supported on AWS-hosted workspaces; Create requests from other clouds are rejected with
   * INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("service_credential")
  private ModelProviderServiceConfigServiceCredential serviceCredential;

  public ModelProviderServiceConfigAmazonBedrockProviderDirectConfig setAwsAccessKeyId(
      String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }

  public ModelProviderServiceConfigAmazonBedrockProviderDirectConfig setAwsSecretAccessKey(
      ModelProviderServiceConfigProviderSecret awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getAwsSecretAccessKey() {
    return awsSecretAccessKey;
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
    return Objects.equals(awsAccessKeyId, that.awsAccessKeyId)
        && Objects.equals(awsSecretAccessKey, that.awsSecretAccessKey)
        && Objects.equals(region, that.region)
        && Objects.equals(serviceCredential, that.serviceCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccessKeyId, awsSecretAccessKey, region, serviceCredential);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAmazonBedrockProviderDirectConfig.class)
        .add("awsAccessKeyId", awsAccessKeyId)
        .add("awsSecretAccessKey", awsSecretAccessKey)
        .add("region", region)
        .add("serviceCredential", serviceCredential)
        .toString();
  }
}
