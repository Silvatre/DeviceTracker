package pl.polsl.minwo



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DeviceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Device.list(params), model:[deviceInstanceCount: Device.count()]
    }

    def show(Device deviceInstance) {
        respond deviceInstance
    }

    def create() {
        respond new Device(params)
    }

    @Transactional
    def save(Device deviceInstance) {
        if (deviceInstance == null) {
            notFound()
            return
        }

        if (deviceInstance.hasErrors()) {
            respond deviceInstance.errors, view:'create'
            return
        }

        deviceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'device.label', default: 'Device'), deviceInstance.id])
                redirect deviceInstance
            }
            '*' { respond deviceInstance, [status: CREATED] }
        }
    }

    def edit(Device deviceInstance) {
        respond deviceInstance
    }

    @Transactional
    def update(Device deviceInstance) {
        if (deviceInstance == null) {
            notFound()
            return
        }

        if (deviceInstance.hasErrors()) {
            respond deviceInstance.errors, view:'edit'
            return
        }

        deviceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Device.label', default: 'Device'), deviceInstance.id])
                redirect deviceInstance
            }
            '*'{ respond deviceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Device deviceInstance) {

        if (deviceInstance == null) {
            notFound()
            return
        }

        deviceInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Device.label', default: 'Device'), deviceInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'device.label', default: 'Device'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
