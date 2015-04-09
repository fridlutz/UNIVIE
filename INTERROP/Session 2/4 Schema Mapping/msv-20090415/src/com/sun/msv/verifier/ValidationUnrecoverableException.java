/*
 * @(#)$Id: ValidationUnrecoverableException.java 1566 2003-06-09 20:37:49Z kk122374 $
 *
 * Copyright 2001 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */
package com.sun.msv.verifier;

import org.xml.sax.SAXParseException;

/**
 * Exception that signals error was fatal and recovery was not possible.
 * 
 * @author <a href="mailto:kohsuke.kawaguchi@eng.sun.com">Kohsuke KAWAGUCHI</a>
 */
public class ValidationUnrecoverableException extends SAXParseException
{
    public ValidationUnrecoverableException( SAXParseException vv ) {
        super(
            vv.getMessage(), vv.getPublicId(), vv.getSystemId(),
            vv.getLineNumber(), vv.getColumnNumber(), vv );
    }
}
