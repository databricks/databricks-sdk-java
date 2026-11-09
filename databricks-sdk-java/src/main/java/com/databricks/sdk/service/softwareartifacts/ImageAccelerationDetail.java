// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Image acceleration information for a software artifact version. */
@Generated
public class ImageAccelerationDetail {
  /** Image acceleration status for the version. */
  @JsonProperty("status")
  private ImageAccelerationDetailStatus status;

  public ImageAccelerationDetail setStatus(ImageAccelerationDetailStatus status) {
    this.status = status;
    return this;
  }

  public ImageAccelerationDetailStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImageAccelerationDetail that = (ImageAccelerationDetail) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(ImageAccelerationDetail.class).add("status", status).toString();
  }
}
