package com.cv.tlv.strategies;

import com.cv.tlv.domain.RequestMessage;
import com.cv.tlv.domain.ResponseMessage;
import com.cv.tlv.exceptions.TLVException;

/**
 * Created by cv on 10/7/17.
 */
public interface ProcessorStrategy {
    ResponseMessage process(RequestMessage requestMessage) throws TLVException;
}
