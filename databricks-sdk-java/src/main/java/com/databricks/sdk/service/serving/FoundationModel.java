// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FoundationModel {
  /** The description of the foundation model. */
  @JsonProperty("description")
  private String description;

  /** The display name of the foundation model. */
  @JsonProperty("display_name")
  private String displayName;

  /** The URL to the documentation of the foundation model. */
  @JsonProperty("docs")
  private String docs;

  /** The name of the foundation model. */
  @JsonProperty("name")
  private String name;

  public FoundationModel setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public FoundationModel setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public FoundationModel setDocs(String docs) {
    this.docs = docs;
    return this;
  }

  public String getDocs() {
    return docs;
  }

  public FoundationModel setName(String name) {
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
    FoundationModel that = (FoundationModel) o;
    return Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(docs, that.docs)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, docs, name);
  }

  @Override
  public String toString() {
    return new ToStringer(FoundationModel.class)
        .add("description", description)
        .add("displayName", displayName)
        .add("docs", docs)
        .add("name", name)
        .toString();
  }
}
