// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
 * Stores the catalog name, schema name, and the output schema expiration time for the clean room
 * run.
 */
@Generated
@JsonSerialize(using = OutputSchemaInfo.OutputSchemaInfoSerializer.class)
@JsonDeserialize(using = OutputSchemaInfo.OutputSchemaInfoDeserializer.class)
public class OutputSchemaInfo {
  /** */
  private String catalogName;

  /** The expiration time for the output schema as a Unix timestamp in milliseconds. */
  private Long expirationTime;

  /** */
  private String schemaName;

  public OutputSchemaInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public OutputSchemaInfo setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public OutputSchemaInfo setSchemaName(String schemaName) {
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
    OutputSchemaInfo that = (OutputSchemaInfo) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, expirationTime, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(OutputSchemaInfo.class)
        .add("catalogName", catalogName)
        .add("expirationTime", expirationTime)
        .add("schemaName", schemaName)
        .toString();
  }

  OutputSchemaInfoPb toPb() {
    OutputSchemaInfoPb pb = new OutputSchemaInfoPb();
    pb.setCatalogName(catalogName);
    pb.setExpirationTime(expirationTime);
    pb.setSchemaName(schemaName);

    return pb;
  }

  static OutputSchemaInfo fromPb(OutputSchemaInfoPb pb) {
    OutputSchemaInfo model = new OutputSchemaInfo();
    model.setCatalogName(pb.getCatalogName());
    model.setExpirationTime(pb.getExpirationTime());
    model.setSchemaName(pb.getSchemaName());

    return model;
  }

  public static class OutputSchemaInfoSerializer extends JsonSerializer<OutputSchemaInfo> {
    @Override
    public void serialize(OutputSchemaInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      OutputSchemaInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OutputSchemaInfoDeserializer extends JsonDeserializer<OutputSchemaInfo> {
    @Override
    public OutputSchemaInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OutputSchemaInfoPb pb = mapper.readValue(p, OutputSchemaInfoPb.class);
      return OutputSchemaInfo.fromPb(pb);
    }
  }
}
