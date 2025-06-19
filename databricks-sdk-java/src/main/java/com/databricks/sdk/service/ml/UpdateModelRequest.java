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
@JsonSerialize(using = UpdateModelRequest.UpdateModelRequestSerializer.class)
@JsonDeserialize(using = UpdateModelRequest.UpdateModelRequestDeserializer.class)
public class UpdateModelRequest {
  /** If provided, updates the description for this `registered_model`. */
  private String description;

  /** Registered model unique name identifier. */
  private String name;

  public UpdateModelRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateModelRequest that = (UpdateModelRequest) o;
    return Objects.equals(description, that.description) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelRequest.class)
        .add("description", description)
        .add("name", name)
        .toString();
  }

  UpdateModelRequestPb toPb() {
    UpdateModelRequestPb pb = new UpdateModelRequestPb();
    pb.setDescription(description);
    pb.setName(name);

    return pb;
  }

  static UpdateModelRequest fromPb(UpdateModelRequestPb pb) {
    UpdateModelRequest model = new UpdateModelRequest();
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());

    return model;
  }

  public static class UpdateModelRequestSerializer extends JsonSerializer<UpdateModelRequest> {
    @Override
    public void serialize(UpdateModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateModelRequestDeserializer extends JsonDeserializer<UpdateModelRequest> {
    @Override
    public UpdateModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateModelRequestPb pb = mapper.readValue(p, UpdateModelRequestPb.class);
      return UpdateModelRequest.fromPb(pb);
    }
  }
}
