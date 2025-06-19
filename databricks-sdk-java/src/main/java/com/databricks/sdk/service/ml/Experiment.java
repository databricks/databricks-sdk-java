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

/** An experiment and its metadata. */
@Generated
@JsonSerialize(using = Experiment.ExperimentSerializer.class)
@JsonDeserialize(using = Experiment.ExperimentDeserializer.class)
public class Experiment {
  /** Location where artifacts for the experiment are stored. */
  private String artifactLocation;

  /** Creation time */
  private Long creationTime;

  /** Unique identifier for the experiment. */
  private String experimentId;

  /** Last update time */
  private Long lastUpdateTime;

  /**
   * Current life cycle stage of the experiment: "active" or "deleted". Deleted experiments are not
   * returned by APIs.
   */
  private String lifecycleStage;

  /** Human readable name that identifies the experiment. */
  private String name;

  /** Tags: Additional metadata key-value pairs. */
  private Collection<ExperimentTag> tags;

  public Experiment setArtifactLocation(String artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

  public String getArtifactLocation() {
    return artifactLocation;
  }

  public Experiment setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public Experiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public Experiment setLastUpdateTime(Long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  public Long getLastUpdateTime() {
    return lastUpdateTime;
  }

  public Experiment setLifecycleStage(String lifecycleStage) {
    this.lifecycleStage = lifecycleStage;
    return this;
  }

  public String getLifecycleStage() {
    return lifecycleStage;
  }

  public Experiment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Experiment setTags(Collection<ExperimentTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ExperimentTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Experiment that = (Experiment) o;
    return Objects.equals(artifactLocation, that.artifactLocation)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(experimentId, that.experimentId)
        && Objects.equals(lastUpdateTime, that.lastUpdateTime)
        && Objects.equals(lifecycleStage, that.lifecycleStage)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        artifactLocation, creationTime, experimentId, lastUpdateTime, lifecycleStage, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(Experiment.class)
        .add("artifactLocation", artifactLocation)
        .add("creationTime", creationTime)
        .add("experimentId", experimentId)
        .add("lastUpdateTime", lastUpdateTime)
        .add("lifecycleStage", lifecycleStage)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }

  ExperimentPb toPb() {
    ExperimentPb pb = new ExperimentPb();
    pb.setArtifactLocation(artifactLocation);
    pb.setCreationTime(creationTime);
    pb.setExperimentId(experimentId);
    pb.setLastUpdateTime(lastUpdateTime);
    pb.setLifecycleStage(lifecycleStage);
    pb.setName(name);
    pb.setTags(tags);

    return pb;
  }

  static Experiment fromPb(ExperimentPb pb) {
    Experiment model = new Experiment();
    model.setArtifactLocation(pb.getArtifactLocation());
    model.setCreationTime(pb.getCreationTime());
    model.setExperimentId(pb.getExperimentId());
    model.setLastUpdateTime(pb.getLastUpdateTime());
    model.setLifecycleStage(pb.getLifecycleStage());
    model.setName(pb.getName());
    model.setTags(pb.getTags());

    return model;
  }

  public static class ExperimentSerializer extends JsonSerializer<Experiment> {
    @Override
    public void serialize(Experiment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExperimentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExperimentDeserializer extends JsonDeserializer<Experiment> {
    @Override
    public Experiment deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExperimentPb pb = mapper.readValue(p, ExperimentPb.class);
      return Experiment.fromPb(pb);
    }
  }
}
