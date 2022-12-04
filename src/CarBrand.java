//Csináljunk egy Container implementációt. Azaz egy class-t ami mondjuk legyen CarBrand és implementáljuk a Container interfészt ezen az osztályon. Azaz hozzuk létre egyelőre üres blokkal a Container-ben definiált metódusokat.
public class CarBrand implements Container {

    //Ezen CarBrand osztályon belül csinálj egy propertit (field) ami egy String[] és tartalmaz számos autó márkát, pl. ("Honda", "Dácsia", "Skoda", "Audi", "Ford", "BMW", stb.)
    private String[] brands = {"Honda", "Dácsia", "Skoda", "Audi", "Ford", "BMW"};


    //Implementáld a CarBrand class-ban a Container-ből megöröklött metódusokat ami gyakorlatilag csak a tömb megfelelő értékeit továbbítja.
    @Override
    public Iterator getIterator() {
        return new CarIterator(this);
    }

    @Override
    public int getSize() {
        return this.brands.length;
    }

    @Override
    public Object getItem(int idx) {
        return this.brands[idx];
    }
}


//A CarBrand.java file-ban a CarBrand class melé, szintén hozz létre egy CarIterator class-t ami implementálja az Iterator interfészt. Szintén a szükséges metódusokat vedd fel, még üress blokkokkal.
class CarIterator implements Iterator {

    private final Container container;
    private int currentIndex;

    //A CarIterator-nak csinálj egy konstruktort ami paraméterként vár egy CarBrand referenciát és azt eltárolja container propertiként. Továbbá vegyél fel egy currentIndex properit is ami egész szám és az éppen aktuális indexet tárolja, kezdőérték 0 legyen beállítva a konstruktor blokjában.
    CarIterator(CarBrand carBrand) {
        this.container = carBrand;
        this.currentIndex = 0;
    }

    //Implementáld a CarIterator hasNext metódusát. Itt a feladat hogy visszatérjünk azzal a logikai értékkel ami megmondja, hogy az iterátorban van-e még elem, azaz a currentIndex kisebb-e mint a container.getSize()
    @Override
    public boolean hasNext() {
        return this.currentIndex < this.container.getSize();
    }


    //Implementáld a CarIterator next metódusát. Itt a feladat hogy visszatérjünk azzal az elemmel ami az éppen aktuális indexen van, azaz a currentIndex lévő elemet, vagy null add vissza ha már nincs következő elem.
    @Override
    public Object next() {
        return this.hasNext() ? container.getItem(currentIndex++) : null;
    }
}
