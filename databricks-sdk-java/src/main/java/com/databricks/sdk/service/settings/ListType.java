// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

/**
 * This describes an enum
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public enum ListType {
  ALLOW, // An allow list. Include this IP or range.
  BLOCK, // A block list. Exclude this IP or range. IP addresses in the block list are
  // excluded even if they are included in an allow list.

}
