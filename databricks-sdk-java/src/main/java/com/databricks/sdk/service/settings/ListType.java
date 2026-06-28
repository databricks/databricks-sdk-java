// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Type of IP access list. Valid values are as follows and are case-sensitive:
 *
 * <p>* `ALLOW`: An allow list. Include this IP or range. * `BLOCK`: A block list. Exclude this IP
 * or range. IP addresses in the block list are excluded even if they are included in an allow list.
 */
@Generated
public enum ListType {
  ALLOW, // An allow list. Include this IP or range.
  BLOCK, // A block list. Exclude this IP or range. IP addresses in the block list are
  // excluded even if they are included in an allow list.

}
