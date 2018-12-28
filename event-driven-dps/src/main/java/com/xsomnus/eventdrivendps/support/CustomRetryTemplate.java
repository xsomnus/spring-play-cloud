package com.xsomnus.eventdrivendps.support;

import org.springframework.retry.*;
import org.springframework.retry.backoff.BackOffPolicy;
import org.springframework.retry.policy.RetryContextCache;
import org.springframework.retry.support.RetryTemplate;

/**
 * @author somnus_xiawenye
 * @since 2018/12/7 0007 17:54
 */
public class CustomRetryTemplate extends RetryTemplate {

    @Override
    public void setThrowLastExceptionOnExhausted(boolean throwLastExceptionOnExhausted) {
        super.setThrowLastExceptionOnExhausted(throwLastExceptionOnExhausted);
    }

    @Override
    public void setRetryContextCache(RetryContextCache retryContextCache) {
        super.setRetryContextCache(retryContextCache);
    }

    @Override
    public void setListeners(RetryListener[] listeners) {
        super.setListeners(listeners);
    }

    @Override
    public void registerListener(RetryListener listener) {
        super.registerListener(listener);
    }

    @Override
    public void setBackOffPolicy(BackOffPolicy backOffPolicy) {
        super.setBackOffPolicy(backOffPolicy);
    }

    @Override
    public void setRetryPolicy(RetryPolicy retryPolicy) {
        super.setRetryPolicy(retryPolicy);
    }

    @Override
    protected <T, E extends Throwable> T doExecute(RetryCallback<T, E> retryCallback, RecoveryCallback<T> recoveryCallback, RetryState state) throws E, ExhaustedRetryException {
        return super.doExecute(retryCallback, recoveryCallback, state);
    }

    @Override
    protected boolean canRetry(RetryPolicy retryPolicy, RetryContext context) {
        return super.canRetry(retryPolicy, context);
    }

    @Override
    protected void close(RetryPolicy retryPolicy, RetryContext context, RetryState state, boolean succeeded) {
        super.close(retryPolicy, context, state, succeeded);
    }

    @Override
    protected void registerThrowable(RetryPolicy retryPolicy, RetryState state, RetryContext context, Throwable e) {
        super.registerThrowable(retryPolicy, state, context, e);
    }

    @Override
    protected RetryContext open(RetryPolicy retryPolicy, RetryState state) {
        return super.open(retryPolicy, state);
    }

    @Override
    protected <T> T handleRetryExhausted(RecoveryCallback<T> recoveryCallback, RetryContext context, RetryState state) throws Throwable {
        return super.handleRetryExhausted(recoveryCallback, context, state);
    }

    @Override
    protected <E extends Throwable> void rethrow(RetryContext context, String message) throws E {
        super.rethrow(context, message);
    }

    @Override
    protected boolean shouldRethrow(RetryPolicy retryPolicy, RetryContext context, RetryState state) {
        return super.shouldRethrow(retryPolicy, context, state);
    }
}
