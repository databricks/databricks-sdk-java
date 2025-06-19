// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = RestartWindow.RestartWindowSerializer.class)
@JsonDeserialize(using = RestartWindow.RestartWindowDeserializer.class)
public class RestartWindow {
  /**
   * Days of week in which the restart is allowed to happen (within a five-hour window starting at
   * start_hour). If not specified all days of the week will be used.
   */
  private Collection<DayOfWeek> daysOfWeek;

  /**
   * An integer between 0 and 23 denoting the start hour for the restart window in the 24-hour day.
   * Continuous pipeline restart is triggered only within a five-hour window starting at this hour.
   */
  private Long startHour;

  /**
   * Time zone id of restart window. See
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-aux-conf-mgmt-set-timezone.html
   * for details. If not specified, UTC will be used.
   */
  private String timeZoneId;

  public RestartWindow setDaysOfWeek(Collection<DayOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Collection<DayOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  public RestartWindow setStartHour(Long startHour) {
    this.startHour = startHour;
    return this;
  }

  public Long getStartHour() {
    return startHour;
  }

  public RestartWindow setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

  public String getTimeZoneId() {
    return timeZoneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestartWindow that = (RestartWindow) o;
    return Objects.equals(daysOfWeek, that.daysOfWeek)
        && Objects.equals(startHour, that.startHour)
        && Objects.equals(timeZoneId, that.timeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, startHour, timeZoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(RestartWindow.class)
        .add("daysOfWeek", daysOfWeek)
        .add("startHour", startHour)
        .add("timeZoneId", timeZoneId)
        .toString();
  }

  RestartWindowPb toPb() {
    RestartWindowPb pb = new RestartWindowPb();
    pb.setDaysOfWeek(daysOfWeek);
    pb.setStartHour(startHour);
    pb.setTimeZoneId(timeZoneId);

    return pb;
  }

  static RestartWindow fromPb(RestartWindowPb pb) {
    RestartWindow model = new RestartWindow();
    model.setDaysOfWeek(pb.getDaysOfWeek());
    model.setStartHour(pb.getStartHour());
    model.setTimeZoneId(pb.getTimeZoneId());

    return model;
  }

  public static class RestartWindowSerializer extends JsonSerializer<RestartWindow> {
    @Override
    public void serialize(RestartWindow value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestartWindowPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestartWindowDeserializer extends JsonDeserializer<RestartWindow> {
    @Override
    public RestartWindow deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestartWindowPb pb = mapper.readValue(p, RestartWindowPb.class);
      return RestartWindow.fromPb(pb);
    }
  }
}
