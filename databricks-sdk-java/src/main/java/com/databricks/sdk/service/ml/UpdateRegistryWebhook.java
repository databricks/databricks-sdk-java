// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = UpdateRegistryWebhook.UpdateRegistryWebhookSerializer.class)
@JsonDeserialize(using = UpdateRegistryWebhook.UpdateRegistryWebhookDeserializer.class)
public class UpdateRegistryWebhook {
  /** User-specified description for the webhook. */
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
  private Collection<RegistryWebhookEvent> events;

  /** */
  private HttpUrlSpec httpUrlSpec;

  /** Webhook ID */
  private String id;

  /** */
  private JobSpec jobSpec;

  /**
   * Enable or disable triggering the webhook, or put the webhook into test mode. The default is
   * `ACTIVE`: * `ACTIVE`: Webhook is triggered when an associated event happens.
   *
   * <p>* `DISABLED`: Webhook is not triggered.
   *
   * <p>* `TEST_MODE`: Webhook can be triggered through the test endpoint, but is not triggered on a
   * real event.
   */
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
        && Objects.equals(status, that.status);
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
        .add("status", status)
        .toString();
  }

  UpdateRegistryWebhookPb toPb() {
    UpdateRegistryWebhookPb pb = new UpdateRegistryWebhookPb();
    pb.setDescription(description);
    pb.setEvents(events);
    pb.setHttpUrlSpec(httpUrlSpec);
    pb.setId(id);
    pb.setJobSpec(jobSpec);
    pb.setStatus(status);

    return pb;
  }

  static UpdateRegistryWebhook fromPb(UpdateRegistryWebhookPb pb) {
    UpdateRegistryWebhook model = new UpdateRegistryWebhook();
    model.setDescription(pb.getDescription());
    model.setEvents(pb.getEvents());
    model.setHttpUrlSpec(pb.getHttpUrlSpec());
    model.setId(pb.getId());
    model.setJobSpec(pb.getJobSpec());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class UpdateRegistryWebhookSerializer
      extends JsonSerializer<UpdateRegistryWebhook> {
    @Override
    public void serialize(
        UpdateRegistryWebhook value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateRegistryWebhookPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateRegistryWebhookDeserializer
      extends JsonDeserializer<UpdateRegistryWebhook> {
    @Override
    public UpdateRegistryWebhook deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateRegistryWebhookPb pb = mapper.readValue(p, UpdateRegistryWebhookPb.class);
      return UpdateRegistryWebhook.fromPb(pb);
    }
  }
}
