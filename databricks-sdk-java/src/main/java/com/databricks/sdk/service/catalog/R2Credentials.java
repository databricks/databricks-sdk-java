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
 * R2 temporary credentials for API authentication. Read more at
 * https://developers.cloudflare.com/r2/api/s3/tokens/.
 */
@Generated
@JsonSerialize(using = R2Credentials.R2CredentialsSerializer.class)
@JsonDeserialize(using = R2Credentials.R2CredentialsDeserializer.class)
public class R2Credentials {
  /** The access key ID that identifies the temporary credentials. */
  private String accessKeyId;

  /** The secret access key associated with the access key. */
  private String secretAccessKey;

  /** The generated JWT that users must pass to use the temporary credentials. */
  private String sessionToken;

  public R2Credentials setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public R2Credentials setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public R2Credentials setSessionToken(String sessionToken) {
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
    R2Credentials that = (R2Credentials) o;
    return Objects.equals(accessKeyId, that.accessKeyId)
        && Objects.equals(secretAccessKey, that.secretAccessKey)
        && Objects.equals(sessionToken, that.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey, sessionToken);
  }

  @Override
  public String toString() {
    return new ToStringer(R2Credentials.class)
        .add("accessKeyId", accessKeyId)
        .add("secretAccessKey", secretAccessKey)
        .add("sessionToken", sessionToken)
        .toString();
  }

  R2CredentialsPb toPb() {
    R2CredentialsPb pb = new R2CredentialsPb();
    pb.setAccessKeyId(accessKeyId);
    pb.setSecretAccessKey(secretAccessKey);
    pb.setSessionToken(sessionToken);

    return pb;
  }

  static R2Credentials fromPb(R2CredentialsPb pb) {
    R2Credentials model = new R2Credentials();
    model.setAccessKeyId(pb.getAccessKeyId());
    model.setSecretAccessKey(pb.getSecretAccessKey());
    model.setSessionToken(pb.getSessionToken());

    return model;
  }

  public static class R2CredentialsSerializer extends JsonSerializer<R2Credentials> {
    @Override
    public void serialize(R2Credentials value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      R2CredentialsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class R2CredentialsDeserializer extends JsonDeserializer<R2Credentials> {
    @Override
    public R2Credentials deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      R2CredentialsPb pb = mapper.readValue(p, R2CredentialsPb.class);
      return R2Credentials.fromPb(pb);
    }
  }
}
