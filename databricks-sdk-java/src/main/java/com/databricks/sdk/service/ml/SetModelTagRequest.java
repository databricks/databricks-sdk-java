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
@JsonSerialize(using = SetModelTagRequest.SetModelTagRequestSerializer.class)
@JsonDeserialize(using = SetModelTagRequest.SetModelTagRequestDeserializer.class)
public class SetModelTagRequest {
  /**
   * Name of the tag. Maximum size depends on storage backend. If a tag with this name already
   * exists, its preexisting value will be replaced by the specified `value`. All storage backends
   * are guaranteed to support key values up to 250 bytes in size.
   */
  private String key;

  /** Unique name of the model. */
  private String name;

  /**
   * String value of the tag being logged. Maximum size depends on storage backend. All storage
   * backends are guaranteed to support key values up to 5000 bytes in size.
   */
  private String value;

  public SetModelTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetModelTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SetModelTagRequest setValue(String value) {
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
    SetModelTagRequest that = (SetModelTagRequest) o;
    return Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, value);
  }

  @Override
  public String toString() {
    return new ToStringer(SetModelTagRequest.class)
        .add("key", key)
        .add("name", name)
        .add("value", value)
        .toString();
  }

  SetModelTagRequestPb toPb() {
    SetModelTagRequestPb pb = new SetModelTagRequestPb();
    pb.setKey(key);
    pb.setName(name);
    pb.setValue(value);

    return pb;
  }

  static SetModelTagRequest fromPb(SetModelTagRequestPb pb) {
    SetModelTagRequest model = new SetModelTagRequest();
    model.setKey(pb.getKey());
    model.setName(pb.getName());
    model.setValue(pb.getValue());

    return model;
  }

  public static class SetModelTagRequestSerializer extends JsonSerializer<SetModelTagRequest> {
    @Override
    public void serialize(SetModelTagRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetModelTagRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetModelTagRequestDeserializer extends JsonDeserializer<SetModelTagRequest> {
    @Override
    public SetModelTagRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetModelTagRequestPb pb = mapper.readValue(p, SetModelTagRequestPb.class);
      return SetModelTagRequest.fromPb(pb);
    }
  }
}
