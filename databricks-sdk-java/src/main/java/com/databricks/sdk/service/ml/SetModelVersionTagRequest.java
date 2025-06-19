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
@JsonSerialize(using = SetModelVersionTagRequest.SetModelVersionTagRequestSerializer.class)
@JsonDeserialize(using = SetModelVersionTagRequest.SetModelVersionTagRequestDeserializer.class)
public class SetModelVersionTagRequest {
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

  /** Model version number. */
  private String version;

  public SetModelVersionTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetModelVersionTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SetModelVersionTagRequest setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  public SetModelVersionTagRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetModelVersionTagRequest that = (SetModelVersionTagRequest) o;
    return Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(value, that.value)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, value, version);
  }

  @Override
  public String toString() {
    return new ToStringer(SetModelVersionTagRequest.class)
        .add("key", key)
        .add("name", name)
        .add("value", value)
        .add("version", version)
        .toString();
  }

  SetModelVersionTagRequestPb toPb() {
    SetModelVersionTagRequestPb pb = new SetModelVersionTagRequestPb();
    pb.setKey(key);
    pb.setName(name);
    pb.setValue(value);
    pb.setVersion(version);

    return pb;
  }

  static SetModelVersionTagRequest fromPb(SetModelVersionTagRequestPb pb) {
    SetModelVersionTagRequest model = new SetModelVersionTagRequest();
    model.setKey(pb.getKey());
    model.setName(pb.getName());
    model.setValue(pb.getValue());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class SetModelVersionTagRequestSerializer
      extends JsonSerializer<SetModelVersionTagRequest> {
    @Override
    public void serialize(
        SetModelVersionTagRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetModelVersionTagRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetModelVersionTagRequestDeserializer
      extends JsonDeserializer<SetModelVersionTagRequest> {
    @Override
    public SetModelVersionTagRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetModelVersionTagRequestPb pb = mapper.readValue(p, SetModelVersionTagRequestPb.class);
      return SetModelVersionTagRequest.fromPb(pb);
    }
  }
}
