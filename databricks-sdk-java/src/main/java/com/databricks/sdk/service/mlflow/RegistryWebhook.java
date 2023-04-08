// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistryWebhook {
  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** User-specified description for the webhook. */
  @JsonProperty("description")
  private String description;

  /**
   * Events that can trigger a registry webhook: * `MODEL_VERSION_CREATED`: A new model version was
   * created for the associated model.
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
   */
  @JsonProperty("events")
  private java.util.List<RegistryWebhookEvent> events;

  /** */
  @JsonProperty("http_url_spec")
  private HttpUrlSpecWithoutSecret httpUrlSpec;

  /** Webhook ID */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("job_spec")
  private JobSpecWithoutSecret jobSpec;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** Name of the model whose events would trigger this webhook. */
  @JsonProperty("model_name")
  private String modelName;

  /** This describes an enum */
  @JsonProperty("status")
  private RegistryWebhookStatus status;

  public RegistryWebhook setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public RegistryWebhook setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RegistryWebhook setEvents(java.util.List<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public java.util.List<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public RegistryWebhook setHttpUrlSpec(HttpUrlSpecWithoutSecret httpUrlSpec) {
    this.httpUrlSpec = httpUrlSpec;
    return this;
  }

  public HttpUrlSpecWithoutSecret getHttpUrlSpec() {
    return httpUrlSpec;
  }

  public RegistryWebhook setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public RegistryWebhook setJobSpec(JobSpecWithoutSecret jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  public JobSpecWithoutSecret getJobSpec() {
    return jobSpec;
  }

  public RegistryWebhook setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public RegistryWebhook setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public RegistryWebhook setStatus(RegistryWebhookStatus status) {
    this.status = status;
    return this;
  }

  public RegistryWebhookStatus getStatus() {
    return status;
  }
}
