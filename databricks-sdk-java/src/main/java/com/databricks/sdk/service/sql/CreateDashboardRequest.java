// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Create a dashboard object */
public class CreateDashboardRequest {
  /**
   * The title of this dashboard that appears in list views and at the top of the dashboard page.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The identifier of the workspace folder containing the dashboard. The default is the user's home
   * folder.
   */
  @JsonProperty("parent")
  private String parent;

  /** */
  @JsonProperty("tags")
  private Collection<String> tags;

  public CreateDashboardRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateDashboardRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateDashboardRequest setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDashboardRequest that = (CreateDashboardRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parent, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDashboardRequest.class)
        .add("name", name)
        .add("parent", parent)
        .add("tags", tags)
        .toString();
  }
}
