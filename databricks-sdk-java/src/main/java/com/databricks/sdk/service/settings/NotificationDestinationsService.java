// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The notification destinations API lets you programmatically manage a workspace's notification
 * destinations. Notification destinations are used to send notifications for query alerts and jobs
 * to destinations outside of Databricks. Only workspace admins can create, update, and delete
 * notification destinations.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface NotificationDestinationsService {
  /** Creates a notification destination. Requires workspace admin permissions. */
  NotificationDestination create(
      CreateNotificationDestinationRequest createNotificationDestinationRequest);

  /** Deletes a notification destination. Requires workspace admin permissions. */
  void delete(DeleteNotificationDestinationRequest deleteNotificationDestinationRequest);

  /** Gets a notification destination by ID. Workspace admins also receive its config. */
  NotificationDestination get(GetNotificationDestinationRequest getNotificationDestinationRequest);

  /**
   * Lists the notification destinations in the workspace. Results never include a destination's
   * config; workspace admins can retrieve it with Get.
   */
  ListNotificationDestinationsResponse list(
      ListNotificationDestinationsRequest listNotificationDestinationsRequest);

  /**
   * Updates a notification destination. Requires workspace admin permissions. At least one field is
   * required in the request body. A config provided in the request replaces the existing one.
   */
  NotificationDestination update(
      UpdateNotificationDestinationRequest updateNotificationDestinationRequest);
}
