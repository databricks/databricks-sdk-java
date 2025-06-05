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
@JsonSerialize(using = SetTag.SetTagSerializer.class)
@JsonDeserialize(using = SetTag.SetTagDeserializer.class)
public class SetTag {
  /** Name of the tag. Keys up to 250 bytes in size are supported. */
  private String key;

  /** ID of the run under which to log the tag. Must be provided. */
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run under which to log the tag. This field will be
   * removed in a future MLflow version.
   */
  private String runUuid;

  /** String value of the tag being logged. Values up to 64KB in size are supported. */
  private String value;

  public SetTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetTag setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public SetTag setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public SetTag setValue(String value) {
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
    SetTag that = (SetTag) o;
    return Objects.equals(key, that.key)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, runId, runUuid, value);
  }

  @Override
  public String toString() {
    return new ToStringer(SetTag.class)
        .add("key", key)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("value", value)
        .toString();
  }

  SetTagPb toPb() {
    SetTagPb pb = new SetTagPb();
    pb.setKey(key);
    pb.setRunId(runId);
    pb.setRunUuid(runUuid);
    pb.setValue(value);

    return pb;
  }

  static SetTag fromPb(SetTagPb pb) {
    SetTag model = new SetTag();
    model.setKey(pb.getKey());
    model.setRunId(pb.getRunId());
    model.setRunUuid(pb.getRunUuid());
    model.setValue(pb.getValue());

    return model;
  }

  public static class SetTagSerializer extends JsonSerializer<SetTag> {
    @Override
    public void serialize(SetTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetTagDeserializer extends JsonDeserializer<SetTag> {
    @Override
    public SetTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetTagPb pb = mapper.readValue(p, SetTagPb.class);
      return SetTag.fromPb(pb);
    }
  }
}
