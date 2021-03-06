package app

import org.glassfish.jersey.media.multipart.MultiPartFeature
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.server.spring.scope.RequestContextFilter

/**
 * @author futao
 * Created on 2017/12/19 - 14:49.
 */
open class RestJaxRsApplication : ResourceConfig() {
    init {
        register(MultiPartFeature::class.java)
        /*RESTfull APi*/
        register(RESTfullWrapper::class.java)

        register(RequestContextFilter::class.java)
    }
}