package org.echg.transport.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by examiner on 1/4/16.
 */
@XmlRootElement
public class CodeValidator {
    private String code;
    private boolean isTrailer;
    private boolean isContainer;

    public CodeValidator(){

    }

    public CodeValidator(String code, boolean isTrailer, boolean isContainer) {
        this.code = code;
        this.isTrailer = isTrailer;
        this.isContainer = isContainer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isTrailer() {
        return isTrailer;
    }

    public void setTrailer(boolean trailer) {
        isTrailer = trailer;
    }

    public boolean isContainer() {
        return isContainer;
    }

    public void setContainer(boolean container) {
        isContainer = container;
    }
}
