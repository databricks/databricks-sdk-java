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
@JsonSerialize(using = TaskNotificationSettings.TaskNotificationSettingsSerializer.class)
@JsonDeserialize(using = TaskNotificationSettings.TaskNotificationSettingsDeserializer.class)
public class TaskNotificationSettings {
  /**
   * If true, do not send notifications to recipients specified in `on_start` for the retried runs
   * and do not send notifications to recipients specified in `on_failure` until the last retry of
   * the run.
   */
  private Boolean alertOnLastAttempt;

  /**
   * If true, do not send notifications to recipients specified in `on_failure` if the run is
   * canceled.
   */
  private Boolean noAlertForCanceledRuns;

  /**
   * If true, do not send notifications to recipients specified in `on_failure` if the run is
   * skipped.
   */
  private Boolean noAlertForSkippedRuns;

  public TaskNotificationSettings setAlertOnLastAttempt(Boolean alertOnLastAttempt) {
    this.alertOnLastAttempt = alertOnLastAttempt;
    return this;
  }

  public Boolean getAlertOnLastAttempt() {
    return alertOnLastAttempt;
  }

  public TaskNotificationSettings setNoAlertForCanceledRuns(Boolean noAlertForCanceledRuns) {
    this.noAlertForCanceledRuns = noAlertForCanceledRuns;
    return this;
  }

  public Boolean getNoAlertForCanceledRuns() {
    return noAlertForCanceledRuns;
  }

  public TaskNotificationSettings setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
    this.noAlertForSkippedRuns = noAlertForSkippedRuns;
    return this;
  }

  public Boolean getNoAlertForSkippedRuns() {
    return noAlertForSkippedRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskNotificationSettings that = (TaskNotificationSettings) o;
    return Objects.equals(alertOnLastAttempt, that.alertOnLastAttempt)
        && Objects.equals(noAlertForCanceledRuns, that.noAlertForCanceledRuns)
        && Objects.equals(noAlertForSkippedRuns, that.noAlertForSkippedRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertOnLastAttempt, noAlertForCanceledRuns, noAlertForSkippedRuns);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskNotificationSettings.class)
        .add("alertOnLastAttempt", alertOnLastAttempt)
        .add("noAlertForCanceledRuns", noAlertForCanceledRuns)
        .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
        .toString();
  }

  TaskNotificationSettingsPb toPb() {
    TaskNotificationSettingsPb pb = new TaskNotificationSettingsPb();
    pb.setAlertOnLastAttempt(alertOnLastAttempt);
    pb.setNoAlertForCanceledRuns(noAlertForCanceledRuns);
    pb.setNoAlertForSkippedRuns(noAlertForSkippedRuns);

    return pb;
  }

  static TaskNotificationSettings fromPb(TaskNotificationSettingsPb pb) {
    TaskNotificationSettings model = new TaskNotificationSettings();
    model.setAlertOnLastAttempt(pb.getAlertOnLastAttempt());
    model.setNoAlertForCanceledRuns(pb.getNoAlertForCanceledRuns());
    model.setNoAlertForSkippedRuns(pb.getNoAlertForSkippedRuns());

    return model;
  }

  public static class TaskNotificationSettingsSerializer
      extends JsonSerializer<TaskNotificationSettings> {
    @Override
    public void serialize(
        TaskNotificationSettings value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TaskNotificationSettingsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TaskNotificationSettingsDeserializer
      extends JsonDeserializer<TaskNotificationSettings> {
    @Override
    public TaskNotificationSettings deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TaskNotificationSettingsPb pb = mapper.readValue(p, TaskNotificationSettingsPb.class);
      return TaskNotificationSettings.fromPb(pb);
    }
  }
}
