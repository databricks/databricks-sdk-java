// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ContextStatusResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ContextStatusResponse {
  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("status")
  private ContextStatus status;

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ContextStatusResponse} object
   */
  public ContextStatusResponse setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.compute.ContextStatus} object
   * @return a {@link com.databricks.sdk.service.compute.ContextStatusResponse} object
   */
  public ContextStatusResponse setStatus(ContextStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ContextStatus} object
   */
  public ContextStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextStatusResponse that = (ContextStatusResponse) o;
    return Objects.equals(id, that.id) && Objects.equals(status, that.status);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ContextStatusResponse.class)
        .add("id", id)
        .add("status", status)
        .toString();
  }
}
