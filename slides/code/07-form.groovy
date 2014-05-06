@Grab("io.ratpack:ratpack-groovy:0.9.2")
import static ratpack.groovy.Groovy.*
import ratpack.form.Form

ratpack {
    handlers {
        get {
            render htmlBuilder {
                h1 'Send me something'
                form(method: 'POST', action: 'htmlForm') {
                    input type: 'text', name: 'text'
                    input type: 'submit', value: 'Enviar'
                }
            }
        }

        post('form') {
            def form = parse Form

            render "You sent: ${form.get('text')}"
        }

        post('htmlForm') {
            def form = parse Form

            render htmlBuilder {
                p 'You sent'
                h2 form.get('text')
                a href: '/', 'Send me another text!'
            }
        }
    }
}