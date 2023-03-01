import computer.*;
import computer.components.*;

/**
 * This program implements the Design Pattern Decorator for
 * the Bootcamp code challenge from DIO. Made with proud
 * (and Java).
 *
 * @author Pedro
 * @version 1.0
 * @since 2022-05-30
 * @see <a href=
 *      "https://www.freecodecamp.org/portuguese/news/os-3-tipos-de-padroes-de-projetos-que-todo-desenvolvedor-deveria-conhecer-com-exemplos-de-codigo-de-cada-um/"
 *      target="_blank">Project based on this reference</a>
 * @see <a href="https://springframework.guru/gang-of-four-design-patterns/decorator-pattern/">Posible implementation using Spring Boot</a>
 */

public class App {
    public static void main(String[] args) throws Exception {
        Computer computer = new MyPC();

        computer = new HD(computer, 256, "SSD", 100);
        computer = new RAM(computer, 8, 100);
        computer = new CPU(computer, 3.5, 4, "Intel", 200);
        computer = new GPU(computer, 2, "Nvidia", 300);

        System.out.println(computer.getSpecs() + "\nThe final price of your PC is $" + computer.cost());

    }
}
