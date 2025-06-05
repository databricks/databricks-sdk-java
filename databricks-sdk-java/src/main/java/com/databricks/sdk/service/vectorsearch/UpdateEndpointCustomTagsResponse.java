// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(
    using = UpdateEndpointCustomTagsResponse.UpdateEndpointCustomTagsResponseSerializer.class)
@JsonDeserialize(
    using = UpdateEndpointCustomTagsResponse.UpdateEndpointCustomTagsResponseDeserializer.class)
public class UpdateEndpointCustomTagsResponse {
  /** All the custom tags that are applied to the vector search endpoint. */
  private Collection<CustomTag> customTags;

  /** The name of the vector search endpoint whose custom tags were updated. */
  private String name;

  public UpdateEndpointCustomTagsResponse setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public UpdateEndpointCustomTagsResponse setName(String name) {
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
    UpdateEndpointCustomTagsResponse that = (UpdateEndpointCustomTagsResponse) o;
    return Objects.equals(customTags, that.customTags) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEndpointCustomTagsResponse.class)
        .add("customTags", customTags)
        .add("name", name)
        .toString();
  }

  UpdateEndpointCustomTagsResponsePb toPb() {
    UpdateEndpointCustomTagsResponsePb pb = new UpdateEndpointCustomTagsResponsePb();
    pb.setCustomTags(customTags);
    pb.setName(name);

    return pb;
  }

  static UpdateEndpointCustomTagsResponse fromPb(UpdateEndpointCustomTagsResponsePb pb) {
    UpdateEndpointCustomTagsResponse model = new UpdateEndpointCustomTagsResponse();
    model.setCustomTags(pb.getCustomTags());
    model.setName(pb.getName());

    return model;
  }

  public static class UpdateEndpointCustomTagsResponseSerializer
      extends JsonSerializer<UpdateEndpointCustomTagsResponse> {
    @Override
    public void serialize(
        UpdateEndpointCustomTagsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateEndpointCustomTagsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateEndpointCustomTagsResponseDeserializer
      extends JsonDeserializer<UpdateEndpointCustomTagsResponse> {
    @Override
    public UpdateEndpointCustomTagsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateEndpointCustomTagsResponsePb pb =
          mapper.readValue(p, UpdateEndpointCustomTagsResponsePb.class);
      return UpdateEndpointCustomTagsResponse.fromPb(pb);
    }
  }
}
