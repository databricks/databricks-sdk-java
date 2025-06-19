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
@JsonSerialize(using = UpdateModelVersionRequest.UpdateModelVersionRequestSerializer.class)
@JsonDeserialize(using = UpdateModelVersionRequest.UpdateModelVersionRequestDeserializer.class)
public class UpdateModelVersionRequest {
  /** If provided, updates the description for this `registered_model`. */
  private String description;

  /** Name of the registered model */
  private String name;

  /** Model version number */
  private String version;

  public UpdateModelVersionRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateModelVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateModelVersionRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateModelVersionRequest that = (UpdateModelVersionRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelVersionRequest.class)
        .add("description", description)
        .add("name", name)
        .add("version", version)
        .toString();
  }

  UpdateModelVersionRequestPb toPb() {
    UpdateModelVersionRequestPb pb = new UpdateModelVersionRequestPb();
    pb.setDescription(description);
    pb.setName(name);
    pb.setVersion(version);

    return pb;
  }

  static UpdateModelVersionRequest fromPb(UpdateModelVersionRequestPb pb) {
    UpdateModelVersionRequest model = new UpdateModelVersionRequest();
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class UpdateModelVersionRequestSerializer
      extends JsonSerializer<UpdateModelVersionRequest> {
    @Override
    public void serialize(
        UpdateModelVersionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateModelVersionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateModelVersionRequestDeserializer
      extends JsonDeserializer<UpdateModelVersionRequest> {
    @Override
    public UpdateModelVersionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateModelVersionRequestPb pb = mapper.readValue(p, UpdateModelVersionRequestPb.class);
      return UpdateModelVersionRequest.fromPb(pb);
    }
  }
}
