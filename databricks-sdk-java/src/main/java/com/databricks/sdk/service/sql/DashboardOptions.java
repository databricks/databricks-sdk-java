// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DashboardOptions {
  /**
   * The timestamp when this dashboard was moved to trash. Only present when the `is_archived`
   * property is `true`. Trashed items are deleted after thirty days.
   */
  @JsonProperty("moved_to_trash_at")
  private String movedToTrashAt;

  public DashboardOptions setMovedToTrashAt(String movedToTrashAt) {
    this.movedToTrashAt = movedToTrashAt;
    return this;
  }

  public String getMovedToTrashAt() {
    return movedToTrashAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardOptions that = (DashboardOptions) o;
    return Objects.equals(movedToTrashAt, that.movedToTrashAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movedToTrashAt);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardOptions.class).add("movedToTrashAt", movedToTrashAt).toString();
  }
}
