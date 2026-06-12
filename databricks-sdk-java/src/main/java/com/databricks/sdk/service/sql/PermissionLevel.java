// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 *
 *
 * <ul>
 *   <li>{@code CAN_VIEW}: Can view the query
 *   <li>{@code CAN_RUN}: Can run the query
 *   <li>{@code CAN_EDIT}: Can edit the query
 *   <li>{@code CAN_MANAGE}: Can manage the query
 * </ul>
 */
@Generated
public enum PermissionLevel {
  CAN_EDIT, // Can edit the query
  CAN_MANAGE, // Can manage the query
  CAN_RUN, // Can run the query
  CAN_VIEW, // Can view the query
}
