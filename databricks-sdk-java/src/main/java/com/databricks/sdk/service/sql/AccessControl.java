// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

@Generated
@JsonSerialize(using = AccessControl.AccessControlSerializer.class)
@JsonDeserialize(using = AccessControl.AccessControlDeserializer.class)
public class AccessControl {
  /** */
  private String groupName;

  /**
   * * `CAN_VIEW`: Can view the query * `CAN_RUN`: Can run the query * `CAN_EDIT`: Can edit the
   * query * `CAN_MANAGE`: Can manage the query
   */
  private PermissionLevel permissionLevel;

  /** */
  private String userName;

  public AccessControl setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public AccessControl setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public AccessControl setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccessControl that = (AccessControl) o;
    return Objects.equals(groupName, that.groupName)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, permissionLevel, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(AccessControl.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("userName", userName)
        .toString();
  }

  AccessControlPb toPb() {
    AccessControlPb pb = new AccessControlPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setUserName(userName);

    return pb;
  }

  static AccessControl fromPb(AccessControlPb pb) {
    AccessControl model = new AccessControl();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class AccessControlSerializer extends JsonSerializer<AccessControl> {
    @Override
    public void serialize(AccessControl value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccessControlPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccessControlDeserializer extends JsonDeserializer<AccessControl> {
    @Override
    public AccessControl deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccessControlPb pb = mapper.readValue(p, AccessControlPb.class);
      return AccessControl.fromPb(pb);
    }
  }
}
