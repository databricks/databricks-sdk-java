// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether users can copy tabular data to the clipboard via the UI. By default, this
 * setting is enabled.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EnableNotebookTableClipboardService {
  /**
   * Get the Enable Notebook Table Clipboard setting.
   *
   * <p>Gets the Enable Notebook Table Clipboard setting.
   */
  EnableNotebookTableClipboard getEnableNotebookTableClipboard();

  /**
   * Update the Enable Notebook Table Clipboard setting.
   *
   * <p>Updates the Enable Notebook Table Clipboard setting. The model follows eventual consistency,
   * which means the get after the update operation might receive stale values for some time.
   */
  EnableNotebookTableClipboard patchEnableNotebookTableClipboard(
      UpdateEnableNotebookTableClipboardRequest updateEnableNotebookTableClipboardRequest);
}
