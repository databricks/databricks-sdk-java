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
@JsonSerialize(using = SetExperimentTag.SetExperimentTagSerializer.class)
@JsonDeserialize(using = SetExperimentTag.SetExperimentTagDeserializer.class)
public class SetExperimentTag {
  /** ID of the experiment under which to log the tag. Must be provided. */
  private String experimentId;

  /** Name of the tag. Keys up to 250 bytes in size are supported. */
  private String key;

  /** String value of the tag being logged. Values up to 64KB in size are supported. */
  private String value;

  public SetExperimentTag setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public SetExperimentTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetExperimentTag setValue(String value) {
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
    SetExperimentTag that = (SetExperimentTag) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(key, that.key)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(SetExperimentTag.class)
        .add("experimentId", experimentId)
        .add("key", key)
        .add("value", value)
        .toString();
  }

  SetExperimentTagPb toPb() {
    SetExperimentTagPb pb = new SetExperimentTagPb();
    pb.setExperimentId(experimentId);
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static SetExperimentTag fromPb(SetExperimentTagPb pb) {
    SetExperimentTag model = new SetExperimentTag();
    model.setExperimentId(pb.getExperimentId());
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class SetExperimentTagSerializer extends JsonSerializer<SetExperimentTag> {
    @Override
    public void serialize(SetExperimentTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetExperimentTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetExperimentTagDeserializer extends JsonDeserializer<SetExperimentTag> {
    @Override
    public SetExperimentTag deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetExperimentTagPb pb = mapper.readValue(p, SetExperimentTagPb.class);
      return SetExperimentTag.fromPb(pb);
    }
  }
}
