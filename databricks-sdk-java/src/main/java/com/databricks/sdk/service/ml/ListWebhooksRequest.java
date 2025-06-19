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

/** List registry webhooks */
@Generated
@JsonSerialize(using = ListWebhooksRequest.ListWebhooksRequestSerializer.class)
@JsonDeserialize(using = ListWebhooksRequest.ListWebhooksRequestDeserializer.class)
public class ListWebhooksRequest {
  /**
   * If `events` is specified, any webhook with one or more of the specified trigger events is
   * included in the output. If `events` is not specified, webhooks of all event types are included
   * in the output.
   */
  private Collection<RegistryWebhookEvent> events;

  /**
   * If not specified, all webhooks associated with the specified events are listed, regardless of
   * their associated model.
   */
  private String modelName;

  /** Token indicating the page of artifact results to fetch */
  private String pageToken;

  public ListWebhooksRequest setEvents(Collection<RegistryWebhookEvent> events) {
    this.events = events;
    return this;
  }

  public Collection<RegistryWebhookEvent> getEvents() {
    return events;
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
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, modelName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWebhooksRequest.class)
        .add("events", events)
        .add("modelName", modelName)
        .add("pageToken", pageToken)
        .toString();
  }

  ListWebhooksRequestPb toPb() {
    ListWebhooksRequestPb pb = new ListWebhooksRequestPb();
    pb.setEvents(events);
    pb.setModelName(modelName);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListWebhooksRequest fromPb(ListWebhooksRequestPb pb) {
    ListWebhooksRequest model = new ListWebhooksRequest();
    model.setEvents(pb.getEvents());
    model.setModelName(pb.getModelName());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListWebhooksRequestSerializer extends JsonSerializer<ListWebhooksRequest> {
    @Override
    public void serialize(ListWebhooksRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListWebhooksRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListWebhooksRequestDeserializer
      extends JsonDeserializer<ListWebhooksRequest> {
    @Override
    public ListWebhooksRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListWebhooksRequestPb pb = mapper.readValue(p, ListWebhooksRequestPb.class);
      return ListWebhooksRequest.fromPb(pb);
    }
  }
}
