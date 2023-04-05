package com.databricks.sdk;

import com.databricks.sdk.client.ConfigLoader;
import org.junit.jupiter.api.Test;
import com.databricks.sdk.client.DatabricksConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabricksAuthTest {

    private Function<String,String> staticEnvResolver(Map<String,String> env) {
        return var -> env.getOrDefault(var, "");
    }

    @Test
    public void testConfigNoParams() {
        try {
            DatabricksConfig config = new DatabricksConfig();
            config.authenticate();
        } catch(Exception authException) {
            assertEquals("default auth: cannot configure default credentials", authException.getMessage());
        }
    }

    @Test
    public void testConfigHostEnv() {
        // Set environment variables
        HashMap<String, String> testEnv = new HashMap<>();
        testEnv.put("DATABRICKS_HOST", "x");

        try {
            DatabricksConfig config = new DatabricksConfig();
            ConfigLoader.resolve(config, staticEnvResolver(testEnv));
            config.authenticate();
        } catch(Exception authException) {
            assertEquals("default auth: cannot configure default credentials", authException.getMessage());
        }
    }

    @Test
    public void testConfigTokenEnv() {
        // Set environment variables
        HashMap<String, String> testEnv = new HashMap<>();
        testEnv.put("DATABRICKS_TOKEN", "x");

        try {
            DatabricksConfig config = new DatabricksConfig();
            ConfigLoader.resolve(config, staticEnvResolver(testEnv));
            config.authenticate();
        } catch(Exception authException) {
            assertEquals("default auth: cannot configure default credentials", authException.getMessage());
        }
    }

    @Test
    public void testConfigHostTokenEnv() {
        // Set environment variables
        HashMap<String, String> testEnv = new HashMap<>();
        testEnv.put("DATABRICKS_HOST", "x");
        testEnv.put("DATABRICKS_TOKEN", "x");

        DatabricksConfig config = new DatabricksConfig();
        ConfigLoader.resolve(config, staticEnvResolver(testEnv));

        // This is being done here as opposed to DatabricksConfig constructor because
        // we are reading env variables from another map which gets populated later.
        config.fixHostIfNeeded();
        config.authenticate();

        assertEquals("https://x", config.getHost());
        assertEquals("pat", config.getAuthType());
    }
}
