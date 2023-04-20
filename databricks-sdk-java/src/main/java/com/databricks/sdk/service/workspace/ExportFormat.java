// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

/**
 * This specifies the format of the file to be imported. By default, this is `SOURCE`.
 *
 * <p>If using `AUTO` the item is imported or exported as either a workspace file or a
 * notebook,depending on an analysis of the item’s extension and the header content provided in the
 * request. The value is case sensitive. In addition, if the item is imported as a notebook, then
 * the item’s extension is automatically removed.
 */
public enum ExportFormat {
  AUTO,
  DBC,
  HTML,
  JUPYTER,
  R_MARKDOWN,
  SOURCE,
}
