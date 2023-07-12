// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;

/**
 * This specifies the format of the file to be imported.
 *
 * <p>The value is case sensitive.
 *
 * <p>- `AUTO`: The item is imported depending on an analysis of the item's extension and the header
 * content provided in the request. If the item is imported as a notebook, then the item's extension
 * is automatically removed. - `SOURCE`: The notebook is imported as source code. - `HTML`: The
 * notebook is imported as an HTML file. - `JUPYTER`: The notebook is imported as a Jupyter/IPython
 * Notebook file. - `DBC`: The notebook is imported in Databricks archive format. Required for
 * directories. - `R_MARKDOWN`: The notebook is imported from R Markdown format.
 */
@Generated
public enum ImportFormat {
  AUTO,
  DBC,
  HTML,
  JUPYTER,
  R_MARKDOWN,
  SOURCE,
}
