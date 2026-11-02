// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.util.Objects;

@Generated
public class UploadFileRequest {
  /** The complete file contents. An empty body creates an empty file. */
  @JsonIgnore private InputStream contents;

  /** The sandbox resource name, in the form sandboxes/{sandbox_id}. */
  @JsonIgnore private String parent;

  /** The absolute UTF-8 destination path inside the sandbox. */
  @JsonIgnore
  @QueryParam("path")
  private String path;

  public UploadFileRequest setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public UploadFileRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public UploadFileRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UploadFileRequest that = (UploadFileRequest) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(parent, that.parent)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, parent, path);
  }

  @Override
  public String toString() {
    return new ToStringer(UploadFileRequest.class)
        .add("contents", contents)
        .add("parent", parent)
        .add("path", path)
        .toString();
  }
}
