// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusters;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * The Clusters API allows you to create, start, edit, list, terminate, and delete clusters.
 *
 * <p>Databricks maps cluster node instance types to compute units known as DBUs. See the instance
 * type pricing page for a list of the supported instance types and their corresponding DBUs.
 *
 * <p>A Databricks cluster is a set of computation resources and configurations on which you run
 * data engineering, data science, and data analytics workloads, such as production ETL pipelines,
 * streaming analytics, ad-hoc analytics, and machine learning.
 *
 * <p>You run these workloads as a set of commands in a notebook or as an automated job. Databricks
 * makes a distinction between all-purpose clusters and job clusters. You use all-purpose clusters
 * to analyze data collaboratively using interactive notebooks. You use job clusters to run fast and
 * robust automated jobs.
 *
 * <p>You can create an all-purpose cluster using the UI, CLI, or REST API. You can manually
 * terminate and restart an all-purpose cluster. Multiple users can share such clusters to do
 * collaborative interactive analysis.
 *
 * <p>IMPORTANT: Databricks retains cluster configuration information for up to 200 all-purpose
 * clusters terminated in the last 30 days and up to 30 job clusters recently terminated by the job
 * scheduler. To keep an all-purpose cluster configuration even after it has been terminated for
 * more than 30 days, an administrator can pin a cluster to the cluster list.
 */
public class ClustersAPI {
  private final ClustersService impl;

  /** Regular-use constructor */
  public ClustersAPI(ApiClient apiClient) {
    impl = new ClustersImpl(apiClient);
  }

  /** Constructor for mocks */
  public ClustersAPI(ClustersService mock) {
    impl = mock;
  }

  public void changeOwner(String clusterId, String ownerUsername) {
    changeOwner(new ChangeClusterOwner().setClusterId(clusterId).setOwnerUsername(ownerUsername));
  }

  /**
   * Change cluster owner.
   *
   * <p>Change the owner of the cluster. You must be an admin to perform this operation.
   */
  public void changeOwner(ChangeClusterOwner request) {
    impl.changeOwner(request);
  }

  public CreateClusterResponse create(String sparkVersion) {
    return create(new CreateCluster().setSparkVersion(sparkVersion));
  }

  /**
   * Create new cluster.
   *
   * <p>Creates a new Spark cluster. This method will acquire new instances from the cloud provider
   * if necessary. This method is asynchronous; the returned `cluster_id` can be used to poll the
   * cluster status. When this method returns, the cluster will be in a `PENDING` state. The cluster
   * will be usable once it enters a `RUNNING` state.
   *
   * <p>Note: Databricks may not be able to acquire some of the requested nodes, due to cloud
   * provider limitations (account limits, spot price, etc.) or transient network issues.
   *
   * <p>If Databricks acquires at least 85% of the requested on-demand nodes, cluster creation will
   * succeed. Otherwise the cluster will terminate with an informative error message.
   */
  public CreateClusterResponse create(CreateCluster request) {
    return impl.create(request);
  }

  public void delete(String clusterId) {
    delete(new DeleteCluster().setClusterId(clusterId));
  }

  /**
   * Terminate cluster.
   *
   * <p>Terminates the Spark cluster with the specified ID. The cluster is removed asynchronously.
   * Once the termination has completed, the cluster will be in a `TERMINATED` state. If the cluster
   * is already in a `TERMINATING` or `TERMINATED` state, nothing will happen.
   */
  public void delete(DeleteCluster request) {
    impl.delete(request);
  }

  public void edit(String clusterId, String sparkVersion) {
    edit(new EditCluster().setClusterId(clusterId).setSparkVersion(sparkVersion));
  }

  /**
   * Update cluster configuration.
   *
   * <p>Updates the configuration of a cluster to match the provided attributes and size. A cluster
   * can be updated if it is in a `RUNNING` or `TERMINATED` state.
   *
   * <p>If a cluster is updated while in a `RUNNING` state, it will be restarted so that the new
   * attributes can take effect.
   *
   * <p>If a cluster is updated while in a `TERMINATED` state, it will remain `TERMINATED`. The next
   * time it is started using the `clusters/start` API, the new attributes will take effect. Any
   * attempt to update a cluster in any other state will be rejected with an `INVALID_STATE` error
   * code.
   *
   * <p>Clusters created by the Databricks Jobs service cannot be edited.
   */
  public void edit(EditCluster request) {
    impl.edit(request);
  }

  public GetEventsResponse events(String clusterId) {
    return events(new GetEvents().setClusterId(clusterId));
  }

  /**
   * List cluster activity events.
   *
   * <p>Retrieves a list of events about the activity of a cluster. This API is paginated. If there
   * are more events to read, the response includes all the nparameters necessary to request the
   * next page of events.
   */
  public GetEventsResponse events(GetEvents request) {
    return impl.events(request);
  }

