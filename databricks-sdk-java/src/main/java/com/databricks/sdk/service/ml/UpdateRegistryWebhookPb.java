// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateRegistryWebhookPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("events")
  private Collection<RegistryWebhookEvent> events;

  @JsonProperty("http_url_spec")
  private HttpUrlSpec httpUrlSpec;

  @JsonProperty("id")
  private String id;

  @JsonProperty("job_spec")
  private JobSpec jobSpec;

  @JsonProperty("status")
  private RegistryWebhookStatus status;

  public UpdateRegistryWebhookPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateRegistryWebhookPb setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public UpdateRegistryWebhookPb setHttpUrlSpec(HttpUrlSpec httpUrlSpec) {
    this.httpUrlSpec = httpUrlSpec;
    return this;
  }

  public HttpUrlSpec getHttpUrlSpec() {
    return httpUrlSpec;
  }

  public UpdateRegistryWebhookPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateRegistryWebhookPb setJobSpec(JobSpec jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  public JobSpec getJobSpec() {
    return jobSpec;
  }

  public UpdateRegistryWebhookPb setStatus(RegistryWebhookStatus status) {
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
    UpdateRegistryWebhookPb that = (UpdateRegistryWebhookPb) o;
    return Objects.equals(description, that.description)
        && Objects.equals(events, that.events)
        && Objects.equals(httpUrlSpec, that.httpUrlSpec)
        && Objects.equals(id, that.id)
        && Objects.equals(jobSpec, that.jobSpec)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, events, httpUrlSpec, id, jobSpec, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRegistryWebhookPb.class)
        .add("description", description)
        .add("events", events)
        .add("httpUrlSpec", httpUrlSpec)
        .add("id", id)
        .add("jobSpec", jobSpec)
        .add("status", status)
        .toString();
  }
}
