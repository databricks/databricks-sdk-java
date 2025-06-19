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
@JsonSerialize(using = RestoreRun.RestoreRunSerializer.class)
@JsonDeserialize(using = RestoreRun.RestoreRunDeserializer.class)
public class RestoreRun {
  /** ID of the run to restore. */
  private String runId;

  public RestoreRun setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestoreRun that = (RestoreRun) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(RestoreRun.class).add("runId", runId).toString();
  }

  RestoreRunPb toPb() {
    RestoreRunPb pb = new RestoreRunPb();
    pb.setRunId(runId);

    return pb;
  }

  static RestoreRun fromPb(RestoreRunPb pb) {
    RestoreRun model = new RestoreRun();
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class RestoreRunSerializer extends JsonSerializer<RestoreRun> {
    @Override
    public void serialize(RestoreRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestoreRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestoreRunDeserializer extends JsonDeserializer<RestoreRun> {
    @Override
    public RestoreRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestoreRunPb pb = mapper.readValue(p, RestoreRunPb.class);
      return RestoreRun.fromPb(pb);
    }
  }
}
