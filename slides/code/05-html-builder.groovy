@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get {
            render htmlBuilder {
                head {
                    title 'My website title'
                }
                body {
                    h1 'Hi stranger!'
                    p {
                        a href: 'http://github.com', "Let's visit GitHub!"
                    }
                }
            }
        }
    }
}