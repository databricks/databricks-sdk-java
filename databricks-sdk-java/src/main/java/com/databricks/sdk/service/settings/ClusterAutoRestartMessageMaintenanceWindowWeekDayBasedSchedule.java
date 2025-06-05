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
        ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule
            .ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedScheduleSerializer.class)
@JsonDeserialize(
    using =
        ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule
            .ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedScheduleDeserializer.class)
public class ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule {
  /** */
  private ClusterAutoRestartMessageMaintenanceWindowDayOfWeek dayOfWeek;

  /** */
  private ClusterAutoRestartMessageMaintenanceWindowWeekDayFrequency frequency;

  /** */
  private ClusterAutoRestartMessageMaintenanceWindowWindowStartTime windowStartTime;

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule setDayOfWeek(
      ClusterAutoRestartMessageMaintenanceWindowDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule setFrequency(
      ClusterAutoRestartMessageMaintenanceWindowWeekDayFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayFrequency getFrequency() {
    return frequency;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule setWindowStartTime(
      ClusterAutoRestartMessageMaintenanceWindowWindowStartTime windowStartTime) {
    this.windowStartTime = windowStartTime;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTime getWindowStartTime() {
    return windowStartTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule that =
        (ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule) o;
    return Objects.equals(dayOfWeek, that.dayOfWeek)
        && Objects.equals(frequency, that.frequency)
        && Objects.equals(windowStartTime, that.windowStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, frequency, windowStartTime);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule.class)
        .add("dayOfWeek", dayOfWeek)
        .add("frequency", frequency)
        .add("windowStartTime", windowStartTime)
        .toString();
  }

  ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb toPb() {
    ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb pb =
        new ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb();
    pb.setDayOfWeek(dayOfWeek);
    pb.setFrequency(frequency);
    pb.setWindowStartTime(windowStartTime);

    return pb;
  }

  static ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule fromPb(
      ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb pb) {
    ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule model =
        new ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule();
    model.setDayOfWeek(pb.getDayOfWeek());
    model.setFrequency(pb.getFrequency());
    model.setWindowStartTime(pb.getWindowStartTime());

    return model;
  }

  public static class ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedScheduleSerializer
      extends JsonSerializer<ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule> {
    @Override
    public void serialize(
        ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedScheduleDeserializer
      extends JsonDeserializer<ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule> {
    @Override
    public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb pb =
          mapper.readValue(
              p, ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb.class);
      return ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule.fromPb(pb);
    }
  }
}
