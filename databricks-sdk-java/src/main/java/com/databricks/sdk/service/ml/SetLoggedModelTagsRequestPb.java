// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SetLoggedModelTagsRequestPb {
  @JsonIgnore private String modelId;

  @JsonProperty("tags")
  private Collection<LoggedModelTag> tags;

  public SetLoggedModelTagsRequestPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public SetLoggedModelTagsRequestPb setTags(Collection<LoggedModelTag> tags) {
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
    SetLoggedModelTagsRequestPb that = (SetLoggedModelTagsRequestPb) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(SetLoggedModelTagsRequestPb.class)
        .add("modelId", modelId)
        .add("tags", tags)
        .toString();
  }
}
