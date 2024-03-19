package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.ApiErrors;
import com.databricks.sdk.core.http.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;

public class NonIdempotentRequestRetryStrategy implements RetryStrategy {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass().getName());

    private DatabricksError databricksError;

    private static final List<String> TRANSIENT_ERROR_STRING_MATCHES =
            Arrays.asList(
                    "com.databricks.backend.manager.util.UnknownWorkerEnvironmentException",
                    "does not have any associated worker environments",
                    "There is no worker environment with id",
                    "Unknown worker environment",
                    "ClusterNotReadyException");

    private static final List<Class<? extends Throwable>> RETRYABLE_CLASSES =
            Arrays.asList(SocketException.class, SocketTimeoutException.class, ConnectException.class);

    @Override
    public boolean isRetriable(Response response, Exception e) {
        databricksError = ApiErrors.checkForRetry(response, e);
        if (isTooManyRequestsError(databricksError)) {
            return true;
        }
        if (isCausedByTransientError(databricksError)) {
            return true;
        }
        if (isClientSideException(databricksError)) {
            return true;
        }
        if (isNotProcessedByServer(databricksError)) {
            return true;
        }
        return false;
    }

    @Override
    public DatabricksError getError() {
        return databricksError;
    }

    private boolean isNotProcessedByServer(DatabricksError databricksError) {
        return databricksError.getStatusCode() == 501 || databricksError.getStatusCode() == 503;
    }


    private boolean isTooManyRequestsError(DatabricksError databricksError) {
        return databricksError.getStatusCode() == 429;
    }

    private boolean isCausedByTransientError(DatabricksError databricksError) {
        String message = databricksError.getMessage();
        for (String match : TRANSIENT_ERROR_STRING_MATCHES) {
            if (message != null && message.contains(match)) {
                return true;
            }
        }
        return false;
    }

    private boolean isClientSideException(DatabricksError error) {
        for (Class<? extends Throwable> clazz : RETRYABLE_CLASSES) {
            if (isCausedBy(error.getCause(), clazz)) {
                LOGGER.debug("Attempting retry because cause or nested cause extends {}", clazz.getName());
                return true;
            }
        }
        return false;
    }

    private static boolean isCausedBy(Throwable throwable, Class<? extends Throwable> clazz) {
        if (throwable == null) {
            return false;
        }
        if (clazz.isInstance(throwable)) {
            return true;
        }
        return isCausedBy(throwable.getCause(), clazz);
    }
}
