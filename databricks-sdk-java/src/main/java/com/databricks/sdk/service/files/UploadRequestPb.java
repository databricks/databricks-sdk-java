// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.util.Objects;

/** Upload a file */
@Generated
class UploadRequestPb {
  @JsonIgnore private InputStream contents;

  @JsonIgnore private String filePath;

  @JsonIgnore
  @QueryParam("overwrite")
  private Boolean overwrite;

  public UploadRequestPb setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public UploadRequestPb setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  public UploadRequestPb setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UploadRequestPb that = (UploadRequestPb) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(filePath, that.filePath)
        && Objects.equals(overwrite, that.overwrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, filePath, overwrite);
  }

  @Override
  public String toString() {
    return new ToStringer(UploadRequestPb.class)
        .add("contents", contents)
        .add("filePath", filePath)
        .add("overwrite", overwrite)
        .toString();
  }
}
