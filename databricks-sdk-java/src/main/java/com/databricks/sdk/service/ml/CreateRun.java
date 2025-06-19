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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateRun.CreateRunSerializer.class)
@JsonDeserialize(using = CreateRun.CreateRunDeserializer.class)
public class CreateRun {
  /** ID of the associated experiment. */
  private String experimentId;

  /** The name of the run. */
  private String runName;

  /** Unix timestamp in milliseconds of when the run started. */
  private Long startTime;

  /** Additional metadata for run. */
  private Collection<RunTag> tags;

  /**
   * ID of the user executing the run. This field is deprecated as of MLflow 1.0, and will be
   * removed in a future MLflow release. Use 'mlflow.user' tag instead.
   */
  private String userId;

  public CreateRun setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public CreateRun setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public CreateRun setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public CreateRun setTags(Collection<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<RunTag> getTags() {
    return tags;
  }

  public CreateRun setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRun that = (CreateRun) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(runName, that.runName)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, runName, startTime, tags, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRun.class)
        .add("experimentId", experimentId)
        .add("runName", runName)
        .add("startTime", startTime)
        .add("tags", tags)
        .add("userId", userId)
        .toString();
  }

  CreateRunPb toPb() {
    CreateRunPb pb = new CreateRunPb();
    pb.setExperimentId(experimentId);
    pb.setRunName(runName);
    pb.setStartTime(startTime);
    pb.setTags(tags);
    pb.setUserId(userId);

    return pb;
  }

  static CreateRun fromPb(CreateRunPb pb) {
    CreateRun model = new CreateRun();
    model.setExperimentId(pb.getExperimentId());
    model.setRunName(pb.getRunName());
    model.setStartTime(pb.getStartTime());
    model.setTags(pb.getTags());
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class CreateRunSerializer extends JsonSerializer<CreateRun> {
    @Override
    public void serialize(CreateRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateRunDeserializer extends JsonDeserializer<CreateRun> {
    @Override
    public CreateRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateRunPb pb = mapper.readValue(p, CreateRunPb.class);
      return CreateRun.fromPb(pb);
    }
  }
}
