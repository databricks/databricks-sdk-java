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
import java.util.Objects;

/** List assets */
@Generated
@JsonSerialize(using = ListCleanRoomAssetsRequest.ListCleanRoomAssetsRequestSerializer.class)
@JsonDeserialize(using = ListCleanRoomAssetsRequest.ListCleanRoomAssetsRequestDeserializer.class)
public class ListCleanRoomAssetsRequest {
  /** Name of the clean room. */
  private String cleanRoomName;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListCleanRoomAssetsRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public ListCleanRoomAssetsRequest setPageToken(String pageToken) {
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
    ListCleanRoomAssetsRequest that = (ListCleanRoomAssetsRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetsRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("pageToken", pageToken)
        .toString();
  }

  ListCleanRoomAssetsRequestPb toPb() {
    ListCleanRoomAssetsRequestPb pb = new ListCleanRoomAssetsRequestPb();
    pb.setCleanRoomName(cleanRoomName);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListCleanRoomAssetsRequest fromPb(ListCleanRoomAssetsRequestPb pb) {
    ListCleanRoomAssetsRequest model = new ListCleanRoomAssetsRequest();
    model.setCleanRoomName(pb.getCleanRoomName());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListCleanRoomAssetsRequestSerializer
      extends JsonSerializer<ListCleanRoomAssetsRequest> {
    @Override
    public void serialize(
        ListCleanRoomAssetsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCleanRoomAssetsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCleanRoomAssetsRequestDeserializer
      extends JsonDeserializer<ListCleanRoomAssetsRequest> {
    @Override
    public ListCleanRoomAssetsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCleanRoomAssetsRequestPb pb = mapper.readValue(p, ListCleanRoomAssetsRequestPb.class);
      return ListCleanRoomAssetsRequest.fromPb(pb);
    }
  }
}
