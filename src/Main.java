//Hozz létre egy belépéi pontot a futtatáshoz. Azaz mondjuk egy Main osztályt main metódussal amiben létrehozunk egy példányt a CarBrand -ből, mint cars. Majd ezen végig iterálunk a következőképpen:
public class Main {

    public static void main(String[] args) {

        CarBrand cars = new CarBrand();

        for (Iterator iter = cars.getIterator(); iter.hasNext(); ) {
            String brand = (String) iter.next();
            System.out.println("Autó márka: " + brand);
        }
    }
}
