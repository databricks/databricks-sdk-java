// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class LibraryOperationMetadata {
  /** The time at which the operation was created */
  @JsonProperty("created_at")
  private Long createdAt;

  /** The name of the library resource */
  @JsonProperty("library_name")
  private String libraryName;

  public LibraryOperationMetadata setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public LibraryOperationMetadata setLibraryName(String libraryName) {
    this.libraryName = libraryName;
    return this;
  }

  public String getLibraryName() {
    return libraryName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LibraryOperationMetadata that = (LibraryOperationMetadata) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(libraryName, that.libraryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, libraryName);
  }

  @Override
  public String toString() {
    return new ToStringer(LibraryOperationMetadata.class)
        .add("createdAt", createdAt)
        .add("libraryName", libraryName)
        .toString();
  }
}
