// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a Model Version */
@Generated
class DeleteModelVersionRequestPb {
  @JsonIgnore private String fullName;

  @JsonIgnore private Long version;

  public DeleteModelVersionRequestPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public DeleteModelVersionRequestPb setVersion(Long version) {
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
    DeleteModelVersionRequestPb that = (DeleteModelVersionRequestPb) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelVersionRequestPb.class)
        .add("fullName", fullName)
        .add("version", version)
        .toString();
  }
}
