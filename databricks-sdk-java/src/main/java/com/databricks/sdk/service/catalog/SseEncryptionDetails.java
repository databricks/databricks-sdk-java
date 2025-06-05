// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Server-Side Encryption properties for clients communicating with AWS s3. */
@Generated
@JsonSerialize(using = SseEncryptionDetails.SseEncryptionDetailsSerializer.class)
@JsonDeserialize(using = SseEncryptionDetails.SseEncryptionDetailsDeserializer.class)
public class SseEncryptionDetails {
  /** Sets the value of the 'x-amz-server-side-encryption' header in S3 request. */
  private SseEncryptionDetailsAlgorithm algorithm;

  /**
   * Optional. The ARN of the SSE-KMS key used with the S3 location, when algorithm = "SSE-KMS".
   * Sets the value of the 'x-amz-server-side-encryption-aws-kms-key-id' header.
   */
  private String awsKmsKeyArn;

  public SseEncryptionDetails setAlgorithm(SseEncryptionDetailsAlgorithm algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  public SseEncryptionDetailsAlgorithm getAlgorithm() {
    return algorithm;
  }

  public SseEncryptionDetails setAwsKmsKeyArn(String awsKmsKeyArn) {
    this.awsKmsKeyArn = awsKmsKeyArn;
    return this;
  }

  public String getAwsKmsKeyArn() {
    return awsKmsKeyArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SseEncryptionDetails that = (SseEncryptionDetails) o;
    return Objects.equals(algorithm, that.algorithm)
        && Objects.equals(awsKmsKeyArn, that.awsKmsKeyArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, awsKmsKeyArn);
  }

  @Override
  public String toString() {
    return new ToStringer(SseEncryptionDetails.class)
        .add("algorithm", algorithm)
        .add("awsKmsKeyArn", awsKmsKeyArn)
        .toString();
  }

  SseEncryptionDetailsPb toPb() {
    SseEncryptionDetailsPb pb = new SseEncryptionDetailsPb();
    pb.setAlgorithm(algorithm);
    pb.setAwsKmsKeyArn(awsKmsKeyArn);

    return pb;
  }

  static SseEncryptionDetails fromPb(SseEncryptionDetailsPb pb) {
    SseEncryptionDetails model = new SseEncryptionDetails();
    model.setAlgorithm(pb.getAlgorithm());
    model.setAwsKmsKeyArn(pb.getAwsKmsKeyArn());

    return model;
  }

  public static class SseEncryptionDetailsSerializer extends JsonSerializer<SseEncryptionDetails> {
    @Override
    public void serialize(
        SseEncryptionDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SseEncryptionDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SseEncryptionDetailsDeserializer
      extends JsonDeserializer<SseEncryptionDetails> {
    @Override
    public SseEncryptionDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SseEncryptionDetailsPb pb = mapper.readValue(p, SseEncryptionDetailsPb.class);
      return SseEncryptionDetails.fromPb(pb);
    }
  }
}
