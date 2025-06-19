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
@JsonSerialize(using = GetSharePermissionsResponse.GetSharePermissionsResponseSerializer.class)
@JsonDeserialize(using = GetSharePermissionsResponse.GetSharePermissionsResponseDeserializer.class)
public class GetSharePermissionsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** The privileges assigned to each principal */
  private Collection<PrivilegeAssignment> privilegeAssignments;

  public GetSharePermissionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetSharePermissionsResponse setPrivilegeAssignments(
      Collection<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSharePermissionsResponse that = (GetSharePermissionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSharePermissionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }

  GetSharePermissionsResponsePb toPb() {
    GetSharePermissionsResponsePb pb = new GetSharePermissionsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setPrivilegeAssignments(privilegeAssignments);

    return pb;
  }

  static GetSharePermissionsResponse fromPb(GetSharePermissionsResponsePb pb) {
    GetSharePermissionsResponse model = new GetSharePermissionsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrivilegeAssignments(pb.getPrivilegeAssignments());

    return model;
  }

  public static class GetSharePermissionsResponseSerializer
      extends JsonSerializer<GetSharePermissionsResponse> {
    @Override
    public void serialize(
        GetSharePermissionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetSharePermissionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetSharePermissionsResponseDeserializer
      extends JsonDeserializer<GetSharePermissionsResponse> {
    @Override
    public GetSharePermissionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetSharePermissionsResponsePb pb = mapper.readValue(p, GetSharePermissionsResponsePb.class);
      return GetSharePermissionsResponse.fromPb(pb);
    }
  }
}
