package com.xsomnus.eventdrivendps.support;

import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryPolicy;

/**
 * @author somnus_xiawenye
 * @since 2018/12/7 0007 17:55
 */
public class CustomRetryPolicy implements RetryPolicy {

    @Override
    public boolean canRetry(RetryContext retryContext) {
        return true;
    }

    @Override
    public RetryContext open(RetryContext retryContext) {
        return null;
    }

    @Override
    public void close(RetryContext retryContext) {

    }

    @Override
    public void registerThrowable(RetryContext retryContext, Throwable throwable) {
        Throwable lastThrowable = retryContext.getLastThrowable();

        if (lastThrowable instanceof RuntimeException) {

        }
    }
}
