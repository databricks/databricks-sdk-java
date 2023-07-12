// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListRegistryWebhooks {
  /** Token that can be used to retrieve the next page of artifact results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Array of registry webhooks. */
  @JsonProperty("webhooks")
  private Collection<RegistryWebhook> webhooks;

  public ListRegistryWebhooks setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRegistryWebhooks setWebhooks(Collection<RegistryWebhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public Collection<RegistryWebhook> getWebhooks() {
    return webhooks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRegistryWebhooks that = (ListRegistryWebhooks) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(webhooks, that.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, webhooks);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRegistryWebhooks.class)
        .add("nextPageToken", nextPageToken)
        .add("webhooks", webhooks)
        .toString();
  }
}
