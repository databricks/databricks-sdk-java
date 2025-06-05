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

@Generated
@JsonSerialize(using = CreateShare.CreateShareSerializer.class)
@JsonDeserialize(using = CreateShare.CreateShareDeserializer.class)
public class CreateShare {
  /** User-provided free-form text description. */
  private String comment;

  /** Name of the share. */
  private String name;

  /** Storage root URL for the share. */
  private String storageRoot;

  public CreateShare setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateShare setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateShare setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateShare that = (CreateShare) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateShare.class)
        .add("comment", comment)
        .add("name", name)
        .add("storageRoot", storageRoot)
        .toString();
  }

  CreateSharePb toPb() {
    CreateSharePb pb = new CreateSharePb();
    pb.setComment(comment);
    pb.setName(name);
    pb.setStorageRoot(storageRoot);

    return pb;
  }

  static CreateShare fromPb(CreateSharePb pb) {
    CreateShare model = new CreateShare();
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setStorageRoot(pb.getStorageRoot());

    return model;
  }

  public static class CreateShareSerializer extends JsonSerializer<CreateShare> {
    @Override
    public void serialize(CreateShare value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateSharePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateShareDeserializer extends JsonDeserializer<CreateShare> {
    @Override
    public CreateShare deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateSharePb pb = mapper.readValue(p, CreateSharePb.class);
      return CreateShare.fromPb(pb);
    }
  }
}
