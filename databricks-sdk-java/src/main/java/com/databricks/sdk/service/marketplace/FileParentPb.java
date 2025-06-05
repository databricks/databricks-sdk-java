// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class FileParentPb {
  @JsonProperty("file_parent_type")
  private FileParentType fileParentType;

  @JsonProperty("parent_id")
  private String parentId;

  public FileParentPb setFileParentType(FileParentType fileParentType) {
    this.fileParentType = fileParentType;
    return this;
  }

  public FileParentType getFileParentType() {
    return fileParentType;
  }

  public FileParentPb setParentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  public String getParentId() {
    return parentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileParentPb that = (FileParentPb) o;
    return Objects.equals(fileParentType, that.fileParentType)
        && Objects.equals(parentId, that.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParentType, parentId);
  }

  @Override
  public String toString() {
    return new ToStringer(FileParentPb.class)
        .add("fileParentType", fileParentType)
        .add("parentId", parentId)
        .toString();
  }
}
