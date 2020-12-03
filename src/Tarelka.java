public class Tarelka extends Dish
{
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Tarelka(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Тарелка" + "\n" + "Материал: " + material + "\n" + "Цвет: " + color + "\n" + "Размер: " + size;
    }
}