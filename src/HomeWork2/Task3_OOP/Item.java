package HomeWork2.Task3_OOP;

public class Item {

    private String name;
    private double price;
    private double quantity;

    public Item(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (amount <= 0) {
            System.out.println("Количество для продажи должно быть больше нуля.");
            return;
        }
        if (amount > quantity) {
            System.out.println("Недостаточно товара на складе.");
        } else {
            quantity -= amount;
            System.out.println(amount + " единиц товара " + name + " продано.");
        }
    }

    public void restock(int amount) {
        if (amount <= 0) {
            System.out.println("Количество для пополнения должно быть больше нуля.");
        } else {
            quantity += amount;
            System.out.println(amount + " единиц товара " + name + " добавлено на склад.");
        }
    }

    public String getInfo() {
        return "Название: " + name + ", Цена: " + price + ", Количество на складе: " + quantity;
    }
}
