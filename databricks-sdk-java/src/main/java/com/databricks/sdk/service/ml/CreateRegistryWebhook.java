// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CreateRegistryWebhook class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /** */
  @JsonProperty("http_url_spec")
  private HttpUrlSpec httpUrlSpec;

  /** */
  @JsonProperty("job_spec")
  private JobSpec jobSpec;

  /** Name of the model whose events would trigger this webhook. */
  @JsonProperty("model_name")
  private String modelName;

  /** This describes an enum */
  @JsonProperty("status")
  private RegistryWebhookStatus status;

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   */
  public CreateRegistryWebhook setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>events</code>.</p>
   *
   * @param events a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   */
  public CreateRegistryWebhook setEvents(Collection<RegistryWebhookEvent> events) {
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
   * <p>Setter for the field <code>httpUrlSpec</code>.</p>
   *
   * @param httpUrlSpec a {@link com.databricks.sdk.service.ml.HttpUrlSpec} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   */
  public CreateRegistryWebhook setHttpUrlSpec(HttpUrlSpec httpUrlSpec) {
    this.httpUrlSpec = httpUrlSpec;
    return this;
  }

  /**
   * <p>Getter for the field <code>httpUrlSpec</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.HttpUrlSpec} object
   */
  public HttpUrlSpec getHttpUrlSpec() {
    return httpUrlSpec;
  }

  /**
   * <p>Setter for the field <code>jobSpec</code>.</p>
   *
   * @param jobSpec a {@link com.databricks.sdk.service.ml.JobSpec} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   */
  public CreateRegistryWebhook setJobSpec(JobSpec jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobSpec</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.JobSpec} object
   */
  public JobSpec getJobSpec() {
    return jobSpec;
  }

  /**
   * <p>Setter for the field <code>modelName</code>.</p>
   *
   * @param modelName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   */
  public CreateRegistryWebhook setModelName(String modelName) {
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
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.ml.RegistryWebhookStatus} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   */
  public CreateRegistryWebhook setStatus(RegistryWebhookStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.RegistryWebhookStatus} object
   */
  public RegistryWebhookStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(description, events, httpUrlSpec, jobSpec, modelName, status);
  }

  /** {@inheritDoc} */
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
