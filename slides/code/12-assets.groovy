@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get {
            render 'Standard endpoint'
        }
        get('code') {
            redirect '/images/code2.jpg'
        }
        assets 'public'
    }
}