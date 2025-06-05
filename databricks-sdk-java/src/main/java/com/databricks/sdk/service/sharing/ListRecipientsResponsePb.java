// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListRecipientsResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("recipients")
  private Collection<RecipientInfo> recipients;

  public ListRecipientsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRecipientsResponsePb setRecipients(Collection<RecipientInfo> recipients) {
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
    ListRecipientsResponsePb that = (ListRecipientsResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(recipients, that.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, recipients);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRecipientsResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("recipients", recipients)
        .toString();
  }
}
