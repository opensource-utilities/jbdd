package io.github.awiodev.jbdd.core.definition;

/**
 * Represents unique JBdd run object.
 * @param <TSteps> for type of steps object
 * @param <TContext> for type of context object
 */
public interface JBddRun<TSteps extends Steps, TContext extends JBddContext> {

    /**
     * Provides scenario steps.
     * @return instance of given steps object
     */
    TSteps scenario();

    /**
     * Provides test context.
     * @return instance of given test context object
     */
    TContext context();

    /**
     * Performs cleanup of test run resources.
     */
    default void clean() {
        context().cleanup();
    }
}
