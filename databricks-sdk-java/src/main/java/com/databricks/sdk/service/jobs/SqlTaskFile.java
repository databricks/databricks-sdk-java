// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class SqlTaskFile {
  /**
   * Relative path of the SQL file in the remote Git repository.
   */
  @JsonProperty("path")
  private String path;
  
  public SqlTaskFile setPath(String path) {
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
    SqlTaskFile that = (SqlTaskFile) o;
    return Objects.equals(path, that.path)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskFile.class)
      .add("path", path).toString();
  }
}
