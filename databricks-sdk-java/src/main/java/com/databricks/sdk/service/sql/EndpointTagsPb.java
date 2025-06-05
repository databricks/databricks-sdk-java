// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EndpointTagsPb {
  @JsonProperty("custom_tags")
  private Collection<EndpointTagPair> customTags;

  public EndpointTagsPb setCustomTags(Collection<EndpointTagPair> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<EndpointTagPair> getCustomTags() {
    return customTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointTagsPb that = (EndpointTagsPb) o;
    return Objects.equals(customTags, that.customTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointTagsPb.class).add("customTags", customTags).toString();
  }
}
