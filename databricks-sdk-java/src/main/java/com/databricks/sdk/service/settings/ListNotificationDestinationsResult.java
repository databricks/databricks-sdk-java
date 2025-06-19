// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
import java.util.Objects;

@Generated
@JsonSerialize(
    using = ListNotificationDestinationsResult.ListNotificationDestinationsResultSerializer.class)
@JsonDeserialize(
    using = ListNotificationDestinationsResult.ListNotificationDestinationsResultDeserializer.class)
public class ListNotificationDestinationsResult {
  /**
   * [Output-only] The type of the notification destination. The type can not be changed once set.
   */
  private DestinationType destinationType;

  /** The display name for the notification destination. */
  private String displayName;

  /** UUID identifying notification destination. */
  private String id;

  public ListNotificationDestinationsResult setDestinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  public DestinationType getDestinationType() {
    return destinationType;
  }

  public ListNotificationDestinationsResult setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListNotificationDestinationsResult setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNotificationDestinationsResult that = (ListNotificationDestinationsResult) o;
    return Objects.equals(destinationType, that.destinationType)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationType, displayName, id);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNotificationDestinationsResult.class)
        .add("destinationType", destinationType)
        .add("displayName", displayName)
        .add("id", id)
        .toString();
  }

  ListNotificationDestinationsResultPb toPb() {
    ListNotificationDestinationsResultPb pb = new ListNotificationDestinationsResultPb();
    pb.setDestinationType(destinationType);
    pb.setDisplayName(displayName);
    pb.setId(id);

    return pb;
  }

  static ListNotificationDestinationsResult fromPb(ListNotificationDestinationsResultPb pb) {
    ListNotificationDestinationsResult model = new ListNotificationDestinationsResult();
    model.setDestinationType(pb.getDestinationType());
    model.setDisplayName(pb.getDisplayName());
    model.setId(pb.getId());

    return model;
  }

  public static class ListNotificationDestinationsResultSerializer
      extends JsonSerializer<ListNotificationDestinationsResult> {
    @Override
    public void serialize(
        ListNotificationDestinationsResult value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListNotificationDestinationsResultPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNotificationDestinationsResultDeserializer
      extends JsonDeserializer<ListNotificationDestinationsResult> {
    @Override
    public ListNotificationDestinationsResult deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNotificationDestinationsResultPb pb =
          mapper.readValue(p, ListNotificationDestinationsResultPb.class);
      return ListNotificationDestinationsResult.fromPb(pb);
    }
  }
}
