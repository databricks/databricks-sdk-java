// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>StartUpdateResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class StartUpdateResponse {
  /** */
  @JsonProperty("update_id")
  private String updateId;

  /**
   * <p>Setter for the field <code>updateId</code>.</p>
   *
   * @param updateId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdateResponse} object
   */
  public StartUpdateResponse setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  /**
   * <p>Getter for the field <code>updateId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdateId() {
    return updateId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartUpdateResponse that = (StartUpdateResponse) o;
    return Objects.equals(updateId, that.updateId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(updateId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StartUpdateResponse.class).add("updateId", updateId).toString();
  }
}
