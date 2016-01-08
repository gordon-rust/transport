package org.echg.transport.services;

import org.echg.transport.model.CodeValidator;
import org.echg.transport.model.Trailer;

import java.util.concurrent.Callable;

/**
 * Created by examiner on 12/31/15.
 */
public class BarcodeService {
    public Trailer addTrailerData(Trailer trailer){
        return trailer;
    }

    public CodeValidator checkValidBarcode(String code){
        CodeValidator cv = new CodeValidator();
        cv.setCode(code);
        cv.setContainer(true);
        cv.setTrailer(false);

        return cv;
    }
}
