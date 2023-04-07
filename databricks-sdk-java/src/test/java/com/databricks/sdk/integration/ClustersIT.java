package com.databricks.sdk.integration;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.clusters.GetEvents;
import com.databricks.sdk.service.clusters.GetEventsResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class ClustersIT {
    @Test
    void listsEvents(DatabricksWorkspace w, @EnvOrSkip("TEST_DEFAULT_CLUSTER_ID") String clusterId) {
        GetEventsResponse events = w.clusters().events(new GetEvents().setClusterId(clusterId));
        assertFalse(events.getEvents().isEmpty());
    }
}
