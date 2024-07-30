package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.sql.ListQueryHistoryRequest;
import com.databricks.sdk.service.sql.QueryFilter;
import com.databricks.sdk.service.sql.QueryInfo;
import com.databricks.sdk.service.sql.TimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class SqlIT {
  @Test
  void listQueryHistoryTimeRange(WorkspaceClient w) {
    TimeRange timeRange =
        new TimeRange().setStartTimeMs(1690243200000L).setEndTimeMs(1690329600000L);
    ListQueryHistoryRequest request =
        new ListQueryHistoryRequest()
            .setFilterBy(new QueryFilter().setQueryStartTimeRange(timeRange));
    Iterable<QueryInfo> queries = w.queryHistory().list(request).getRes();
    if (queries != null) {
      for (QueryInfo query : queries) {
        System.out.println(query);
      }
    }
  }

  @Test
  void listQueryHistoryUserIds(WorkspaceClient w) {
    ListQueryHistoryRequest request =
        new ListQueryHistoryRequest()
            .setFilterBy(new QueryFilter().setUserIds(Arrays.asList(123L, 456L)));
    Iterable<QueryInfo> queries = w.queryHistory().list(request).getRes();
    if (queries != null) {
      for (QueryInfo query : queries) {
        System.out.println(query);
      }
    }
  }
}
