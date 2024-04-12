// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FileParent {
  /** */
  @JsonProperty("file_parent_type")
  private FileParentType fileParentType;

  /** TODO make the following fields required */
  @JsonProperty("parent_id")
  private String parentId;

  public FileParent setFileParentType(FileParentType fileParentType) {
    this.fileParentType = fileParentType;
    return this;
  }

  public FileParentType getFileParentType() {
    return fileParentType;
  }

  public FileParent setParentId(String parentId) {
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
    FileParent that = (FileParent) o;
    return Objects.equals(fileParentType, that.fileParentType)
        && Objects.equals(parentId, that.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParentType, parentId);
  }

  @Override
  public String toString() {
    return new ToStringer(FileParent.class)
        .add("fileParentType", fileParentType)
        .add("parentId", parentId)
        .toString();
  }
}
