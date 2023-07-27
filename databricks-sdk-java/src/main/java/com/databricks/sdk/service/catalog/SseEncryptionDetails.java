// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Server-Side Encryption properties for clients communicating with AWS s3. */
@Generated
public class SseEncryptionDetails {
  /** The type of key encryption to use (affects headers from s3 client). */
  @JsonProperty("algorithm")
  private SseEncryptionDetailsAlgorithm algorithm;

  /** When algorithm is **AWS_SSE_KMS** this field specifies the ARN of the SSE key to use. */
  @JsonProperty("aws_kms_key_arn")
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
}
