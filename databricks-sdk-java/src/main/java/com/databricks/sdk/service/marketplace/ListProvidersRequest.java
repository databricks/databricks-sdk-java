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

/** List providers */
@Generated
@JsonSerialize(using = ListProvidersRequest.ListProvidersRequestSerializer.class)
@JsonDeserialize(using = ListProvidersRequest.ListProvidersRequestDeserializer.class)
public class ListProvidersRequest {
  /** */
  private Boolean isFeatured;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListProvidersRequest setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public ListProvidersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListProvidersRequest setPageToken(String pageToken) {
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
    ListProvidersRequest that = (ListProvidersRequest) o;
    return Objects.equals(isFeatured, that.isFeatured)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFeatured, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersRequest.class)
        .add("isFeatured", isFeatured)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListProvidersRequestPb toPb() {
    ListProvidersRequestPb pb = new ListProvidersRequestPb();
    pb.setIsFeatured(isFeatured);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListProvidersRequest fromPb(ListProvidersRequestPb pb) {
    ListProvidersRequest model = new ListProvidersRequest();
    model.setIsFeatured(pb.getIsFeatured());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListProvidersRequestSerializer extends JsonSerializer<ListProvidersRequest> {
    @Override
    public void serialize(
        ListProvidersRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListProvidersRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListProvidersRequestDeserializer
      extends JsonDeserializer<ListProvidersRequest> {
    @Override
    public ListProvidersRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListProvidersRequestPb pb = mapper.readValue(p, ListProvidersRequestPb.class);
      return ListProvidersRequest.fromPb(pb);
    }
  }
}
