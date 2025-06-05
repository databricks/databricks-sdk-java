// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Publicly visible clean room collaborator. */
@Generated
class CleanRoomCollaboratorPb {
  @JsonProperty("collaborator_alias")
  private String collaboratorAlias;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("global_metastore_id")
  private String globalMetastoreId;

  @JsonProperty("invite_recipient_email")
  private String inviteRecipientEmail;

  @JsonProperty("invite_recipient_workspace_id")
  private Long inviteRecipientWorkspaceId;

  @JsonProperty("organization_name")
  private String organizationName;

  public CleanRoomCollaboratorPb setCollaboratorAlias(String collaboratorAlias) {
    this.collaboratorAlias = collaboratorAlias;
    return this;
  }

  public String getCollaboratorAlias() {
    return collaboratorAlias;
  }

  public CleanRoomCollaboratorPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CleanRoomCollaboratorPb setGlobalMetastoreId(String globalMetastoreId) {
    this.globalMetastoreId = globalMetastoreId;
    return this;
  }

  public String getGlobalMetastoreId() {
    return globalMetastoreId;
  }

  public CleanRoomCollaboratorPb setInviteRecipientEmail(String inviteRecipientEmail) {
    this.inviteRecipientEmail = inviteRecipientEmail;
    return this;
  }

  public String getInviteRecipientEmail() {
    return inviteRecipientEmail;
  }

  public CleanRoomCollaboratorPb setInviteRecipientWorkspaceId(Long inviteRecipientWorkspaceId) {
    this.inviteRecipientWorkspaceId = inviteRecipientWorkspaceId;
    return this;
  }

  public Long getInviteRecipientWorkspaceId() {
    return inviteRecipientWorkspaceId;
  }

  public CleanRoomCollaboratorPb setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomCollaboratorPb that = (CleanRoomCollaboratorPb) o;
    return Objects.equals(collaboratorAlias, that.collaboratorAlias)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(globalMetastoreId, that.globalMetastoreId)
        && Objects.equals(inviteRecipientEmail, that.inviteRecipientEmail)
        && Objects.equals(inviteRecipientWorkspaceId, that.inviteRecipientWorkspaceId)
        && Objects.equals(organizationName, that.organizationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        collaboratorAlias,
        displayName,
        globalMetastoreId,
        inviteRecipientEmail,
        inviteRecipientWorkspaceId,
        organizationName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomCollaboratorPb.class)
        .add("collaboratorAlias", collaboratorAlias)
        .add("displayName", displayName)
        .add("globalMetastoreId", globalMetastoreId)
        .add("inviteRecipientEmail", inviteRecipientEmail)
        .add("inviteRecipientWorkspaceId", inviteRecipientWorkspaceId)
        .add("organizationName", organizationName)
        .toString();
  }
}
