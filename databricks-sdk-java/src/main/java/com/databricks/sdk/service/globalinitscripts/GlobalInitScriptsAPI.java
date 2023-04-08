// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.globalinitscripts;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * The Global Init Scripts API enables Workspace administrators to configure global initialization
 * scripts for their workspace. These scripts run on every node in every cluster in the workspace.
 *
 * <p>**Important:** Existing clusters must be restarted to pick up any changes made to global init
 * scripts. Global init scripts are run in order. If the init script returns with a bad exit code,
 * the Apache Spark container fails to launch and init scripts with later position are skipped. If
 * enough containers fail, the entire cluster fails with a `GLOBAL_INIT_SCRIPT_FAILURE` error code.
 */
public class GlobalInitScriptsAPI {
  private final GlobalInitScriptsService impl;

  /** Regular-use constructor */
  public GlobalInitScriptsAPI(ApiClient apiClient) {
    impl = new GlobalInitScriptsImpl(apiClient);
  }

  /** Constructor for mocks */
  public GlobalInitScriptsAPI(GlobalInitScriptsService mock) {
    impl = mock;
  }

  /**
   * Create init script.
   *
   * <p>Creates a new global init script in this workspace.
   */
  public CreateResponse create(GlobalInitScriptCreateRequest request) {
    return impl.create(request);
  }

  /**
   * Delete init script.
   *
   * <p>Deletes a global init script.
   */
  public void delete(Delete request) {
    impl.delete(request);
  }

  /**
   * Get an init script.
   *
   * <p>Gets all the details of a script, including its Base64-encoded contents.
   */
  public GlobalInitScriptDetailsWithContent get(Get request) {
    return impl.get(request);
  }

  /**
   * Get init scripts.
   *
   * <p>"Get a list of all global init scripts for this workspace. This returns all properties for
   * each script but **not** the script contents. To retrieve the contents of a script, use the [get
   * a global init script](#operation/get-script) operation.
   */
  public ListGlobalInitScriptsResponse list() {
    return impl.list();
  }

  /**
   * Update init script.
   *
   * <p>Updates a global init script, specifying only the fields to change. All fields are optional.
   * Unspecified fields retain their current value.
   */
  public void update(GlobalInitScriptUpdateRequest request) {
    impl.update(request);
  }

  public GlobalInitScriptsService impl() {
    return impl;
  }
}
