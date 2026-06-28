// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metadata for test resource operations */
@Generated
public class TestResourceOperationMetadata {
  /** Progress percentage (0-100) */
  @JsonProperty("progress_percent")
  private Long progressPercent;

  /** ID of the resource being operated on */
  @JsonProperty("resource_id")
  private String resourceId;

  public TestResourceOperationMetadata setProgressPercent(Long progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  public Long getProgressPercent() {
    return progressPercent;
  }

  public TestResourceOperationMetadata setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestResourceOperationMetadata that = (TestResourceOperationMetadata) o;
    return Objects.equals(progressPercent, that.progressPercent)
        && Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progressPercent, resourceId);
  }

  @Override
  public String toString() {
    return new ToStringer(TestResourceOperationMetadata.class)
        .add("progressPercent", progressPercent)
        .add("resourceId", resourceId)
        .toString();
  }
}
