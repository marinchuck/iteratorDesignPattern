//Készíts egy interfészt, legyen a neve Container.
public interface Container {

    //Container interfészben csinálj egy metódus, getIterator ami nem kap semmilyen paramétert és a visszatérési érték Iterator interfészt megvalósító objektum. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük a tárolótól az iterátorát amivek végig tudunk menni majd az elemeken.
    Iterator getIterator();

    //Container interfészben csinálj egy metódus, getSize ami nem kap semmilyen paramétert és a visszatérési érték int méret. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük a tárolótól a méretét.
    int getSize();

    //Container interfészben csinálj egy metódus, getItem ami egy index egész számot kap paraméterként és a visszatérési érték Object ami az adott indexű elem. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük a tárolótól egy kívánt elemét.
    Object getItem(int idx);
}
