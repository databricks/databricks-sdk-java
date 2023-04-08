// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class QueryOptions {
  /**
   * The timestamp when this query was moved to trash. Only present when the `is_archived` property
   * is `true`. Trashed items are deleted after thirty days.
   */
  @JsonProperty("moved_to_trash_at")
  private String movedToTrashAt;

  /** */
  @JsonProperty("parameters")
  private Collection<Parameter> parameters;

  public QueryOptions setMovedToTrashAt(String movedToTrashAt) {
    this.movedToTrashAt = movedToTrashAt;
    return this;
  }

  public String getMovedToTrashAt() {
    return movedToTrashAt;
  }

  public QueryOptions setParameters(Collection<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<Parameter> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryOptions that = (QueryOptions) o;
    return Objects.equals(movedToTrashAt, that.movedToTrashAt)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movedToTrashAt, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryOptions.class)
        .add("movedToTrashAt", movedToTrashAt)
        .add("parameters", parameters)
        .toString();
  }
}
