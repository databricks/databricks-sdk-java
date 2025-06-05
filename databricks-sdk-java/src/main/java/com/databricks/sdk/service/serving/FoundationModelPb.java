// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * All fields are not sensitive as they are hard-coded in the system and made available to
 * customers.
 */
@Generated
class FoundationModelPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("docs")
  private String docs;

  @JsonProperty("name")
  private String name;

  public FoundationModelPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public FoundationModelPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public FoundationModelPb setDocs(String docs) {
    this.docs = docs;
    return this;
  }

  public String getDocs() {
    return docs;
  }

  public FoundationModelPb setName(String name) {
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
    FoundationModelPb that = (FoundationModelPb) o;
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
    return new ToStringer(FoundationModelPb.class)
        .add("description", description)
        .add("displayName", displayName)
        .add("docs", docs)
        .add("name", name)
        .toString();
  }
}
