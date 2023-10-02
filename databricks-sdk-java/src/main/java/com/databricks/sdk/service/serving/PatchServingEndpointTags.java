// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PatchServingEndpointTags {
  /** List of endpoint tags to add */
  @JsonProperty("add_tags")
  private Collection<EndpointTag> addTags;

  /** List of tag keys to delete */
  @JsonProperty("delete_tags")
  private Collection<String> deleteTags;

  /** The name of the serving endpoint who's tags to patch. This field is required. */
  private String name;

  public PatchServingEndpointTags setAddTags(Collection<EndpointTag> addTags) {
    this.addTags = addTags;
    return this;
  }

  public Collection<EndpointTag> getAddTags() {
    return addTags;
  }

  public PatchServingEndpointTags setDeleteTags(Collection<String> deleteTags) {
    this.deleteTags = deleteTags;
    return this;
  }

  public Collection<String> getDeleteTags() {
    return deleteTags;
  }

  public PatchServingEndpointTags setName(String name) {
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
    PatchServingEndpointTags that = (PatchServingEndpointTags) o;
    return Objects.equals(addTags, that.addTags)
        && Objects.equals(deleteTags, that.deleteTags)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTags, deleteTags, name);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchServingEndpointTags.class)
        .add("addTags", addTags)
        .add("deleteTags", deleteTags)
        .add("name", name)
        .toString();
  }
}
