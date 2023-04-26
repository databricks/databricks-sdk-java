// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SetExperimentTag class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SetExperimentTag {
  /** ID of the experiment under which to log the tag. Must be provided. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /**
   * Name of the tag. Maximum size depends on storage backend. All storage backends are guaranteed
   * to support key values up to 250 bytes in size.
   */
  @JsonProperty("key")
  private String key;

  /**
   * String value of the tag being logged. Maximum size depends on storage backend. All storage
   * backends are guaranteed to support key values up to 5000 bytes in size.
   */
  @JsonProperty("value")
  private String value;

  /**
   * <p>Setter for the field <code>experimentId</code>.</p>
   *
   * @param experimentId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SetExperimentTag} object
   */
  public SetExperimentTag setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * <p>Getter for the field <code>experimentId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExperimentId() {
    return experimentId;
  }

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SetExperimentTag} object
   */
  public SetExperimentTag setKey(String key) {
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
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SetExperimentTag} object
   */
  public SetExperimentTag setValue(String value) {
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
    SetExperimentTag that = (SetExperimentTag) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(key, that.key)
        && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(experimentId, key, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SetExperimentTag.class)
        .add("experimentId", experimentId)
        .add("key", key)
        .add("value", value)
        .toString();
  }
}
