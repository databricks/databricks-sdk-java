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
@JsonSerialize(using = UpdateConnection.UpdateConnectionSerializer.class)
@JsonDeserialize(using = UpdateConnection.UpdateConnectionDeserializer.class)
public class UpdateConnection {
  /** Name of the connection. */
  private String name;

  /** New name for the connection. */
  private String newName;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> options;

  /** Username of current owner of the connection. */
  private String owner;

  public UpdateConnection setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateConnection setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateConnection setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public UpdateConnection setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateConnection that = (UpdateConnection) o;
    return Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newName, options, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateConnection.class)
        .add("name", name)
        .add("newName", newName)
        .add("options", options)
        .add("owner", owner)
        .toString();
  }

  UpdateConnectionPb toPb() {
    UpdateConnectionPb pb = new UpdateConnectionPb();
    pb.setName(name);
    pb.setNewName(newName);
    pb.setOptions(options);
    pb.setOwner(owner);

    return pb;
  }

  static UpdateConnection fromPb(UpdateConnectionPb pb) {
    UpdateConnection model = new UpdateConnection();
    model.setName(pb.getName());
    model.setNewName(pb.getNewName());
    model.setOptions(pb.getOptions());
    model.setOwner(pb.getOwner());

    return model;
  }

  public static class UpdateConnectionSerializer extends JsonSerializer<UpdateConnection> {
    @Override
    public void serialize(UpdateConnection value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateConnectionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateConnectionDeserializer extends JsonDeserializer<UpdateConnection> {
    @Override
    public UpdateConnection deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateConnectionPb pb = mapper.readValue(p, UpdateConnectionPb.class);
      return UpdateConnection.fromPb(pb);
    }
  }
}
