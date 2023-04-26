// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage metastore assignments to a workspace.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AccountMetastoreAssignmentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountMetastoreAssignmentsAPI.class);

  private final AccountMetastoreAssignmentsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountMetastoreAssignmentsAPI(ApiClient apiClient) {
    impl = new AccountMetastoreAssignmentsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsService} object
   */
  public AccountMetastoreAssignmentsAPI(AccountMetastoreAssignmentsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @param defaultCatalogName a {@link java.lang.String} object
   * @param workspaceId a long
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  public MetastoreAssignment create(
      String metastoreId, String defaultCatalogName, long workspaceId) {
    return create(
        new CreateMetastoreAssignment()
            .setMetastoreId(metastoreId)
            .setDefaultCatalogName(defaultCatalogName)
            .setWorkspaceId(workspaceId));
  }

  /**
   * Assigns a workspace to a metastore.
   *
   * <p>Creates an assignment to a metastore for a workspace
   *
   * @param request a {@link com.databricks.sdk.service.catalog.CreateMetastoreAssignment} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  public MetastoreAssignment create(CreateMetastoreAssignment request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param workspaceId a long
   * @param metastoreId a {@link java.lang.String} object
   */
  public void delete(long workspaceId, String metastoreId) {
    delete(
        new DeleteAccountMetastoreAssignmentRequest()
            .setWorkspaceId(workspaceId)
            .setMetastoreId(metastoreId));
  }

  /**
   * Delete a metastore assignment.
   *
   * <p>Deletes a metastore assignment to a workspace, leaving the workspace with no metastore.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.DeleteAccountMetastoreAssignmentRequest} object
   */
  public void delete(DeleteAccountMetastoreAssignmentRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param workspaceId a long
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  public MetastoreAssignment get(long workspaceId) {
    return get(new GetAccountMetastoreAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Gets the metastore assignment for a workspace.
   *
   * <p>Gets the metastore assignment, if any, for the workspace specified by ID. If the workspace
   * is assigned a metastore, the mappig will be returned. If no metastore is assigned to the
   * workspace, the assignment will not be found and a 404 returned.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.GetAccountMetastoreAssignmentRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  public MetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    return impl.get(request);
  }

  /**
   * <p>list.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<MetastoreAssignment> list(String metastoreId) {
    return list(new ListAccountMetastoreAssignmentsRequest().setMetastoreId(metastoreId));
  }

  /**
   * Get all workspaces assigned to a metastore.
   *
   * <p>Gets a list of all Databricks workspace IDs that have been assigned to given metastore.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.ListAccountMetastoreAssignmentsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
    return impl.list(request);
  }

  /**
   * <p>update.</p>
   *
   * @param workspaceId a long
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  public MetastoreAssignment update(long workspaceId, String metastoreId) {
    return update(
        new UpdateMetastoreAssignment().setWorkspaceId(workspaceId).setMetastoreId(metastoreId));
  }

  /**
   * Updates a metastore assignment to a workspaces.
   *
   * <p>Updates an assignment to a metastore for a workspace. Currently, only the default catalog
   * may be updated
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UpdateMetastoreAssignment} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  public MetastoreAssignment update(UpdateMetastoreAssignment request) {
    return impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsService} object
   */
  public AccountMetastoreAssignmentsService impl() {
    return impl;
  }
}
