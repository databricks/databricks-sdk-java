// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListRegistryWebhooks class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListRegistryWebhooks {
  /** Token that can be used to retrieve the next page of artifact results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Array of registry webhooks. */
  @JsonProperty("webhooks")
  private Collection<RegistryWebhook> webhooks;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListRegistryWebhooks} object
   */
  public ListRegistryWebhooks setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>webhooks</code>.</p>
   *
   * @param webhooks a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ListRegistryWebhooks} object
   */
  public ListRegistryWebhooks setWebhooks(Collection<RegistryWebhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  /**
   * <p>Getter for the field <code>webhooks</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RegistryWebhook> getWebhooks() {
    return webhooks;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRegistryWebhooks that = (ListRegistryWebhooks) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(webhooks, that.webhooks);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, webhooks);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListRegistryWebhooks.class)
        .add("nextPageToken", nextPageToken)
        .add("webhooks", webhooks)
        .toString();
  }
}
