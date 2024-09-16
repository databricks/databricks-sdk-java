// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a file */
@Generated
public class DeleteFileRequest {
  /** The absolute path of the file. */
  @JsonIgnore private String filePath;

  public DeleteFileRequest setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteFileRequest that = (DeleteFileRequest) o;
    return Objects.equals(filePath, that.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFileRequest.class).add("filePath", filePath).toString();
  }
}
