// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
@Generated
public class ClustersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ClustersAPI.class);

  private final ClustersService impl;

  /** Regular-use constructor */
  public ClustersAPI(ApiClient apiClient) {
    impl = new ClustersImpl(apiClient);
  }

  /** Constructor for mocks */
  public ClustersAPI(ClustersService mock) {
    impl = mock;
  }

  public ClusterInfo waitGetClusterRunning(String clusterId) throws TimeoutException {
    return waitGetClusterRunning(clusterId, Duration.ofMinutes(20), null);
  }

  public ClusterInfo waitGetClusterRunning(
      String clusterId, Duration timeout, Consumer<ClusterInfo> callback) throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<State> targetStates = Arrays.asList(State.RUNNING);
    java.util.List<State> failureStates = Arrays.asList(State.ERROR, State.TERMINATED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      ClusterInfo poll = get(new GetClusterRequest().setClusterId(clusterId));
      State status = poll.getState();
      statusMessage = poll.getStateMessage();
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach RUNNING, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("clusterId=%s", clusterId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public ClusterInfo waitGetClusterTerminated(String clusterId) throws TimeoutException {
    return waitGetClusterTerminated(clusterId, Duration.ofMinutes(20), null);
  }

  public ClusterInfo waitGetClusterTerminated(
      String clusterId, Duration timeout, Consumer<ClusterInfo> callback) throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<State> targetStates = Arrays.asList(State.TERMINATED);
    java.util.List<State> failureStates = Arrays.asList(State.ERROR);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      ClusterInfo poll = get(new GetClusterRequest().setClusterId(clusterId));
      State status = poll.getState();
      statusMessage = poll.getStateMessage();
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach TERMINATED, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("clusterId=%s", clusterId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
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

  public Wait<ClusterInfo, CreateClusterResponse> create(String sparkVersion) {
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
  public Wait<ClusterInfo, CreateClusterResponse> create(CreateCluster request) {
    CreateClusterResponse response = impl.create(request);
    return new Wait<>(
        (timeout, callback) -> waitGetClusterRunning(response.getClusterId(), timeout, callback),
        response);
  }

  public Wait<ClusterInfo, Void> delete(String clusterId) {
    return delete(new DeleteCluster().setClusterId(clusterId));
  }

  /**
   * Terminate cluster.
   *
   * <p>Terminates the Spark cluster with the specified ID. The cluster is removed asynchronously.
   * Once the termination has completed, the cluster will be in a `TERMINATED` state. If the cluster
   * is already in a `TERMINATING` or `TERMINATED` state, nothing will happen.
   */
  public Wait<ClusterInfo, Void> delete(DeleteCluster request) {
    impl.delete(request);
    return new Wait<>(
        (timeout, callback) -> waitGetClusterTerminated(request.getClusterId(), timeout, callback));
  }

  public Wait<ClusterInfo, Void> edit(String clusterId, String sparkVersion) {
    return edit(new EditCluster().setClusterId(clusterId).setSparkVersion(sparkVersion));
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
  public Wait<ClusterInfo, Void> edit(EditCluster request) {
    impl.edit(request);
    return new Wait<>(
        (timeout, callback) -> waitGetClusterRunning(request.getClusterId(), timeout, callback));
  }

  public Iterable<ClusterEvent> events(String clusterId) {
    return events(new GetEvents().setClusterId(clusterId));
  }

  /**
   * List cluster activity events.
   *
   * <p>Retrieves a list of events about the activity of a cluster. This API is paginated. If there
   * are more events to read, the response includes all the nparameters necessary to request the
   * next page of events.
   */
  public Iterable<ClusterEvent> events(GetEvents request) {
    return new Paginator<>(
        request,
        impl::events,
        GetEventsResponse::getEvents,
        response -> {
          return response.getNextPage();
        });
  }

  public ClusterInfo get(String clusterId) {
    return get(new GetClusterRequest().setClusterId(clusterId));
  }

  /**
   * Get cluster info.
   *
   * <p>Retrieves the information for a cluster given its identifier. Clusters can be described
   * while they are running, or up to 60 days after they are terminated.
   */
  public ClusterInfo get(GetClusterRequest request) {
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
  public Iterable<ClusterInfo> list(ListClustersRequest request) {
    return impl.list(request).getClusters();
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

  public Wait<ClusterInfo, Void> resize(String clusterId) {
    return resize(new ResizeCluster().setClusterId(clusterId));
  }

  /**
   * Resize cluster.
   *
   * <p>Resizes a cluster to have a desired number of workers. This will fail unless the cluster is
   * in a `RUNNING` state.
   */
  public Wait<ClusterInfo, Void> resize(ResizeCluster request) {
    impl.resize(request);
    return new Wait<>(
        (timeout, callback) -> waitGetClusterRunning(request.getClusterId(), timeout, callback));
  }

  public Wait<ClusterInfo, Void> restart(String clusterId) {
    return restart(new RestartCluster().setClusterId(clusterId));
  }

  /**
   * Restart cluster.
   *
   * <p>Restarts a Spark cluster with the supplied ID. If the cluster is not currently in a
   * `RUNNING` state, nothing will happen.
   */
  public Wait<ClusterInfo, Void> restart(RestartCluster request) {
    impl.restart(request);
    return new Wait<>(
        (timeout, callback) -> waitGetClusterRunning(request.getClusterId(), timeout, callback));
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

  public Wait<ClusterInfo, Void> start(String clusterId) {
    return start(new StartCluster().setClusterId(clusterId));
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
  public Wait<ClusterInfo, Void> start(StartCluster request) {
    impl.start(request);
    return new Wait<>(
        (timeout, callback) -> waitGetClusterRunning(request.getClusterId(), timeout, callback));
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
