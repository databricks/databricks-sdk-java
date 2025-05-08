package com.databricks.sdk.examples;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.workspace.WorkspaceClient;

/**
 * Example demonstrating how to use GitHub OIDC authentication with Databricks.
 * 
 * This example assumes you have:
 * 1. A Databricks workspace
 * 2. A service principal configured with GitHub OIDC federation
 * 3. The following environment variables set:
 *    - DATABRICKS_HOST: Your Databricks workspace URL
 *    - DATABRICKS_CLIENT_ID: Your service principal's client ID
 *    - ACTIONS_ID_TOKEN_REQUEST_URL: GitHub Actions token request URL
 *    - ACTIONS_ID_TOKEN_REQUEST_TOKEN: GitHub Actions token request token
 */
public class GithubOIDCAuthExample {
    public static void main(String[] args) {
        // Create Databricks configuration with GitHub OIDC authentication
        DatabricksConfig config = new DatabricksConfig()
            .setAuthType("github-oidc");

        // Create a workspace client
        WorkspaceClient workspace = new WorkspaceClient(config);

        try {
            // Test the authentication by getting the current user
            var currentUser = workspace.currentUser().me();
            System.out.println("Successfully authenticated as: " + currentUser.getUserName());
            
            // You can add more API calls here to test other functionality
            // For example:
            // var clusters = workspace.clusters().list();
            // System.out.println("Available clusters: " + clusters);
            
        } catch (Exception e) {
            System.err.println("Authentication failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 