@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get {
            byContent {
                json {
                    render 'JSON'
                }
                plainText {
                    render 'TEXT'
                }
                html {
                    render 'HTML'
                }
            }
        }
    }
}