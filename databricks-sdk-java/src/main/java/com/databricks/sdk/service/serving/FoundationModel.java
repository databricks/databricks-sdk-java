// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/**
 * All fields are not sensitive as they are hard-coded in the system and made available to
 * customers.
 */
@Generated
@JsonSerialize(using = FoundationModel.FoundationModelSerializer.class)
@JsonDeserialize(using = FoundationModel.FoundationModelDeserializer.class)
public class FoundationModel {
  /** */
  private String description;

  /** */
  private String displayName;

  /** */
  private String docs;

  /** */
  private String name;

  public FoundationModel setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public FoundationModel setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public FoundationModel setDocs(String docs) {
    this.docs = docs;
    return this;
  }

  public String getDocs() {
    return docs;
  }

  public FoundationModel setName(String name) {
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
    FoundationModel that = (FoundationModel) o;
    return Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(docs, that.docs)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, docs, name);
  }

  @Override
  public String toString() {
    return new ToStringer(FoundationModel.class)
        .add("description", description)
        .add("displayName", displayName)
        .add("docs", docs)
        .add("name", name)
        .toString();
  }

  FoundationModelPb toPb() {
    FoundationModelPb pb = new FoundationModelPb();
    pb.setDescription(description);
    pb.setDisplayName(displayName);
    pb.setDocs(docs);
    pb.setName(name);

    return pb;
  }

  static FoundationModel fromPb(FoundationModelPb pb) {
    FoundationModel model = new FoundationModel();
    model.setDescription(pb.getDescription());
    model.setDisplayName(pb.getDisplayName());
    model.setDocs(pb.getDocs());
    model.setName(pb.getName());

    return model;
  }

  public static class FoundationModelSerializer extends JsonSerializer<FoundationModel> {
    @Override
    public void serialize(FoundationModel value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FoundationModelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FoundationModelDeserializer extends JsonDeserializer<FoundationModel> {
    @Override
    public FoundationModel deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FoundationModelPb pb = mapper.readValue(p, FoundationModelPb.class);
      return FoundationModel.fromPb(pb);
    }
  }
}
