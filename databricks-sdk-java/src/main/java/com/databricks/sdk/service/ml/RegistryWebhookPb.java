// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class RegistryWebhookPb {
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("description")
  private String description;

  @JsonProperty("events")
  private Collection<RegistryWebhookEvent> events;

  @JsonProperty("http_url_spec")
  private HttpUrlSpecWithoutSecret httpUrlSpec;

  @JsonProperty("id")
  private String id;

  @JsonProperty("job_spec")
  private JobSpecWithoutSecret jobSpec;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("status")
  private RegistryWebhookStatus status;

  public RegistryWebhookPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public RegistryWebhookPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RegistryWebhookPb setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
  }

  public RegistryWebhookPb setHttpUrlSpec(HttpUrlSpecWithoutSecret httpUrlSpec) {
    this.httpUrlSpec = httpUrlSpec;
    return this;
  }

  public HttpUrlSpecWithoutSecret getHttpUrlSpec() {
    return httpUrlSpec;
  }

  public RegistryWebhookPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public RegistryWebhookPb setJobSpec(JobSpecWithoutSecret jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  public JobSpecWithoutSecret getJobSpec() {
    return jobSpec;
  }

  public RegistryWebhookPb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public RegistryWebhookPb setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public RegistryWebhookPb setStatus(RegistryWebhookStatus status) {
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
    RegistryWebhookPb that = (RegistryWebhookPb) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(description, that.description)
        && Objects.equals(events, that.events)
        && Objects.equals(httpUrlSpec, that.httpUrlSpec)
        && Objects.equals(id, that.id)
        && Objects.equals(jobSpec, that.jobSpec)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        description,
        events,
        httpUrlSpec,
        id,
        jobSpec,
        lastUpdatedTimestamp,
        modelName,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(RegistryWebhookPb.class)
        .add("creationTimestamp", creationTimestamp)
        .add("description", description)
        .add("events", events)
        .add("httpUrlSpec", httpUrlSpec)
        .add("id", id)
        .add("jobSpec", jobSpec)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("modelName", modelName)
        .add("status", status)
        .toString();
  }
}
