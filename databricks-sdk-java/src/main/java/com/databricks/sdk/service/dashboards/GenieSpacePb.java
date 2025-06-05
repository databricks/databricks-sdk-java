// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenieSpacePb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("space_id")
  private String spaceId;

  @JsonProperty("title")
  private String title;

  public GenieSpacePb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieSpacePb setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieSpacePb setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieSpacePb that = (GenieSpacePb) o;
    return Objects.equals(description, that.description)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, spaceId, title);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieSpacePb.class)
        .add("description", description)
        .add("spaceId", spaceId)
        .add("title", title)
        .toString();
  }
}
