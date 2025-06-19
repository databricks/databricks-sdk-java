// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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

/** Get custom oauth app integrations */
@Generated
@JsonSerialize(
    using = ListCustomAppIntegrationsRequest.ListCustomAppIntegrationsRequestSerializer.class)
@JsonDeserialize(
    using = ListCustomAppIntegrationsRequest.ListCustomAppIntegrationsRequestDeserializer.class)
public class ListCustomAppIntegrationsRequest {
  /** */
  private Boolean includeCreatorUsername;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListCustomAppIntegrationsRequest setIncludeCreatorUsername(
      Boolean includeCreatorUsername) {
    this.includeCreatorUsername = includeCreatorUsername;
    return this;
  }

  public Boolean getIncludeCreatorUsername() {
    return includeCreatorUsername;
  }

  public ListCustomAppIntegrationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCustomAppIntegrationsRequest setPageToken(String pageToken) {
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
    ListCustomAppIntegrationsRequest that = (ListCustomAppIntegrationsRequest) o;
    return Objects.equals(includeCreatorUsername, that.includeCreatorUsername)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeCreatorUsername, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCustomAppIntegrationsRequest.class)
        .add("includeCreatorUsername", includeCreatorUsername)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListCustomAppIntegrationsRequestPb toPb() {
    ListCustomAppIntegrationsRequestPb pb = new ListCustomAppIntegrationsRequestPb();
    pb.setIncludeCreatorUsername(includeCreatorUsername);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListCustomAppIntegrationsRequest fromPb(ListCustomAppIntegrationsRequestPb pb) {
    ListCustomAppIntegrationsRequest model = new ListCustomAppIntegrationsRequest();
    model.setIncludeCreatorUsername(pb.getIncludeCreatorUsername());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListCustomAppIntegrationsRequestSerializer
      extends JsonSerializer<ListCustomAppIntegrationsRequest> {
    @Override
    public void serialize(
        ListCustomAppIntegrationsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCustomAppIntegrationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCustomAppIntegrationsRequestDeserializer
      extends JsonDeserializer<ListCustomAppIntegrationsRequest> {
    @Override
    public ListCustomAppIntegrationsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCustomAppIntegrationsRequestPb pb =
          mapper.readValue(p, ListCustomAppIntegrationsRequestPb.class);
      return ListCustomAppIntegrationsRequest.fromPb(pb);
    }
  }
}
