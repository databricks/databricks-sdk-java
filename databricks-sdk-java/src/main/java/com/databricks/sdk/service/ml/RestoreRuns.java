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
@JsonSerialize(using = RestoreRuns.RestoreRunsSerializer.class)
@JsonDeserialize(using = RestoreRuns.RestoreRunsDeserializer.class)
public class RestoreRuns {
  /** The ID of the experiment containing the runs to restore. */
  private String experimentId;

  /**
   * An optional positive integer indicating the maximum number of runs to restore. The maximum
   * allowed value for max_runs is 10000.
   */
  private Long maxRuns;

  /**
   * The minimum deletion timestamp in milliseconds since the UNIX epoch for restoring runs. Only
   * runs deleted no earlier than this timestamp are restored.
   */
  private Long minTimestampMillis;

  public RestoreRuns setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public RestoreRuns setMaxRuns(Long maxRuns) {
    this.maxRuns = maxRuns;
    return this;
  }

  public Long getMaxRuns() {
    return maxRuns;
  }

  public RestoreRuns setMinTimestampMillis(Long minTimestampMillis) {
    this.minTimestampMillis = minTimestampMillis;
    return this;
  }

  public Long getMinTimestampMillis() {
    return minTimestampMillis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestoreRuns that = (RestoreRuns) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(maxRuns, that.maxRuns)
        && Objects.equals(minTimestampMillis, that.minTimestampMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, maxRuns, minTimestampMillis);
  }

  @Override
  public String toString() {
    return new ToStringer(RestoreRuns.class)
        .add("experimentId", experimentId)
        .add("maxRuns", maxRuns)
        .add("minTimestampMillis", minTimestampMillis)
        .toString();
  }

  RestoreRunsPb toPb() {
    RestoreRunsPb pb = new RestoreRunsPb();
    pb.setExperimentId(experimentId);
    pb.setMaxRuns(maxRuns);
    pb.setMinTimestampMillis(minTimestampMillis);

    return pb;
  }

  static RestoreRuns fromPb(RestoreRunsPb pb) {
    RestoreRuns model = new RestoreRuns();
    model.setExperimentId(pb.getExperimentId());
    model.setMaxRuns(pb.getMaxRuns());
    model.setMinTimestampMillis(pb.getMinTimestampMillis());

    return model;
  }

  public static class RestoreRunsSerializer extends JsonSerializer<RestoreRuns> {
    @Override
    public void serialize(RestoreRuns value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestoreRunsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestoreRunsDeserializer extends JsonDeserializer<RestoreRuns> {
    @Override
    public RestoreRuns deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestoreRunsPb pb = mapper.readValue(p, RestoreRunsPb.class);
      return RestoreRuns.fromPb(pb);
    }
  }
}
