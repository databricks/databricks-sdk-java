// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetFileResponsePb {
  @JsonProperty("file_info")
  private FileInfo fileInfo;

  public GetFileResponsePb setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

  public FileInfo getFileInfo() {
    return fileInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetFileResponsePb that = (GetFileResponsePb) o;
    return Objects.equals(fileInfo, that.fileInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFileResponsePb.class).add("fileInfo", fileInfo).toString();
  }
}
