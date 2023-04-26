// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>LogParam class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class LogParam {
  /** Name of the param. Maximum size is 255 bytes. */
  @JsonProperty("key")
  private String key;

  /** ID of the run under which to log the param. Must be provided. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] ID of the run under which to log the param. This field will be
   * removed in a future MLflow version.
   */
  @JsonProperty("run_uuid")
  private String runUuid;

  /** String value of the param being logged. Maximum size is 500 bytes. */
  @JsonProperty("value")
  private String value;

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogParam} object
   */
  public LogParam setKey(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Getter for the field <code>key</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogParam} object
   */
  public LogParam setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>runUuid</code>.</p>
   *
   * @param runUuid a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogParam} object
   */
  public LogParam setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  /**
   * <p>Getter for the field <code>runUuid</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunUuid() {
    return runUuid;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.LogParam} object
   */
  public LogParam setValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogParam that = (LogParam) o;
    return Objects.equals(key, that.key)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, runId, runUuid, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LogParam.class)
        .add("key", key)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("value", value)
        .toString();
  }
}
