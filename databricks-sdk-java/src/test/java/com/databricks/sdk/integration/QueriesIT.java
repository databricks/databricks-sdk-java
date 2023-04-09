package com.databricks.sdk.integration;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.sql.ListQueriesRequest;
import com.databricks.sdk.service.sql.Query;
import com.databricks.sdk.service.sql.QueryList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
class QueriesIT {
  @Test
  void name(DatabricksWorkspace w) {
    QueryList labs = w.queries().list(new ListQueriesRequest().setQ("labs"));
    System.out.println("Queries:");
    for (Query query : labs.getResults()) {
      System.out.println(query.getQuery());
    }
  }
}
