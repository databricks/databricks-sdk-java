// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SetLoggedModelTagsRequest {
  /** The ID of the logged model to set the tags on. */
  @JsonIgnore private String modelId;

  /** The tags to set on the logged model. */
  @JsonProperty("tags")
  private Collection<LoggedModelTag> tags;

  public SetLoggedModelTagsRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public SetLoggedModelTagsRequest setTags(Collection<LoggedModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<LoggedModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetLoggedModelTagsRequest that = (SetLoggedModelTagsRequest) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(SetLoggedModelTagsRequest.class)
        .add("modelId", modelId)
        .add("tags", tags)
        .toString();
  }
}
