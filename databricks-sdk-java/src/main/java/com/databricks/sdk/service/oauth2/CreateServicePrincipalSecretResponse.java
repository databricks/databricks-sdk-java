// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
@JsonSerialize(
    using =
        CreateServicePrincipalSecretResponse.CreateServicePrincipalSecretResponseSerializer.class)
@JsonDeserialize(
    using =
        CreateServicePrincipalSecretResponse.CreateServicePrincipalSecretResponseDeserializer.class)
public class CreateServicePrincipalSecretResponse {
  /** UTC time when the secret was created */
  private String createTime;

  /**
   * UTC time when the secret will expire. If the field is not present, the secret does not expire.
   */
  private String expireTime;

  /** ID of the secret */
  private String id;

  /** Secret Value */
  private String secret;

  /** Secret Hash */
  private String secretHash;

  /** Status of the secret */
  private String status;

  /** UTC time when the secret was updated */
  private String updateTime;

  public CreateServicePrincipalSecretResponse setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public CreateServicePrincipalSecretResponse setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public String getExpireTime() {
    return expireTime;
  }

  public CreateServicePrincipalSecretResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateServicePrincipalSecretResponse setSecret(String secret) {
    this.secret = secret;
    return this;
  }

  public String getSecret() {
    return secret;
  }

  public CreateServicePrincipalSecretResponse setSecretHash(String secretHash) {
    this.secretHash = secretHash;
    return this;
  }

  public String getSecretHash() {
    return secretHash;
  }

  public CreateServicePrincipalSecretResponse setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public CreateServicePrincipalSecretResponse setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServicePrincipalSecretResponse that = (CreateServicePrincipalSecretResponse) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(expireTime, that.expireTime)
        && Objects.equals(id, that.id)
        && Objects.equals(secret, that.secret)
        && Objects.equals(secretHash, that.secretHash)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, expireTime, id, secret, secretHash, status, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalSecretResponse.class)
        .add("createTime", createTime)
        .add("expireTime", expireTime)
        .add("id", id)
        .add("secret", secret)
        .add("secretHash", secretHash)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }

  CreateServicePrincipalSecretResponsePb toPb() {
    CreateServicePrincipalSecretResponsePb pb = new CreateServicePrincipalSecretResponsePb();
    pb.setCreateTime(createTime);
    pb.setExpireTime(expireTime);
    pb.setId(id);
    pb.setSecret(secret);
    pb.setSecretHash(secretHash);
    pb.setStatus(status);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static CreateServicePrincipalSecretResponse fromPb(CreateServicePrincipalSecretResponsePb pb) {
    CreateServicePrincipalSecretResponse model = new CreateServicePrincipalSecretResponse();
    model.setCreateTime(pb.getCreateTime());
    model.setExpireTime(pb.getExpireTime());
    model.setId(pb.getId());
    model.setSecret(pb.getSecret());
    model.setSecretHash(pb.getSecretHash());
    model.setStatus(pb.getStatus());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class CreateServicePrincipalSecretResponseSerializer
      extends JsonSerializer<CreateServicePrincipalSecretResponse> {
    @Override
    public void serialize(
        CreateServicePrincipalSecretResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateServicePrincipalSecretResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateServicePrincipalSecretResponseDeserializer
      extends JsonDeserializer<CreateServicePrincipalSecretResponse> {
    @Override
    public CreateServicePrincipalSecretResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateServicePrincipalSecretResponsePb pb =
          mapper.readValue(p, CreateServicePrincipalSecretResponsePb.class);
      return CreateServicePrincipalSecretResponse.fromPb(pb);
    }
  }
}
