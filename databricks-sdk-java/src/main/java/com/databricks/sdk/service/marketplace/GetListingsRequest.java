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

/** List listings */
@Generated
@JsonSerialize(using = GetListingsRequest.GetListingsRequestSerializer.class)
@JsonDeserialize(using = GetListingsRequest.GetListingsRequestDeserializer.class)
public class GetListingsRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public GetListingsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GetListingsRequest setPageToken(String pageToken) {
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
    GetListingsRequest that = (GetListingsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  GetListingsRequestPb toPb() {
    GetListingsRequestPb pb = new GetListingsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static GetListingsRequest fromPb(GetListingsRequestPb pb) {
    GetListingsRequest model = new GetListingsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class GetListingsRequestSerializer extends JsonSerializer<GetListingsRequest> {
    @Override
    public void serialize(GetListingsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetListingsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetListingsRequestDeserializer extends JsonDeserializer<GetListingsRequest> {
    @Override
    public GetListingsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetListingsRequestPb pb = mapper.readValue(p, GetListingsRequestPb.class);
      return GetListingsRequest.fromPb(pb);
    }
  }
}
