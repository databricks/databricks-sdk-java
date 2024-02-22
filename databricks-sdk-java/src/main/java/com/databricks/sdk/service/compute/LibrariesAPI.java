// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Libraries API allows you to install and uninstall libraries and get the status of libraries
 * on a cluster.
 *
 * <p>To make third-party or custom code available to notebooks and jobs running on your clusters,
 * you can install a library. Libraries can be written in Python, Java, Scala, and R. You can upload
 * Java, Scala, and Python libraries and point to external packages in PyPI, Maven, and CRAN
 * repositories.
 *
 * <p>Cluster libraries can be used by all notebooks running on a cluster. You can install a cluster
 * library directly from a public repository such as PyPI or Maven, using a previously installed
 * workspace library, or using an init script.
 *
 * <p>When you install a library on a cluster, a notebook already attached to that cluster will not
 * immediately see the new library. You must first detach and then reattach the notebook to the
 * cluster.
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
   * <p>Get the status of all libraries on all clusters. A status will be available for all
   * libraries installed on this cluster via the API or the libraries UI as well as libraries set to
   * be installed on all clusters via the libraries UI.
   */
  public ListAllClusterLibraryStatusesResponse allClusterStatuses() {
    return impl.allClusterStatuses();
  }

  public Iterable<LibraryFullStatus> clusterStatus(String clusterId) {
    return clusterStatus(new ClusterStatusRequest().setClusterId(clusterId));
  }

  /**
   * Get status.
   *
   * <p>Get the status of libraries on a cluster. A status will be available for all libraries
   * installed on this cluster via the API or the libraries UI as well as libraries set to be
   * installed on all clusters via the libraries UI. The order of returned libraries will be as
   * follows.
   *
   * <p>1. Libraries set to be installed on this cluster will be returned first. Within this group,
   * the final order will be order in which the libraries were added to the cluster.
   *
   * <p>2. Libraries set to be installed on all clusters are returned next. Within this group there
   * is no order guarantee.
   *
   * <p>3. Libraries that were previously requested on this cluster or on all clusters, but now
   * marked for removal. Within this group there is no order guarantee.
   */
  public Iterable<LibraryFullStatus> clusterStatus(ClusterStatusRequest request) {
    return impl.clusterStatus(request).getLibraryStatuses();
  }

  public InstallLibrariesResponse install(String clusterId, Collection<Library> libraries) {
    return install(new InstallLibraries().setClusterId(clusterId).setLibraries(libraries));
  }

  /**
   * Add a library.
   *
   * <p>Add libraries to be installed on a cluster. The installation is asynchronous; it happens in
   * the background after the completion of this request.
   *
   * <p>**Note**: The actual set of libraries to be installed on a cluster is the union of the
   * libraries specified via this method and the libraries set to be installed on all clusters via
   * the libraries UI.
   */
  public InstallLibrariesResponse install(InstallLibraries request) {
    return impl.install(request);
  }

  public UninstallLibrariesResponse uninstall(String clusterId, Collection<Library> libraries) {
    return uninstall(new UninstallLibraries().setClusterId(clusterId).setLibraries(libraries));
  }

  /**
   * Uninstall libraries.
   *
   * <p>Set libraries to be uninstalled on a cluster. The libraries won't be uninstalled until the
   * cluster is restarted. Uninstalling libraries that are not installed on the cluster will have no
   * impact but is not an error.
   */
  public UninstallLibrariesResponse uninstall(UninstallLibraries request) {
    return impl.uninstall(request);
  }

  public LibrariesService impl() {
    return impl;
  }
}
