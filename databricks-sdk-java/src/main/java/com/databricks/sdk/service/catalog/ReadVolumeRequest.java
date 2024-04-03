// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a Volume */
@Generated
public class ReadVolumeRequest {
  /**
   * Whether to include volumes in the response for which the principal can only access selective
   * metadata for
   */
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /** The three-level (fully qualified) name of the volume */
  private String name;

  public ReadVolumeRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ReadVolumeRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadVolumeRequest that = (ReadVolumeRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadVolumeRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("name", name)
        .toString();
  }
}
