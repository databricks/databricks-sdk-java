package com.databricks.sdk.client;

import java.util.Arrays;
import java.util.List;

public class BricksCliTokenSource extends CliTokenSource {
    public BricksCliTokenSource(DatabricksConfig config) {
        String cliPath = config.getBricksCliPath();
        if(cliPath == null) {
            cliPath = "bricks";
        }
        List<String> cmd = Arrays.asList(cliPath, "auth", "token", "--host", config.getHost());
        if(config.isAccountClient()) {
            cmd.add("--account-id");
            cmd.add(config.getAccountId());
        }
        new CliTokenSource(cmd, "token_type", "access_token", "expiry");
    }

}
