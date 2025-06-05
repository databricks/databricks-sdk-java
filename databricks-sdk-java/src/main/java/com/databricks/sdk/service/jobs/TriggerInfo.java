// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

/** Additional details about what triggered the run */
@Generated
@JsonSerialize(using = TriggerInfo.TriggerInfoSerializer.class)
@JsonDeserialize(using = TriggerInfo.TriggerInfoDeserializer.class)
public class TriggerInfo {
  /** The run id of the Run Job task run */
  private Long runId;

  public TriggerInfo setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerInfo that = (TriggerInfo) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerInfo.class).add("runId", runId).toString();
  }

  TriggerInfoPb toPb() {
    TriggerInfoPb pb = new TriggerInfoPb();
    pb.setRunId(runId);

    return pb;
  }

  static TriggerInfo fromPb(TriggerInfoPb pb) {
    TriggerInfo model = new TriggerInfo();
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class TriggerInfoSerializer extends JsonSerializer<TriggerInfo> {
    @Override
    public void serialize(TriggerInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TriggerInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TriggerInfoDeserializer extends JsonDeserializer<TriggerInfo> {
    @Override
    public TriggerInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TriggerInfoPb pb = mapper.readValue(p, TriggerInfoPb.class);
      return TriggerInfo.fromPb(pb);
    }
  }
}
