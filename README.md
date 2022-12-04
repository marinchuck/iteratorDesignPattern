# OOP gyakorlás 🏋️‍♂️
## Lépések
1. Készíts egy interfészt, legyen a neve Iterator.

2. Iterator interfészben csinálj egy metódus, hasNext ami nem kap semmilyen paramétert és a visszatérési érték boolean logikai. Ennek az implementálása fogja megvalósítani, hogy van-e még olyan eleme a tárolónak amit még nem láttunk.

3. Iterator interfészben csinálj egy metódus, next ami nem kap semmilyen paramétert és a visszatérési érték Object objekt. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük azt az elemét a tárolónak amit még nem láttunk.

4. Készíts egy interfészt, legyen a neve Container.

5. Container interfészben csinálj egy metódus, getIterator ami nem kap semmilyen paramétert és a visszatérési érték Iterator interfészt megvalósító objektum. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük a tárolótól az iterátorát amivek végig tudunk menni majd az elemeken.

6. Container interfészben csinálj egy metódus, getSize ami nem kap semmilyen paramétert és a visszatérési érték int méret. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük a tárolótól a méretét.

7. Container interfészben csinálj egy metódus, getItem ami egy index egész számot kap paraméterként és a visszatérési érték Object ami az adott indexű elem. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük a tárolótól egy kívánt elemét.

8. Csináljunk egy Container implementációt. Azaz egy class-t ami mondjuk legyen CarBrands és implementáljuk a Container interfészt ezen az osztályon. Azaz hozzuk létre egyelőre üres blokkal a Container-ben definiált metódusokat. 🚗

9. Ezen CarBrand osztályon belül csinálj egy propertit (field) ami egy String[] és tartalmaz számos autó márkát, pl. ("Honda", "Dácsia", "Skoda", "Audi", "Ford", "BMW", stb.)

10. A CarBrand.java file-ban a CarBrand class melé, szintén hozz létre egy CarIterator class-t ami implementálja az Iterator interfészt. Szintén a szükséges metódusokat vedd fel, még üress blokkokkal.

11. A CarIterator-nak csinálj egy konstruktort ami paraméterként vár egy CarBrand referenciát és azt eltárolja container propertiként. Továbbá vegyél fel egy currentIndex properit is ami egész szám és az éppen aktuális indexet tárolja, kezdőérték 0 legyen beállítva a konstruktor blokjában.

12. Implementáld a CarIterator hasNext metódusát. Itt a feladat hogy visszatérjünk azzal a logikai értékkel ami megmondja, hogy az iterátorban van-e még elem, azaz a currentIndex kisebb-e mint a container.getSize()

13. Implementáld a CarIterator next metódusát. Itt a feladat hogy visszatérjünk azzal az elemmel ami az éppen aktuális indexen van, azaz a currentIndex lévő elemet, vagy null add vissza ha már nincs következő elem.

14. Implementáld a CarBrand class-ban a Container-ből megöröklött metódusokat ami gyakorlatilag csak a tömb megfelelő értékeit továbbítja, valamint visszatér egy új CarIterator példánnyal. 

15. Hozz létre egy belépéi pontot a futtatáshoz. Azaz mondjuk egy Main osztályt main metódussal amiben létrehozunk egy példányt a CarBrand -ből, mint cars. Majd ezen végig iterálunk a következőképpen:

```java
for(Iterator iter = cars.getIterator(); iter.hasNext();){
  String brand = (String)iter.next();
  System.out.println("Autó márka: " + brand);
}
```
16. Ellenőrizzük, hogy a megfelelő márkák megjelentek.

### Összegzés
Amit most létrehoztunk az megegyezik az OOP világban használt Iterátor tervezési mintának. 🗺️

Ez a minta nagyon általánosan használt. Arra használatos, hogy végig tudjunk lépkedni egy tárolóban eltárolt elemeken anélkül hogy tudnánk milyen a tároló konkrét megvalósítása.

Az iterátor tervezési minta (Iterator design pattern) a viselkedési minták gyűjtő (behavioral pattern category) alá tartozik.
