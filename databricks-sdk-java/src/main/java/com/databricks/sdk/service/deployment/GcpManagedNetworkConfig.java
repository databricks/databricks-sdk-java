// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The network settings for the workspace. The configurations are only for
 * Databricks-managed VPCs. It is ignored if you specify a customer-managed VPC
 * in the `network_id` field.
 */
@Generated("databricks-sdk-generator")
public class GcpManagedNetworkConfig {
    /**
     * The IP range from which to allocate GKE cluster pods. No bigger than `/9`
     * and no smaller than `/21`.
     */
    @JsonProperty("gke_cluster_pod_ip_range")
    private String gkeClusterPodIpRange;
    
    /**
     * The IP range from which to allocate GKE cluster services. No bigger than
     * `/16` and no smaller than `/27`.
     */
    @JsonProperty("gke_cluster_service_ip_range")
    private String gkeClusterServiceIpRange;
    
    /**
     * The IP range from which to allocate GKE cluster nodes. No bigger than
     * `/9` and no smaller than `/29`.
     */
    @JsonProperty("subnet_cidr")
    private String subnetCidr;
    
    public GcpManagedNetworkConfig setGkeClusterPodIpRange(String gkeClusterPodIpRange) {
        this.gkeClusterPodIpRange = gkeClusterPodIpRange;
        return this;
    }

    public String getGkeClusterPodIpRange() {
        return gkeClusterPodIpRange;
    }
    
    public GcpManagedNetworkConfig setGkeClusterServiceIpRange(String gkeClusterServiceIpRange) {
        this.gkeClusterServiceIpRange = gkeClusterServiceIpRange;
        return this;
    }

    public String getGkeClusterServiceIpRange() {
        return gkeClusterServiceIpRange;
    }
    
    public GcpManagedNetworkConfig setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    public String getSubnetCidr() {
        return subnetCidr;
    }
    
}
