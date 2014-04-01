@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get {
            String name = queryParams.name
            render 'Hello $name!'
        }
    }
}