
class Product(
    val name: String,
    val price: Double,
    val quantity: Int
) {
    fun calculateTotalValue(): Double {
        return price * quantity
    }

    fun showInformation() {
        println("Producto: $name")
        println("Precio unitario: $price")
        println("Cantidad disponible: $quantity")
        println("Valor total del inventario: ${calculateTotalValue()}")
        println("-----------------------------")
    }
}

fun main() {
    val product1 = Product("Teclado", 80000.0, 5)
    val product2 = Product("Mouse", 45000.0, 10)
    val product3 = Product("Monitor", 650000.0, 3)

    product1.showInformation()
    product2.showInformation()
    product3.showInformation()
}
