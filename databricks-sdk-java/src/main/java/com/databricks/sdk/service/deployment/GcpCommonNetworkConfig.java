// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The common network configuration fields that can be used by both
 * Databricks-managed VPCs and customer-managed VPCs.
 */
@Generated("databricks-sdk-generator")
public class GcpCommonNetworkConfig {
    /**
     * The IP range from which to allocate GKE cluster master resources. This
     * field will be ignored if GKE private cluster is not enabled.
     * 
     * It must be exactly as big as `/28`.
     */
    @JsonProperty("gke_cluster_master_ip_range")
    private String gkeClusterMasterIpRange;
    
    /**
     * Specifies the network connectivity types for the GKE nodes and the GKE
     * master network. Set to `PRIVATE_NODE_PUBLIC_MASTER` for a private GKE
     * cluster for the workspace. The GKE nodes will not have public IPs. Set to
     * `PUBLIC_NODE_PUBLIC_MASTER` for a public GKE cluster. The nodes of a
     * public GKE cluster have public IP addresses.
     */
    @JsonProperty("gke_connectivity_type")
    private GkeConnectivityType gkeConnectivityType;
    
    public GcpCommonNetworkConfig setGkeClusterMasterIpRange(String gkeClusterMasterIpRange) {
        this.gkeClusterMasterIpRange = gkeClusterMasterIpRange;
        return this;
    }

    public String getGkeClusterMasterIpRange() {
        return gkeClusterMasterIpRange;
    }
    
    public GcpCommonNetworkConfig setGkeConnectivityType(GkeConnectivityType gkeConnectivityType) {
        this.gkeConnectivityType = gkeConnectivityType;
        return this;
    }

    public GkeConnectivityType getGkeConnectivityType() {
        return gkeConnectivityType;
    }
    
}
