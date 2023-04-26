// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Filters class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Filters {
  /** Paths to exclude. */
  @JsonProperty("exclude")
  private Collection<String> exclude;

  /** Paths to include. */
  @JsonProperty("include")
  private Collection<String> include;

  /**
   * <p>Setter for the field <code>exclude</code>.</p>
   *
   * @param exclude a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.Filters} object
   */
  public Filters setExclude(Collection<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * <p>Getter for the field <code>exclude</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getExclude() {
    return exclude;
  }

  /**
   * <p>Setter for the field <code>include</code>.</p>
   *
   * @param include a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.Filters} object
   */
  public Filters setInclude(Collection<String> include) {
    this.include = include;
    return this;
  }

  /**
   * <p>Getter for the field <code>include</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getInclude() {
    return include;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Filters that = (Filters) o;
    return Objects.equals(exclude, that.exclude) && Objects.equals(include, that.include);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(exclude, include);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Filters.class).add("exclude", exclude).add("include", include).toString();
  }
}
