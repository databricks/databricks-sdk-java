// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/** List registry webhooks */
public class ListWebhooksRequest {
  /**
   * If `events` is specified, any webhook with one or more of the specified trigger events is
   * included in the output. If `events` is not specified, webhooks of all event types are included
   * in the output.
   */
  @QueryParam("events")
  private Collection<RegistryWebhookEvent> events;

  /**
   * If not specified, all webhooks associated with the specified events are listed, regardless of
   * their associated model.
   */
  @QueryParam("model_name")
  private String modelName;

  /** Token indicating the page of artifact results to fetch */
  @QueryParam("page_token")
  private String pageToken;

  public ListWebhooksRequest setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public ListWebhooksRequest setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ListWebhooksRequest setPageToken(String pageToken) {
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
    ListWebhooksRequest that = (ListWebhooksRequest) o;
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
    return new ToStringer(ListWebhooksRequest.class)
        .add("events", events)
        .add("modelName", modelName)
        .add("pageToken", pageToken)
        .toString();
  }
}
