// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = SecretMetadata.SecretMetadataSerializer.class)
@JsonDeserialize(using = SecretMetadata.SecretMetadataDeserializer.class)
public class SecretMetadata {
  /** A unique name to identify the secret. */
  private String key;

  /** The last updated timestamp (in milliseconds) for the secret. */
  private Long lastUpdatedTimestamp;

  public SecretMetadata setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SecretMetadata setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecretMetadata that = (SecretMetadata) o;
    return Objects.equals(key, that.key)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, lastUpdatedTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretMetadata.class)
        .add("key", key)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .toString();
  }

  SecretMetadataPb toPb() {
    SecretMetadataPb pb = new SecretMetadataPb();
    pb.setKey(key);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);

    return pb;
  }

  static SecretMetadata fromPb(SecretMetadataPb pb) {
    SecretMetadata model = new SecretMetadata();
    model.setKey(pb.getKey());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());

    return model;
  }

  public static class SecretMetadataSerializer extends JsonSerializer<SecretMetadata> {
    @Override
    public void serialize(SecretMetadata value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SecretMetadataPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SecretMetadataDeserializer extends JsonDeserializer<SecretMetadata> {
    @Override
    public SecretMetadata deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SecretMetadataPb pb = mapper.readValue(p, SecretMetadataPb.class);
      return SecretMetadata.fromPb(pb);
    }
  }
}
