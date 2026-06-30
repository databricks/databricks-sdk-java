// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteTagPolicyRequest {
  /** */
  @JsonIgnore private String tagKey;

  public DeleteTagPolicyRequest setTagKey(String tagKey) {
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
    DeleteTagPolicyRequest that = (DeleteTagPolicyRequest) o;
    return Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTagPolicyRequest.class).add("tagKey", tagKey).toString();
  }
}
