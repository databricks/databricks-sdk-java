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
        ClusterAutoRestartMessageMaintenanceWindow
            .ClusterAutoRestartMessageMaintenanceWindowSerializer.class)
@JsonDeserialize(
    using =
        ClusterAutoRestartMessageMaintenanceWindow
            .ClusterAutoRestartMessageMaintenanceWindowDeserializer.class)
public class ClusterAutoRestartMessageMaintenanceWindow {
  /** */
  private ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule weekDayBasedSchedule;

  public ClusterAutoRestartMessageMaintenanceWindow setWeekDayBasedSchedule(
      ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule weekDayBasedSchedule) {
    this.weekDayBasedSchedule = weekDayBasedSchedule;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule getWeekDayBasedSchedule() {
    return weekDayBasedSchedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageMaintenanceWindow that =
        (ClusterAutoRestartMessageMaintenanceWindow) o;
    return Objects.equals(weekDayBasedSchedule, that.weekDayBasedSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDayBasedSchedule);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageMaintenanceWindow.class)
        .add("weekDayBasedSchedule", weekDayBasedSchedule)
        .toString();
  }

  ClusterAutoRestartMessageMaintenanceWindowPb toPb() {
    ClusterAutoRestartMessageMaintenanceWindowPb pb =
        new ClusterAutoRestartMessageMaintenanceWindowPb();
    pb.setWeekDayBasedSchedule(weekDayBasedSchedule);

    return pb;
  }

  static ClusterAutoRestartMessageMaintenanceWindow fromPb(
      ClusterAutoRestartMessageMaintenanceWindowPb pb) {
    ClusterAutoRestartMessageMaintenanceWindow model =
        new ClusterAutoRestartMessageMaintenanceWindow();
    model.setWeekDayBasedSchedule(pb.getWeekDayBasedSchedule());

    return model;
  }

  public static class ClusterAutoRestartMessageMaintenanceWindowSerializer
      extends JsonSerializer<ClusterAutoRestartMessageMaintenanceWindow> {
    @Override
    public void serialize(
        ClusterAutoRestartMessageMaintenanceWindow value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ClusterAutoRestartMessageMaintenanceWindowPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterAutoRestartMessageMaintenanceWindowDeserializer
      extends JsonDeserializer<ClusterAutoRestartMessageMaintenanceWindow> {
    @Override
    public ClusterAutoRestartMessageMaintenanceWindow deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterAutoRestartMessageMaintenanceWindowPb pb =
          mapper.readValue(p, ClusterAutoRestartMessageMaintenanceWindowPb.class);
      return ClusterAutoRestartMessageMaintenanceWindow.fromPb(pb);
    }
  }
}
