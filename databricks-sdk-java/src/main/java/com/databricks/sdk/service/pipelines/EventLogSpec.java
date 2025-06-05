// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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

/** Configurable event log parameters. */
@Generated
@JsonSerialize(using = EventLogSpec.EventLogSpecSerializer.class)
@JsonDeserialize(using = EventLogSpec.EventLogSpecDeserializer.class)
public class EventLogSpec {
  /** The UC catalog the event log is published under. */
  private String catalog;

  /** The name the event log is published to in UC. */
  private String name;

  /** The UC schema the event log is published under. */
  private String schema;

  public EventLogSpec setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public EventLogSpec setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EventLogSpec setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventLogSpec that = (EventLogSpec) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, name, schema);
  }

  @Override
  public String toString() {
    return new ToStringer(EventLogSpec.class)
        .add("catalog", catalog)
        .add("name", name)
        .add("schema", schema)
        .toString();
  }

  EventLogSpecPb toPb() {
    EventLogSpecPb pb = new EventLogSpecPb();
    pb.setCatalog(catalog);
    pb.setName(name);
    pb.setSchema(schema);

    return pb;
  }

  static EventLogSpec fromPb(EventLogSpecPb pb) {
    EventLogSpec model = new EventLogSpec();
    model.setCatalog(pb.getCatalog());
    model.setName(pb.getName());
    model.setSchema(pb.getSchema());

    return model;
  }

  public static class EventLogSpecSerializer extends JsonSerializer<EventLogSpec> {
    @Override
    public void serialize(EventLogSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EventLogSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EventLogSpecDeserializer extends JsonDeserializer<EventLogSpec> {
    @Override
    public EventLogSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EventLogSpecPb pb = mapper.readValue(p, EventLogSpecPb.class);
      return EventLogSpec.fromPb(pb);
    }
  }
}
