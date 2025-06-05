// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateEndpointCustomTagsResponsePb {
  @JsonProperty("custom_tags")
  private Collection<CustomTag> customTags;

  @JsonProperty("name")
  private String name;

  public UpdateEndpointCustomTagsResponsePb setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public UpdateEndpointCustomTagsResponsePb setName(String name) {
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
    UpdateEndpointCustomTagsResponsePb that = (UpdateEndpointCustomTagsResponsePb) o;
    return Objects.equals(customTags, that.customTags) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEndpointCustomTagsResponsePb.class)
        .add("customTags", customTags)
        .add("name", name)
        .toString();
  }
}
