package com.cv.tlv.processors;

import com.cv.tlv.domain.RequestMessage;
import com.cv.tlv.domain.ResponseMessage;
import com.cv.tlv.exceptions.MalformedMessageException;
import com.cv.tlv.exceptions.TLVException;
import com.cv.tlv.strategies.ProcessorStrategy;

/**
 * Created by cv on 10/7/17.
 */
public abstract class TLVProcessor {

    private ProcessorStrategy processorStrategy;

    public TLVProcessor(ProcessorStrategy processorStrategy) {
        this.processorStrategy = processorStrategy;
    }

    public ResponseMessage process (RequestMessage requestMessage) throws TLVException {
        validateMessage(requestMessage);
        return processorStrategy.process(requestMessage);
    }

    public void validateMessage (RequestMessage requestMessage) throws MalformedMessageException {

    }

}
