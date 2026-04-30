// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Jira specific options for ingestion */
@Generated
public class JiraConnectorOptions {
  /** (Optional) Projects to filter Jira data on */
  @JsonProperty("include_jira_spaces")
  private Collection<String> includeJiraSpaces;

  public JiraConnectorOptions setIncludeJiraSpaces(Collection<String> includeJiraSpaces) {
    this.includeJiraSpaces = includeJiraSpaces;
    return this;
  }

  public Collection<String> getIncludeJiraSpaces() {
    return includeJiraSpaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JiraConnectorOptions that = (JiraConnectorOptions) o;
    return Objects.equals(includeJiraSpaces, that.includeJiraSpaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeJiraSpaces);
  }

  @Override
  public String toString() {
    return new ToStringer(JiraConnectorOptions.class)
        .add("includeJiraSpaces", includeJiraSpaces)
        .toString();
  }
}
