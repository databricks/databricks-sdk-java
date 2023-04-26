// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Global Init Scripts API enables Workspace administrators to configure global initialization
 * scripts for their workspace. These scripts run on every node in every cluster in the workspace.
 *
 * <p>**Important:** Existing clusters must be restarted to pick up any changes made to global init
 * scripts. Global init scripts are run in order. If the init script returns with a bad exit code,
 * the Apache Spark container fails to launch and init scripts with later position are skipped. If
 * enough containers fail, the entire cluster fails with a `GLOBAL_INIT_SCRIPT_FAILURE` error code.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GlobalInitScriptsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GlobalInitScriptsAPI.class);

  private final GlobalInitScriptsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public GlobalInitScriptsAPI(ApiClient apiClient) {
    impl = new GlobalInitScriptsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.compute.GlobalInitScriptsService} object
   */
  public GlobalInitScriptsAPI(GlobalInitScriptsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param script a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CreateResponse} object
   */
  public CreateResponse create(String name, String script) {
    return create(new GlobalInitScriptCreateRequest().setName(name).setScript(script));
  }

  /**
   * Create init script.
   *
   * <p>Creates a new global init script in this workspace.
   *
   * @param request a {@link com.databricks.sdk.service.compute.GlobalInitScriptCreateRequest} object
   * @return a {@link com.databricks.sdk.service.compute.CreateResponse} object
   */
  public CreateResponse create(GlobalInitScriptCreateRequest request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void delete(String scriptId) {
    delete(new DeleteGlobalInitScriptRequest().setScriptId(scriptId));
  }

  /**
   * Delete init script.
   *
   * <p>Deletes a global init script.
   *
   * @param request a {@link com.databricks.sdk.service.compute.DeleteGlobalInitScriptRequest} object
   */
  public void delete(DeleteGlobalInitScriptRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param scriptId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent get(String scriptId) {
    return get(new GetGlobalInitScriptRequest().setScriptId(scriptId));
  }

  /**
   * Get an init script.
   *
   * <p>Gets all the details of a script, including its Base64-encoded contents.
   *
   * @param request a {@link com.databricks.sdk.service.compute.GetGlobalInitScriptRequest} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent get(GetGlobalInitScriptRequest request) {
    return impl.get(request);
  }

  /**
   * Get init scripts.
   *
   * <p>"Get a list of all global init scripts for this workspace. This returns all properties for
   * each script but **not** the script contents. To retrieve the contents of a script, use the [get
   * a global init script](#operation/get-script) operation.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<GlobalInitScriptDetails> list() {
    return impl.list().getScripts();
  }

  /**
   * <p>update.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param script a {@link java.lang.String} object
   * @param scriptId a {@link java.lang.String} object
   */
  public void update(String name, String script, String scriptId) {
    update(
        new GlobalInitScriptUpdateRequest().setName(name).setScript(script).setScriptId(scriptId));
  }

  /**
   * Update init script.
   *
   * <p>Updates a global init script, specifying only the fields to change. All fields are optional.
   * Unspecified fields retain their current value.
   *
   * @param request a {@link com.databricks.sdk.service.compute.GlobalInitScriptUpdateRequest} object
   */
  public void update(GlobalInitScriptUpdateRequest request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptsService} object
   */
  public GlobalInitScriptsService impl() {
    return impl;
  }
}
