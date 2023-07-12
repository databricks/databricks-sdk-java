// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class UpdateRegistryWebhook {
  /**
   * User-specified description for the webhook.
   */
  @JsonProperty("description")
  private String description;
  
  /**
   * Events that can trigger a registry webhook: * `MODEL_VERSION_CREATED`: A
   * new model version was created for the associated model.
   * 
   * * `MODEL_VERSION_TRANSITIONED_STAGE`: A model version’s stage was
   * changed.
   * 
   * * `TRANSITION_REQUEST_CREATED`: A user requested a model version’s stage
   * be transitioned.
   * 
   * * `COMMENT_CREATED`: A user wrote a comment on a registered model.
   * 
   * * `REGISTERED_MODEL_CREATED`: A new registered model was created. This
   * event type can only be specified for a registry-wide webhook, which can be
   * created by not specifying a model name in the create request.
   * 
   * * `MODEL_VERSION_TAG_SET`: A user set a tag on the model version.
   * 
   * * `MODEL_VERSION_TRANSITIONED_TO_STAGING`: A model version was transitioned
   * to staging.
   * 
   * * `MODEL_VERSION_TRANSITIONED_TO_PRODUCTION`: A model version was
   * transitioned to production.
   * 
   * * `MODEL_VERSION_TRANSITIONED_TO_ARCHIVED`: A model version was archived.
   * 
   * * `TRANSITION_REQUEST_TO_STAGING_CREATED`: A user requested a model version
   * be transitioned to staging.
   * 
   * * `TRANSITION_REQUEST_TO_PRODUCTION_CREATED`: A user requested a model
   * version be transitioned to production.
   * 
   * * `TRANSITION_REQUEST_TO_ARCHIVED_CREATED`: A user requested a model
   * version be archived.
   */
  @JsonProperty("events")
  private Collection<RegistryWebhookEvent> events;
  
  /**
   
   */
  @JsonProperty("http_url_spec")
  private HttpUrlSpec httpUrlSpec;
  
  /**
   * Webhook ID
   */
  @JsonProperty("id")
  private String id;
  
  /**
   
   */
  @JsonProperty("job_spec")
  private JobSpec jobSpec;
  
  /**
   * This describes an enum
   */
  @JsonProperty("status")
  private RegistryWebhookStatus status;
  
  public UpdateRegistryWebhook setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }
  
  public UpdateRegistryWebhook setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }
  
  public UpdateRegistryWebhook setHttpUrlSpec(HttpUrlSpec httpUrlSpec) {
    this.httpUrlSpec = httpUrlSpec;
    return this;
  }

  public HttpUrlSpec getHttpUrlSpec() {
    return httpUrlSpec;
  }
  
  public UpdateRegistryWebhook setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
  
  public UpdateRegistryWebhook setJobSpec(JobSpec jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  public JobSpec getJobSpec() {
    return jobSpec;
  }
  
  public UpdateRegistryWebhook setStatus(RegistryWebhookStatus status) {
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
    UpdateRegistryWebhook that = (UpdateRegistryWebhook) o;
    return Objects.equals(description, that.description)
    && Objects.equals(events, that.events)
    && Objects.equals(httpUrlSpec, that.httpUrlSpec)
    && Objects.equals(id, that.id)
    && Objects.equals(jobSpec, that.jobSpec)
    && Objects.equals(status, that.status)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, events, httpUrlSpec, id, jobSpec, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRegistryWebhook.class)
      .add("description", description)
      .add("events", events)
      .add("httpUrlSpec", httpUrlSpec)
      .add("id", id)
      .add("jobSpec", jobSpec)
      .add("status", status).toString();
  }
}
