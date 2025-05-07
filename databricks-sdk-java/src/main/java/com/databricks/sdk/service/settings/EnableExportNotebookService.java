// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether users can export notebooks and files from the Workspace UI. By default, this
 * setting is enabled.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EnableExportNotebookService {
  /**
   * Get the Notebook and File exporting setting.
   *
   * <p>Gets the Notebook and File exporting setting.
   */
  EnableExportNotebook getEnableExportNotebook();

  /**
   * Update the Notebook and File exporting setting.
   *
   * <p>Updates the Notebook and File exporting setting. The model follows eventual consistency,
   * which means the get after the update operation might receive stale values for some time.
   */
  EnableExportNotebook patchEnableExportNotebook(
      UpdateEnableExportNotebookRequest updateEnableExportNotebookRequest);
}
