// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomAutoApprovalRule {
  /**
   * Collaborator alias of the author covered by the rule. Only one of `author_collaborator_alias`
   * and `author_scope` can be set.
   */
  @JsonProperty("author_collaborator_alias")
  private String authorCollaboratorAlias;

  /**
   * Scope of authors covered by the rule. Only one of `author_collaborator_alias` and
   * `author_scope` can be set.
   */
  @JsonProperty("author_scope")
  private CleanRoomAutoApprovalRuleAuthorScope authorScope;

  /** The name of the clean room this auto-approval rule belongs to. */
  @JsonProperty("clean_room_name")
  private String cleanRoomName;

  /** Timestamp of when the rule was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** A generated UUID identifying the rule. */
  @JsonProperty("rule_id")
  private String ruleId;

  /** The owner of the rule to whom the rule applies. */
  @JsonProperty("rule_owner_collaborator_alias")
  private String ruleOwnerCollaboratorAlias;

  /** Collaborator alias of the runner covered by the rule. */
  @JsonProperty("runner_collaborator_alias")
  private String runnerCollaboratorAlias;

  public CleanRoomAutoApprovalRule setAuthorCollaboratorAlias(String authorCollaboratorAlias) {
    this.authorCollaboratorAlias = authorCollaboratorAlias;
    return this;
  }

  public String getAuthorCollaboratorAlias() {
    return authorCollaboratorAlias;
  }

  public CleanRoomAutoApprovalRule setAuthorScope(
      CleanRoomAutoApprovalRuleAuthorScope authorScope) {
    this.authorScope = authorScope;
    return this;
  }

  public CleanRoomAutoApprovalRuleAuthorScope getAuthorScope() {
    return authorScope;
  }

  public CleanRoomAutoApprovalRule setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public CleanRoomAutoApprovalRule setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CleanRoomAutoApprovalRule setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public CleanRoomAutoApprovalRule setRuleOwnerCollaboratorAlias(
      String ruleOwnerCollaboratorAlias) {
    this.ruleOwnerCollaboratorAlias = ruleOwnerCollaboratorAlias;
    return this;
  }

  public String getRuleOwnerCollaboratorAlias() {
    return ruleOwnerCollaboratorAlias;
  }

  public CleanRoomAutoApprovalRule setRunnerCollaboratorAlias(String runnerCollaboratorAlias) {
    this.runnerCollaboratorAlias = runnerCollaboratorAlias;
    return this;
  }

  public String getRunnerCollaboratorAlias() {
    return runnerCollaboratorAlias;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAutoApprovalRule that = (CleanRoomAutoApprovalRule) o;
    return Objects.equals(authorCollaboratorAlias, that.authorCollaboratorAlias)
        && Objects.equals(authorScope, that.authorScope)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(ruleId, that.ruleId)
        && Objects.equals(ruleOwnerCollaboratorAlias, that.ruleOwnerCollaboratorAlias)
        && Objects.equals(runnerCollaboratorAlias, that.runnerCollaboratorAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authorCollaboratorAlias,
        authorScope,
        cleanRoomName,
        createdAt,
        ruleId,
        ruleOwnerCollaboratorAlias,
        runnerCollaboratorAlias);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAutoApprovalRule.class)
        .add("authorCollaboratorAlias", authorCollaboratorAlias)
        .add("authorScope", authorScope)
        .add("cleanRoomName", cleanRoomName)
        .add("createdAt", createdAt)
        .add("ruleId", ruleId)
        .add("ruleOwnerCollaboratorAlias", ruleOwnerCollaboratorAlias)
        .add("runnerCollaboratorAlias", runnerCollaboratorAlias)
        .toString();
  }
}
