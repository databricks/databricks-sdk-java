// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCustomTemplatesResponse {
  /** Pagination token to request the next page of custom templates. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("templates")
  private Collection<CustomTemplate> templates;

  public ListCustomTemplatesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListCustomTemplatesResponse setTemplates(Collection<CustomTemplate> templates) {
    this.templates = templates;
    return this;
  }

  public Collection<CustomTemplate> getTemplates() {
    return templates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCustomTemplatesResponse that = (ListCustomTemplatesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(templates, that.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, templates);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCustomTemplatesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("templates", templates)
        .toString();
  }
}
