package graphql.servlet.input;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BatchInputPreProcessor {

    /**
     * An injectable object that allows clients to manipulate a batch before executing, or abort altogether. If the returned result is not to be exeuted
     * @param batchedInvocationInput  the input to process
     * @param request the servlet request
     * @param response the servlet response
     * @return wrapped batch to possibly process.
     */
    BatchInputPreProcessResult preProcessBatch(GraphQLBatchedInvocationInput batchedInvocationInput, HttpServletRequest request,
                                               HttpServletResponse response);
}