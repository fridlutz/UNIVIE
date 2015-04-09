/*
 * @(#)$Id: NamespaceReceiver.java 1597 2003-09-04 20:37:30Z kohsuke $
 *
 * Copyright 2001 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */
package schemaLookup;

/**
 * Receives namespace URIs.
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public interface NamespaceReceiver {
    void onNamespace(String ns);
}
