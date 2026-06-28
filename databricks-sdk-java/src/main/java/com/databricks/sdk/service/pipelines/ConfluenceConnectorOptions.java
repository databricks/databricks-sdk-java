// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Confluence specific options for ingestion */
@Generated
public class ConfluenceConnectorOptions {
  /** (Optional) Spaces to filter Confluence data on */
  @JsonProperty("include_confluence_spaces")
  private Collection<String> includeConfluenceSpaces;

  public ConfluenceConnectorOptions setIncludeConfluenceSpaces(
      Collection<String> includeConfluenceSpaces) {
    this.includeConfluenceSpaces = includeConfluenceSpaces;
    return this;
  }

  public Collection<String> getIncludeConfluenceSpaces() {
    return includeConfluenceSpaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConfluenceConnectorOptions that = (ConfluenceConnectorOptions) o;
    return Objects.equals(includeConfluenceSpaces, that.includeConfluenceSpaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeConfluenceSpaces);
  }

  @Override
  public String toString() {
    return new ToStringer(ConfluenceConnectorOptions.class)
        .add("includeConfluenceSpaces", includeConfluenceSpaces)
        .toString();
  }
}
