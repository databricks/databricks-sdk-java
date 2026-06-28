// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Information about truncations applied to this event. */
@Generated
public class Truncation {
  /**
   * List of fields that were truncated from this event. If empty or absent, no truncation occurred.
   */
  @JsonProperty("truncated_fields")
  private Collection<TruncationTruncationDetail> truncatedFields;

  public Truncation setTruncatedFields(Collection<TruncationTruncationDetail> truncatedFields) {
    this.truncatedFields = truncatedFields;
    return this;
  }

  public Collection<TruncationTruncationDetail> getTruncatedFields() {
    return truncatedFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Truncation that = (Truncation) o;
    return Objects.equals(truncatedFields, that.truncatedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(truncatedFields);
  }

  @Override
  public String toString() {
    return new ToStringer(Truncation.class).add("truncatedFields", truncatedFields).toString();
  }
}
