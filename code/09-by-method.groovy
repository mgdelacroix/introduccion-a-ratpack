@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*
import static groovy.json.JsonOutput.toJson

ratpack {
    handlers {
        handler('myendpoint') {
            byMethod {
                get {
                    response.send 'application/json', toJson(['method': 'GET'])
                }
                post {
                    response.send 'application/json', toJson(['method': 'POST'])
                }
            }
        }
    }
}