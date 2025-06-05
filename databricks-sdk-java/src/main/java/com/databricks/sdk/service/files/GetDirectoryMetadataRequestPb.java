// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get directory metadata */
@Generated
class GetDirectoryMetadataRequestPb {
  @JsonIgnore private String directoryPath;

  public GetDirectoryMetadataRequestPb setDirectoryPath(String directoryPath) {
    this.directoryPath = directoryPath;
    return this;
  }

  public String getDirectoryPath() {
    return directoryPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDirectoryMetadataRequestPb that = (GetDirectoryMetadataRequestPb) o;
    return Objects.equals(directoryPath, that.directoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryPath);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDirectoryMetadataRequestPb.class)
        .add("directoryPath", directoryPath)
        .toString();
  }
}
