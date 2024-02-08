// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FileArrivalTriggerConfiguration {
  /**
   * If set, the trigger starts a run only after the specified amount of time passed since the last
   * time the trigger fired. The minimum allowed value is 60 seconds
   */
  @JsonProperty("min_time_between_triggers_seconds")
  private Long minTimeBetweenTriggersSeconds;

  /**
   * The storage location to monitor for file arrivals. The value must point to the root or a
   * subpath of an external location URL or the root or subpath of a Unity Catalog volume.
   */
  @JsonProperty("url")
  private String url;

  /**
   * If set, the trigger starts a run only after no file activity has occurred for the specified
   * amount of time. This makes it possible to wait for a batch of incoming files to arrive before
   * triggering a run. The minimum allowed value is 60 seconds.
   */
  @JsonProperty("wait_after_last_change_seconds")
  private Long waitAfterLastChangeSeconds;

  public FileArrivalTriggerConfiguration setMinTimeBetweenTriggersSeconds(
      Long minTimeBetweenTriggersSeconds) {
    this.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
    return this;
  }

  public Long getMinTimeBetweenTriggersSeconds() {
    return minTimeBetweenTriggersSeconds;
  }

  public FileArrivalTriggerConfiguration setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public FileArrivalTriggerConfiguration setWaitAfterLastChangeSeconds(
      Long waitAfterLastChangeSeconds) {
    this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
    return this;
  }

  public Long getWaitAfterLastChangeSeconds() {
    return waitAfterLastChangeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileArrivalTriggerConfiguration that = (FileArrivalTriggerConfiguration) o;
    return Objects.equals(minTimeBetweenTriggersSeconds, that.minTimeBetweenTriggersSeconds)
        && Objects.equals(url, that.url)
        && Objects.equals(waitAfterLastChangeSeconds, that.waitAfterLastChangeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minTimeBetweenTriggersSeconds, url, waitAfterLastChangeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(FileArrivalTriggerConfiguration.class)
        .add("minTimeBetweenTriggersSeconds", minTimeBetweenTriggersSeconds)
        .add("url", url)
        .add("waitAfterLastChangeSeconds", waitAfterLastChangeSeconds)
        .toString();
  }
}
