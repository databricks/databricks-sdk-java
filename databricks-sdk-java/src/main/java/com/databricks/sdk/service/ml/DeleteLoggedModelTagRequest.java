// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a tag on a logged model */
@Generated
public class DeleteLoggedModelTagRequest {
  /** The ID of the logged model to delete the tag from. */
  @JsonIgnore private String modelId;

  /** The tag key. */
  @JsonIgnore private String tagKey;

  public DeleteLoggedModelTagRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public DeleteLoggedModelTagRequest setTagKey(String tagKey) {
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
    DeleteLoggedModelTagRequest that = (DeleteLoggedModelTagRequest) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteLoggedModelTagRequest.class)
        .add("modelId", modelId)
        .add("tagKey", tagKey)
        .toString();
  }
}
