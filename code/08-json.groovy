@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*
import static groovy.json.JsonOutput.toJson

ratpack {
    handlers {
        get {
            response.contentType 'application/json'
            render toJson(['message': 'Long live to Json!'])
        }
        get('simpler') {
            response.send 'application/json', toJson(['even': 'simpler'])
        }
    }
}