// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clean room auto-approval rules automatically create an approval on your behalf when an asset
 * (e.g. notebook) meeting specific criteria is shared in a clean room.
 */
@Generated
public class CleanRoomAutoApprovalRulesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CleanRoomAutoApprovalRulesAPI.class);

  private final CleanRoomAutoApprovalRulesService impl;

  /** Regular-use constructor */
  public CleanRoomAutoApprovalRulesAPI(ApiClient apiClient) {
    impl = new CleanRoomAutoApprovalRulesImpl(apiClient);
  }

  /** Constructor for mocks */
  public CleanRoomAutoApprovalRulesAPI(CleanRoomAutoApprovalRulesService mock) {
    impl = mock;
  }

  /** Create an auto-approval rule */
  public CleanRoomAutoApprovalRule create(CreateCleanRoomAutoApprovalRuleRequest request) {
    return impl.create(request);
  }

  public void delete(String cleanRoomName, String ruleId) {
    delete(
        new DeleteCleanRoomAutoApprovalRuleRequest()
            .setCleanRoomName(cleanRoomName)
            .setRuleId(ruleId));
  }

  /** Delete a auto-approval rule by rule ID */
  public void delete(DeleteCleanRoomAutoApprovalRuleRequest request) {
    impl.delete(request);
  }

  public CleanRoomAutoApprovalRule get(String cleanRoomName, String ruleId) {
    return get(
        new GetCleanRoomAutoApprovalRuleRequest()
            .setCleanRoomName(cleanRoomName)
            .setRuleId(ruleId));
  }

  /** Get a auto-approval rule by rule ID */
  public CleanRoomAutoApprovalRule get(GetCleanRoomAutoApprovalRuleRequest request) {
    return impl.get(request);
  }

  public Iterable<CleanRoomAutoApprovalRule> list(String cleanRoomName) {
    return list(new ListCleanRoomAutoApprovalRulesRequest().setCleanRoomName(cleanRoomName));
  }

  /** List all auto-approval rules for the caller */
  public Iterable<CleanRoomAutoApprovalRule> list(ListCleanRoomAutoApprovalRulesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListCleanRoomAutoApprovalRulesResponse::getRules,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Update a auto-approval rule by rule ID */
  public CleanRoomAutoApprovalRule update(UpdateCleanRoomAutoApprovalRuleRequest request) {
    return impl.update(request);
  }

  public CleanRoomAutoApprovalRulesService impl() {
    return impl;
  }
}
