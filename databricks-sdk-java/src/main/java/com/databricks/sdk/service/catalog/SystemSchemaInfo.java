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
@JsonSerialize(using = SystemSchemaInfo.SystemSchemaInfoSerializer.class)
@JsonDeserialize(using = SystemSchemaInfo.SystemSchemaInfoDeserializer.class)
public class SystemSchemaInfo {
  /** Name of the system schema. */
  private String schema;

  /**
   * The current state of enablement for the system schema. An empty string means the system schema
   * is available and ready for opt-in. Possible values: AVAILABLE | ENABLE_INITIALIZED |
   * ENABLE_COMPLETED | DISABLE_INITIALIZED | UNAVAILABLE
   */
  private String state;

  public SystemSchemaInfo setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public SystemSchemaInfo setState(String state) {
    this.state = state;
    return this;
  }

  public String getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SystemSchemaInfo that = (SystemSchemaInfo) o;
    return Objects.equals(schema, that.schema) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, state);
  }

  @Override
  public String toString() {
    return new ToStringer(SystemSchemaInfo.class)
        .add("schema", schema)
        .add("state", state)
        .toString();
  }

  SystemSchemaInfoPb toPb() {
    SystemSchemaInfoPb pb = new SystemSchemaInfoPb();
    pb.setSchema(schema);
    pb.setState(state);

    return pb;
  }

  static SystemSchemaInfo fromPb(SystemSchemaInfoPb pb) {
    SystemSchemaInfo model = new SystemSchemaInfo();
    model.setSchema(pb.getSchema());
    model.setState(pb.getState());

    return model;
  }

  public static class SystemSchemaInfoSerializer extends JsonSerializer<SystemSchemaInfo> {
    @Override
    public void serialize(SystemSchemaInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SystemSchemaInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SystemSchemaInfoDeserializer extends JsonDeserializer<SystemSchemaInfo> {
    @Override
    public SystemSchemaInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SystemSchemaInfoPb pb = mapper.readValue(p, SystemSchemaInfoPb.class);
      return SystemSchemaInfo.fromPb(pb);
    }
  }
}
