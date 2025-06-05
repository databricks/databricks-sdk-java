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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateModelRequest.CreateModelRequestSerializer.class)
@JsonDeserialize(using = CreateModelRequest.CreateModelRequestDeserializer.class)
public class CreateModelRequest {
  /** Optional description for registered model. */
  private String description;

  /** Register models under this name */
  private String name;

  /** Additional metadata for registered model. */
  private Collection<ModelTag> tags;

  public CreateModelRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateModelRequest setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelRequest that = (CreateModelRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateModelRequest.class)
        .add("description", description)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }

  CreateModelRequestPb toPb() {
    CreateModelRequestPb pb = new CreateModelRequestPb();
    pb.setDescription(description);
    pb.setName(name);
    pb.setTags(tags);

    return pb;
  }

  static CreateModelRequest fromPb(CreateModelRequestPb pb) {
    CreateModelRequest model = new CreateModelRequest();
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());
    model.setTags(pb.getTags());

    return model;
  }

  public static class CreateModelRequestSerializer extends JsonSerializer<CreateModelRequest> {
    @Override
    public void serialize(CreateModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateModelRequestDeserializer extends JsonDeserializer<CreateModelRequest> {
    @Override
    public CreateModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateModelRequestPb pb = mapper.readValue(p, CreateModelRequestPb.class);
      return CreateModelRequest.fromPb(pb);
    }
  }
}
