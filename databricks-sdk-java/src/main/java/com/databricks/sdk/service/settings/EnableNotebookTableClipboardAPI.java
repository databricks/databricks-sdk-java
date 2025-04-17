// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether users can copy tabular data to the clipboard via the UI. By default, this
 * setting is enabled.
 */
@Generated
public class EnableNotebookTableClipboardAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EnableNotebookTableClipboardAPI.class);

  private final EnableNotebookTableClipboardService impl;

  /** Regular-use constructor */
  public EnableNotebookTableClipboardAPI(ApiClient apiClient) {
    impl = new EnableNotebookTableClipboardImpl(apiClient);
  }

  /** Constructor for mocks */
  public EnableNotebookTableClipboardAPI(EnableNotebookTableClipboardService mock) {
    impl = mock;
  }

  /**
   * Get the Enable Notebook Table Clipboard setting.
   *
   * <p>Gets the Enable Notebook Table Clipboard setting.
   */
  public EnableNotebookTableClipboard getEnableNotebookTableClipboard() {
    return impl.getEnableNotebookTableClipboard();
  }

  public EnableNotebookTableClipboard patchEnableNotebookTableClipboard(
      boolean allowMissing, EnableNotebookTableClipboard setting, String fieldMask) {
    return patchEnableNotebookTableClipboard(
        new UpdateEnableNotebookTableClipboardRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the Enable Notebook Table Clipboard setting.
   *
   * <p>Updates the Enable Notebook Table Clipboard setting. The model follows eventual consistency,
   * which means the get after the update operation might receive stale values for some time.
   */
  public EnableNotebookTableClipboard patchEnableNotebookTableClipboard(
      UpdateEnableNotebookTableClipboardRequest request) {
    return impl.patchEnableNotebookTableClipboard(request);
  }

  public EnableNotebookTableClipboardService impl() {
    return impl;
  }
}
