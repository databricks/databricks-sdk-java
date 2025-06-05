// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(
    using =
        ClusterAutoRestartMessageMaintenanceWindowWindowStartTime
            .ClusterAutoRestartMessageMaintenanceWindowWindowStartTimeSerializer.class)
@JsonDeserialize(
    using =
        ClusterAutoRestartMessageMaintenanceWindowWindowStartTime
            .ClusterAutoRestartMessageMaintenanceWindowWindowStartTimeDeserializer.class)
public class ClusterAutoRestartMessageMaintenanceWindowWindowStartTime {
  /** */
  private Long hours;

  /** */
  private Long minutes;

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTime setHours(Long hours) {
    this.hours = hours;
    return this;
  }

  public Long getHours() {
    return hours;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTime setMinutes(Long minutes) {
    this.minutes = minutes;
    return this;
  }

  public Long getMinutes() {
    return minutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageMaintenanceWindowWindowStartTime that =
        (ClusterAutoRestartMessageMaintenanceWindowWindowStartTime) o;
    return Objects.equals(hours, that.hours) && Objects.equals(minutes, that.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, minutes);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageMaintenanceWindowWindowStartTime.class)
        .add("hours", hours)
        .add("minutes", minutes)
        .toString();
  }

  ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb toPb() {
    ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb pb =
        new ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb();
    pb.setHours(hours);
    pb.setMinutes(minutes);

    return pb;
  }

  static ClusterAutoRestartMessageMaintenanceWindowWindowStartTime fromPb(
      ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb pb) {
    ClusterAutoRestartMessageMaintenanceWindowWindowStartTime model =
        new ClusterAutoRestartMessageMaintenanceWindowWindowStartTime();
    model.setHours(pb.getHours());
    model.setMinutes(pb.getMinutes());

    return model;
  }

  public static class ClusterAutoRestartMessageMaintenanceWindowWindowStartTimeSerializer
      extends JsonSerializer<ClusterAutoRestartMessageMaintenanceWindowWindowStartTime> {
    @Override
    public void serialize(
        ClusterAutoRestartMessageMaintenanceWindowWindowStartTime value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterAutoRestartMessageMaintenanceWindowWindowStartTimeDeserializer
      extends JsonDeserializer<ClusterAutoRestartMessageMaintenanceWindowWindowStartTime> {
    @Override
    public ClusterAutoRestartMessageMaintenanceWindowWindowStartTime deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb pb =
          mapper.readValue(p, ClusterAutoRestartMessageMaintenanceWindowWindowStartTimePb.class);
      return ClusterAutoRestartMessageMaintenanceWindowWindowStartTime.fromPb(pb);
    }
  }
}
