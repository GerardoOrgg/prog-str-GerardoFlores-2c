
/*
 * Author: Manuel Alejandro Bello Hernández
 * Date: 11/02/26
 * Description: Virtual store that calculates the total amount of products
 * and reduces the stock when they are purchased.
 * Modified to use full object encapsulation and English variables.
 */

import java.util.Scanner;



// MAIN CLASS
public class TiendaObjetos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. PRODUCT INITIALIZATION (Array of Objects)
        Product[] inventory = {
                new Product("Doritos", 20.00),
                new Product("Coca Cola", 18.00),
                new Product("Galletas", 15.50),
                new Product("Agua Ciel", 12.00),
                new Product("Chicle", 5.00)
        };

        System.out.println("--- BIENVENIDO A TIENDA MANUEL ---");

        boolean continueShopping = true;

        while (continueShopping) {
            // 3. SHOW MENU AND TABLE
            System.out.println("\nLista de Productos Disponibles:");
            System.out.printf("%-5s %-15s %-10s %-10s%n", "ID", "Nombre", "Precio", "Stock");
            System.out.println("---------------------------------------------");

            for (int i = 0; i < inventory.length; i++) {
                // Formatted table using Getters instead of direct property access
                System.out.printf("%-5d %-15s $%-9.2f %-10d%n",
                        (i + 1),
                        inventory[i].getName(),
                        inventory[i].getPrice(),
                        inventory[i].getStock());
            }
            System.out.println("0.    Salir");
            System.out.println("---------------------------------------------");

            // 4. DATA REQUEST
            try {
                System.out.print("\nElige el ID del producto a comprar: ");
                int option = Integer.parseInt(scanner.nextLine());

                if (option == 0) {
                    System.out.println("¡Gracias por su compra! Vuelva pronto.");
                    continueShopping = false;
                } else {
                    int index = option - 1;

                    // Validate that the ID exists
                    if (index >= 0 && index < inventory.length) {
                        Product selectedProduct = inventory[index];

                        System.out.print("¿Cuántos '" + selectedProduct.getName() + "' deseas llevar?: ");
                        int quantity = Integer.parseInt(scanner.nextLine());

                        // 5. SALES LOGIC AND VALIDATION
                        if (quantity <= 0) {
                            System.out.println("Error: La cantidad debe ser mayor a 0.");
                        } else if (quantity <= selectedProduct.getStock()) {

                            // Calculations using Getters
                            double totalAmount = quantity * selectedProduct.getPrice();

                            // Update Stock using Getter and Setter
                            int currentStock = selectedProduct.getStock();
                            selectedProduct.setStock(currentStock - quantity);

                            // Show Results
                            System.out.println("\n VENTA EXITOSA");
                            System.out.println("Producto:      " + selectedProduct.getName());
                            System.out.println("Cantidad:      " + quantity);
                            System.out.printf("Total a pagar: $%.2f%n", totalAmount);
                            System.out.println("Stock actual:  " + selectedProduct.getStock());
                        } else {
                            System.out.println("\n No hay suficiente stock. Solo quedan " + selectedProduct.getStock() + " unidades.");
                        }

                    } else {
                        System.out.println("\n ID de producto no válido.");
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("\n Error: Por favor ingresa solo números.");
            }
        }

        scanner.close();
    }
}