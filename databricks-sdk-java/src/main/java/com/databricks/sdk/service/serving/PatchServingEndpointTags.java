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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PatchServingEndpointTags.PatchServingEndpointTagsSerializer.class)
@JsonDeserialize(using = PatchServingEndpointTags.PatchServingEndpointTagsDeserializer.class)
public class PatchServingEndpointTags {
  /** List of endpoint tags to add */
  private Collection<EndpointTag> addTags;

  /** List of tag keys to delete */
  private Collection<String> deleteTags;

  /** The name of the serving endpoint who's tags to patch. This field is required. */
  private String name;

  public PatchServingEndpointTags setAddTags(Collection<EndpointTag> addTags) {
    this.addTags = addTags;
    return this;
  }

  public Collection<EndpointTag> getAddTags() {
    return addTags;
  }

  public PatchServingEndpointTags setDeleteTags(Collection<String> deleteTags) {
    this.deleteTags = deleteTags;
    return this;
  }

  public Collection<String> getDeleteTags() {
    return deleteTags;
  }

  public PatchServingEndpointTags setName(String name) {
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
    PatchServingEndpointTags that = (PatchServingEndpointTags) o;
    return Objects.equals(addTags, that.addTags)
        && Objects.equals(deleteTags, that.deleteTags)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTags, deleteTags, name);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchServingEndpointTags.class)
        .add("addTags", addTags)
        .add("deleteTags", deleteTags)
        .add("name", name)
        .toString();
  }

  PatchServingEndpointTagsPb toPb() {
    PatchServingEndpointTagsPb pb = new PatchServingEndpointTagsPb();
    pb.setAddTags(addTags);
    pb.setDeleteTags(deleteTags);
    pb.setName(name);

    return pb;
  }

  static PatchServingEndpointTags fromPb(PatchServingEndpointTagsPb pb) {
    PatchServingEndpointTags model = new PatchServingEndpointTags();
    model.setAddTags(pb.getAddTags());
    model.setDeleteTags(pb.getDeleteTags());
    model.setName(pb.getName());

    return model;
  }

  public static class PatchServingEndpointTagsSerializer
      extends JsonSerializer<PatchServingEndpointTags> {
    @Override
    public void serialize(
        PatchServingEndpointTags value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PatchServingEndpointTagsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PatchServingEndpointTagsDeserializer
      extends JsonDeserializer<PatchServingEndpointTags> {
    @Override
    public PatchServingEndpointTags deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PatchServingEndpointTagsPb pb = mapper.readValue(p, PatchServingEndpointTagsPb.class);
      return PatchServingEndpointTags.fromPb(pb);
    }
  }
}
