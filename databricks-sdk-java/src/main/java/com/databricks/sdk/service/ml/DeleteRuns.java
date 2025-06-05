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
@JsonSerialize(using = DeleteRuns.DeleteRunsSerializer.class)
@JsonDeserialize(using = DeleteRuns.DeleteRunsDeserializer.class)
public class DeleteRuns {
  /** The ID of the experiment containing the runs to delete. */
  private String experimentId;

  /**
   * An optional positive integer indicating the maximum number of runs to delete. The maximum
   * allowed value for max_runs is 10000.
   */
  private Long maxRuns;

  /**
   * The maximum creation timestamp in milliseconds since the UNIX epoch for deleting runs. Only
   * runs created prior to or at this timestamp are deleted.
   */
  private Long maxTimestampMillis;

  public DeleteRuns setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public DeleteRuns setMaxRuns(Long maxRuns) {
    this.maxRuns = maxRuns;
    return this;
  }

  public Long getMaxRuns() {
    return maxRuns;
  }

  public DeleteRuns setMaxTimestampMillis(Long maxTimestampMillis) {
    this.maxTimestampMillis = maxTimestampMillis;
    return this;
  }

  public Long getMaxTimestampMillis() {
    return maxTimestampMillis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRuns that = (DeleteRuns) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(maxRuns, that.maxRuns)
        && Objects.equals(maxTimestampMillis, that.maxTimestampMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, maxRuns, maxTimestampMillis);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRuns.class)
        .add("experimentId", experimentId)
        .add("maxRuns", maxRuns)
        .add("maxTimestampMillis", maxTimestampMillis)
        .toString();
  }

  DeleteRunsPb toPb() {
    DeleteRunsPb pb = new DeleteRunsPb();
    pb.setExperimentId(experimentId);
    pb.setMaxRuns(maxRuns);
    pb.setMaxTimestampMillis(maxTimestampMillis);

    return pb;
  }

  static DeleteRuns fromPb(DeleteRunsPb pb) {
    DeleteRuns model = new DeleteRuns();
    model.setExperimentId(pb.getExperimentId());
    model.setMaxRuns(pb.getMaxRuns());
    model.setMaxTimestampMillis(pb.getMaxTimestampMillis());

    return model;
  }

  public static class DeleteRunsSerializer extends JsonSerializer<DeleteRuns> {
    @Override
    public void serialize(DeleteRuns value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRunsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRunsDeserializer extends JsonDeserializer<DeleteRuns> {
    @Override
    public DeleteRuns deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRunsPb pb = mapper.readValue(p, DeleteRunsPb.class);
      return DeleteRuns.fromPb(pb);
    }
  }
}
