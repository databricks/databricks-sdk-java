package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyCredentialsProvider;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.FixtureServer.FixtureMapping;
import com.databricks.sdk.service.iam.ListAccountUsersRequest;
import com.databricks.sdk.service.iam.ListUsersRequest;
import com.databricks.sdk.service.iam.MeRequest;
import com.databricks.sdk.service.iam.User;
import com.databricks.sdk.service.provisioning.Workspace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ClientHttpFixtureTest {
  private static final String ACCOUNT_ID = "00000000-0000-0000-0000-000000000000";
  private static final long WORKSPACE_ID = 123456789L;

  @Test
  void derivedWorkspaceClientIsIsolatedAndRoutesAtHttpBoundary() throws IOException {
    Map<String, List<String>> workspaceHeader =
        Collections.singletonMap(
            "X-Databricks-Workspace-Id", Collections.singletonList(String.valueOf(WORKSPACE_ID)));
    FixtureMapping getWorkspace =
        fixture(
            "GET",
            "/api/2.0/accounts/" + ACCOUNT_ID + "/workspaces/" + WORKSPACE_ID,
            "{\"account_id\":\""
                + ACCOUNT_ID
                + "\",\"deployment_name\":\"fixture-workspace\",\"workspace_id\":"
                + WORKSPACE_ID
                + ",\"workspace_name\":\"fixture\",\"workspace_status\":\"RUNNING\"}");
    FixtureMapping currentUser =
        new FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/api/2.0/preview/scim/v2/Me")
            .validateHeadersPresent(workspaceHeader)
            .withResponse(
                "{\"active\":true,\"id\":\"user-1\"," + "\"userName\":\"fixture@databricks.com\"}",
                200)
            .build();

    try (FixtureServer server = new FixtureServer().with(getWorkspace).with(currentUser)) {
      DatabricksConfig accountConfig =
          fixtureConfig(server).setAccountId(ACCOUNT_ID).setWorkspaceId(null);
      AccountClient account = new AccountClient(accountConfig);

      Workspace workspace = account.workspaces().get(WORKSPACE_ID);
      WorkspaceClient derived = account.getWorkspaceClient(workspace);
      User me = derived.currentUser().me(new MeRequest());

      assertEquals("fixture@databricks.com", me.getUserName());
      assertEquals(server.getUrl(), derived.config().getHost());
      assertEquals(String.valueOf(WORKSPACE_ID), derived.config().getWorkspaceId());
      assertEquals(server.getUrl(), account.config().getHost());
      assertEquals(ACCOUNT_ID, account.config().getAccountId());
      assertNull(account.config().getWorkspaceId());
      server.assertAllFixturesConsumed();
    }
  }

  @Test
  void workspaceScimPaginationAdvancesStartIndexAtHttpBoundary() throws IOException {
    List<FixtureMapping> pages =
        Arrays.asList(
            fixture(
                "GET",
                "/api/2.0/preview/scim/v2/Users?count=2&startIndex=1",
                usersPage(
                    "{\"active\":true,\"id\":\"user-1\","
                        + "\"userName\":\"one@databricks.com\"},"
                        + "{\"active\":true,\"id\":\"user-2\","
                        + "\"userName\":\"two@databricks.com\"}",
                    2,
                    1,
                    3)),
            fixture(
                "GET",
                "/api/2.0/preview/scim/v2/Users?count=2&startIndex=3",
                usersPage(
                    "{\"active\":true,\"id\":\"user-3\","
                        + "\"userName\":\"three@databricks.com\"}",
                    1,
                    3,
                    3)),
            fixture(
                "GET",
                "/api/2.0/preview/scim/v2/Users?count=2&startIndex=4",
                usersPage("", 0, 4, 3)));

    try (FixtureServer server = new FixtureServer().with(pages)) {
      WorkspaceClient workspace = new WorkspaceClient(fixtureConfig(server));

      List<String> userNames =
          userNames(workspace.users().list(new ListUsersRequest().setCount(2L)));

      assertEquals(
          Arrays.asList("one@databricks.com", "two@databricks.com", "three@databricks.com"),
          userNames);
      server.assertAllFixturesConsumed();
    }
  }

  @Test
  void accountScimPaginationAdvancesStartIndexAtHttpBoundary() throws IOException {
    String endpoint = "/api/2.0/accounts/" + ACCOUNT_ID + "/scim/v2/Users";
    List<FixtureMapping> pages =
        Arrays.asList(
            fixture(
                "GET",
                endpoint + "?count=2&startIndex=1",
                usersPage(
                    "{\"active\":true,\"id\":\"user-1\","
                        + "\"userName\":\"one@databricks.com\"},"
                        + "{\"active\":true,\"id\":\"user-2\","
                        + "\"userName\":\"two@databricks.com\"}",
                    2,
                    1,
                    3)),
            fixture(
                "GET",
                endpoint + "?count=2&startIndex=3",
                usersPage(
                    "{\"active\":true,\"id\":\"user-3\","
                        + "\"userName\":\"three@databricks.com\"}",
                    1,
                    3,
                    3)),
            fixture("GET", endpoint + "?count=2&startIndex=4", usersPage("", 0, 4, 3)));

    try (FixtureServer server = new FixtureServer().with(pages)) {
      AccountClient account = new AccountClient(fixtureConfig(server).setAccountId(ACCOUNT_ID));

      List<String> userNames =
          userNames(account.users().list(new ListAccountUsersRequest().setCount(2L)));

      assertEquals(
          Arrays.asList("one@databricks.com", "two@databricks.com", "three@databricks.com"),
          userNames);
      server.assertAllFixturesConsumed();
    }
  }

  private static DatabricksConfig fixtureConfig(FixtureServer server) {
    return new DatabricksConfig()
        .setHost(server.getUrl())
        .setCredentialsProvider(new DummyCredentialsProvider())
        .setDisableRetries(true);
  }

  private static FixtureMapping fixture(String method, String path, String response) {
    return new FixtureMapping.Builder()
        .validateMethod(method)
        .validatePath(path)
        .withResponse(response, 200)
        .build();
  }

  private static String usersPage(
      String users, long itemsPerPage, long startIndex, long totalResults) {
    return "{\"Resources\":["
        + users
        + "],\"itemsPerPage\":"
        + itemsPerPage
        + ",\"startIndex\":"
        + startIndex
        + ",\"totalResults\":"
        + totalResults
        + "}";
  }

  private static List<String> userNames(Iterable<User> users) {
    List<String> result = new ArrayList<>();
    for (User user : users) {
      result.add(user.getUserName());
    }
    return result;
  }
}
