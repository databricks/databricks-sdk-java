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

@Generated
@JsonSerialize(using = CancelRun.CancelRunSerializer.class)
@JsonDeserialize(using = CancelRun.CancelRunDeserializer.class)
public class CancelRun {
  /** This field is required. */
  private Long runId;

  public CancelRun setRunId(Long runId) {
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
    CancelRun that = (CancelRun) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelRun.class).add("runId", runId).toString();
  }

  CancelRunPb toPb() {
    CancelRunPb pb = new CancelRunPb();
    pb.setRunId(runId);

    return pb;
  }

  static CancelRun fromPb(CancelRunPb pb) {
    CancelRun model = new CancelRun();
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class CancelRunSerializer extends JsonSerializer<CancelRun> {
    @Override
    public void serialize(CancelRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelRunDeserializer extends JsonDeserializer<CancelRun> {
    @Override
    public CancelRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelRunPb pb = mapper.readValue(p, CancelRunPb.class);
      return CancelRun.fromPb(pb);
    }
  }
}
