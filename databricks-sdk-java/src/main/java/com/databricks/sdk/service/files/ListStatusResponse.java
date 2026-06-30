// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListStatusResponse {
  /** A list of FileInfo's that describe contents of directory or file. See example above. */
  @JsonProperty("files")
  private Collection<FileInfo> files;

  public ListStatusResponse setFiles(Collection<FileInfo> files) {
    this.files = files;
    return this;
  }

  public Collection<FileInfo> getFiles() {
    return files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListStatusResponse that = (ListStatusResponse) o;
    return Objects.equals(files, that.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStatusResponse.class).add("files", files).toString();
  }
}
