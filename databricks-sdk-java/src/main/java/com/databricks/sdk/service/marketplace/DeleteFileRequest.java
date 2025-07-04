// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteFileRequest {
  /** */
  @JsonIgnore private String fileId;

  public DeleteFileRequest setFileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  public String getFileId() {
    return fileId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteFileRequest that = (DeleteFileRequest) o;
    return Objects.equals(fileId, that.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFileRequest.class).add("fileId", fileId).toString();
  }
}
