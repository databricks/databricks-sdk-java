// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;

/**
 * Apps run directly on a customer's Databricks instance, integrate with their data, use and extend
 * Databricks services, and enable users to interact through single sign-on.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AppsService {
  /** Creates a new app. */
  App create(CreateAppRequest createAppRequest);

  /** Creates a new app space. */
  Operation createSpace(CreateSpaceRequest createSpaceRequest);

  /**
   * Creates an app update and starts the update process. The update process is asynchronous and the
   * status of the update can be checked with the GetAppUpdate method.
   */
  AppUpdate createUpdate(AsyncUpdateAppRequest asyncUpdateAppRequest);

  /** Deletes an app. */
  App delete(DeleteAppRequest deleteAppRequest);

  /** Deletes an app space. */
  Operation deleteSpace(DeleteSpaceRequest deleteSpaceRequest);

  /** Creates an app deployment for the app with the supplied name. */
  AppDeployment deploy(CreateAppDeploymentRequest createAppDeploymentRequest);

  /** Retrieves information for the app with the supplied name. */
  App get(GetAppRequest getAppRequest);

  /** Retrieves information for the app deployment with the supplied name and deployment id. */
  AppDeployment getDeployment(GetAppDeploymentRequest getAppDeploymentRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetAppPermissionLevelsResponse getPermissionLevels(
      GetAppPermissionLevelsRequest getAppPermissionLevelsRequest);

  /** Gets the permissions of an app. Apps can inherit permissions from their root object. */
  AppPermissions getPermissions(GetAppPermissionsRequest getAppPermissionsRequest);

  /** Retrieves information for the app space with the supplied name. */
  Space getSpace(GetSpaceRequest getSpaceRequest);

  /** Gets the status of an app space update operation. */
  Operation getSpaceOperation(GetOperationRequest getOperationRequest);

  /** Gets the status of an app update. */
  AppUpdate getUpdate(GetAppUpdateRequest getAppUpdateRequest);

  /** Lists all apps in the workspace. */
  ListAppsResponse list(ListAppsRequest listAppsRequest);

  /** Lists all app deployments for the app with the supplied name. */
  ListAppDeploymentsResponse listDeployments(ListAppDeploymentsRequest listAppDeploymentsRequest);

  /** Lists all app spaces in the workspace. */
  ListSpacesResponse listSpaces(ListSpacesRequest listSpacesRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  AppPermissions setPermissions(AppPermissionsRequest appPermissionsRequest);

  /** Start the last active deployment of the app in the workspace. */
  App start(StartAppRequest startAppRequest);

  /** Stops the active deployment of the app in the workspace. */
  App stop(StopAppRequest stopAppRequest);

  /** Updates the app with the supplied name. */
  App update(UpdateAppRequest updateAppRequest);

  /** Updates the permissions on an app. Apps can inherit permissions from their root object. */
  AppPermissions updatePermissions(AppPermissionsRequest appPermissionsRequest);

  /**
   * Updates an app space. The update process is asynchronous and the status of the update can be
   * checked with the GetSpaceOperation method.
   */
  Operation updateSpace(UpdateSpaceRequest updateSpaceRequest);
}
