// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListRecipientsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of recipient information objects. */
  @JsonProperty("recipients")
  private Collection<RecipientInfo> recipients;

  public ListRecipientsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRecipientsResponse setRecipients(Collection<RecipientInfo> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Collection<RecipientInfo> getRecipients() {
    return recipients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRecipientsResponse that = (ListRecipientsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(recipients, that.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, recipients);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRecipientsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("recipients", recipients)
        .toString();
  }
}
