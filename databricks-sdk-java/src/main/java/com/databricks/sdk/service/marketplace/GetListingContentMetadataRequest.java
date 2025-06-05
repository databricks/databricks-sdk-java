// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** Get listing content metadata */
@Generated
@JsonSerialize(
    using = GetListingContentMetadataRequest.GetListingContentMetadataRequestSerializer.class)
@JsonDeserialize(
    using = GetListingContentMetadataRequest.GetListingContentMetadataRequestDeserializer.class)
public class GetListingContentMetadataRequest {
  /** */
  private String listingId;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public GetListingContentMetadataRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public GetListingContentMetadataRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GetListingContentMetadataRequest setPageToken(String pageToken) {
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
    GetListingContentMetadataRequest that = (GetListingContentMetadataRequest) o;
    return Objects.equals(listingId, that.listingId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingContentMetadataRequest.class)
        .add("listingId", listingId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  GetListingContentMetadataRequestPb toPb() {
    GetListingContentMetadataRequestPb pb = new GetListingContentMetadataRequestPb();
    pb.setListingId(listingId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static GetListingContentMetadataRequest fromPb(GetListingContentMetadataRequestPb pb) {
    GetListingContentMetadataRequest model = new GetListingContentMetadataRequest();
    model.setListingId(pb.getListingId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class GetListingContentMetadataRequestSerializer
      extends JsonSerializer<GetListingContentMetadataRequest> {
    @Override
    public void serialize(
        GetListingContentMetadataRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetListingContentMetadataRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetListingContentMetadataRequestDeserializer
      extends JsonDeserializer<GetListingContentMetadataRequest> {
    @Override
    public GetListingContentMetadataRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetListingContentMetadataRequestPb pb =
          mapper.readValue(p, GetListingContentMetadataRequestPb.class);
      return GetListingContentMetadataRequest.fromPb(pb);
    }
  }
}
