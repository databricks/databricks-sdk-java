// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** One predicate over Issue.tags. */
@Generated
public class IssueTagFilter {
  /** Matched exactly. */
  @JsonProperty("key")
  private String key;

  /** Matched exactly, and ORed together. Empty matches any Issue carrying the key. */
  @JsonProperty("values")
  private Collection<String> values;

  public IssueTagFilter setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public IssueTagFilter setValues(Collection<String> values) {
    this.values = values;
    return this;
  }

  public Collection<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IssueTagFilter that = (IssueTagFilter) o;
    return Objects.equals(key, that.key) && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values);
  }

  @Override
  public String toString() {
    return new ToStringer(IssueTagFilter.class).add("key", key).add("values", values).toString();
  }
}
