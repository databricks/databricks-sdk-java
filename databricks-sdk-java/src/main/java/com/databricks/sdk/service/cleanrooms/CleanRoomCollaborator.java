// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Publicly visible clean room collaborator. */
@Generated
public class CleanRoomCollaborator {
  /**
   * Collaborator alias specified by the clean room creator. It is unique across all collaborators
   * of this clean room, and used to derive multiple values internally such as catalog alias and
   * clean room name for single metastore clean rooms. It should follow [UC securable naming
   * requirements].
   *
   * <p>[UC securable naming requirements]:
   * https://docs.databricks.com/en/data-governance/unity-catalog/index.html#securable-object-naming-requirements
   */
  @JsonProperty("collaborator_alias")
  private String collaboratorAlias;

  /**
   * Generated display name for the collaborator. In the case of a single metastore clean room, it
   * is the clean room name. For x-metastore clean rooms, it is the organization name of the
   * metastore. It is not restricted to these values and could change in the future
   */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The global Unity Catalog metastore id of the collaborator. The identifier is of format
   * cloud:region:metastore-uuid.
   */
  @JsonProperty("global_metastore_id")
  private String globalMetastoreId;

  /**
   * Email of the user who is receiving the clean room "invitation". It should be empty for the
   * creator of the clean room, and non-empty for the invitees of the clean room. It is only
   * returned in the output when clean room creator calls GET
   */
  @JsonProperty("invite_recipient_email")
  private String inviteRecipientEmail;

  /**
   * Workspace ID of the user who is receiving the clean room "invitation". Must be specified if
   * invite_recipient_email is specified. It should be empty when the collaborator is the creator of
   * the clean room.
   */
  @JsonProperty("invite_recipient_workspace_id")
  private Long inviteRecipientWorkspaceId;

  /**
   * [Organization name](:method:metastores/list#metastores-delta_sharing_organization_name)
   * configured in the metastore
   */
  @JsonProperty("organization_name")
  private String organizationName;

  public CleanRoomCollaborator setCollaboratorAlias(String collaboratorAlias) {
    this.collaboratorAlias = collaboratorAlias;
    return this;
  }

  public String getCollaboratorAlias() {
    return collaboratorAlias;
  }

  public CleanRoomCollaborator setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CleanRoomCollaborator setGlobalMetastoreId(String globalMetastoreId) {
    this.globalMetastoreId = globalMetastoreId;
    return this;
  }

  public String getGlobalMetastoreId() {
    return globalMetastoreId;
  }

  public CleanRoomCollaborator setInviteRecipientEmail(String inviteRecipientEmail) {
    this.inviteRecipientEmail = inviteRecipientEmail;
    return this;
  }

  public String getInviteRecipientEmail() {
    return inviteRecipientEmail;
  }

  public CleanRoomCollaborator setInviteRecipientWorkspaceId(Long inviteRecipientWorkspaceId) {
    this.inviteRecipientWorkspaceId = inviteRecipientWorkspaceId;
    return this;
  }

  public Long getInviteRecipientWorkspaceId() {
    return inviteRecipientWorkspaceId;
  }

  public CleanRoomCollaborator setOrganizationName(String organizationName) {
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
    CleanRoomCollaborator that = (CleanRoomCollaborator) o;
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
    return new ToStringer(CleanRoomCollaborator.class)
        .add("collaboratorAlias", collaboratorAlias)
        .add("displayName", displayName)
        .add("globalMetastoreId", globalMetastoreId)
        .add("inviteRecipientEmail", inviteRecipientEmail)
        .add("inviteRecipientWorkspaceId", inviteRecipientWorkspaceId)
        .add("organizationName", organizationName)
        .toString();
  }
}
