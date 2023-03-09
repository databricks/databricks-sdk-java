// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusters;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Clusters API allows you to create, start, edit, list, terminate, and
 * delete clusters.
 * 
 * Databricks maps cluster node instance types to compute units known as DBUs.
 * See the instance type pricing page for a list of the supported instance types
 * and their corresponding DBUs.
 * 
 * A Databricks cluster is a set of computation resources and configurations on
 * which you run data engineering, data science, and data analytics workloads,
 * such as production ETL pipelines, streaming analytics, ad-hoc analytics, and
 * machine learning.
 * 
 * You run these workloads as a set of commands in a notebook or as an automated
 * job. Databricks makes a distinction between all-purpose clusters and job
 * clusters. You use all-purpose clusters to analyze data collaboratively using
 * interactive notebooks. You use job clusters to run fast and robust automated
 * jobs.
 * 
 * You can create an all-purpose cluster using the UI, CLI, or REST API. You can
 * manually terminate and restart an all-purpose cluster. Multiple users can
 * share such clusters to do collaborative interactive analysis.
 * 
 * IMPORTANT: Databricks retains cluster configuration information for up to 200
 * all-purpose clusters terminated in the last 30 days and up to 30 job clusters
 * recently terminated by the job scheduler. To keep an all-purpose cluster
 * configuration even after it has been terminated for more than 30 days, an
 * administrator can pin a cluster to the cluster list.
 */
public class ClustersAPI implements ClustersService {
    private final ApiClient apiClient;

