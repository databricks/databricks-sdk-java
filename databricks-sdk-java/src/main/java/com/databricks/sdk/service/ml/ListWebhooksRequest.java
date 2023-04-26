// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/**
 * List registry webhooks
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>events</code>.</p>
   *
   * @param events a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ListWebhooksRequest} object
   */
  public ListWebhooksRequest setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  /**
   * <p>Getter for the field <code>events</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  /**
   * <p>Setter for the field <code>modelName</code>.</p>
   *
   * @param modelName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListWebhooksRequest} object
   */
  public ListWebhooksRequest setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * <p>Getter for the field <code>modelName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getModelName() {
    return modelName;
  }

  /**
   * <p>Setter for the field <code>pageToken</code>.</p>
   *
   * @param pageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListWebhooksRequest} object
   */
  public ListWebhooksRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>pageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPageToken() {
    return pageToken;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWebhooksRequest that = (ListWebhooksRequest) o;
    return Objects.equals(events, that.events)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(pageToken, that.pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(events, modelName, pageToken);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListWebhooksRequest.class)
        .add("events", events)
        .add("modelName", modelName)
        .add("pageToken", pageToken)
        .toString();
  }
}
