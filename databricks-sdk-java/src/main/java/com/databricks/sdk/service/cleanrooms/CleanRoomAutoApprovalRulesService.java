// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;

/**
 * Clean room auto-approval rules automatically create an approval on your behalf when an asset
 * (e.g. notebook) meeting specific criteria is shared in a clean room.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CleanRoomAutoApprovalRulesService {
  /** Create an auto-approval rule */
  CleanRoomAutoApprovalRule create(
      CreateCleanRoomAutoApprovalRuleRequest createCleanRoomAutoApprovalRuleRequest);

  /** Delete a auto-approval rule by rule ID */
  void delete(DeleteCleanRoomAutoApprovalRuleRequest deleteCleanRoomAutoApprovalRuleRequest);

  /** Get a auto-approval rule by rule ID */
  CleanRoomAutoApprovalRule get(
      GetCleanRoomAutoApprovalRuleRequest getCleanRoomAutoApprovalRuleRequest);

  /** List all auto-approval rules for the caller */
  ListCleanRoomAutoApprovalRulesResponse list(
      ListCleanRoomAutoApprovalRulesRequest listCleanRoomAutoApprovalRulesRequest);

  /** Update a auto-approval rule by rule ID */
  CleanRoomAutoApprovalRule update(
      UpdateCleanRoomAutoApprovalRuleRequest updateCleanRoomAutoApprovalRuleRequest);
}
