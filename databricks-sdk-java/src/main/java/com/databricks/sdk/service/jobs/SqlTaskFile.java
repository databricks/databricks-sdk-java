// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SqlTaskFile {
  /**
   * Path of the SQL file. Must be relative if the source is a remote Git repository and absolute
   * for workspace paths.
   */
  @JsonProperty("path")
  private String path;

  /**
   * Optional location type of the SQL file. When set to `WORKSPACE`, the SQL file will be retrieved
   * from the local <Databricks> workspace. When set to `GIT`, the SQL file will be retrieved from a
   * Git repository defined in `git_source`. If the value is empty, the task will use `GIT` if
   * `git_source` is defined and `WORKSPACE` otherwise.
   *
   * <p>* `WORKSPACE`: SQL file is located in <Databricks> workspace. * `GIT`: SQL file is located
   * in cloud Git provider.
   */
  @JsonProperty("source")
  private Source source;

  public SqlTaskFile setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public SqlTaskFile setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskFile that = (SqlTaskFile) o;
    return Objects.equals(path, that.path) && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, source);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskFile.class).add("path", path).add("source", source).toString();
  }
}
