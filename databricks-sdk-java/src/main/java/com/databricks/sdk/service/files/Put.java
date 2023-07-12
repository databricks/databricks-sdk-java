// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Put {
  /**
   * This parameter might be absent, and instead a posted file will be used.
   */
  @JsonProperty("contents")
  private String contents;
  
  /**
   * The flag that specifies whether to overwrite existing file/files.
   */
  @JsonProperty("overwrite")
  private Boolean overwrite;
  
  /**
   * The path of the new file. The path should be the absolute DBFS path.
   */
  @JsonProperty("path")
  private String path;
  
  public Put setContents(String contents) {
    this.contents = contents;
    return this;
  }

  public String getContents() {
    return contents;
  }
  
  public Put setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }
  
  public Put setPath(String path) {
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
    Put that = (Put) o;
    return Objects.equals(contents, that.contents)
    && Objects.equals(overwrite, that.overwrite)
    && Objects.equals(path, that.path)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, overwrite, path);
  }

  @Override
  public String toString() {
    return new ToStringer(Put.class)
      .add("contents", contents)
      .add("overwrite", overwrite)
      .add("path", path).toString();
  }
}
