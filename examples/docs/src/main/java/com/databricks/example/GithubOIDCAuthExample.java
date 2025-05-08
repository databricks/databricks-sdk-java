package com.databricks.example;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.iam.User;
import com.databricks.sdk.service.iam.ListAccountGroupsRequest;
import com.databricks.sdk.service.iam.Group;

/**
 * Example demonstrating how to use GitHub OIDC authentication with Databricks.
 */
public class GithubOIDCAuthExample {

    public static void main(String[] args) {
        // Create Databricks configuration with GitHub OIDC authentication
        DatabricksConfig config = new DatabricksConfig()
        .setAuthType("github-oidc")
        .setHost("https://accounts.cloud.databricks.com/")
        .setAccountId("968367da-7edd-44f7-9dea-3e0b20b0ec97")
        .setClientId("dd3b5d58-5a6e-45e3-a3ae-81d8f89fc6fd");

        AccountClient account = new AccountClient(config);

        try {
            System.out.println("\nListing account groups:");
            Iterable<Group> groups = account.groups().list(new ListAccountGroupsRequest());
            for (Group group : groups) {
                System.out.println("- Group: " + group.getDisplayName() + " (ID: " + group.getId() + ")");
            }

        } catch (Exception e) {
            System.err.println("Authentication failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}