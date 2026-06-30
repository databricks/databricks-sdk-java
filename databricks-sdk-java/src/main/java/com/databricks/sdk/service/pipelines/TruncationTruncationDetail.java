// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Details about a specific field that was truncated. */
@Generated
public class TruncationTruncationDetail {
  /**
   * The name of the truncated field (e.g., "error"). Corresponds to field names in PipelineEvent.
   */
  @JsonProperty("field_name")
  private String fieldName;

  public TruncationTruncationDetail setFieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  public String getFieldName() {
    return fieldName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TruncationTruncationDetail that = (TruncationTruncationDetail) o;
    return Objects.equals(fieldName, that.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName);
  }

  @Override
  public String toString() {
    return new ToStringer(TruncationTruncationDetail.class).add("fieldName", fieldName).toString();
  }
}
