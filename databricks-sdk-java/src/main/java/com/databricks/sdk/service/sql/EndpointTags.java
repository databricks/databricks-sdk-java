// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = EndpointTags.EndpointTagsSerializer.class)
@JsonDeserialize(using = EndpointTags.EndpointTagsDeserializer.class)
public class EndpointTags {
  /** */
  private Collection<EndpointTagPair> customTags;

  public EndpointTags setCustomTags(Collection<EndpointTagPair> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<EndpointTagPair> getCustomTags() {
    return customTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointTags that = (EndpointTags) o;
    return Objects.equals(customTags, that.customTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointTags.class).add("customTags", customTags).toString();
  }

  EndpointTagsPb toPb() {
    EndpointTagsPb pb = new EndpointTagsPb();
    pb.setCustomTags(customTags);

    return pb;
  }

  static EndpointTags fromPb(EndpointTagsPb pb) {
    EndpointTags model = new EndpointTags();
    model.setCustomTags(pb.getCustomTags());

    return model;
  }

  public static class EndpointTagsSerializer extends JsonSerializer<EndpointTags> {
    @Override
    public void serialize(EndpointTags value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointTagsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointTagsDeserializer extends JsonDeserializer<EndpointTags> {
    @Override
    public EndpointTags deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointTagsPb pb = mapper.readValue(p, EndpointTagsPb.class);
      return EndpointTags.fromPb(pb);
    }
  }
}
