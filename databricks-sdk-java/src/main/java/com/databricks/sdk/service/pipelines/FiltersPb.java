// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class FiltersPb {
  @JsonProperty("exclude")
  private Collection<String> exclude;

  @JsonProperty("include")
  private Collection<String> include;

  public FiltersPb setExclude(Collection<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  public Collection<String> getExclude() {
    return exclude;
  }

  public FiltersPb setInclude(Collection<String> include) {
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
    FiltersPb that = (FiltersPb) o;
    return Objects.equals(exclude, that.exclude) && Objects.equals(include, that.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, include);
  }

  @Override
  public String toString() {
    return new ToStringer(FiltersPb.class)
        .add("exclude", exclude)
        .add("include", include)
        .toString();
  }
}
