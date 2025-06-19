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

@Generated
@JsonSerialize(using = CloudflareApiToken.CloudflareApiTokenSerializer.class)
@JsonDeserialize(using = CloudflareApiToken.CloudflareApiTokenDeserializer.class)
public class CloudflareApiToken {
  /** The Cloudflare access key id of the token. */
  private String accessKeyId;

  /** The account id associated with the API token. */
  private String accountId;

  /** The secret access token generated for the access key id */
  private String secretAccessKey;

  public CloudflareApiToken setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public CloudflareApiToken setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CloudflareApiToken setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudflareApiToken that = (CloudflareApiToken) o;
    return Objects.equals(accessKeyId, that.accessKeyId)
        && Objects.equals(accountId, that.accountId)
        && Objects.equals(secretAccessKey, that.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accountId, secretAccessKey);
  }

  @Override
  public String toString() {
    return new ToStringer(CloudflareApiToken.class)
        .add("accessKeyId", accessKeyId)
        .add("accountId", accountId)
        .add("secretAccessKey", secretAccessKey)
        .toString();
  }

  CloudflareApiTokenPb toPb() {
    CloudflareApiTokenPb pb = new CloudflareApiTokenPb();
    pb.setAccessKeyId(accessKeyId);
    pb.setAccountId(accountId);
    pb.setSecretAccessKey(secretAccessKey);

    return pb;
  }

  static CloudflareApiToken fromPb(CloudflareApiTokenPb pb) {
    CloudflareApiToken model = new CloudflareApiToken();
    model.setAccessKeyId(pb.getAccessKeyId());
    model.setAccountId(pb.getAccountId());
    model.setSecretAccessKey(pb.getSecretAccessKey());

    return model;
  }

  public static class CloudflareApiTokenSerializer extends JsonSerializer<CloudflareApiToken> {
    @Override
    public void serialize(CloudflareApiToken value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CloudflareApiTokenPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CloudflareApiTokenDeserializer extends JsonDeserializer<CloudflareApiToken> {
    @Override
    public CloudflareApiToken deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CloudflareApiTokenPb pb = mapper.readValue(p, CloudflareApiTokenPb.class);
      return CloudflareApiToken.fromPb(pb);
    }
  }
}
