// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AmazonBedrockConfig {
  /**
   * The Databricks secret key reference for an AWS Access Key ID with permissions to interact with
   * Bedrock services.
   */
  @JsonProperty("aws_access_key_id")
  private String awsAccessKeyId;

  /** The AWS region to use. Bedrock has to be enabled there. */
  @JsonProperty("aws_region")
  private String awsRegion;

  /**
   * The Databricks secret key reference for an AWS Secret Access Key paired with the access key ID,
   * with permissions to interact with Bedrock services.
   */
  @JsonProperty("aws_secret_access_key")
  private String awsSecretAccessKey;

  /**
   * The underlying provider in Amazon Bedrock. Supported values (case insensitive) include:
   * Anthropic, Cohere, AI21Labs, Amazon.
   */
  @JsonProperty("bedrock_provider")
  private AmazonBedrockConfigBedrockProvider bedrockProvider;

  public AmazonBedrockConfig setAwsAccessKeyId(String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }

  public AmazonBedrockConfig setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  public String getAwsRegion() {
    return awsRegion;
  }

  public AmazonBedrockConfig setAwsSecretAccessKey(String awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
    return this;
  }

  public String getAwsSecretAccessKey() {
    return awsSecretAccessKey;
  }

  public AmazonBedrockConfig setBedrockProvider(
      AmazonBedrockConfigBedrockProvider bedrockProvider) {
    this.bedrockProvider = bedrockProvider;
    return this;
  }

  public AmazonBedrockConfigBedrockProvider getBedrockProvider() {
    return bedrockProvider;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AmazonBedrockConfig that = (AmazonBedrockConfig) o;
    return Objects.equals(awsAccessKeyId, that.awsAccessKeyId)
        && Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(awsSecretAccessKey, that.awsSecretAccessKey)
        && Objects.equals(bedrockProvider, that.bedrockProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccessKeyId, awsRegion, awsSecretAccessKey, bedrockProvider);
  }

  @Override
  public String toString() {
    return new ToStringer(AmazonBedrockConfig.class)
        .add("awsAccessKeyId", awsAccessKeyId)
        .add("awsRegion", awsRegion)
        .add("awsSecretAccessKey", awsSecretAccessKey)
        .add("bedrockProvider", bedrockProvider)
        .toString();
  }
}
