// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Unity Catalog volume the Genie Agent can access. */
@Generated
public class GenieAgentVolume {
  /** Description of the volume. */
  @JsonProperty("description")
  private String description;

  /**
   * The volume path, for example `/Volumes/catalog/schema/volume`. May name a directory or file
   * within the volume.
   */
  @JsonProperty("path")
  private String path;

  public GenieAgentVolume setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieAgentVolume setPath(String path) {
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
    GenieAgentVolume that = (GenieAgentVolume) o;
    return Objects.equals(description, that.description) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, path);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentVolume.class)
        .add("description", description)
        .add("path", path)
        .toString();
  }
}
