// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Create {
  /** The flag that specifies whether to overwrite existing file/files. */
  @JsonProperty("overwrite")
  private Boolean overwrite;

  /** The path of the new file. The path should be the absolute DBFS path. */
  @JsonProperty("path")
  private String path;

  public Create setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  public Create setPath(String path) {
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
    Create that = (Create) o;
    return Objects.equals(overwrite, that.overwrite) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overwrite, path);
  }

  @Override
  public String toString() {
    return new ToStringer(Create.class).add("overwrite", overwrite).add("path", path).toString();
  }
}
