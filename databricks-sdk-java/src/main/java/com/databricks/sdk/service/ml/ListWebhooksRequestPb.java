// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

/** List registry webhooks */
@Generated
class ListWebhooksRequestPb {
  @JsonIgnore
  @QueryParam("events")
  private Collection<RegistryWebhookEvent> events;

  @JsonIgnore
  @QueryParam("model_name")
  private String modelName;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListWebhooksRequestPb setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public ListWebhooksRequestPb setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ListWebhooksRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWebhooksRequestPb that = (ListWebhooksRequestPb) o;
    return Objects.equals(events, that.events)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, modelName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWebhooksRequestPb.class)
        .add("events", events)
        .add("modelName", modelName)
        .add("pageToken", pageToken)
        .toString();
  }
}
