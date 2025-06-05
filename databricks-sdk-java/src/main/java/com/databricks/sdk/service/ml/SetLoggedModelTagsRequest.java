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
@JsonSerialize(using = SetLoggedModelTagsRequest.SetLoggedModelTagsRequestSerializer.class)
@JsonDeserialize(using = SetLoggedModelTagsRequest.SetLoggedModelTagsRequestDeserializer.class)
public class SetLoggedModelTagsRequest {
  /** The ID of the logged model to set the tags on. */
  private String modelId;

  /** The tags to set on the logged model. */
  private Collection<LoggedModelTag> tags;

  public SetLoggedModelTagsRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public SetLoggedModelTagsRequest setTags(Collection<LoggedModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<LoggedModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetLoggedModelTagsRequest that = (SetLoggedModelTagsRequest) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(SetLoggedModelTagsRequest.class)
        .add("modelId", modelId)
        .add("tags", tags)
        .toString();
  }

  SetLoggedModelTagsRequestPb toPb() {
    SetLoggedModelTagsRequestPb pb = new SetLoggedModelTagsRequestPb();
    pb.setModelId(modelId);
    pb.setTags(tags);

    return pb;
  }

  static SetLoggedModelTagsRequest fromPb(SetLoggedModelTagsRequestPb pb) {
    SetLoggedModelTagsRequest model = new SetLoggedModelTagsRequest();
    model.setModelId(pb.getModelId());
    model.setTags(pb.getTags());

    return model;
  }

  public static class SetLoggedModelTagsRequestSerializer
      extends JsonSerializer<SetLoggedModelTagsRequest> {
    @Override
    public void serialize(
        SetLoggedModelTagsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetLoggedModelTagsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetLoggedModelTagsRequestDeserializer
      extends JsonDeserializer<SetLoggedModelTagsRequest> {
    @Override
    public SetLoggedModelTagsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetLoggedModelTagsRequestPb pb = mapper.readValue(p, SetLoggedModelTagsRequestPb.class);
      return SetLoggedModelTagsRequest.fromPb(pb);
    }
  }
}
