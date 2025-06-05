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
@JsonSerialize(using = ShareToPrivilegeAssignment.ShareToPrivilegeAssignmentSerializer.class)
@JsonDeserialize(using = ShareToPrivilegeAssignment.ShareToPrivilegeAssignmentDeserializer.class)
public class ShareToPrivilegeAssignment {
  /** The privileges assigned to the principal. */
  private Collection<PrivilegeAssignment> privilegeAssignments;

  /** The share name. */
  private String shareName;

  public ShareToPrivilegeAssignment setPrivilegeAssignments(
      Collection<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  public ShareToPrivilegeAssignment setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShareToPrivilegeAssignment that = (ShareToPrivilegeAssignment) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments)
        && Objects.equals(shareName, that.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments, shareName);
  }

  @Override
  public String toString() {
    return new ToStringer(ShareToPrivilegeAssignment.class)
        .add("privilegeAssignments", privilegeAssignments)
        .add("shareName", shareName)
        .toString();
  }

  ShareToPrivilegeAssignmentPb toPb() {
    ShareToPrivilegeAssignmentPb pb = new ShareToPrivilegeAssignmentPb();
    pb.setPrivilegeAssignments(privilegeAssignments);
    pb.setShareName(shareName);

    return pb;
  }

  static ShareToPrivilegeAssignment fromPb(ShareToPrivilegeAssignmentPb pb) {
    ShareToPrivilegeAssignment model = new ShareToPrivilegeAssignment();
    model.setPrivilegeAssignments(pb.getPrivilegeAssignments());
    model.setShareName(pb.getShareName());

    return model;
  }

  public static class ShareToPrivilegeAssignmentSerializer
      extends JsonSerializer<ShareToPrivilegeAssignment> {
    @Override
    public void serialize(
        ShareToPrivilegeAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ShareToPrivilegeAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ShareToPrivilegeAssignmentDeserializer
      extends JsonDeserializer<ShareToPrivilegeAssignment> {
    @Override
    public ShareToPrivilegeAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ShareToPrivilegeAssignmentPb pb = mapper.readValue(p, ShareToPrivilegeAssignmentPb.class);
      return ShareToPrivilegeAssignment.fromPb(pb);
    }
  }
}
