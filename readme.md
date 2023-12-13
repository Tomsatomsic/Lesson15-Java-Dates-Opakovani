# Lekce 15 - Opakování Java Dates

Vrámci opakování práce s datumy vypracujte následující příklady. Výsledky si můžete ověřit v testovací třídě *DateTimeUtilsTest*.

## Zadání
 1) *(1 bod)* Vypište aktuální datum ve formátu den.měsíc.rok hodina:minuta (např. 12.12.2023 14:41)
 2) *(1 bod)* Naparsujte datum "03.11.2023" pomocí parseru se zadaným fromátem. Správný zápis formátu můžete vyhledat.
 3) *(1 bod)* Přičtěte k zadanému datu (LocalDate) 12 hodin a vypište ve formátu 12.12.2023 12:00
 4) *(1 bod)* Vypište aktuální den v týdnu v české lokalizaci.
    * :bulb: Pro dneštní datum bude výsledek: "Dnes je středa."
 5) *(2 body)* Definujte proměnou Vánoce (LocalDate), která bude ukazovat na datum 24.12.2023 a vypište kolik dní zbývá do začátku Vánoc pomocí String format();

    * pro výpočet použijte proměnné Vánoce a aktuální datum.
    * Výsledný výstup z metody bude String ve formátu "Do Vánoc zbývá XY dní."

 6) *(2 body)* Napište metodu, která porovná dva vložené datumy a vrátí vždy nižší z datumů na první pozici a vyšší na druhé. Pokud je tedy druhé datum nižší než to první, pak oba datumy prohodí prohodí a vrátí je jako list.
 7) *(2 body)* Najděte a vypište první pondělí po Vánocích 24.12.2023

