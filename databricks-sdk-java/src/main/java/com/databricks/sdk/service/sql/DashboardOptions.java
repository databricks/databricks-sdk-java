// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DashboardOptions class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DashboardOptions {
  /**
   * The timestamp when this dashboard was moved to trash. Only present when the `is_archived`
   * property is `true`. Trashed items are deleted after thirty days.
   */
  @JsonProperty("moved_to_trash_at")
  private String movedToTrashAt;

  /**
   * <p>Setter for the field <code>movedToTrashAt</code>.</p>
   *
   * @param movedToTrashAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.DashboardOptions} object
   */
  public DashboardOptions setMovedToTrashAt(String movedToTrashAt) {
    this.movedToTrashAt = movedToTrashAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>movedToTrashAt</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMovedToTrashAt() {
    return movedToTrashAt;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardOptions that = (DashboardOptions) o;
    return Objects.equals(movedToTrashAt, that.movedToTrashAt);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(movedToTrashAt);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DashboardOptions.class).add("movedToTrashAt", movedToTrashAt).toString();
  }
}
