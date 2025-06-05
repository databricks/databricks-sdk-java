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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateConnection.CreateConnectionSerializer.class)
@JsonDeserialize(using = CreateConnection.CreateConnectionDeserializer.class)
public class CreateConnection {
  /** User-provided free-form text description. */
  private String comment;

  /** The type of connection. */
  private ConnectionType connectionType;

  /** Name of the connection. */
  private String name;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> options;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  /** If the connection is read only. */
  private Boolean readOnly;

  public CreateConnection setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateConnection setConnectionType(ConnectionType connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  public ConnectionType getConnectionType() {
    return connectionType;
  }

  public CreateConnection setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateConnection setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public CreateConnection setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateConnection setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateConnection that = (CreateConnection) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(connectionType, that.connectionType)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(properties, that.properties)
        && Objects.equals(readOnly, that.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, connectionType, name, options, properties, readOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateConnection.class)
        .add("comment", comment)
        .add("connectionType", connectionType)
        .add("name", name)
        .add("options", options)
        .add("properties", properties)
        .add("readOnly", readOnly)
        .toString();
  }

  CreateConnectionPb toPb() {
    CreateConnectionPb pb = new CreateConnectionPb();
    pb.setComment(comment);
    pb.setConnectionType(connectionType);
    pb.setName(name);
    pb.setOptions(options);
    pb.setProperties(properties);
    pb.setReadOnly(readOnly);

    return pb;
  }

  static CreateConnection fromPb(CreateConnectionPb pb) {
    CreateConnection model = new CreateConnection();
    model.setComment(pb.getComment());
    model.setConnectionType(pb.getConnectionType());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setProperties(pb.getProperties());
    model.setReadOnly(pb.getReadOnly());

    return model;
  }

  public static class CreateConnectionSerializer extends JsonSerializer<CreateConnection> {
    @Override
    public void serialize(CreateConnection value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateConnectionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateConnectionDeserializer extends JsonDeserializer<CreateConnection> {
    @Override
    public CreateConnection deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateConnectionPb pb = mapper.readValue(p, CreateConnectionPb.class);
      return CreateConnection.fromPb(pb);
    }
  }
}
