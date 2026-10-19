// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Contains metadata for the requested path without following its final symlink. */
@Generated
public class GetMetadataResponse {
  /** */
  @JsonProperty("file")
  private SandboxFileInfo file;

  public GetMetadataResponse setFile(SandboxFileInfo file) {
    this.file = file;
    return this;
  }

  public SandboxFileInfo getFile() {
    return file;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetadataResponse that = (GetMetadataResponse) o;
    return Objects.equals(file, that.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetadataResponse.class).add("file", file).toString();
  }
}
