// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PutPb {
  @JsonProperty("contents")
  private String contents;

  @JsonProperty("overwrite")
  private Boolean overwrite;

  @JsonProperty("path")
  private String path;

  public PutPb setContents(String contents) {
    this.contents = contents;
    return this;
  }

  public String getContents() {
    return contents;
  }

  public PutPb setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  public PutPb setPath(String path) {
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
    PutPb that = (PutPb) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(overwrite, that.overwrite)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, overwrite, path);
  }

  @Override
  public String toString() {
    return new ToStringer(PutPb.class)
        .add("contents", contents)
        .add("overwrite", overwrite)
        .add("path", path)
        .toString();
  }
}
