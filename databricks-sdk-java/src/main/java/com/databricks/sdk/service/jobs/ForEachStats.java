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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ForEachStats.ForEachStatsSerializer.class)
@JsonDeserialize(using = ForEachStats.ForEachStatsDeserializer.class)
public class ForEachStats {
  /** Sample of 3 most common error messages occurred during the iteration. */
  private Collection<ForEachTaskErrorMessageStats> errorMessageStats;

  /** Describes stats of the iteration. Only latest retries are considered. */
  private ForEachTaskTaskRunStats taskRunStats;

  public ForEachStats setErrorMessageStats(
      Collection<ForEachTaskErrorMessageStats> errorMessageStats) {
    this.errorMessageStats = errorMessageStats;
    return this;
  }

  public Collection<ForEachTaskErrorMessageStats> getErrorMessageStats() {
    return errorMessageStats;
  }

  public ForEachStats setTaskRunStats(ForEachTaskTaskRunStats taskRunStats) {
    this.taskRunStats = taskRunStats;
    return this;
  }

  public ForEachTaskTaskRunStats getTaskRunStats() {
    return taskRunStats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForEachStats that = (ForEachStats) o;
    return Objects.equals(errorMessageStats, that.errorMessageStats)
        && Objects.equals(taskRunStats, that.taskRunStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessageStats, taskRunStats);
  }

  @Override
  public String toString() {
    return new ToStringer(ForEachStats.class)
        .add("errorMessageStats", errorMessageStats)
        .add("taskRunStats", taskRunStats)
        .toString();
  }

  ForEachStatsPb toPb() {
    ForEachStatsPb pb = new ForEachStatsPb();
    pb.setErrorMessageStats(errorMessageStats);
    pb.setTaskRunStats(taskRunStats);

    return pb;
  }

  static ForEachStats fromPb(ForEachStatsPb pb) {
    ForEachStats model = new ForEachStats();
    model.setErrorMessageStats(pb.getErrorMessageStats());
    model.setTaskRunStats(pb.getTaskRunStats());

    return model;
  }

  public static class ForEachStatsSerializer extends JsonSerializer<ForEachStats> {
    @Override
    public void serialize(ForEachStats value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ForEachStatsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ForEachStatsDeserializer extends JsonDeserializer<ForEachStats> {
    @Override
    public ForEachStats deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ForEachStatsPb pb = mapper.readValue(p, ForEachStatsPb.class);
      return ForEachStats.fromPb(pb);
    }
  }
}
