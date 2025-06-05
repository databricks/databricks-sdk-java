// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SqlTaskFilePb {
  @JsonProperty("path")
  private String path;

  @JsonProperty("source")
  private Source source;

  public SqlTaskFilePb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public SqlTaskFilePb setSource(Source source) {
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
    SqlTaskFilePb that = (SqlTaskFilePb) o;
    return Objects.equals(path, that.path) && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, source);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskFilePb.class).add("path", path).add("source", source).toString();
  }
}
