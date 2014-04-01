@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*
import static groovy.json.JsonOutput.toJson

ratpack {
    handlers {
        prefix('api') {
            prefix('v1') {
                handler('user') {
                    byMethod {
                        get {
                            response.send 'application/json', toJson('Show user')
                        }
                        post {
                            response.send 'application/json', toJson('Create user')
                        }
                        put {
                            response.send 'application/json', toJson('Update user')
                        }
                        delete {
                            response.send 'application/json', toJson('Delete user')
                        }
                    }
                }
            }
            prefix('v2') {
                get('user') {
                    response.send 'application/json', toJson('Show user V2')
                }
            }
        }
    }
}