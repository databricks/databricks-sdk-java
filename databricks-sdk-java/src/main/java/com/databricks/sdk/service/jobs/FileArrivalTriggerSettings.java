// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>FileArrivalTriggerSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class FileArrivalTriggerSettings {
  /**
   * If set, the trigger starts a run only after the specified amount of time passed since the last
   * time the trigger fired. The minimum allowed value is 60 seconds
   */
  @JsonProperty("min_time_between_trigger_seconds")
  private Long minTimeBetweenTriggerSeconds;

  /**
   * URL to be monitored for file arrivals. The path must point to the root or a subpath of the
   * external location.
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

  /**
   * <p>Setter for the field <code>minTimeBetweenTriggerSeconds</code>.</p>
   *
   * @param minTimeBetweenTriggerSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.FileArrivalTriggerSettings} object
   */
  public FileArrivalTriggerSettings setMinTimeBetweenTriggerSeconds(
      Long minTimeBetweenTriggerSeconds) {
    this.minTimeBetweenTriggerSeconds = minTimeBetweenTriggerSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>minTimeBetweenTriggerSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMinTimeBetweenTriggerSeconds() {
    return minTimeBetweenTriggerSeconds;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.FileArrivalTriggerSettings} object
   */
  public FileArrivalTriggerSettings setUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * <p>Setter for the field <code>waitAfterLastChangeSeconds</code>.</p>
   *
   * @param waitAfterLastChangeSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.FileArrivalTriggerSettings} object
   */
  public FileArrivalTriggerSettings setWaitAfterLastChangeSeconds(Long waitAfterLastChangeSeconds) {
    this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>waitAfterLastChangeSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getWaitAfterLastChangeSeconds() {
    return waitAfterLastChangeSeconds;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileArrivalTriggerSettings that = (FileArrivalTriggerSettings) o;
    return Objects.equals(minTimeBetweenTriggerSeconds, that.minTimeBetweenTriggerSeconds)
        && Objects.equals(url, that.url)
        && Objects.equals(waitAfterLastChangeSeconds, that.waitAfterLastChangeSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(minTimeBetweenTriggerSeconds, url, waitAfterLastChangeSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(FileArrivalTriggerSettings.class)
        .add("minTimeBetweenTriggerSeconds", minTimeBetweenTriggerSeconds)
        .add("url", url)
        .add("waitAfterLastChangeSeconds", waitAfterLastChangeSeconds)
        .toString();
  }
}
