// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Additional metadata about a directory. */
@Generated
public class DirectoryInfo {
  /**
   * Whether the directory is a Git folder, whose contents are version-controlled by a remote Git
   * repository. How a Git folder is represented depends on whether it has Git CLI access:
   *
   * <p>- A Git folder with Git CLI access has an object type of ``DIRECTORY``, with this field set
   * to ``true``. - A standard Git folder, which does not have Git CLI access, has an object type of
   * ``REPO`` and does not include this field. - A directory that is not Git-backed has this field
   * set to ``false``.
   *
   * <p>Use this field together with ``object_type`` to identify every Git folder in a workspace.
   */
  @JsonProperty("is_git_folder")
  private Boolean isGitFolder;

  public DirectoryInfo setIsGitFolder(Boolean isGitFolder) {
    this.isGitFolder = isGitFolder;
    return this;
  }

  public Boolean getIsGitFolder() {
    return isGitFolder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DirectoryInfo that = (DirectoryInfo) o;
    return Objects.equals(isGitFolder, that.isGitFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGitFolder);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectoryInfo.class).add("isGitFolder", isGitFolder).toString();
  }
}
