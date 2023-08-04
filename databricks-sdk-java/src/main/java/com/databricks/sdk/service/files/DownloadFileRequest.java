// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Download a file */
@Generated
public class DownloadFileRequest {
  /** The absolute path of the file or directory in DBFS. */
  private String filePath;

  public DownloadFileRequest setFilePath(String filePath) {
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
    DownloadFileRequest that = (DownloadFileRequest) o;
    return Objects.equals(filePath, that.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadFileRequest.class).add("filePath", filePath).toString();
  }
}
