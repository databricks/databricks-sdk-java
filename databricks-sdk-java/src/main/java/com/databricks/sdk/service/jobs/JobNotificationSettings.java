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
@JsonSerialize(using = JobNotificationSettings.JobNotificationSettingsSerializer.class)
@JsonDeserialize(using = JobNotificationSettings.JobNotificationSettingsDeserializer.class)
public class JobNotificationSettings {
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

  public JobNotificationSettings setNoAlertForCanceledRuns(Boolean noAlertForCanceledRuns) {
    this.noAlertForCanceledRuns = noAlertForCanceledRuns;
    return this;
  }

  public Boolean getNoAlertForCanceledRuns() {
    return noAlertForCanceledRuns;
  }

  public JobNotificationSettings setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
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
    JobNotificationSettings that = (JobNotificationSettings) o;
    return Objects.equals(noAlertForCanceledRuns, that.noAlertForCanceledRuns)
        && Objects.equals(noAlertForSkippedRuns, that.noAlertForSkippedRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noAlertForCanceledRuns, noAlertForSkippedRuns);
  }

  @Override
  public String toString() {
    return new ToStringer(JobNotificationSettings.class)
        .add("noAlertForCanceledRuns", noAlertForCanceledRuns)
        .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
        .toString();
  }

  JobNotificationSettingsPb toPb() {
    JobNotificationSettingsPb pb = new JobNotificationSettingsPb();
    pb.setNoAlertForCanceledRuns(noAlertForCanceledRuns);
    pb.setNoAlertForSkippedRuns(noAlertForSkippedRuns);

    return pb;
  }

  static JobNotificationSettings fromPb(JobNotificationSettingsPb pb) {
    JobNotificationSettings model = new JobNotificationSettings();
    model.setNoAlertForCanceledRuns(pb.getNoAlertForCanceledRuns());
    model.setNoAlertForSkippedRuns(pb.getNoAlertForSkippedRuns());

    return model;
  }

  public static class JobNotificationSettingsSerializer
      extends JsonSerializer<JobNotificationSettings> {
    @Override
    public void serialize(
        JobNotificationSettings value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobNotificationSettingsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobNotificationSettingsDeserializer
      extends JsonDeserializer<JobNotificationSettings> {
    @Override
    public JobNotificationSettings deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobNotificationSettingsPb pb = mapper.readValue(p, JobNotificationSettingsPb.class);
      return JobNotificationSettings.fromPb(pb);
    }
  }
}
