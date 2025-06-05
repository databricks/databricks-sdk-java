// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PatchServingEndpointTagsPb {
  @JsonProperty("add_tags")
  private Collection<EndpointTag> addTags;

  @JsonProperty("delete_tags")
  private Collection<String> deleteTags;

  @JsonIgnore private String name;

  public PatchServingEndpointTagsPb setAddTags(Collection<EndpointTag> addTags) {
    this.addTags = addTags;
    return this;
  }

  public Collection<EndpointTag> getAddTags() {
    return addTags;
  }

  public PatchServingEndpointTagsPb setDeleteTags(Collection<String> deleteTags) {
    this.deleteTags = deleteTags;
    return this;
  }

  public Collection<String> getDeleteTags() {
    return deleteTags;
  }

  public PatchServingEndpointTagsPb setName(String name) {
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
    PatchServingEndpointTagsPb that = (PatchServingEndpointTagsPb) o;
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
    return new ToStringer(PatchServingEndpointTagsPb.class)
        .add("addTags", addTags)
        .add("deleteTags", deleteTags)
        .add("name", name)
        .toString();
  }
}
