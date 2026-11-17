// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateParserVersionRequest {
  /** Resource name of the parser to append a version to. Format: `parsers/{parser_id}`. */
  @JsonIgnore private String parent;

  /** The version to append. */
  @JsonProperty("parser_version")
  private ParserVersion parserVersion;

  public CreateParserVersionRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateParserVersionRequest setParserVersion(ParserVersion parserVersion) {
    this.parserVersion = parserVersion;
    return this;
  }

  public ParserVersion getParserVersion() {
    return parserVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateParserVersionRequest that = (CreateParserVersionRequest) o;
    return Objects.equals(parent, that.parent) && Objects.equals(parserVersion, that.parserVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, parserVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateParserVersionRequest.class)
        .add("parent", parent)
        .add("parserVersion", parserVersion)
        .toString();
  }
}
