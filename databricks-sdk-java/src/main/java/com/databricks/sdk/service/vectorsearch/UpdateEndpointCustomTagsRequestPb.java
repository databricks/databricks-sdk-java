// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateEndpointCustomTagsRequestPb {
  @JsonProperty("custom_tags")
  private Collection<CustomTag> customTags;

  @JsonIgnore private String endpointName;

  public UpdateEndpointCustomTagsRequestPb setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public UpdateEndpointCustomTagsRequestPb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateEndpointCustomTagsRequestPb that = (UpdateEndpointCustomTagsRequestPb) o;
    return Objects.equals(customTags, that.customTags)
        && Objects.equals(endpointName, that.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags, endpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEndpointCustomTagsRequestPb.class)
        .add("customTags", customTags)
        .add("endpointName", endpointName)
        .toString();
  }
}
