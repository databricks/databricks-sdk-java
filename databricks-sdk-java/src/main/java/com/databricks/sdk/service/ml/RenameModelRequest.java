// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = RenameModelRequest.RenameModelRequestSerializer.class)
@JsonDeserialize(using = RenameModelRequest.RenameModelRequestDeserializer.class)
public class RenameModelRequest {
  /** Registered model unique name identifier. */
  private String name;

  /** If provided, updates the name for this `registered_model`. */
  private String newName;

  public RenameModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RenameModelRequest setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RenameModelRequest that = (RenameModelRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(newName, that.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newName);
  }

  @Override
  public String toString() {
    return new ToStringer(RenameModelRequest.class)
        .add("name", name)
        .add("newName", newName)
        .toString();
  }

  RenameModelRequestPb toPb() {
    RenameModelRequestPb pb = new RenameModelRequestPb();
    pb.setName(name);
    pb.setNewName(newName);

    return pb;
  }

  static RenameModelRequest fromPb(RenameModelRequestPb pb) {
    RenameModelRequest model = new RenameModelRequest();
    model.setName(pb.getName());
    model.setNewName(pb.getNewName());

    return model;
  }

  public static class RenameModelRequestSerializer extends JsonSerializer<RenameModelRequest> {
    @Override
    public void serialize(RenameModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RenameModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RenameModelRequestDeserializer extends JsonDeserializer<RenameModelRequest> {
    @Override
    public RenameModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RenameModelRequestPb pb = mapper.readValue(p, RenameModelRequestPb.class);
      return RenameModelRequest.fromPb(pb);
    }
  }
}
