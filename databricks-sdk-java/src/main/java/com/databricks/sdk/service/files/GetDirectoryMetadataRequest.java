// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get directory metadata */
@Generated
public class GetDirectoryMetadataRequest {
  /** The absolute path of a directory. */
  private String directoryPath;

  public GetDirectoryMetadataRequest setDirectoryPath(String directoryPath) {
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
    GetDirectoryMetadataRequest that = (GetDirectoryMetadataRequest) o;
    return Objects.equals(directoryPath, that.directoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryPath);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDirectoryMetadataRequest.class)
        .add("directoryPath", directoryPath)
        .toString();
  }
}
