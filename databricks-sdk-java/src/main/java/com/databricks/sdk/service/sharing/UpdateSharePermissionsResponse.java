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
    using = UpdateSharePermissionsResponse.UpdateSharePermissionsResponseSerializer.class)
@JsonDeserialize(
    using = UpdateSharePermissionsResponse.UpdateSharePermissionsResponseDeserializer.class)
public class UpdateSharePermissionsResponse {
  /** The privileges assigned to each principal */
  private Collection<PrivilegeAssignment> privilegeAssignments;

  public UpdateSharePermissionsResponse setPrivilegeAssignments(
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
    UpdateSharePermissionsResponse that = (UpdateSharePermissionsResponse) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSharePermissionsResponse.class)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }

  UpdateSharePermissionsResponsePb toPb() {
    UpdateSharePermissionsResponsePb pb = new UpdateSharePermissionsResponsePb();
    pb.setPrivilegeAssignments(privilegeAssignments);

    return pb;
  }

  static UpdateSharePermissionsResponse fromPb(UpdateSharePermissionsResponsePb pb) {
    UpdateSharePermissionsResponse model = new UpdateSharePermissionsResponse();
    model.setPrivilegeAssignments(pb.getPrivilegeAssignments());

    return model;
  }

  public static class UpdateSharePermissionsResponseSerializer
      extends JsonSerializer<UpdateSharePermissionsResponse> {
    @Override
    public void serialize(
        UpdateSharePermissionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateSharePermissionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateSharePermissionsResponseDeserializer
      extends JsonDeserializer<UpdateSharePermissionsResponse> {
    @Override
    public UpdateSharePermissionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateSharePermissionsResponsePb pb =
          mapper.readValue(p, UpdateSharePermissionsResponsePb.class);
      return UpdateSharePermissionsResponse.fromPb(pb);
    }
  }
}
