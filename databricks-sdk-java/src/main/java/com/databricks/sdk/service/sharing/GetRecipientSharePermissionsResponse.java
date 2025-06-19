// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(
    using =
        GetRecipientSharePermissionsResponse.GetRecipientSharePermissionsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetRecipientSharePermissionsResponse.GetRecipientSharePermissionsResponseDeserializer.class)
public class GetRecipientSharePermissionsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** An array of data share permissions for a recipient. */
  private Collection<ShareToPrivilegeAssignment> permissionsOut;

  public GetRecipientSharePermissionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetRecipientSharePermissionsResponse setPermissionsOut(
      Collection<ShareToPrivilegeAssignment> permissionsOut) {
    this.permissionsOut = permissionsOut;
    return this;
  }

  public Collection<ShareToPrivilegeAssignment> getPermissionsOut() {
    return permissionsOut;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRecipientSharePermissionsResponse that = (GetRecipientSharePermissionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(permissionsOut, that.permissionsOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, permissionsOut);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRecipientSharePermissionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("permissionsOut", permissionsOut)
        .toString();
  }

  GetRecipientSharePermissionsResponsePb toPb() {
    GetRecipientSharePermissionsResponsePb pb = new GetRecipientSharePermissionsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setPermissionsOut(permissionsOut);

    return pb;
  }

  static GetRecipientSharePermissionsResponse fromPb(GetRecipientSharePermissionsResponsePb pb) {
    GetRecipientSharePermissionsResponse model = new GetRecipientSharePermissionsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPermissionsOut(pb.getPermissionsOut());

    return model;
  }

  public static class GetRecipientSharePermissionsResponseSerializer
      extends JsonSerializer<GetRecipientSharePermissionsResponse> {
    @Override
    public void serialize(
        GetRecipientSharePermissionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRecipientSharePermissionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRecipientSharePermissionsResponseDeserializer
      extends JsonDeserializer<GetRecipientSharePermissionsResponse> {
    @Override
    public GetRecipientSharePermissionsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRecipientSharePermissionsResponsePb pb =
          mapper.readValue(p, GetRecipientSharePermissionsResponsePb.class);
      return GetRecipientSharePermissionsResponse.fromPb(pb);
    }
  }
}
