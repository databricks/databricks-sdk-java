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

@Generated
@JsonSerialize(using = EndpointTag.EndpointTagSerializer.class)
@JsonDeserialize(using = EndpointTag.EndpointTagDeserializer.class)
public class EndpointTag {
  /** Key field for a serving endpoint tag. */
  private String key;

  /** Optional value field for a serving endpoint tag. */
  private String value;

  public EndpointTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public EndpointTag setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointTag that = (EndpointTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointTag.class).add("key", key).add("value", value).toString();
  }

  EndpointTagPb toPb() {
    EndpointTagPb pb = new EndpointTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static EndpointTag fromPb(EndpointTagPb pb) {
    EndpointTag model = new EndpointTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class EndpointTagSerializer extends JsonSerializer<EndpointTag> {
    @Override
    public void serialize(EndpointTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointTagDeserializer extends JsonDeserializer<EndpointTag> {
    @Override
    public EndpointTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointTagPb pb = mapper.readValue(p, EndpointTagPb.class);
      return EndpointTag.fromPb(pb);
    }
  }
}
