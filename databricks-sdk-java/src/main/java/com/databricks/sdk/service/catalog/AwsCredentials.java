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

/**
 * AWS temporary credentials for API authentication. Read more at
 * https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html.
 */
@Generated
@JsonSerialize(using = AwsCredentials.AwsCredentialsSerializer.class)
@JsonDeserialize(using = AwsCredentials.AwsCredentialsDeserializer.class)
public class AwsCredentials {
  /** The access key ID that identifies the temporary credentials. */
  private String accessKeyId;

  /**
   * The Amazon Resource Name (ARN) of the S3 access point for temporary credentials related the
   * external location.
   */
  private String accessPoint;

  /** The secret access key that can be used to sign AWS API requests. */
  private String secretAccessKey;

  /** The token that users must pass to AWS API to use the temporary credentials. */
  private String sessionToken;

  public AwsCredentials setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public AwsCredentials setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

  public String getAccessPoint() {
    return accessPoint;
  }

  public AwsCredentials setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public AwsCredentials setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  public String getSessionToken() {
    return sessionToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsCredentials that = (AwsCredentials) o;
    return Objects.equals(accessKeyId, that.accessKeyId)
        && Objects.equals(accessPoint, that.accessPoint)
        && Objects.equals(secretAccessKey, that.secretAccessKey)
        && Objects.equals(sessionToken, that.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accessPoint, secretAccessKey, sessionToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsCredentials.class)
        .add("accessKeyId", accessKeyId)
        .add("accessPoint", accessPoint)
        .add("secretAccessKey", secretAccessKey)
        .add("sessionToken", sessionToken)
        .toString();
  }

  AwsCredentialsPb toPb() {
    AwsCredentialsPb pb = new AwsCredentialsPb();
    pb.setAccessKeyId(accessKeyId);
    pb.setAccessPoint(accessPoint);
    pb.setSecretAccessKey(secretAccessKey);
    pb.setSessionToken(sessionToken);

    return pb;
  }

  static AwsCredentials fromPb(AwsCredentialsPb pb) {
    AwsCredentials model = new AwsCredentials();
    model.setAccessKeyId(pb.getAccessKeyId());
    model.setAccessPoint(pb.getAccessPoint());
    model.setSecretAccessKey(pb.getSecretAccessKey());
    model.setSessionToken(pb.getSessionToken());

    return model;
  }

  public static class AwsCredentialsSerializer extends JsonSerializer<AwsCredentials> {
    @Override
    public void serialize(AwsCredentials value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsCredentialsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsCredentialsDeserializer extends JsonDeserializer<AwsCredentials> {
    @Override
    public AwsCredentials deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsCredentialsPb pb = mapper.readValue(p, AwsCredentialsPb.class);
      return AwsCredentials.fromPb(pb);
    }
  }
}
