// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateParserRequest {
  /** The parser to create. `spec` and `description` become version 1. */
  @JsonProperty("parser")
  private Parser parser;

  public CreateParserRequest setParser(Parser parser) {
    this.parser = parser;
    return this;
  }

  public Parser getParser() {
    return parser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateParserRequest that = (CreateParserRequest) o;
    return Objects.equals(parser, that.parser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parser);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateParserRequest.class).add("parser", parser).toString();
  }
}
