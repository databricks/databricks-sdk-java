// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListRecipientsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListRecipientsResponse {
  /** An array of recipient information objects. */
  @JsonProperty("recipients")
  private Collection<RecipientInfo> recipients;

  /**
   * <p>Setter for the field <code>recipients</code>.</p>
   *
   * @param recipients a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.ListRecipientsResponse} object
   */
  public ListRecipientsResponse setRecipients(Collection<RecipientInfo> recipients) {
    this.recipients = recipients;
    return this;
  }

  /**
   * <p>Getter for the field <code>recipients</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RecipientInfo> getRecipients() {
    return recipients;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRecipientsResponse that = (ListRecipientsResponse) o;
    return Objects.equals(recipients, that.recipients);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(recipients);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListRecipientsResponse.class).add("recipients", recipients).toString();
  }
}
