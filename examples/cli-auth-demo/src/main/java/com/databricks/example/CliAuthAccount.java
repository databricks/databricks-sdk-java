package com.databricks.example;

import com.databricks.sdk.DatabricksAccount;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.provisioning.Workspace;

/**
 Example for authenticating with Databricks Account through CLI.
 The authentication type can be set to either "bricks-cli" or "azure-cli".
 For details on authenticating via bricks cli, please see: <a href="https://docs.databricks.com/dev-tools/cli/auth-commands.html">...</a>
 */
public class CliAuthAccount {
    /**
     Get config used for authenticating with Databricks.
     @return DatabricksConfig object used for authentication
     */
    private static DatabricksConfig getConfig() {
        // Change to "azure-cli" if you want to authenticate through azure cli
        // Please authenticate using cli before using them in SDK.
        // Example for the following case:
        // $ bricks cli auth login --host <host> --account-id <accountId>
        String authType = "bricks-cli";
        String host = "";
        String accountId = "";
        return new DatabricksConfig()
                .setAuthType(authType)
                .setHost(host)
                .setAccountId(accountId);
    }

    /**
     Authenticate and retrieve the list of workspaces from account
     */
    public static void main(String[] args) {
        DatabricksConfig config = getConfig();

        DatabricksAccount account = new DatabricksAccount(config);
        for (Workspace w : account.workspaces().list()) {
            System.out.println(w.getWorkspaceName());
        }
    }
}