    public ClustersAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Change cluster owner.
     * 
     * Change the owner of the cluster. You must be an admin to perform this
     * operation.
     */
    @Override
    public void changeOwner(ChangeClusterOwner request) {
        String path = "/api/2.0/clusters/change-owner";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Create new cluster.
     * 
     * Creates a new Spark cluster. This method will acquire new instances from
     * the cloud provider if necessary. This method is asynchronous; the
     * returned `cluster_id` can be used to poll the cluster status. When this
     * method returns, the cluster will be in a `PENDING` state. The cluster
     * will be usable once it enters a `RUNNING` state.
     * 
     * Note: Databricks may not be able to acquire some of the requested nodes,
     * due to cloud provider limitations (account limits, spot price, etc.) or
     * transient network issues.
     * 
     * If Databricks acquires at least 85% of the requested on-demand nodes,
     * cluster creation will succeed. Otherwise the cluster will terminate with
     * an informative error message.
     */
    @Override
    public CreateClusterResponse create(CreateCluster request) {
        String path = "/api/2.0/clusters/create";
        return apiClient.POST(path, request, CreateClusterResponse.class);
    }
    
	/**
     * Terminate cluster.
     * 
     * Terminates the Spark cluster with the specified ID. The cluster is
     * removed asynchronously. Once the termination has completed, the cluster
     * will be in a `TERMINATED` state. If the cluster is already in a
     * `TERMINATING` or `TERMINATED` state, nothing will happen.
     */
    @Override
    public void delete(DeleteCluster request) {
        String path = "/api/2.0/clusters/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Update cluster configuration.
     * 
     * Updates the configuration of a cluster to match the provided attributes
     * and size. A cluster can be updated if it is in a `RUNNING` or
     * `TERMINATED` state.
     * 
     * If a cluster is updated while in a `RUNNING` state, it will be restarted
     * so that the new attributes can take effect.
     * 
     * If a cluster is updated while in a `TERMINATED` state, it will remain
     * `TERMINATED`. The next time it is started using the `clusters/start` API,
     * the new attributes will take effect. Any attempt to update a cluster in
     * any other state will be rejected with an `INVALID_STATE` error code.
     * 
     * Clusters created by the Databricks Jobs service cannot be edited.
     */
    @Override
    public void edit(EditCluster request) {
        String path = "/api/2.0/clusters/edit";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * List cluster activity events.
     * 
     * Retrieves a list of events about the activity of a cluster. This API is
     * paginated. If there are more events to read, the response includes all
     * the nparameters necessary to request the next page of events.
     */
    @Override
    public GetEventsResponse events(GetEvents request) {
        String path = "/api/2.0/clusters/events";
        return apiClient.POST(path, request, GetEventsResponse.class);
    }
    
	/**
     * Get cluster info.
     * 
     * "Retrieves the information for a cluster given its identifier. Clusters
     * can be described while they are running, or up to 60 days after they are
     * terminated.
     */
    @Override
    public ClusterInfo get(Get request) {
        String path = "/api/2.0/clusters/get";
        return apiClient.GET(path, request, ClusterInfo.class);
    }
    
	/**
     * List all clusters.
     * 
     * Return information about all pinned clusters, active clusters, up to 200
     * of the most recently terminated all-purpose clusters in the past 30 days,
     * and up to 30 of the most recently terminated job clusters in the past 30
     * days.
     * 
     * For example, if there is 1 pinned cluster, 4 active clusters, 45
     * terminated all-purpose clusters in the past 30 days, and 50 terminated
     * job clusters in the past 30 days, then this API returns the 1 pinned
     * cluster, 4 active clusters, all 45 terminated all-purpose clusters, and
     * the 30 most recently terminated job clusters.
     */
    @Override
    public ListClustersResponse list(List request) {
        String path = "/api/2.0/clusters/list";
        return apiClient.GET(path, request, ListClustersResponse.class);
    }
    
	/**
     * List node types.
     * 
     * Returns a list of supported Spark node types. These node types can be
     * used to launch a cluster.
     */
    @Override
    public ListNodeTypesResponse listNodeTypes() {
        String path = "/api/2.0/clusters/list-node-types";
        return apiClient.GET(path, ListNodeTypesResponse.class);
    }
    
	/**
     * List availability zones.
     * 
     * Returns a list of availability zones where clusters can be created in
     * (For example, us-west-2a). These zones can be used to launch a cluster.
     */
    @Override
    public ListAvailableZonesResponse listZones() {
        String path = "/api/2.0/clusters/list-zones";
        return apiClient.GET(path, ListAvailableZonesResponse.class);
    }
    
	/**
     * Permanently delete cluster.
     * 
     * Permanently deletes a Spark cluster. This cluster is terminated and
     * resources are asynchronously removed.
     * 
     * In addition, users will no longer see permanently deleted clusters in the
     * cluster list, and API users can no longer perform any action on
     * permanently deleted clusters.
     */
    @Override
    public void permanentDelete(PermanentDeleteCluster request) {
        String path = "/api/2.0/clusters/permanent-delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Pin cluster.
     * 
     * Pinning a cluster ensures that the cluster will always be returned by the
     * ListClusters API. Pinning a cluster that is already pinned will have no
     * effect. This API can only be called by workspace admins.
     */
    @Override
    public void pin(PinCluster request) {
        String path = "/api/2.0/clusters/pin";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Resize cluster.
     * 
     * Resizes a cluster to have a desired number of workers. This will fail
     * unless the cluster is in a `RUNNING` state.
     */
    @Override
    public void resize(ResizeCluster request) {
        String path = "/api/2.0/clusters/resize";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Restart cluster.
     * 
     * Restarts a Spark cluster with the supplied ID. If the cluster is not
     * currently in a `RUNNING` state, nothing will happen.
     */
    @Override
    public void restart(RestartCluster request) {
        String path = "/api/2.0/clusters/restart";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * List available Spark versions.
     * 
     * Returns the list of available Spark versions. These versions can be used
     * to launch a cluster.
     */
    @Override
    public GetSparkVersionsResponse sparkVersions() {
        String path = "/api/2.0/clusters/spark-versions";
        return apiClient.GET(path, GetSparkVersionsResponse.class);
    }
    
	/**
     * Start terminated cluster.
     * 
     * Starts a terminated Spark cluster with the supplied ID. This works
     * similar to `createCluster` except:
     * 
     * * The previous cluster id and attributes are preserved. * The cluster
     * starts with the last specified cluster size. * If the previous cluster
     * was an autoscaling cluster, the current cluster starts with the minimum
     * number of nodes. * If the cluster is not currently in a `TERMINATED`
     * state, nothing will happen. * Clusters launched to run a job cannot be
     * started.
     */
    @Override
    public void start(StartCluster request) {
        String path = "/api/2.0/clusters/start";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Unpin cluster.
     * 
     * Unpinning a cluster will allow the cluster to eventually be removed from
     * the ListClusters API. Unpinning a cluster that is not pinned will have no
     * effect. This API can only be called by workspace admins.
     */
    @Override
    public void unpin(UnpinCluster request) {
        String path = "/api/2.0/clusters/unpin";
        apiClient.POST(path, request, Void.class);
    }
    
}