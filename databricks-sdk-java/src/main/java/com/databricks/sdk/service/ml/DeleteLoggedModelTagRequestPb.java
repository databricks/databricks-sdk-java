// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a tag on a logged model */
@Generated
class DeleteLoggedModelTagRequestPb {
  @JsonIgnore private String modelId;

  @JsonIgnore private String tagKey;

  public DeleteLoggedModelTagRequestPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public DeleteLoggedModelTagRequestPb setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteLoggedModelTagRequestPb that = (DeleteLoggedModelTagRequestPb) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteLoggedModelTagRequestPb.class)
        .add("modelId", modelId)
        .add("tagKey", tagKey)
        .toString();
  }
}
