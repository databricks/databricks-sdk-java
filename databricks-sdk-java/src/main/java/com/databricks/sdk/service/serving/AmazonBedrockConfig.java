// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = AmazonBedrockConfig.AmazonBedrockConfigSerializer.class)
@JsonDeserialize(using = AmazonBedrockConfig.AmazonBedrockConfigDeserializer.class)
public class AmazonBedrockConfig {
  /**
   * The Databricks secret key reference for an AWS access key ID with permissions to interact with
   * Bedrock services. If you prefer to paste your API key directly, see
   * `aws_access_key_id_plaintext`. You must provide an API key using one of the following fields:
   * `aws_access_key_id` or `aws_access_key_id_plaintext`.
   */
  private String awsAccessKeyId;

  /**
   * An AWS access key ID with permissions to interact with Bedrock services provided as a plaintext
   * string. If you prefer to reference your key using Databricks Secrets, see `aws_access_key_id`.
   * You must provide an API key using one of the following fields: `aws_access_key_id` or
   * `aws_access_key_id_plaintext`.
   */
  private String awsAccessKeyIdPlaintext;

  /** The AWS region to use. Bedrock has to be enabled there. */
  private String awsRegion;

  /**
   * The Databricks secret key reference for an AWS secret access key paired with the access key ID,
   * with permissions to interact with Bedrock services. If you prefer to paste your API key
   * directly, see `aws_secret_access_key_plaintext`. You must provide an API key using one of the
   * following fields: `aws_secret_access_key` or `aws_secret_access_key_plaintext`.
   */
  private String awsSecretAccessKey;

  /**
   * An AWS secret access key paired with the access key ID, with permissions to interact with
   * Bedrock services provided as a plaintext string. If you prefer to reference your key using
   * Databricks Secrets, see `aws_secret_access_key`. You must provide an API key using one of the
   * following fields: `aws_secret_access_key` or `aws_secret_access_key_plaintext`.
   */
  private String awsSecretAccessKeyPlaintext;

  /**
   * The underlying provider in Amazon Bedrock. Supported values (case insensitive) include:
   * Anthropic, Cohere, AI21Labs, Amazon.
   */
  private AmazonBedrockConfigBedrockProvider bedrockProvider;

  /**
   * ARN of the instance profile that the external model will use to access AWS resources. You must
   * authenticate using an instance profile or access keys. If you prefer to authenticate using
   * access keys, see `aws_access_key_id`, `aws_access_key_id_plaintext`, `aws_secret_access_key`
   * and `aws_secret_access_key_plaintext`.
   */
  private String instanceProfileArn;

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

  public AmazonBedrockConfig setInstanceProfileArn(String instanceProfileArn) {
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
    AmazonBedrockConfig that = (AmazonBedrockConfig) o;
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
    return new ToStringer(AmazonBedrockConfig.class)
        .add("awsAccessKeyId", awsAccessKeyId)
        .add("awsAccessKeyIdPlaintext", awsAccessKeyIdPlaintext)
        .add("awsRegion", awsRegion)
        .add("awsSecretAccessKey", awsSecretAccessKey)
        .add("awsSecretAccessKeyPlaintext", awsSecretAccessKeyPlaintext)
        .add("bedrockProvider", bedrockProvider)
        .add("instanceProfileArn", instanceProfileArn)
        .toString();
  }

  AmazonBedrockConfigPb toPb() {
    AmazonBedrockConfigPb pb = new AmazonBedrockConfigPb();
    pb.setAwsAccessKeyId(awsAccessKeyId);
    pb.setAwsAccessKeyIdPlaintext(awsAccessKeyIdPlaintext);
    pb.setAwsRegion(awsRegion);
    pb.setAwsSecretAccessKey(awsSecretAccessKey);
    pb.setAwsSecretAccessKeyPlaintext(awsSecretAccessKeyPlaintext);
    pb.setBedrockProvider(bedrockProvider);
    pb.setInstanceProfileArn(instanceProfileArn);

    return pb;
  }

  static AmazonBedrockConfig fromPb(AmazonBedrockConfigPb pb) {
    AmazonBedrockConfig model = new AmazonBedrockConfig();
    model.setAwsAccessKeyId(pb.getAwsAccessKeyId());
    model.setAwsAccessKeyIdPlaintext(pb.getAwsAccessKeyIdPlaintext());
    model.setAwsRegion(pb.getAwsRegion());
    model.setAwsSecretAccessKey(pb.getAwsSecretAccessKey());
    model.setAwsSecretAccessKeyPlaintext(pb.getAwsSecretAccessKeyPlaintext());
    model.setBedrockProvider(pb.getBedrockProvider());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());

    return model;
  }

  public static class AmazonBedrockConfigSerializer extends JsonSerializer<AmazonBedrockConfig> {
    @Override
    public void serialize(AmazonBedrockConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AmazonBedrockConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AmazonBedrockConfigDeserializer
      extends JsonDeserializer<AmazonBedrockConfig> {
    @Override
    public AmazonBedrockConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AmazonBedrockConfigPb pb = mapper.readValue(p, AmazonBedrockConfigPb.class);
      return AmazonBedrockConfig.fromPb(pb);
    }
  }
}
