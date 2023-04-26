// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>QueryOptions class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>movedToTrashAt</code>.</p>
   *
   * @param movedToTrashAt a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryOptions} object
   */
  public QueryOptions setMovedToTrashAt(String movedToTrashAt) {
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

  /**
   * <p>Setter for the field <code>parameters</code>.</p>
   *
   * @param parameters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.QueryOptions} object
   */
  public QueryOptions setParameters(Collection<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameters</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Parameter> getParameters() {
    return parameters;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryOptions that = (QueryOptions) o;
    return Objects.equals(movedToTrashAt, that.movedToTrashAt)
        && Objects.equals(parameters, that.parameters);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(movedToTrashAt, parameters);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(QueryOptions.class)
        .add("movedToTrashAt", movedToTrashAt)
        .add("parameters", parameters)
        .toString();
  }
}
