// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Retrieve the most recent log lines associated with a given serving endpoint's served model
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class LogsRequest {
  /** The name of the serving endpoint that the served model belongs to. This field is required. */
  private String name;

  /** The name of the served model that logs will be retrieved for. This field is required. */
  private String servedModelName;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.LogsRequest} object
   */
  public LogsRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>servedModelName</code>.</p>
   *
   * @param servedModelName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.LogsRequest} object
   */
  public LogsRequest setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  /**
   * <p>Getter for the field <code>servedModelName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getServedModelName() {
    return servedModelName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogsRequest that = (LogsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(servedModelName, that.servedModelName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, servedModelName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LogsRequest.class)
        .add("name", name)
        .add("servedModelName", servedModelName)
        .toString();
  }
}
