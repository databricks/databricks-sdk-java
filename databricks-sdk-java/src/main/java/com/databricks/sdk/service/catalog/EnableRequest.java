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
@JsonSerialize(using = EnableRequest.EnableRequestSerializer.class)
@JsonDeserialize(using = EnableRequest.EnableRequestDeserializer.class)
public class EnableRequest {
  /** the catalog for which the system schema is to enabled in */
  private String catalogName;

  /** The metastore ID under which the system schema lives. */
  private String metastoreId;

  /** Full name of the system schema. */
  private String schemaName;

  public EnableRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public EnableRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public EnableRequest setSchemaName(String schemaName) {
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
    EnableRequest that = (EnableRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, metastoreId, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnableRequest.class)
        .add("catalogName", catalogName)
        .add("metastoreId", metastoreId)
        .add("schemaName", schemaName)
        .toString();
  }

  EnableRequestPb toPb() {
    EnableRequestPb pb = new EnableRequestPb();
    pb.setCatalogName(catalogName);
    pb.setMetastoreId(metastoreId);
    pb.setSchemaName(schemaName);

    return pb;
  }

  static EnableRequest fromPb(EnableRequestPb pb) {
    EnableRequest model = new EnableRequest();
    model.setCatalogName(pb.getCatalogName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setSchemaName(pb.getSchemaName());

    return model;
  }

  public static class EnableRequestSerializer extends JsonSerializer<EnableRequest> {
    @Override
    public void serialize(EnableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnableRequestDeserializer extends JsonDeserializer<EnableRequest> {
    @Override
    public EnableRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnableRequestPb pb = mapper.readValue(p, EnableRequestPb.class);
      return EnableRequest.fromPb(pb);
    }
  }
}
