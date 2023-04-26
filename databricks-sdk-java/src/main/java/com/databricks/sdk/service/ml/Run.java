// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Run class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Run {
  /** Run data. */
  @JsonProperty("data")
  private RunData data;

  /** Run metadata. */
  @JsonProperty("info")
  private RunInfo info;

  /**
   * <p>Setter for the field <code>data</code>.</p>
   *
   * @param data a {@link com.databricks.sdk.service.ml.RunData} object
   * @return a {@link com.databricks.sdk.service.ml.Run} object
   */
  public Run setData(RunData data) {
    this.data = data;
    return this;
  }

  /**
   * <p>Getter for the field <code>data</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.RunData} object
   */
  public RunData getData() {
    return data;
  }

  /**
   * <p>Setter for the field <code>info</code>.</p>
   *
   * @param info a {@link com.databricks.sdk.service.ml.RunInfo} object
   * @return a {@link com.databricks.sdk.service.ml.Run} object
   */
  public Run setInfo(RunInfo info) {
    this.info = info;
    return this;
  }

  /**
   * <p>Getter for the field <code>info</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo getInfo() {
    return info;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Run that = (Run) o;
    return Objects.equals(data, that.data) && Objects.equals(info, that.info);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(data, info);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Run.class).add("data", data).add("info", info).toString();
  }
}
