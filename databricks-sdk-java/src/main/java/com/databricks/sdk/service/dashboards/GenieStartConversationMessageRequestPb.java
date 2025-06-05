// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenieStartConversationMessageRequestPb {
  @JsonProperty("content")
  private String content;

  @JsonIgnore private String spaceId;

  public GenieStartConversationMessageRequestPb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieStartConversationMessageRequestPb setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieStartConversationMessageRequestPb that = (GenieStartConversationMessageRequestPb) o;
    return Objects.equals(content, that.content) && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieStartConversationMessageRequestPb.class)
        .add("content", content)
        .add("spaceId", spaceId)
        .toString();
  }
}
