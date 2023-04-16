package com.databricks.sdk.client;

import java.util.Arrays;
import java.util.List;

public class AzureCliTokenSource extends CliTokenSource {

    public AzureCliTokenSource(String resource) {
        List<String> cmd = Arrays.asList("az", "account", "get-access-token", "--resource", resource, "--output", "json");
        new CliTokenSource(cmd, "tokenType", "accessToken", "expiresOn");
    }

}
