// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The request to convert files of a migration project. */
@Generated
public class ConvertProjectFilesRequest {
  /**
   * The files to convert, in the format `projects/{project_id}/files/{file_id}`. For example,
   * `projects/123/files/789`. All files must belong to `parent`. At most 500 files; a workspace can
   * set a lower limit, and requests over it return `INVALID_PARAMETER_VALUE`.
   */
  @JsonProperty("names")
  private Collection<String> names;

  /**
   * The resource name of the project whose files to convert, in the format `projects/{project_id}`.
   * For example, `projects/123`.
   */
  @JsonIgnore private String parent;

  /**
   * Custom skills that the conversion can use, as workspace paths of skill folders. Each folder
   * must contain a `SKILL.md` file and be directly inside a skills folder:
   * `<home>/.assistant/skills`, `/Workspace/.assistant/skills`, or another configured skills
   * folder. At most 10 paths, which together must fit in 1000 bytes when encoded as a JSON array.
   * Larger values return `INVALID_PARAMETER_VALUE`. If empty, the conversion discovers skills
   * automatically.
   */
  @JsonProperty("skill_paths")
  private Collection<String> skillPaths;

  /**
   * Whether to convert each selected file from scratch instead of continuing from its previous
   * results (changes, to-do items, blockers, and notes). Supported only for projects whose target
   * framework is `TARGET_FRAMEWORK_SQL`; other projects return `INVALID_PARAMETER_VALUE`. Defaults
   * to `false`.
   */
  @JsonProperty("start_over")
  private Boolean startOver;

  public ConvertProjectFilesRequest setNames(Collection<String> names) {
    this.names = names;
    return this;
  }

  public Collection<String> getNames() {
    return names;
  }

  public ConvertProjectFilesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public ConvertProjectFilesRequest setSkillPaths(Collection<String> skillPaths) {
    this.skillPaths = skillPaths;
    return this;
  }

  public Collection<String> getSkillPaths() {
    return skillPaths;
  }

  public ConvertProjectFilesRequest setStartOver(Boolean startOver) {
    this.startOver = startOver;
    return this;
  }

  public Boolean getStartOver() {
    return startOver;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConvertProjectFilesRequest that = (ConvertProjectFilesRequest) o;
    return Objects.equals(names, that.names)
        && Objects.equals(parent, that.parent)
        && Objects.equals(skillPaths, that.skillPaths)
        && Objects.equals(startOver, that.startOver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, parent, skillPaths, startOver);
  }

  @Override
  public String toString() {
    return new ToStringer(ConvertProjectFilesRequest.class)
        .add("names", names)
        .add("parent", parent)
        .add("skillPaths", skillPaths)
        .add("startOver", startOver)
        .toString();
  }
}
