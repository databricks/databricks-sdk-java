// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateRegistryWebhookPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("events")
  private Collection<RegistryWebhookEvent> events;

  @JsonProperty("http_url_spec")
  private HttpUrlSpec httpUrlSpec;

  @JsonProperty("job_spec")
  private JobSpec jobSpec;

  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("status")
  private RegistryWebhookStatus status;

  public CreateRegistryWebhookPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateRegistryWebhookPb setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public CreateRegistryWebhookPb setHttpUrlSpec(HttpUrlSpec httpUrlSpec) {
    this.httpUrlSpec = httpUrlSpec;
    return this;
  }

  public HttpUrlSpec getHttpUrlSpec() {
    return httpUrlSpec;
  }

  public CreateRegistryWebhookPb setJobSpec(JobSpec jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  public JobSpec getJobSpec() {
    return jobSpec;
  }

  public CreateRegistryWebhookPb setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public CreateRegistryWebhookPb setStatus(RegistryWebhookStatus status) {
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
    CreateRegistryWebhookPb that = (CreateRegistryWebhookPb) o;
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
    return new ToStringer(CreateRegistryWebhookPb.class)
        .add("description", description)
        .add("events", events)
        .add("httpUrlSpec", httpUrlSpec)
        .add("jobSpec", jobSpec)
        .add("modelName", modelName)
        .add("status", status)
        .toString();
  }
}
