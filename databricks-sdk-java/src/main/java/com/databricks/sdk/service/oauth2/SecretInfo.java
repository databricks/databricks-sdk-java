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
@JsonSerialize(using = SecretInfo.SecretInfoSerializer.class)
@JsonDeserialize(using = SecretInfo.SecretInfoDeserializer.class)
public class SecretInfo {
  /** UTC time when the secret was created */
  private String createTime;

  /**
   * UTC time when the secret will expire. If the field is not present, the secret does not expire.
   */
  private String expireTime;

  /** ID of the secret */
  private String id;

  /** Secret Hash */
  private String secretHash;

  /** Status of the secret */
  private String status;

  /** UTC time when the secret was updated */
  private String updateTime;

  public SecretInfo setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public SecretInfo setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public String getExpireTime() {
    return expireTime;
  }

  public SecretInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public SecretInfo setSecretHash(String secretHash) {
    this.secretHash = secretHash;
    return this;
  }

  public String getSecretHash() {
    return secretHash;
  }

  public SecretInfo setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public SecretInfo setUpdateTime(String updateTime) {
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
    SecretInfo that = (SecretInfo) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(expireTime, that.expireTime)
        && Objects.equals(id, that.id)
        && Objects.equals(secretHash, that.secretHash)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, expireTime, id, secretHash, status, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretInfo.class)
        .add("createTime", createTime)
        .add("expireTime", expireTime)
        .add("id", id)
        .add("secretHash", secretHash)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }

  SecretInfoPb toPb() {
    SecretInfoPb pb = new SecretInfoPb();
    pb.setCreateTime(createTime);
    pb.setExpireTime(expireTime);
    pb.setId(id);
    pb.setSecretHash(secretHash);
    pb.setStatus(status);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static SecretInfo fromPb(SecretInfoPb pb) {
    SecretInfo model = new SecretInfo();
    model.setCreateTime(pb.getCreateTime());
    model.setExpireTime(pb.getExpireTime());
    model.setId(pb.getId());
    model.setSecretHash(pb.getSecretHash());
    model.setStatus(pb.getStatus());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class SecretInfoSerializer extends JsonSerializer<SecretInfo> {
    @Override
    public void serialize(SecretInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SecretInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SecretInfoDeserializer extends JsonDeserializer<SecretInfo> {
    @Override
    public SecretInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SecretInfoPb pb = mapper.readValue(p, SecretInfoPb.class);
      return SecretInfo.fromPb(pb);
    }
  }
}
