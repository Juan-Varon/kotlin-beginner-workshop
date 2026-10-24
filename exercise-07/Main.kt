
class Contact(
    val name: String,
    val phone: String,
    val email: String
)

fun addContact(contacts: MutableList<Contact>, contact: Contact) {
    contacts.add(contact)
    println("Contacto agregado: ${contact.name}")
}

fun listContacts(contacts: MutableList<Contact>) {
    if (contacts.isEmpty()) {
        println("La agenda esta vacia.")
        return
    }

    println("\n--- Lista de contactos ---")

    for (contact in contacts) {
        println("Nombre: ${contact.name}")
        println("Telefono: ${contact.phone}")
        println("Correo: ${contact.email}")
        println("--------------------------")
    }
}

fun searchContact(contacts: MutableList<Contact>, name: String) {
    val contact = contacts.find {
        it.name.equals(name, ignoreCase = true)
    }

    if (contact != null) {
        println("\nContacto encontrado:")
        println("Nombre: ${contact.name}")
        println("Telefono: ${contact.phone}")
        println("Correo: ${contact.email}")
    } else {
        println("No existe un contacto con el nombre: $name")
    }
}

fun deleteContact(contacts: MutableList<Contact>, name: String) {
    val contact = contacts.find {
        it.name.equals(name, ignoreCase = true)
    }

    if (contact != null) {
        contacts.remove(contact)
        println("Contacto eliminado: ${contact.name}")
    } else {
        println("No existe un contacto con el nombre: $name")
    }
}

fun main() {
    val contacts = mutableListOf(
        Contact("Ana", "3001234567", "ana@gmail.com"),
        Contact("Carlos", "3102345678", "carlos@gmail.com"),
        Contact("Laura", "3203456789", "laura@gmail.com"),
        Contact("Pedro", "3154567890", "pedro@gmail.com"),
        Contact("Maria", "3015678901", "maria@gmail.com")
    )

    listContacts(contacts)

    addContact(
        contacts,
        Contact("Juan", "3126789012", "juan@gmail.com")
    )

    searchContact(contacts, "Laura")

    deleteContact(contacts, "Carlos")

    println("\nAgenda despues de eliminar un contacto:")
    listContacts(contacts)
}
