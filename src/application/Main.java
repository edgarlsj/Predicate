package application;

import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 1500.0)); // instanciando os produtos
        list.add(new Product("Notebook", 80.00));
        list.add(new Product("Celular", 500.00));
        list.add(new Product("Carregador", 50.00));
        list.add(new Product("Pelicula", 30.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);



        sc.close();

    }
}