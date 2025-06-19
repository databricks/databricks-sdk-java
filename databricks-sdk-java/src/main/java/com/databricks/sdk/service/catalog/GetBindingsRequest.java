// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Get securable workspace bindings */
@Generated
@JsonSerialize(using = GetBindingsRequest.GetBindingsRequestSerializer.class)
@JsonDeserialize(using = GetBindingsRequest.GetBindingsRequestDeserializer.class)
public class GetBindingsRequest {
  /**
   * Maximum number of workspace bindings to return. - When set to 0, the page length is set to a
   * server configured value (recommended); - When set to a value greater than 0, the page length is
   * the minimum of this value and a server configured value; - When set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all the workspace bindings are returned (not
   * recommended).
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  /** The name of the securable. */
  private String securableName;

  /**
   * The type of the securable to bind to a workspace (catalog, storage_credential, credential, or
   * external_location).
   */
  private String securableType;

  public GetBindingsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public GetBindingsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetBindingsRequest setSecurableName(String securableName) {
    this.securableName = securableName;
    return this;
  }

  public String getSecurableName() {
    return securableName;
  }

  public GetBindingsRequest setSecurableType(String securableType) {
    this.securableType = securableType;
    return this;
  }

  public String getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetBindingsRequest that = (GetBindingsRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(securableName, that.securableName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, securableName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBindingsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("securableName", securableName)
        .add("securableType", securableType)
        .toString();
  }

  GetBindingsRequestPb toPb() {
    GetBindingsRequestPb pb = new GetBindingsRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);
    pb.setSecurableName(securableName);
    pb.setSecurableType(securableType);

    return pb;
  }

  static GetBindingsRequest fromPb(GetBindingsRequestPb pb) {
    GetBindingsRequest model = new GetBindingsRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());
    model.setSecurableName(pb.getSecurableName());
    model.setSecurableType(pb.getSecurableType());

    return model;
  }

  public static class GetBindingsRequestSerializer extends JsonSerializer<GetBindingsRequest> {
    @Override
    public void serialize(GetBindingsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetBindingsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetBindingsRequestDeserializer extends JsonDeserializer<GetBindingsRequest> {
    @Override
    public GetBindingsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetBindingsRequestPb pb = mapper.readValue(p, GetBindingsRequestPb.class);
      return GetBindingsRequest.fromPb(pb);
    }
  }
}
