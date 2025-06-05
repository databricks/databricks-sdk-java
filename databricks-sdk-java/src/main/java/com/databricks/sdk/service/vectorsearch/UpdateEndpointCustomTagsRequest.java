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
    using = UpdateEndpointCustomTagsRequest.UpdateEndpointCustomTagsRequestSerializer.class)
@JsonDeserialize(
    using = UpdateEndpointCustomTagsRequest.UpdateEndpointCustomTagsRequestDeserializer.class)
public class UpdateEndpointCustomTagsRequest {
  /** The new custom tags for the vector search endpoint */
  private Collection<CustomTag> customTags;

  /** Name of the vector search endpoint */
  private String endpointName;

  public UpdateEndpointCustomTagsRequest setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public UpdateEndpointCustomTagsRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateEndpointCustomTagsRequest that = (UpdateEndpointCustomTagsRequest) o;
    return Objects.equals(customTags, that.customTags)
        && Objects.equals(endpointName, that.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags, endpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEndpointCustomTagsRequest.class)
        .add("customTags", customTags)
        .add("endpointName", endpointName)
        .toString();
  }

  UpdateEndpointCustomTagsRequestPb toPb() {
    UpdateEndpointCustomTagsRequestPb pb = new UpdateEndpointCustomTagsRequestPb();
    pb.setCustomTags(customTags);
    pb.setEndpointName(endpointName);

    return pb;
  }

  static UpdateEndpointCustomTagsRequest fromPb(UpdateEndpointCustomTagsRequestPb pb) {
    UpdateEndpointCustomTagsRequest model = new UpdateEndpointCustomTagsRequest();
    model.setCustomTags(pb.getCustomTags());
    model.setEndpointName(pb.getEndpointName());

    return model;
  }

  public static class UpdateEndpointCustomTagsRequestSerializer
      extends JsonSerializer<UpdateEndpointCustomTagsRequest> {
    @Override
    public void serialize(
        UpdateEndpointCustomTagsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateEndpointCustomTagsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateEndpointCustomTagsRequestDeserializer
      extends JsonDeserializer<UpdateEndpointCustomTagsRequest> {
    @Override
    public UpdateEndpointCustomTagsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateEndpointCustomTagsRequestPb pb =
          mapper.readValue(p, UpdateEndpointCustomTagsRequestPb.class);
      return UpdateEndpointCustomTagsRequest.fromPb(pb);
    }
  }
}
