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
@JsonSerialize(using = CancelAllRuns.CancelAllRunsSerializer.class)
@JsonDeserialize(using = CancelAllRuns.CancelAllRunsDeserializer.class)
public class CancelAllRuns {
  /**
   * Optional boolean parameter to cancel all queued runs. If no job_id is provided, all queued runs
   * in the workspace are canceled.
   */
  private Boolean allQueuedRuns;

  /** The canonical identifier of the job to cancel all runs of. */
  private Long jobId;

  public CancelAllRuns setAllQueuedRuns(Boolean allQueuedRuns) {
    this.allQueuedRuns = allQueuedRuns;
    return this;
  }

  public Boolean getAllQueuedRuns() {
    return allQueuedRuns;
  }

  public CancelAllRuns setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelAllRuns that = (CancelAllRuns) o;
    return Objects.equals(allQueuedRuns, that.allQueuedRuns) && Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allQueuedRuns, jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelAllRuns.class)
        .add("allQueuedRuns", allQueuedRuns)
        .add("jobId", jobId)
        .toString();
  }

  CancelAllRunsPb toPb() {
    CancelAllRunsPb pb = new CancelAllRunsPb();
    pb.setAllQueuedRuns(allQueuedRuns);
    pb.setJobId(jobId);

    return pb;
  }

  static CancelAllRuns fromPb(CancelAllRunsPb pb) {
    CancelAllRuns model = new CancelAllRuns();
    model.setAllQueuedRuns(pb.getAllQueuedRuns());
    model.setJobId(pb.getJobId());

    return model;
  }

  public static class CancelAllRunsSerializer extends JsonSerializer<CancelAllRuns> {
    @Override
    public void serialize(CancelAllRuns value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelAllRunsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelAllRunsDeserializer extends JsonDeserializer<CancelAllRuns> {
    @Override
    public CancelAllRuns deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelAllRunsPb pb = mapper.readValue(p, CancelAllRunsPb.class);
      return CancelAllRuns.fromPb(pb);
    }
  }
}
