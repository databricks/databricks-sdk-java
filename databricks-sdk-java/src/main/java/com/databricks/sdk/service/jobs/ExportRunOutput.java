// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ExportRunOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExportRunOutput {
  /** The exported content in HTML format (one for every view item). */
  @JsonProperty("views")
  private Collection<ViewItem> views;

  /**
   * <p>Setter for the field <code>views</code>.</p>
   *
   * @param views a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.ExportRunOutput} object
   */
  public ExportRunOutput setViews(Collection<ViewItem> views) {
    this.views = views;
    return this;
  }

  /**
   * <p>Getter for the field <code>views</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ViewItem> getViews() {
    return views;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportRunOutput that = (ExportRunOutput) o;
    return Objects.equals(views, that.views);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(views);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExportRunOutput.class).add("views", views).toString();
  }
}
