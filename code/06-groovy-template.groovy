@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get {
            render groovyTemplate('groovyTemplate.html', ['model': 'as Map'])
        }
    }
}