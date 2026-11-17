// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteParserVersionRequest {
  /**
   * Resource name of the version. Format: `parsers/{parser_id}/versions/{version}`, where
   * `{version}` is a version number written without sign or leading zeros, such as `3`. Unlike
   * GetParserVersion, the alias `latest` and forms such as `007` or `+3` are rejected, so a delete
   * always names one fixed version.
   */
  @JsonIgnore private String name;

  public DeleteParserVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteParserVersionRequest that = (DeleteParserVersionRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteParserVersionRequest.class).add("name", name).toString();
  }
}
