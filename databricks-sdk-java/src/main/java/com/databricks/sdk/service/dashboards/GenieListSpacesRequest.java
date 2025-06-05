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
import java.util.Objects;

/** List Genie spaces */
@Generated
@JsonSerialize(using = GenieListSpacesRequest.GenieListSpacesRequestSerializer.class)
@JsonDeserialize(using = GenieListSpacesRequest.GenieListSpacesRequestDeserializer.class)
public class GenieListSpacesRequest {
  /** Maximum number of spaces to return per page */
  private Long pageSize;

  /** Pagination token for getting the next page of results */
  private String pageToken;

  public GenieListSpacesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GenieListSpacesRequest setPageToken(String pageToken) {
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
    GenieListSpacesRequest that = (GenieListSpacesRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListSpacesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  GenieListSpacesRequestPb toPb() {
    GenieListSpacesRequestPb pb = new GenieListSpacesRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static GenieListSpacesRequest fromPb(GenieListSpacesRequestPb pb) {
    GenieListSpacesRequest model = new GenieListSpacesRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class GenieListSpacesRequestSerializer
      extends JsonSerializer<GenieListSpacesRequest> {
    @Override
    public void serialize(
        GenieListSpacesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieListSpacesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieListSpacesRequestDeserializer
      extends JsonDeserializer<GenieListSpacesRequest> {
    @Override
    public GenieListSpacesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieListSpacesRequestPb pb = mapper.readValue(p, GenieListSpacesRequestPb.class);
      return GenieListSpacesRequest.fromPb(pb);
    }
  }
}
