// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListRecipientsResponse {
  /** An array of recipient information objects. */
  @JsonProperty("recipients")
  private Collection<RecipientInfo> recipients;

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
    return Objects.equals(recipients, that.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRecipientsResponse.class).add("recipients", recipients).toString();
  }
}
