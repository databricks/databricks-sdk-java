// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class Filters {
  /** Paths to exclude. */
  @JsonProperty("exclude")
  private Collection<String> exclude;

  /** Paths to include. */
  @JsonProperty("include")
  private Collection<String> include;

  public Filters setExclude(Collection<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  public Collection<String> getExclude() {
    return exclude;
  }

  public Filters setInclude(Collection<String> include) {
    this.include = include;
    return this;
  }

  public Collection<String> getInclude() {
    return include;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Filters that = (Filters) o;
    return Objects.equals(exclude, that.exclude) && Objects.equals(include, that.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, include);
  }

  @Override
  public String toString() {
    return new ToStringer(Filters.class).add("exclude", exclude).add("include", include).toString();
  }
}
