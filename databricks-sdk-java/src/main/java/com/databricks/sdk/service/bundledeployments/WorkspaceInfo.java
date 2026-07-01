// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Workspace location of a bundle deployment, captured at deploy time. */
@Generated
public class WorkspaceInfo {
  /**
   * Path of the bundle root (the directory containing databricks.yml) relative to git_folder_path.
   * Empty when the deployment is not from a Databricks Git folder.
   */
  @JsonProperty("bundle_root_path")
  private String bundleRootPath;

  /**
   * Absolute workspace path where the deployed bundle files live. Mirrors the workspace.file_path
   * field in DABs bundle config.
   */
  @JsonProperty("file_path")
  private String filePath;

  /**
   * When deployed from a Databricks Git folder, the absolute workspace path of that folder; empty
   * for local deploys.
   */
  @JsonProperty("git_folder_path")
  private String gitFolderPath;

  /**
   * Absolute workspace path of the deployment root — the base path the deployed files live under.
   * Mirrors workspace.root_path in the DABs bundle config; file_path is its files subdirectory.
   */
  @JsonProperty("root_path")
  private String rootPath;

  /**
   * Whether files are served directly from the source sync root instead of being copied into
   * file_path.
   */
  @JsonProperty("source_linked")
  private Boolean sourceLinked;

  public WorkspaceInfo setBundleRootPath(String bundleRootPath) {
    this.bundleRootPath = bundleRootPath;
    return this;
  }

  public String getBundleRootPath() {
    return bundleRootPath;
  }

  public WorkspaceInfo setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  public WorkspaceInfo setGitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
    return this;
  }

  public String getGitFolderPath() {
    return gitFolderPath;
  }

  public WorkspaceInfo setRootPath(String rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  public String getRootPath() {
    return rootPath;
  }

  public WorkspaceInfo setSourceLinked(Boolean sourceLinked) {
    this.sourceLinked = sourceLinked;
    return this;
  }

  public Boolean getSourceLinked() {
    return sourceLinked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceInfo that = (WorkspaceInfo) o;
    return Objects.equals(bundleRootPath, that.bundleRootPath)
        && Objects.equals(filePath, that.filePath)
        && Objects.equals(gitFolderPath, that.gitFolderPath)
        && Objects.equals(rootPath, that.rootPath)
        && Objects.equals(sourceLinked, that.sourceLinked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleRootPath, filePath, gitFolderPath, rootPath, sourceLinked);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceInfo.class)
        .add("bundleRootPath", bundleRootPath)
        .add("filePath", filePath)
        .add("gitFolderPath", gitFolderPath)
        .add("rootPath", rootPath)
        .add("sourceLinked", sourceLinked)
        .toString();
  }
}
