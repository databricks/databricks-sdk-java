// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.io.InputStream;
import java.util.Objects;

/** Upload a file */
@Generated
public class UploadFileRequest {
  /** */
  private InputStream contents;

  /** The absolute path of the file or directory in DBFS. */
  private String filePath;

  /** The flag that specifies whether to overwrite existing file/files. */
  @QueryParam("overwrite")
  private Boolean overwrite;

  public UploadFileRequest setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public UploadFileRequest setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  public UploadFileRequest setOverwrite(Boolean overwrite) {
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
    UploadFileRequest that = (UploadFileRequest) o;
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
    return new ToStringer(UploadFileRequest.class)
        .add("contents", contents)
        .add("filePath", filePath)
        .add("overwrite", overwrite)
        .toString();
  }
}
