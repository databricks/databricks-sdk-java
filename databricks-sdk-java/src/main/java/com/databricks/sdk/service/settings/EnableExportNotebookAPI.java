// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether users can export notebooks and files from the Workspace UI. By default, this
 * setting is enabled.
 */
@Generated
public class EnableExportNotebookAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EnableExportNotebookAPI.class);

  private final EnableExportNotebookService impl;

  /** Regular-use constructor */
  public EnableExportNotebookAPI(ApiClient apiClient) {
    impl = new EnableExportNotebookImpl(apiClient);
  }

  /** Constructor for mocks */
  public EnableExportNotebookAPI(EnableExportNotebookService mock) {
    impl = mock;
  }

  /** Gets the Notebook and File exporting setting. */
  public EnableExportNotebook getEnableExportNotebook() {
    return impl.getEnableExportNotebook();
  }

  public EnableExportNotebook patchEnableExportNotebook(
      boolean allowMissing, EnableExportNotebook setting, String fieldMask) {
    return patchEnableExportNotebook(
        new UpdateEnableExportNotebookRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Updates the Notebook and File exporting setting. The model follows eventual consistency, which
   * means the get after the update operation might receive stale values for some time.
   */
  public EnableExportNotebook patchEnableExportNotebook(UpdateEnableExportNotebookRequest request) {
    return impl.patchEnableExportNotebook(request);
  }

  public EnableExportNotebookService impl() {
    return impl;
  }
}
