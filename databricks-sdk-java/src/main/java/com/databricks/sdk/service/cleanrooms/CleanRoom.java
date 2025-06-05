// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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
@JsonSerialize(using = CleanRoom.CleanRoomSerializer.class)
@JsonDeserialize(using = CleanRoom.CleanRoomDeserializer.class)
public class CleanRoom {
  /**
   * Whether clean room access is restricted due to [CSP]
   *
   * <p>[CSP]: https://docs.databricks.com/en/security/privacy/security-profile.html
   */
  private CleanRoomAccessRestricted accessRestricted;

  /** */
  private String comment;

  /** When the clean room was created, in epoch milliseconds. */
  private Long createdAt;

  /** The alias of the collaborator tied to the local clean room. */
  private String localCollaboratorAlias;

  /**
   * The name of the clean room. It should follow [UC securable naming requirements].
   *
   * <p>[UC securable naming requirements]:
   * https://docs.databricks.com/en/data-governance/unity-catalog/index.html#securable-object-naming-requirements
   */
  private String name;

  /**
   * Output catalog of the clean room. It is an output only field. Output catalog is manipulated
   * using the separate CreateCleanRoomOutputCatalog API.
   */
  private CleanRoomOutputCatalog outputCatalog;

  /**
   * This is Databricks username of the owner of the local clean room securable for permission
   * management.
   */
  private String owner;

  /**
   * Central clean room details. During creation, users need to specify cloud_vendor, region, and
   * collaborators.global_metastore_id. This field will not be filled in the ListCleanRooms call.
   */
  private CleanRoomRemoteDetail remoteDetailedInfo;

  /** Clean room status. */
  private CleanRoomStatusEnum status;

  /** When the clean room was last updated, in epoch milliseconds. */
  private Long updatedAt;

  public CleanRoom setAccessRestricted(CleanRoomAccessRestricted accessRestricted) {
    this.accessRestricted = accessRestricted;
    return this;
  }

  public CleanRoomAccessRestricted getAccessRestricted() {
    return accessRestricted;
  }

  public CleanRoom setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CleanRoom setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CleanRoom setLocalCollaboratorAlias(String localCollaboratorAlias) {
    this.localCollaboratorAlias = localCollaboratorAlias;
    return this;
  }

  public String getLocalCollaboratorAlias() {
    return localCollaboratorAlias;
  }

  public CleanRoom setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CleanRoom setOutputCatalog(CleanRoomOutputCatalog outputCatalog) {
    this.outputCatalog = outputCatalog;
    return this;
  }

  public CleanRoomOutputCatalog getOutputCatalog() {
    return outputCatalog;
  }

  public CleanRoom setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CleanRoom setRemoteDetailedInfo(CleanRoomRemoteDetail remoteDetailedInfo) {
    this.remoteDetailedInfo = remoteDetailedInfo;
    return this;
  }

  public CleanRoomRemoteDetail getRemoteDetailedInfo() {
    return remoteDetailedInfo;
  }

  public CleanRoom setStatus(CleanRoomStatusEnum status) {
    this.status = status;
    return this;
  }

  public CleanRoomStatusEnum getStatus() {
    return status;
  }

  public CleanRoom setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoom that = (CleanRoom) o;
    return Objects.equals(accessRestricted, that.accessRestricted)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(localCollaboratorAlias, that.localCollaboratorAlias)
        && Objects.equals(name, that.name)
        && Objects.equals(outputCatalog, that.outputCatalog)
        && Objects.equals(owner, that.owner)
        && Objects.equals(remoteDetailedInfo, that.remoteDetailedInfo)
        && Objects.equals(status, that.status)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessRestricted,
        comment,
        createdAt,
        localCollaboratorAlias,
        name,
        outputCatalog,
        owner,
        remoteDetailedInfo,
        status,
        updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoom.class)
        .add("accessRestricted", accessRestricted)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("localCollaboratorAlias", localCollaboratorAlias)
        .add("name", name)
        .add("outputCatalog", outputCatalog)
        .add("owner", owner)
        .add("remoteDetailedInfo", remoteDetailedInfo)
        .add("status", status)
        .add("updatedAt", updatedAt)
        .toString();
  }

  CleanRoomPb toPb() {
    CleanRoomPb pb = new CleanRoomPb();
    pb.setAccessRestricted(accessRestricted);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setLocalCollaboratorAlias(localCollaboratorAlias);
    pb.setName(name);
    pb.setOutputCatalog(outputCatalog);
    pb.setOwner(owner);
    pb.setRemoteDetailedInfo(remoteDetailedInfo);
    pb.setStatus(status);
    pb.setUpdatedAt(updatedAt);

    return pb;
  }

  static CleanRoom fromPb(CleanRoomPb pb) {
    CleanRoom model = new CleanRoom();
    model.setAccessRestricted(pb.getAccessRestricted());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setLocalCollaboratorAlias(pb.getLocalCollaboratorAlias());
    model.setName(pb.getName());
    model.setOutputCatalog(pb.getOutputCatalog());
    model.setOwner(pb.getOwner());
    model.setRemoteDetailedInfo(pb.getRemoteDetailedInfo());
    model.setStatus(pb.getStatus());
    model.setUpdatedAt(pb.getUpdatedAt());

    return model;
  }

  public static class CleanRoomSerializer extends JsonSerializer<CleanRoom> {
    @Override
    public void serialize(CleanRoom value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomDeserializer extends JsonDeserializer<CleanRoom> {
    @Override
    public CleanRoom deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomPb pb = mapper.readValue(p, CleanRoomPb.class);
      return CleanRoom.fromPb(pb);
    }
  }
}
