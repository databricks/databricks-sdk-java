// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AmazonBedrockConfig {
  /**
   * The Databricks secret key reference for an AWS access key ID with permissions to interact with
   * Bedrock services. If you prefer to paste your API key directly, see
   * `aws_access_key_id_plaintext`. You must provide an API key using one of the following fields:
   * `aws_access_key_id` or `aws_access_key_id_plaintext`.
   */
  @JsonProperty("aws_access_key_id")
  private String awsAccessKeyId;

  /**
   * An AWS access key ID with permissions to interact with Bedrock services provided as a plaintext
   * string. If you prefer to reference your key using Databricks Secrets, see `aws_access_key_id`.
   * You must provide an API key using one of the following fields: `aws_access_key_id` or
   * `aws_access_key_id_plaintext`.
   */
  @JsonProperty("aws_access_key_id_plaintext")
  private String awsAccessKeyIdPlaintext;

  /** The AWS region to use. Bedrock has to be enabled there. */
  @JsonProperty("aws_region")
  private String awsRegion;

  /**
   * The Databricks secret key reference for an AWS secret access key paired with the access key ID,
   * with permissions to interact with Bedrock services. If you prefer to paste your API key
   * directly, see `aws_secret_access_key_plaintext`. You must provide an API key using one of the
   * following fields: `aws_secret_access_key` or `aws_secret_access_key_plaintext`.
   */
  @JsonProperty("aws_secret_access_key")
  private String awsSecretAccessKey;

  /**
   * An AWS secret access key paired with the access key ID, with permissions to interact with
   * Bedrock services provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `aws_secret_access_key`. You must provide an API key using one of the
   * following fields: `aws_secret_access_key` or `aws_secret_access_key_plaintext`.
   */
  @JsonProperty("aws_secret_access_key_plaintext")
  private String awsSecretAccessKeyPlaintext;

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

  public AmazonBedrockConfig setAwsAccessKeyIdPlaintext(String awsAccessKeyIdPlaintext) {
    this.awsAccessKeyIdPlaintext = awsAccessKeyIdPlaintext;
    return this;
  }

  public String getAwsAccessKeyIdPlaintext() {
    return awsAccessKeyIdPlaintext;
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

  public AmazonBedrockConfig setAwsSecretAccessKeyPlaintext(String awsSecretAccessKeyPlaintext) {
    this.awsSecretAccessKeyPlaintext = awsSecretAccessKeyPlaintext;
    return this;
  }

  public String getAwsSecretAccessKeyPlaintext() {
    return awsSecretAccessKeyPlaintext;
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
        && Objects.equals(awsAccessKeyIdPlaintext, that.awsAccessKeyIdPlaintext)
        && Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(awsSecretAccessKey, that.awsSecretAccessKey)
        && Objects.equals(awsSecretAccessKeyPlaintext, that.awsSecretAccessKeyPlaintext)
        && Objects.equals(bedrockProvider, that.bedrockProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsAccessKeyId,
        awsAccessKeyIdPlaintext,
        awsRegion,
        awsSecretAccessKey,
        awsSecretAccessKeyPlaintext,
        bedrockProvider);
  }

  @Override
  public String toString() {
    return new ToStringer(AmazonBedrockConfig.class)
        .add("awsAccessKeyId", awsAccessKeyId)
        .add("awsAccessKeyIdPlaintext", awsAccessKeyIdPlaintext)
        .add("awsRegion", awsRegion)
        .add("awsSecretAccessKey", awsSecretAccessKey)
        .add("awsSecretAccessKeyPlaintext", awsSecretAccessKeyPlaintext)
        .add("bedrockProvider", bedrockProvider)
        .toString();
  }
}
