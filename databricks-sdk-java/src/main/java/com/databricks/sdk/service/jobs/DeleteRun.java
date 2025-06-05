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
@JsonSerialize(using = DeleteRun.DeleteRunSerializer.class)
@JsonDeserialize(using = DeleteRun.DeleteRunDeserializer.class)
public class DeleteRun {
  /** ID of the run to delete. */
  private Long runId;

  public DeleteRun setRunId(Long runId) {
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
    DeleteRun that = (DeleteRun) o;
    return Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRun.class).add("runId", runId).toString();
  }

  DeleteRunPb toPb() {
    DeleteRunPb pb = new DeleteRunPb();
    pb.setRunId(runId);

    return pb;
  }

  static DeleteRun fromPb(DeleteRunPb pb) {
    DeleteRun model = new DeleteRun();
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class DeleteRunSerializer extends JsonSerializer<DeleteRun> {
    @Override
    public void serialize(DeleteRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRunDeserializer extends JsonDeserializer<DeleteRun> {
    @Override
    public DeleteRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRunPb pb = mapper.readValue(p, DeleteRunPb.class);
      return DeleteRun.fromPb(pb);
    }
  }
}
