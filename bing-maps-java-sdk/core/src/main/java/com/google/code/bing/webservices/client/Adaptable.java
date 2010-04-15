/**
 *
 */
package com.google.code.bing.webservices.client;

/**
 * @author nmukhtar
 *
 *
 * @param <Adapter>
 * @param <Adaptee>
 */
public interface Adaptable<Adapter, Adaptee> {

    /**
     * Method description
     *
     *
     * @param adaptee
     */
    public Adapter adaptFrom(Adaptee adaptee);

    /**
     * Method description
     *
     *
     * @return
     */
    public Adaptee adaptTo(Adapter adapter);
}
