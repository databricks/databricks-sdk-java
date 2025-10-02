// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The Libraries API allows you to install and uninstall libraries and get the status of libraries
 * on a cluster.
 *
 * <p>To make third-party or custom code available to notebooks and jobs running on your clusters,
 * you can install a library. Libraries can be written in Python, Java, Scala, and R. You can upload
 * Python, Java, Scala and R libraries and point to external packages in PyPI, Maven, and CRAN
 * repositories.
 *
 * <p>Cluster libraries can be used by all notebooks running on a cluster. You can install a cluster
 * library directly from a public repository such as PyPI or Maven, using a previously installed
 * workspace library, or using an init script.
 *
 * <p>When you uninstall a library from a cluster, the library is removed only when you restart the
 * cluster. Until you restart the cluster, the status of the uninstalled library appears as
 * Uninstall pending restart.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LibrariesService {
  /**
   * Get the status of all libraries on all clusters. A status is returned for all libraries
   * installed on this cluster via the API or the libraries UI.
   */
  ListAllClusterLibraryStatusesResponse allClusterStatuses();

  /**
   * Get the status of libraries on a cluster. A status is returned for all libraries installed on
   * this cluster via the API or the libraries UI. The order of returned libraries is as follows: 1.
   * Libraries set to be installed on this cluster, in the order that the libraries were added to
   * the cluster, are returned first. 2. Libraries that were previously requested to be installed on
   * this cluster or, but are now marked for removal, in no particular order, are returned last.
   */
  ClusterLibraryStatuses clusterStatus(ClusterStatus clusterStatus);

  /**
   * Create a default base environment within workspaces to define the environment version and a
   * list of dependencies to be used in serverless notebooks and jobs. This process will
   * asynchronously generate a cache to optimize dependency resolution.
   */
  DefaultBaseEnvironment createDefaultBaseEnvironment(
      CreateDefaultBaseEnvironmentRequest createDefaultBaseEnvironmentRequest);

  /**
   * Delete the default base environment given an ID. The default base environment may be used by
   * downstream workloads. Please ensure that the deletion is intentional.
   */
  void deleteDefaultBaseEnvironment(
      DeleteDefaultBaseEnvironmentRequest deleteDefaultBaseEnvironmentRequest);

  /** Return the default base environment details for a given ID. */
  DefaultBaseEnvironment getDefaultBaseEnvironment(
      GetDefaultBaseEnvironmentRequest getDefaultBaseEnvironmentRequest);

  /**
   * Add libraries to install on a cluster. The installation is asynchronous; it happens in the
   * background after the completion of this request.
   */
  void install(InstallLibraries installLibraries);

  /** List default base environments defined in the workspaces for the requested user. */
  ListDefaultBaseEnvironmentsResponse listDefaultBaseEnvironments(
      ListDefaultBaseEnvironmentsRequest listDefaultBaseEnvironmentsRequest);

  /**
   * Refresh the cached default base environments for the given IDs. This process will
   * asynchronously regenerate the caches. The existing caches remains available until it expires.
   */
  void refreshDefaultBaseEnvironments(
      RefreshDefaultBaseEnvironmentsRequest refreshDefaultBaseEnvironmentsRequest);

  /**
   * Set libraries to uninstall from a cluster. The libraries won't be uninstalled until the cluster
   * is restarted. A request to uninstall a library that is not currently installed is ignored.
   */
  void uninstall(UninstallLibraries uninstallLibraries);

  /**
   * Update the default base environment for the given ID. This process will asynchronously
   * regenerate the cache. The existing cache remains available until it expires.
   */
  DefaultBaseEnvironment updateDefaultBaseEnvironment(
      UpdateDefaultBaseEnvironmentRequest updateDefaultBaseEnvironmentRequest);

  /**
   * Set the default base environment for the workspace. This marks the specified DBE as the
   * workspace default.
   */
  DefaultBaseEnvironment updateDefaultDefaultBaseEnvironment(
      UpdateDefaultDefaultBaseEnvironmentRequest updateDefaultDefaultBaseEnvironmentRequest);
}
