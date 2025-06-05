// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AmazonBedrockConfigPb {
  @JsonProperty("aws_access_key_id")
  private String awsAccessKeyId;

  @JsonProperty("aws_access_key_id_plaintext")
  private String awsAccessKeyIdPlaintext;

  @JsonProperty("aws_region")
  private String awsRegion;

  @JsonProperty("aws_secret_access_key")
  private String awsSecretAccessKey;

  @JsonProperty("aws_secret_access_key_plaintext")
  private String awsSecretAccessKeyPlaintext;

  @JsonProperty("bedrock_provider")
  private AmazonBedrockConfigBedrockProvider bedrockProvider;

  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  public AmazonBedrockConfigPb setAwsAccessKeyId(String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }

  public AmazonBedrockConfigPb setAwsAccessKeyIdPlaintext(String awsAccessKeyIdPlaintext) {
    this.awsAccessKeyIdPlaintext = awsAccessKeyIdPlaintext;
    return this;
  }

  public String getAwsAccessKeyIdPlaintext() {
    return awsAccessKeyIdPlaintext;
  }

  public AmazonBedrockConfigPb setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  public String getAwsRegion() {
    return awsRegion;
  }

  public AmazonBedrockConfigPb setAwsSecretAccessKey(String awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
    return this;
  }

  public String getAwsSecretAccessKey() {
    return awsSecretAccessKey;
  }

  public AmazonBedrockConfigPb setAwsSecretAccessKeyPlaintext(String awsSecretAccessKeyPlaintext) {
    this.awsSecretAccessKeyPlaintext = awsSecretAccessKeyPlaintext;
    return this;
  }

  public String getAwsSecretAccessKeyPlaintext() {
    return awsSecretAccessKeyPlaintext;
  }

  public AmazonBedrockConfigPb setBedrockProvider(
      AmazonBedrockConfigBedrockProvider bedrockProvider) {
    this.bedrockProvider = bedrockProvider;
    return this;
  }

  public AmazonBedrockConfigBedrockProvider getBedrockProvider() {
    return bedrockProvider;
  }

  public AmazonBedrockConfigPb setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AmazonBedrockConfigPb that = (AmazonBedrockConfigPb) o;
    return Objects.equals(awsAccessKeyId, that.awsAccessKeyId)
        && Objects.equals(awsAccessKeyIdPlaintext, that.awsAccessKeyIdPlaintext)
        && Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(awsSecretAccessKey, that.awsSecretAccessKey)
        && Objects.equals(awsSecretAccessKeyPlaintext, that.awsSecretAccessKeyPlaintext)
        && Objects.equals(bedrockProvider, that.bedrockProvider)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsAccessKeyId,
        awsAccessKeyIdPlaintext,
        awsRegion,
        awsSecretAccessKey,
        awsSecretAccessKeyPlaintext,
        bedrockProvider,
        instanceProfileArn);
  }

  @Override
  public String toString() {
    return new ToStringer(AmazonBedrockConfigPb.class)
        .add("awsAccessKeyId", awsAccessKeyId)
        .add("awsAccessKeyIdPlaintext", awsAccessKeyIdPlaintext)
        .add("awsRegion", awsRegion)
        .add("awsSecretAccessKey", awsSecretAccessKey)
        .add("awsSecretAccessKeyPlaintext", awsSecretAccessKeyPlaintext)
        .add("bedrockProvider", bedrockProvider)
        .add("instanceProfileArn", instanceProfileArn)
        .toString();
  }
}
