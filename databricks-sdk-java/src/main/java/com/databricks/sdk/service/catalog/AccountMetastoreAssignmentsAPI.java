// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** These APIs manage metastore assignments to a workspace. */
@Generated
public class AccountMetastoreAssignmentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountMetastoreAssignmentsAPI.class);

  private final AccountMetastoreAssignmentsService impl;

  /** Regular-use constructor */
  public AccountMetastoreAssignmentsAPI(ApiClient apiClient) {
    impl = new AccountMetastoreAssignmentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountMetastoreAssignmentsAPI(AccountMetastoreAssignmentsService mock) {
    impl = mock;
  }

  /** Creates an assignment to a metastore for a workspace */
  public AccountsCreateMetastoreAssignmentResponse create(
      AccountsCreateMetastoreAssignment request) {
    return impl.create(request);
  }

  public AccountsDeleteMetastoreAssignmentResponse delete(long workspaceId, String metastoreId) {
    return delete(
        new DeleteAccountMetastoreAssignmentRequest()
            .setWorkspaceId(workspaceId)
            .setMetastoreId(metastoreId));
  }

  /** Deletes a metastore assignment to a workspace, leaving the workspace with no metastore. */
  public AccountsDeleteMetastoreAssignmentResponse delete(
      DeleteAccountMetastoreAssignmentRequest request) {
    return impl.delete(request);
  }

  public AccountsMetastoreAssignment get(long workspaceId) {
    return get(new GetAccountMetastoreAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Gets the metastore assignment, if any, for the workspace specified by ID. If the workspace is
   * assigned a metastore, the mapping will be returned. If no metastore is assigned to the
   * workspace, the assignment will not be found and a 404 returned.
   */
  public AccountsMetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    return impl.get(request);
  }

  public Iterable<Long> list(String metastoreId) {
    return list(new ListAccountMetastoreAssignmentsRequest().setMetastoreId(metastoreId));
  }

  /** Gets a list of all Databricks workspace IDs that have been assigned to given metastore. */
  public Iterable<Long> list(ListAccountMetastoreAssignmentsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListAccountMetastoreAssignmentsResponse::getWorkspaceIds,
        response -> null);
  }

  /**
   * Updates an assignment to a metastore for a workspace. Currently, only the default catalog may
   * be updated.
   */
  public AccountsUpdateMetastoreAssignmentResponse update(
      AccountsUpdateMetastoreAssignment request) {
    return impl.update(request);
  }

  public AccountMetastoreAssignmentsService impl() {
    return impl;
  }
}
