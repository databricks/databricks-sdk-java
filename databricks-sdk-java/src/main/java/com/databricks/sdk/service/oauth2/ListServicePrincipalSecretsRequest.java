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

/** List service principal secrets */
@Generated
@JsonSerialize(
    using = ListServicePrincipalSecretsRequest.ListServicePrincipalSecretsRequestSerializer.class)
@JsonDeserialize(
    using = ListServicePrincipalSecretsRequest.ListServicePrincipalSecretsRequestDeserializer.class)
public class ListServicePrincipalSecretsRequest {
  /**
   * An opaque page token which was the `next_page_token` in the response of the previous request to
   * list the secrets for this service principal. Provide this token to retrieve the next page of
   * secret entries. When providing a `page_token`, all other parameters provided to the request
   * must match the previous request. To list all of the secrets for a service principal, it is
   * necessary to continue requesting pages of entries until the response contains no
   * `next_page_token`. Note that the number of entries returned must not be used to determine when
   * the listing is complete.
   */
  private String pageToken;

  /** The service principal ID. */
  private Long servicePrincipalId;

  public ListServicePrincipalSecretsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListServicePrincipalSecretsRequest setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalSecretsRequest that = (ListServicePrincipalSecretsRequest) o;
    return Objects.equals(pageToken, that.pageToken)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalSecretsRequest.class)
        .add("pageToken", pageToken)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }

  ListServicePrincipalSecretsRequestPb toPb() {
    ListServicePrincipalSecretsRequestPb pb = new ListServicePrincipalSecretsRequestPb();
    pb.setPageToken(pageToken);
    pb.setServicePrincipalId(servicePrincipalId);

    return pb;
  }

  static ListServicePrincipalSecretsRequest fromPb(ListServicePrincipalSecretsRequestPb pb) {
    ListServicePrincipalSecretsRequest model = new ListServicePrincipalSecretsRequest();
    model.setPageToken(pb.getPageToken());
    model.setServicePrincipalId(pb.getServicePrincipalId());

    return model;
  }

  public static class ListServicePrincipalSecretsRequestSerializer
      extends JsonSerializer<ListServicePrincipalSecretsRequest> {
    @Override
    public void serialize(
        ListServicePrincipalSecretsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListServicePrincipalSecretsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListServicePrincipalSecretsRequestDeserializer
      extends JsonDeserializer<ListServicePrincipalSecretsRequest> {
    @Override
    public ListServicePrincipalSecretsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListServicePrincipalSecretsRequestPb pb =
          mapper.readValue(p, ListServicePrincipalSecretsRequestPb.class);
      return ListServicePrincipalSecretsRequest.fromPb(pb);
    }
  }
}
