// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListKnowledgeSourcesResponse {
  /** */
  @JsonProperty("knowledge_sources")
  private Collection<KnowledgeSource> knowledgeSources;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListKnowledgeSourcesResponse setKnowledgeSources(
      Collection<KnowledgeSource> knowledgeSources) {
    this.knowledgeSources = knowledgeSources;
    return this;
  }

  public Collection<KnowledgeSource> getKnowledgeSources() {
    return knowledgeSources;
  }

  public ListKnowledgeSourcesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListKnowledgeSourcesResponse that = (ListKnowledgeSourcesResponse) o;
    return Objects.equals(knowledgeSources, that.knowledgeSources)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeSources, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListKnowledgeSourcesResponse.class)
        .add("knowledgeSources", knowledgeSources)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
