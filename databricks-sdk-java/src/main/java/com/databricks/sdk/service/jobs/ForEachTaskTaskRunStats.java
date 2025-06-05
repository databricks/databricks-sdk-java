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
@JsonSerialize(using = ForEachTaskTaskRunStats.ForEachTaskTaskRunStatsSerializer.class)
@JsonDeserialize(using = ForEachTaskTaskRunStats.ForEachTaskTaskRunStatsDeserializer.class)
public class ForEachTaskTaskRunStats {
  /** Describes the iteration runs having an active lifecycle state or an active run sub state. */
  private Long activeIterations;

  /** Describes the number of failed and succeeded iteration runs. */
  private Long completedIterations;

  /** Describes the number of failed iteration runs. */
  private Long failedIterations;

  /** Describes the number of iteration runs that have been scheduled. */
  private Long scheduledIterations;

  /** Describes the number of succeeded iteration runs. */
  private Long succeededIterations;

  /** Describes the length of the list of items to iterate over. */
  private Long totalIterations;

  public ForEachTaskTaskRunStats setActiveIterations(Long activeIterations) {
    this.activeIterations = activeIterations;
    return this;
  }

  public Long getActiveIterations() {
    return activeIterations;
  }

  public ForEachTaskTaskRunStats setCompletedIterations(Long completedIterations) {
    this.completedIterations = completedIterations;
    return this;
  }

  public Long getCompletedIterations() {
    return completedIterations;
  }

  public ForEachTaskTaskRunStats setFailedIterations(Long failedIterations) {
    this.failedIterations = failedIterations;
    return this;
  }

  public Long getFailedIterations() {
    return failedIterations;
  }

  public ForEachTaskTaskRunStats setScheduledIterations(Long scheduledIterations) {
    this.scheduledIterations = scheduledIterations;
    return this;
  }

  public Long getScheduledIterations() {
    return scheduledIterations;
  }

  public ForEachTaskTaskRunStats setSucceededIterations(Long succeededIterations) {
    this.succeededIterations = succeededIterations;
    return this;
  }

  public Long getSucceededIterations() {
    return succeededIterations;
  }

  public ForEachTaskTaskRunStats setTotalIterations(Long totalIterations) {
    this.totalIterations = totalIterations;
    return this;
  }

  public Long getTotalIterations() {
    return totalIterations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForEachTaskTaskRunStats that = (ForEachTaskTaskRunStats) o;
    return Objects.equals(activeIterations, that.activeIterations)
        && Objects.equals(completedIterations, that.completedIterations)
        && Objects.equals(failedIterations, that.failedIterations)
        && Objects.equals(scheduledIterations, that.scheduledIterations)
        && Objects.equals(succeededIterations, that.succeededIterations)
        && Objects.equals(totalIterations, that.totalIterations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeIterations,
        completedIterations,
        failedIterations,
        scheduledIterations,
        succeededIterations,
        totalIterations);
  }

  @Override
  public String toString() {
    return new ToStringer(ForEachTaskTaskRunStats.class)
        .add("activeIterations", activeIterations)
        .add("completedIterations", completedIterations)
        .add("failedIterations", failedIterations)
        .add("scheduledIterations", scheduledIterations)
        .add("succeededIterations", succeededIterations)
        .add("totalIterations", totalIterations)
        .toString();
  }

  ForEachTaskTaskRunStatsPb toPb() {
    ForEachTaskTaskRunStatsPb pb = new ForEachTaskTaskRunStatsPb();
    pb.setActiveIterations(activeIterations);
    pb.setCompletedIterations(completedIterations);
    pb.setFailedIterations(failedIterations);
    pb.setScheduledIterations(scheduledIterations);
    pb.setSucceededIterations(succeededIterations);
    pb.setTotalIterations(totalIterations);

    return pb;
  }

  static ForEachTaskTaskRunStats fromPb(ForEachTaskTaskRunStatsPb pb) {
    ForEachTaskTaskRunStats model = new ForEachTaskTaskRunStats();
    model.setActiveIterations(pb.getActiveIterations());
    model.setCompletedIterations(pb.getCompletedIterations());
    model.setFailedIterations(pb.getFailedIterations());
    model.setScheduledIterations(pb.getScheduledIterations());
    model.setSucceededIterations(pb.getSucceededIterations());
    model.setTotalIterations(pb.getTotalIterations());

    return model;
  }

  public static class ForEachTaskTaskRunStatsSerializer
      extends JsonSerializer<ForEachTaskTaskRunStats> {
    @Override
    public void serialize(
        ForEachTaskTaskRunStats value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ForEachTaskTaskRunStatsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ForEachTaskTaskRunStatsDeserializer
      extends JsonDeserializer<ForEachTaskTaskRunStats> {
    @Override
    public ForEachTaskTaskRunStats deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ForEachTaskTaskRunStatsPb pb = mapper.readValue(p, ForEachTaskTaskRunStatsPb.class);
      return ForEachTaskTaskRunStats.fromPb(pb);
    }
  }
}
