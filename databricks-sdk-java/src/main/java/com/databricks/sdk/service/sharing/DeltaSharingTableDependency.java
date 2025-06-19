// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** A Table in UC as a dependency. */
@Generated
@JsonSerialize(using = DeltaSharingTableDependency.DeltaSharingTableDependencySerializer.class)
@JsonDeserialize(using = DeltaSharingTableDependency.DeltaSharingTableDependencyDeserializer.class)
public class DeltaSharingTableDependency {
  /** */
  private String schemaName;

  /** */
  private String tableName;

  public DeltaSharingTableDependency setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public DeltaSharingTableDependency setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingTableDependency that = (DeltaSharingTableDependency) o;
    return Objects.equals(schemaName, that.schemaName) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingTableDependency.class)
        .add("schemaName", schemaName)
        .add("tableName", tableName)
        .toString();
  }

  DeltaSharingTableDependencyPb toPb() {
    DeltaSharingTableDependencyPb pb = new DeltaSharingTableDependencyPb();
    pb.setSchemaName(schemaName);
    pb.setTableName(tableName);

    return pb;
  }

  static DeltaSharingTableDependency fromPb(DeltaSharingTableDependencyPb pb) {
    DeltaSharingTableDependency model = new DeltaSharingTableDependency();
    model.setSchemaName(pb.getSchemaName());
    model.setTableName(pb.getTableName());

    return model;
  }

  public static class DeltaSharingTableDependencySerializer
      extends JsonSerializer<DeltaSharingTableDependency> {
    @Override
    public void serialize(
        DeltaSharingTableDependency value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaSharingTableDependencyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaSharingTableDependencyDeserializer
      extends JsonDeserializer<DeltaSharingTableDependency> {
    @Override
    public DeltaSharingTableDependency deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaSharingTableDependencyPb pb = mapper.readValue(p, DeltaSharingTableDependencyPb.class);
      return DeltaSharingTableDependency.fromPb(pb);
    }
  }
}
