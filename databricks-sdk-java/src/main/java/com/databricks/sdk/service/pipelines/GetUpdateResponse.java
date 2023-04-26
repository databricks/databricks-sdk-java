// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GetUpdateResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetUpdateResponse {
  /** The current update info. */
  @JsonProperty("update")
  private UpdateInfo update;

  /**
   * <p>Setter for the field <code>update</code>.</p>
   *
   * @param update a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetUpdateResponse} object
   */
  public GetUpdateResponse setUpdate(UpdateInfo update) {
    this.update = update;
    return this;
  }

  /**
   * <p>Getter for the field <code>update</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo getUpdate() {
    return update;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetUpdateResponse that = (GetUpdateResponse) o;
    return Objects.equals(update, that.update);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(update);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetUpdateResponse.class).add("update", update).toString();
  }
}
