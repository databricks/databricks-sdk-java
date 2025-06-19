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

/** Disable a system schema */
@Generated
@JsonSerialize(using = DisableRequest.DisableRequestSerializer.class)
@JsonDeserialize(using = DisableRequest.DisableRequestDeserializer.class)
public class DisableRequest {
  /** The metastore ID under which the system schema lives. */
  private String metastoreId;

  /** Full name of the system schema. */
  private String schemaName;

  public DisableRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DisableRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DisableRequest that = (DisableRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(DisableRequest.class)
        .add("metastoreId", metastoreId)
        .add("schemaName", schemaName)
        .toString();
  }

  DisableRequestPb toPb() {
    DisableRequestPb pb = new DisableRequestPb();
    pb.setMetastoreId(metastoreId);
    pb.setSchemaName(schemaName);

    return pb;
  }

  static DisableRequest fromPb(DisableRequestPb pb) {
    DisableRequest model = new DisableRequest();
    model.setMetastoreId(pb.getMetastoreId());
    model.setSchemaName(pb.getSchemaName());

    return model;
  }

  public static class DisableRequestSerializer extends JsonSerializer<DisableRequest> {
    @Override
    public void serialize(DisableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DisableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DisableRequestDeserializer extends JsonDeserializer<DisableRequest> {
    @Override
    public DisableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DisableRequestPb pb = mapper.readValue(p, DisableRequestPb.class);
      return DisableRequest.fromPb(pb);
    }
  }
}
