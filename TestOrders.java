import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        Item articulo1 = new Item();
        articulo1.name = "Moka";
        articulo1.price = 4.3;

        Item articulo2 = new Item();
        articulo2.name = "Latte";
        articulo2.price = 4.1;

        Item articulo3 = new Item();
        articulo3.name = "Café de goteo";
        articulo3.price = 4.0;

        Item articulo4 = new Item();
        articulo4.name = "Capuchino";
        articulo4.price = 4.2;

        Order pedido1 = new Order();
        pedido1.name = "Cindhuri";

        Order pedido2 = new Order();
        pedido2.name = "Jimmy";

        Order pedido3 = new Order();
        pedido3.name = "Noah";

        Order pedido4 = new Order();
        pedido4.name = "Sam";

        System.out.println(pedido1);
        System.out.println(pedido1.total);

        pedido1.items.add(articulo3);
        pedido1.total += articulo3.price;

        pedido2.items.add(articulo1);
        pedido2.total += articulo2.price;

        pedido3.items.add(articulo4);
        pedido3.total += articulo4.price;

        pedido4.items.add(articulo2);
        pedido4.total += articulo2.price;

        pedido1.ready = true;
        
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.price;
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.price;

        pedido2.ready = true;


        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.printf("Nombre: %s\n", pedido1.name);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.ready);
        System.out.println("----------------------------------------------------");
        System.out.printf("Nombre: %s\n", pedido2.name);
        System.out.printf("Total: %s\n", pedido2.total);
        System.out.printf("Listo: %s\n", pedido2.ready);
        System.out.println("----------------------------------------------------");
        System.out.printf("Nombre: %s\n", pedido3.name);
        System.out.printf("Total: %s\n", pedido3.total);
        System.out.printf("Listo: %s\n", pedido3.ready);
        System.out.println("----------------------------------------------------");
        System.out.printf("Nombre: %s\n", pedido4.name);
        System.out.printf("Total: %s\n", pedido4.total);
        System.out.printf("Listo: %s\n", pedido4.ready);
    }
}