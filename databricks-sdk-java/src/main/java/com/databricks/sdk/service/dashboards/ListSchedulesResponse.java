// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = ListSchedulesResponse.ListSchedulesResponseSerializer.class)
@JsonDeserialize(using = ListSchedulesResponse.ListSchedulesResponseDeserializer.class)
public class ListSchedulesResponse {
  /**
   * A token that can be used as a `page_token` in subsequent requests to retrieve the next page of
   * results. If this field is omitted, there are no subsequent schedules.
   */
  private String nextPageToken;

  /** */
  private Collection<Schedule> schedules;

  public ListSchedulesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSchedulesResponse setSchedules(Collection<Schedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  public Collection<Schedule> getSchedules() {
    return schedules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchedulesResponse that = (ListSchedulesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(schedules, that.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, schedules);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchedulesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("schedules", schedules)
        .toString();
  }

  ListSchedulesResponsePb toPb() {
    ListSchedulesResponsePb pb = new ListSchedulesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setSchedules(schedules);

    return pb;
  }

  static ListSchedulesResponse fromPb(ListSchedulesResponsePb pb) {
    ListSchedulesResponse model = new ListSchedulesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setSchedules(pb.getSchedules());

    return model;
  }

  public static class ListSchedulesResponseSerializer
      extends JsonSerializer<ListSchedulesResponse> {
    @Override
    public void serialize(
        ListSchedulesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSchedulesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSchedulesResponseDeserializer
      extends JsonDeserializer<ListSchedulesResponse> {
    @Override
    public ListSchedulesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSchedulesResponsePb pb = mapper.readValue(p, ListSchedulesResponsePb.class);
      return ListSchedulesResponse.fromPb(pb);
    }
  }
}
