@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get('user/:name?') {
            String name = pathTokens.name
            render 'Hello $name, now from PathTokens!'
        }
    }
}