// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteModelVersionRequest {
  /** The three-level (fully qualified) name of the model version */
  @JsonIgnore private String fullName;

  /** The integer version number of the model version */
  @JsonIgnore private Long version;

  public DeleteModelVersionRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public DeleteModelVersionRequest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelVersionRequest that = (DeleteModelVersionRequest) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelVersionRequest.class)
        .add("fullName", fullName)
        .add("version", version)
        .toString();
  }
}
