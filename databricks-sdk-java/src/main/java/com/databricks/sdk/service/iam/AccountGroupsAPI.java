// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Groups simplify identity management, making it easier to assign access to Databricks Account,
 * data, and other securable objects.
 *
 * <p>It is best practice to assign access to workspaces and access-control policies in Unity
 * Catalog to groups, instead of to users individually. All Databricks Account identities can be
 * assigned as members of groups, and members inherit permissions that are assigned to their group.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AccountGroupsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountGroupsAPI.class);

  private final AccountGroupsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountGroupsAPI(ApiClient apiClient) {
    impl = new AccountGroupsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.iam.AccountGroupsService} object
   */
  public AccountGroupsAPI(AccountGroupsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group create(String id) {
    return create(new Group().setId(id));
  }

  /**
   * Create a new group.
   *
   * <p>Creates a group in the Databricks Account with a unique name, using the supplied group
   * details.
   *
   * @param request a {@link com.databricks.sdk.service.iam.Group} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group create(Group request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void delete(String id) {
    delete(new DeleteAccountGroupRequest().setId(id));
  }

  /**
   * Delete a group.
   *
   * <p>Deletes a group from the Databricks Account.
   *
   * @param request a {@link com.databricks.sdk.service.iam.DeleteAccountGroupRequest} object
   */
  public void delete(DeleteAccountGroupRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group get(String id) {
    return get(new GetAccountGroupRequest().setId(id));
  }

  /**
   * Get group details.
   *
   * <p>Gets the information for a specific group in the Databricks Account.
   *
   * @param request a {@link com.databricks.sdk.service.iam.GetAccountGroupRequest} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group get(GetAccountGroupRequest request) {
    return impl.get(request);
  }

  /**
   * List group details.
   *
   * <p>Gets all details of the groups associated with the Databricks Account.
   *
   * @param request a {@link com.databricks.sdk.service.iam.ListAccountGroupsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Group> list(ListAccountGroupsRequest request) {
    return impl.list(request).getResources();
  }

  /**
   * <p>patch.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void patch(String id) {
    patch(new PartialUpdate().setId(id));
  }

  /**
   * Update group details.
   *
   * <p>Partially updates the details of a group.
   *
   * @param request a {@link com.databricks.sdk.service.iam.PartialUpdate} object
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  /**
   * <p>update.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void update(String id) {
    update(new Group().setId(id));
  }

  /**
   * Replace a group.
   *
   * <p>Updates the details of a group by replacing the entire group entity.
   *
   * @param request a {@link com.databricks.sdk.service.iam.Group} object
   */
  public void update(Group request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.AccountGroupsService} object
   */
  public AccountGroupsService impl() {
    return impl;
  }
}
