// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListRegistryWebhooks {
  /** Token that can be used to retrieve the next page of artifact results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Array of registry webhooks. */
  @JsonProperty("webhooks")
  private java.util.List<RegistryWebhook> webhooks;

  public ListRegistryWebhooks setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRegistryWebhooks setWebhooks(java.util.List<RegistryWebhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public java.util.List<RegistryWebhook> getWebhooks() {
    return webhooks;
  }
}
