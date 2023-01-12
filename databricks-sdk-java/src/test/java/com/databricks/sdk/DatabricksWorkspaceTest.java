package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.sql.ListQueriesRequest;
import com.databricks.sdk.service.sql.Query;
import com.databricks.sdk.service.sql.QueryList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabricksWorkspaceTest {
    @Test
    void name() {
        DatabricksWorkspace wsc = new DatabricksWorkspace(new DatabricksConfig()
                .setProfile("logfood-master"));

        QueryList labs = wsc.queries().list(new ListQueriesRequest().setQ("labs"));
        System.out.println("Queries:");
        for (Query query : labs.getResults()) {
            System.out.println(query.getQuery());
        }
    }
}

