// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFileResponse {
  /** */
  @JsonProperty("file_info")
  private FileInfo fileInfo;

  /** Pre-signed POST URL to blob storage */
  @JsonProperty("upload_url")
  private String uploadUrl;

  public CreateFileResponse setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public CreateFileResponse setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  public String getUploadUrl() {
    return uploadUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFileResponse that = (CreateFileResponse) o;
    return Objects.equals(fileInfo, that.fileInfo) && Objects.equals(uploadUrl, that.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, uploadUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFileResponse.class)
        .add("fileInfo", fileInfo)
        .add("uploadUrl", uploadUrl)
        .toString();
  }
}
