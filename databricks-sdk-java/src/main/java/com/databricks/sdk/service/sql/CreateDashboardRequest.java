// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Create a dashboard object
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.CreateDashboardRequest} object
   */
  public CreateDashboardRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>parent</code>.</p>
   *
   * @param parent a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.CreateDashboardRequest} object
   */
  public CreateDashboardRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * <p>Getter for the field <code>parent</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getParent() {
    return parent;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.CreateDashboardRequest} object
   */
  public CreateDashboardRequest setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getTags() {
    return tags;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDashboardRequest that = (CreateDashboardRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(tags, that.tags);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, parent, tags);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateDashboardRequest.class)
        .add("name", name)
        .add("parent", parent)
        .add("tags", tags)
        .toString();
  }
}
