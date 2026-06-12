// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * .. note:: Experimental: This entity may change or be removed in a future release without warning.
 * Email subscription types for registry notifications:
 *
 * <ul>
 *   <li>{@code ALL_EVENTS}: Subscribed to all events.
 *   <li>{@code DEFAULT}: Default subscription type.
 *   <li>{@code SUBSCRIBED}: Subscribed to notifications.
 *   <li>{@code UNSUBSCRIBED}: Not subscribed to notifications.
 * </ul>
 */
@Generated
public enum RegistryEmailSubscriptionType {
  ALL_EVENTS, // Subscribed to all events.
  DEFAULT, // Default subscription type.
  SUBSCRIBED, // Subscribed to notifications.
  UNSUBSCRIBED, // Not subscribed to notifications.
}
