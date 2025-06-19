// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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
@JsonSerialize(using = ListCleanRoomsResponse.ListCleanRoomsResponseSerializer.class)
@JsonDeserialize(using = ListCleanRoomsResponse.ListCleanRoomsResponseDeserializer.class)
public class ListCleanRoomsResponse {
  /** */
  private Collection<CleanRoom> cleanRooms;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * page_token should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListCleanRoomsResponse setCleanRooms(Collection<CleanRoom> cleanRooms) {
    this.cleanRooms = cleanRooms;
    return this;
  }

  public Collection<CleanRoom> getCleanRooms() {
    return cleanRooms;
  }

  public ListCleanRoomsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomsResponse that = (ListCleanRoomsResponse) o;
    return Objects.equals(cleanRooms, that.cleanRooms)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRooms, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomsResponse.class)
        .add("cleanRooms", cleanRooms)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListCleanRoomsResponsePb toPb() {
    ListCleanRoomsResponsePb pb = new ListCleanRoomsResponsePb();
    pb.setCleanRooms(cleanRooms);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListCleanRoomsResponse fromPb(ListCleanRoomsResponsePb pb) {
    ListCleanRoomsResponse model = new ListCleanRoomsResponse();
    model.setCleanRooms(pb.getCleanRooms());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListCleanRoomsResponseSerializer
      extends JsonSerializer<ListCleanRoomsResponse> {
    @Override
    public void serialize(
        ListCleanRoomsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCleanRoomsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCleanRoomsResponseDeserializer
      extends JsonDeserializer<ListCleanRoomsResponse> {
    @Override
    public ListCleanRoomsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCleanRoomsResponsePb pb = mapper.readValue(p, ListCleanRoomsResponsePb.class);
      return ListCleanRoomsResponse.fromPb(pb);
    }
  }
}
