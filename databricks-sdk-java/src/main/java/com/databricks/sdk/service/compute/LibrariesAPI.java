// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class LibrariesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LibrariesAPI.class);

  private final LibrariesService impl;

  /** Regular-use constructor */
  public LibrariesAPI(ApiClient apiClient) {
    impl = new LibrariesImpl(apiClient);
  }

  /** Constructor for mocks */
  public LibrariesAPI(LibrariesService mock) {
    impl = mock;
  }

  /**
   * Get all statuses.
   *
   * <p>Get the status of all libraries on all clusters. A status is returned for all libraries
   * installed on this cluster via the API or the libraries UI.
   */
  public ListAllClusterLibraryStatusesResponse allClusterStatuses() {
    return impl.allClusterStatuses();
  }

  public Iterable<LibraryFullStatus> clusterStatus(String clusterId) {
    return clusterStatus(new ClusterStatus().setClusterId(clusterId));
  }

  /**
   * Get status.
   *
   * <p>Get the status of libraries on a cluster. A status is returned for all libraries installed
   * on this cluster via the API or the libraries UI. The order of returned libraries is as follows:
   * 1. Libraries set to be installed on this cluster, in the order that the libraries were added to
   * the cluster, are returned first. 2. Libraries that were previously requested to be installed on
   * this cluster or, but are now marked for removal, in no particular order, are returned last.
   */
  public Iterable<LibraryFullStatus> clusterStatus(ClusterStatus request) {
    return new Paginator<>(
        request, impl::clusterStatus, ClusterStatusResponse::getLibraryStatuses, response -> null);
  }

  public void install(String clusterId, Collection<Library> libraries) {
    install(new InstallLibraries().setClusterId(clusterId).setLibraries(libraries));
  }

  /**
   * Add a library.
   *
   * <p>Add libraries to install on a cluster. The installation is asynchronous; it happens in the
   * background after the completion of this request.
   */
  public void install(InstallLibraries request) {
    impl.install(request);
  }

  public void uninstall(String clusterId, Collection<Library> libraries) {
    uninstall(new UninstallLibraries().setClusterId(clusterId).setLibraries(libraries));
  }

  /**
   * Uninstall libraries.
   *
   * <p>Set libraries to uninstall from a cluster. The libraries won't be uninstalled until the
   * cluster is restarted. A request to uninstall a library that is not currently installed is
   * ignored.
   */
  public void uninstall(UninstallLibraries request) {
    impl.uninstall(request);
  }

  public LibrariesService impl() {
    return impl;
  }
}
