// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Dashboard-specific per-resource metadata. Set only for dashboard resources. */
@Generated
public class DashboardMetadata {
  /**
   * Path of the file that declares this dashboard, relative to the bundle's workspace.file_path
   * (Version.workspace_info.file_path) — join the two to get the file's absolute workspace path.
   *
   * <p>For now this lives only on the dashboard metadata, and is a single string because it was a
   * single string (`relative_path`) in the legacy bundle metadata.json. We may generalize it in the
   * future: lifting it to a top-level field on Resource/Operation (every resource type has a
   * definition location) and converting it to a repeated field, since a resource can be declared
   * across multiple files/locations.
   */
  @JsonProperty("definition_path")
  private String definitionPath;

  /**
   * Path of the dashboard's source artifact (its `.lvdash.json`), relative to the deployment root.
   */
  @JsonProperty("source_path")
  private String sourcePath;

  public DashboardMetadata setDefinitionPath(String definitionPath) {
    this.definitionPath = definitionPath;
    return this;
  }

  public String getDefinitionPath() {
    return definitionPath;
  }

  public DashboardMetadata setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  public String getSourcePath() {
    return sourcePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardMetadata that = (DashboardMetadata) o;
    return Objects.equals(definitionPath, that.definitionPath)
        && Objects.equals(sourcePath, that.sourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionPath, sourcePath);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardMetadata.class)
        .add("definitionPath", definitionPath)
        .add("sourcePath", sourcePath)
        .toString();
  }
}
