// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Details required to create a registry webhook. */
@Generated
public class CreateRegistryWebhook {
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
  private Collection<RegistryWebhookEvent> events;

  /** External HTTPS URL called on event trigger (by using a POST request). */
  @JsonProperty("http_url_spec")
  private HttpUrlSpec httpUrlSpec;

  /** ID of the job that the webhook runs. */
  @JsonProperty("job_spec")
  private JobSpec jobSpec;

  /**
   * If model name is not specified, a registry-wide webhook is created that listens for the
   * specified events across all versions of all registered models.
   */
  @JsonProperty("model_name")
  private String modelName;

  /**
   * Enable or disable triggering the webhook, or put the webhook into test mode. The default is
   * `ACTIVE`: * `ACTIVE`: Webhook is triggered when an associated event happens.
   *
   * <p>* `DISABLED`: Webhook is not triggered.
   *
   * <p>* `TEST_MODE`: Webhook can be triggered through the test endpoint, but is not triggered on a
   * real event.
   */
  @JsonProperty("status")
  private RegistryWebhookStatus status;

  public CreateRegistryWebhook setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateRegistryWebhook setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public CreateRegistryWebhook setHttpUrlSpec(HttpUrlSpec httpUrlSpec) {
    this.httpUrlSpec = httpUrlSpec;
    return this;
  }

  public HttpUrlSpec getHttpUrlSpec() {
    return httpUrlSpec;
  }

  public CreateRegistryWebhook setJobSpec(JobSpec jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  public JobSpec getJobSpec() {
    return jobSpec;
  }

  public CreateRegistryWebhook setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public CreateRegistryWebhook setStatus(RegistryWebhookStatus status) {
    this.status = status;
    return this;
  }

  public RegistryWebhookStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRegistryWebhook that = (CreateRegistryWebhook) o;
    return Objects.equals(description, that.description)
        && Objects.equals(events, that.events)
        && Objects.equals(httpUrlSpec, that.httpUrlSpec)
        && Objects.equals(jobSpec, that.jobSpec)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, events, httpUrlSpec, jobSpec, modelName, status);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRegistryWebhook.class)
        .add("description", description)
        .add("events", events)
        .add("httpUrlSpec", httpUrlSpec)
        .add("jobSpec", jobSpec)
        .add("modelName", modelName)
        .add("status", status)
        .toString();
  }
}
