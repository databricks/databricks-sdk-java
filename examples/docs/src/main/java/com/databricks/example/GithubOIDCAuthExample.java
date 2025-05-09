package com.databricks.example;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.iam.User;
import com.databricks.sdk.service.iam.ListAccountGroupsRequest;
import com.databricks.sdk.service.iam.Group;

/**
 * Example demonstrating how to use GitHub OIDC authentication with Databricks.
 * 
 * IMPORTANT: This example only works when running within GitHub Actions.
 */
public class GithubOIDCAuthExample {

    public static void main(String[] args) {
        // Create Databricks configuration with GitHub OIDC authentication
        // Note: This configuration assumes the code is running in GitHub Actions
        DatabricksConfig config = new DatabricksConfig()
            .setAuthType("github-oidc")  // Specifies GitHub OIDC as the authentication method
            .setHost("<INSERT_HOST>")  // Databricks account URL
            .setAccountId("<INSERT_ACCOUNT_ID>")  // Your Databricks account ID
            .setClientId("<INSERT_CLIENT_ID>");  // Service Principal ID

        // Initialize the Account client with the OIDC configuration
        AccountClient account = new AccountClient(config);

        try {
            // Example: List all groups in the Databricks account
            // This demonstrates that the OIDC authentication is working
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