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
@JsonSerialize(using = ListCleanRoomAssetsResponse.ListCleanRoomAssetsResponseSerializer.class)
@JsonDeserialize(using = ListCleanRoomAssetsResponse.ListCleanRoomAssetsResponseDeserializer.class)
public class ListCleanRoomAssetsResponse {
  /** Assets in the clean room. */
  private Collection<CleanRoomAsset> assets;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * page_token should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListCleanRoomAssetsResponse setAssets(Collection<CleanRoomAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<CleanRoomAsset> getAssets() {
    return assets;
  }

  public ListCleanRoomAssetsResponse setNextPageToken(String nextPageToken) {
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
    ListCleanRoomAssetsResponse that = (ListCleanRoomAssetsResponse) o;
    return Objects.equals(assets, that.assets) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAssetsResponse.class)
        .add("assets", assets)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListCleanRoomAssetsResponsePb toPb() {
    ListCleanRoomAssetsResponsePb pb = new ListCleanRoomAssetsResponsePb();
    pb.setAssets(assets);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListCleanRoomAssetsResponse fromPb(ListCleanRoomAssetsResponsePb pb) {
    ListCleanRoomAssetsResponse model = new ListCleanRoomAssetsResponse();
    model.setAssets(pb.getAssets());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListCleanRoomAssetsResponseSerializer
      extends JsonSerializer<ListCleanRoomAssetsResponse> {
    @Override
    public void serialize(
        ListCleanRoomAssetsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCleanRoomAssetsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCleanRoomAssetsResponseDeserializer
      extends JsonDeserializer<ListCleanRoomAssetsResponse> {
    @Override
    public ListCleanRoomAssetsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCleanRoomAssetsResponsePb pb = mapper.readValue(p, ListCleanRoomAssetsResponsePb.class);
      return ListCleanRoomAssetsResponse.fromPb(pb);
    }
  }
}
