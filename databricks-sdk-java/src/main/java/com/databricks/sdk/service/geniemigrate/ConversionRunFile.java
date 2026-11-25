// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A file in a conversion run. */
@Generated
public class ConversionRunFile {
  /** The resource name of the file, in the format `projects/{project_id}/files/{file_id}`. */
  @JsonProperty("name")
  private String name;

  /**
   * The status of the file in this run. `ProjectFile.status` has the file's latest status across
   * all runs.
   */
  @JsonProperty("status")
  private FileStatus status;

  public ConversionRunFile setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ConversionRunFile setStatus(FileStatus status) {
    this.status = status;
    return this;
  }

  public FileStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConversionRunFile that = (ConversionRunFile) o;
    return Objects.equals(name, that.name) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status);
  }

  @Override
  public String toString() {
    return new ToStringer(ConversionRunFile.class)
        .add("name", name)
        .add("status", status)
        .toString();
  }
}
