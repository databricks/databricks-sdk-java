// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A list of Knowledge Assistants. */
@Generated
public class ListKnowledgeAssistantsResponse {
  /** */
  @JsonProperty("knowledge_assistants")
  private Collection<KnowledgeAssistant> knowledgeAssistants;

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListKnowledgeAssistantsResponse setKnowledgeAssistants(
      Collection<KnowledgeAssistant> knowledgeAssistants) {
    this.knowledgeAssistants = knowledgeAssistants;
    return this;
  }

  public Collection<KnowledgeAssistant> getKnowledgeAssistants() {
    return knowledgeAssistants;
  }

  public ListKnowledgeAssistantsResponse setNextPageToken(String nextPageToken) {
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
    ListKnowledgeAssistantsResponse that = (ListKnowledgeAssistantsResponse) o;
    return Objects.equals(knowledgeAssistants, that.knowledgeAssistants)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeAssistants, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListKnowledgeAssistantsResponse.class)
        .add("knowledgeAssistants", knowledgeAssistants)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