  public ClusterInfo get(String clusterId) {
    return get(new Get().setClusterId(clusterId));
  }

  /**
   * Get cluster info.
   *
   * <p>"Retrieves the information for a cluster given its identifier. Clusters can be described
   * while they are running, or up to 60 days after they are terminated.
   */
  public ClusterInfo get(Get request) {
    return impl.get(request);
  }

  /**
   * List all clusters.
   *
   * <p>Return information about all pinned clusters, active clusters, up to 200 of the most
   * recently terminated all-purpose clusters in the past 30 days, and up to 30 of the most recently
   * terminated job clusters in the past 30 days.
   *
   * <p>For example, if there is 1 pinned cluster, 4 active clusters, 45 terminated all-purpose
   * clusters in the past 30 days, and 50 terminated job clusters in the past 30 days, then this API
   * returns the 1 pinned cluster, 4 active clusters, all 45 terminated all-purpose clusters, and
   * the 30 most recently terminated job clusters.
   */
  public ListClustersResponse list(List request) {
    return impl.list(request);
  }

  /**
   * List node types.
   *
   * <p>Returns a list of supported Spark node types. These node types can be used to launch a
   * cluster.
   */
  public ListNodeTypesResponse listNodeTypes() {
    return impl.listNodeTypes();
  }

  /**
   * List availability zones.
   *
   * <p>Returns a list of availability zones where clusters can be created in (For example,
   * us-west-2a). These zones can be used to launch a cluster.
   */
  public ListAvailableZonesResponse listZones() {
    return impl.listZones();
  }

  public void permanentDelete(String clusterId) {
    permanentDelete(new PermanentDeleteCluster().setClusterId(clusterId));
  }

  /**
   * Permanently delete cluster.
   *
   * <p>Permanently deletes a Spark cluster. This cluster is terminated and resources are
   * asynchronously removed.
   *
   * <p>In addition, users will no longer see permanently deleted clusters in the cluster list, and
   * API users can no longer perform any action on permanently deleted clusters.
   */
  public void permanentDelete(PermanentDeleteCluster request) {
    impl.permanentDelete(request);
  }

  public void pin(String clusterId) {
    pin(new PinCluster().setClusterId(clusterId));
  }

  /**
   * Pin cluster.
   *
   * <p>Pinning a cluster ensures that the cluster will always be returned by the ListClusters API.
   * Pinning a cluster that is already pinned will have no effect. This API can only be called by
   * workspace admins.
   */
  public void pin(PinCluster request) {
    impl.pin(request);
  }

  public void resize(String clusterId) {
    resize(new ResizeCluster().setClusterId(clusterId));
  }

  /**
   * Resize cluster.
   *
   * <p>Resizes a cluster to have a desired number of workers. This will fail unless the cluster is
   * in a `RUNNING` state.
   */
  public void resize(ResizeCluster request) {
    impl.resize(request);
  }

  public void restart(String clusterId) {
    restart(new RestartCluster().setClusterId(clusterId));
  }

  /**
   * Restart cluster.
   *
   * <p>Restarts a Spark cluster with the supplied ID. If the cluster is not currently in a
   * `RUNNING` state, nothing will happen.
   */
  public void restart(RestartCluster request) {
    impl.restart(request);
  }

  /**
   * List available Spark versions.
   *
   * <p>Returns the list of available Spark versions. These versions can be used to launch a
   * cluster.
   */
  public GetSparkVersionsResponse sparkVersions() {
    return impl.sparkVersions();
  }

  public void start(String clusterId) {
    start(new StartCluster().setClusterId(clusterId));
  }

  /**
   * Start terminated cluster.
   *
   * <p>Starts a terminated Spark cluster with the supplied ID. This works similar to
   * `createCluster` except:
   *
   * <p>* The previous cluster id and attributes are preserved. * The cluster starts with the last
   * specified cluster size. * If the previous cluster was an autoscaling cluster, the current
   * cluster starts with the minimum number of nodes. * If the cluster is not currently in a
   * `TERMINATED` state, nothing will happen. * Clusters launched to run a job cannot be started.
   */
  public void start(StartCluster request) {
    impl.start(request);
  }

  public void unpin(String clusterId) {
    unpin(new UnpinCluster().setClusterId(clusterId));
  }

  /**
   * Unpin cluster.
   *
   * <p>Unpinning a cluster will allow the cluster to eventually be removed from the ListClusters
   * API. Unpinning a cluster that is not pinned will have no effect. This API can only be called by
   * workspace admins.
   */
  public void unpin(UnpinCluster request) {
    impl.unpin(request);
  }

  public ClustersService impl() {
    return impl;
  }
}
