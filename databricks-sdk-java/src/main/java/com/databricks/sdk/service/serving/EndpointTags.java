// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EndpointTags {
  /** */
  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  public EndpointTags setTags(Collection<EndpointTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<EndpointTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointTags that = (EndpointTags) o;
    return Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointTags.class).add("tags", tags).toString();
  }
}
