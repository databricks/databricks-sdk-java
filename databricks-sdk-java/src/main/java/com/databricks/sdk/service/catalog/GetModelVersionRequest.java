// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a Model Version */
@Generated
public class GetModelVersionRequest {
  /** The three-level (fully qualified) name of the model version */
  private String fullName;

  /** The integer version number of the model version */
  private Long version;

  public GetModelVersionRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetModelVersionRequest setVersion(Long version) {
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
    GetModelVersionRequest that = (GetModelVersionRequest) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionRequest.class)
        .add("fullName", fullName)
        .add("version", version)
        .toString();
  }
}
