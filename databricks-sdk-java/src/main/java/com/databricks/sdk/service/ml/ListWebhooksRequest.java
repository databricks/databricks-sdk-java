// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListWebhooksRequest {
  /**
   * Events that trigger the webhook. * `MODEL_VERSION_CREATED`: A new model version was created for
   * the associated model.
   *
   * <p>* `MODEL_VERSION_TRANSITIONED_STAGE`: A model version’s stage was changed.
   *
   * <p>* `TRANSITION_REQUEST_CREATED`: A user requested a model version’s stage be transitioned.
   *
   * <p>* `COMMENT_CREATED`: A user wrote a comment on a registered model.
   *
   * <p>* `REGISTERED_MODEL_CREATED`: A new registered model was created. This event type can only
   * be specified for a registry-wide webhook, which can be created by not specifying a model name
   * in the create request.
   *
   * <p>* `MODEL_VERSION_TAG_SET`: A user set a tag on the model version.
   *
   * <p>* `MODEL_VERSION_TRANSITIONED_TO_STAGING`: A model version was transitioned to staging.
   *
   * <p>* `MODEL_VERSION_TRANSITIONED_TO_PRODUCTION`: A model version was transitioned to
   * production.
   *
   * <p>* `MODEL_VERSION_TRANSITIONED_TO_ARCHIVED`: A model version was archived.
   *
   * <p>* `TRANSITION_REQUEST_TO_STAGING_CREATED`: A user requested a model version be transitioned
   * to staging.
   *
   * <p>* `TRANSITION_REQUEST_TO_PRODUCTION_CREATED`: A user requested a model version be
   * transitioned to production.
   *
   * <p>* `TRANSITION_REQUEST_TO_ARCHIVED_CREATED`: A user requested a model version be archived.
   *
   * <p>If `events` is specified, any webhook with one or more of the specified trigger events is
   * included in the output. If `events` is not specified, webhooks of all event types are included
   * in the output.
   */
  @JsonIgnore
  @QueryParam("events")
  private Collection<RegistryWebhookEvent> events;

  /** */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * Registered model name If not specified, all webhooks associated with the specified events are
   * listed, regardless of their associated model.
   */
  @JsonIgnore
  @QueryParam("model_name")
  private String modelName;

  /** Token indicating the page of artifact results to fetch */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListWebhooksRequest setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public ListWebhooksRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
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
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, maxResults, modelName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWebhooksRequest.class)
        .add("events", events)
        .add("maxResults", maxResults)
        .add("modelName", modelName)
        .add("pageToken", pageToken)
        .toString();
  }
}
