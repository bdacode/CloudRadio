import com.google.appengine.api.datastore.*

log.info "Setting attribute datetime"

request.setAttribute 'datetime', 'asd'

log.info "Forwarding to the template"

forward '/WEB-INF/pages/test.gtpl'