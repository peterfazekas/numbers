<h1>Numbers - Számok</h1>
<h2>Informatika érettségi emelt szintű feladat: 2013. október</h2>
<p>A <em>Szereti Ön a számokat?</em> internetes vetélkedőben a versenyzők olyan kérdéseket kapnak, amelyekre egy egész számmal kell válaszolniuk. A kérdések különböző témakörökből származnak (pl. magyar, matematika, történelem, kémia), és nehézségüktől függően 1-től 3-ig terjedő pontszámot érnek. Tudjuk, hogy a kérdésekre adható válaszok értéke 0 és 1 milliárd közé esik.</p>
<p>A feladatokat a verseny szervezői egy adatfájlban tárolják. A fájlban minden feladat két sorban helyezkedik el. Az első sor tartalmazza a kérdést, a második pedig – egy-egy szóközzel elválasztva – a helyes választ, a helyes válaszért adható pontszámot és a témakör megnevezését. A fájlban egyelőre ékezetes betűk nem szerepelnek, pl. a „gyümölcsízű” szó helyett a „gyumolcsizu” szót írták be.</p>
<p>Például:</p>
<pre>Mikor volt a mohacsi vesz?
1526 1 tortenelem</pre>
<p>A példában szereplő kérdés: <b><em>Mikor volt a mohacsi vesz?</em></b> A helyes válasz: <b><em>1526</em></b>. A helyes válasz <b><em>1</em></b> pontot ér, és a kérdés a <b><em>tortenelem</em></b> témakörbe tartozik.</p>
<p>Az adatfájl még csak részben készült el. Az Ön feladata ennek a félkész adatfájlnak a tesztelése. A fájl legfeljebb 100 kérdést tartalmaz. Biztosan van benne matematika, történelem és földrajz feladat, de más témakörök is előfordulnak.</p>
<p>Készítsen programot, amely a <b><em>felszam.txt</em></b> állomány adatait felhasználva az alábbi kérdésekre válaszol! A program forráskódját mentse <b><code>szamok</code></b> néven! (A beolvasott fájl adatait és a felhasználó válaszainak az érvényességét nem kell ellenőriznie.)</p>
<p>A képernyőre írást igénylő feladatok eredményének megjelenítése előtt írja ki a képernyőre a feladat sorszámát (például: <code>3. feladat</code>)! Ha a felhasználótól kér be adatot, akkor jelenítse meg a képernyőn azt is, hogy milyen adatot vár! Az ékezetmentes kiírás is elfogadott.</p>
<ol>
<li>Olvassa be a <b><em>felszam.txt</em></b> állományban talált adatokat, és azok felhasználásával oldja meg a következő feladatokat!</li>
<li>Hány feladat van az adatfájlban? A választ írassa ki a képernyőre!</li>
<li>Határozza meg, hogy hány matematika feladat van az adatfájlban, és ezek közül hány feladat ér 1, 2, illetve 3 pontot! A választ egész mondatban írassa ki a képernyőre!<br />
Például:
<pre>Az adatfajlban 20 matematika feladat van, 1 pontot er
10 feladat, 2 pontot er 6 feladat, 3 pontot er 4 feladat.</pre></li>
<li>Mettől meddig terjed a fájlban található válaszok számértéke? A választ egész mondatban írja ki a képernyőre!</li>
<li>Milyen témakörök szerepelnek ténylegesen az adatfájlban? Írassa ki a témakörök nevét a képernyőre úgy, hogy minden előforduló témakör pontosan egyszer jelenjen meg!</li>
<li>Kérje be egy témakör nevét, és véletlenszerűen sorsoljon ki egy kérdést ebből a témakörből! Sorsoláskor ügyeljen arra, hogy az adott témakörbe eső valamennyi feladatnak legyen esélye! (Feltételezheti, hogy a felhasználó helyesen adta meg egy létező témakör nevét.) Írassa ki a kérdést, kérje be a felhasználó válaszát, majd adja meg a válaszért járó pontszámot! (Helytelen válaszért 0 pont jár.) Ha a válasz helytelen volt, a helyes választ is közölje! A párbeszéd az alábbi formában jelenjen meg:<br />Például:
<pre>Milyen temakorbol szeretne kerdest kapni? tortenelem
Mikor volt a mohacsi vesz? 1514
A valasz 0 pontot er.
A helyes valasz: 1526
</pre></li>
<li>Generáljon egy 10 kérdésből álló feladatsort véletlenszerűen úgy, hogy egyetlen feladat se szerepeljen benne kétszer! (Ügyeljen azonban arra, hogy minden beolvasott feladatnak legyen esélye a kiválasztásra!) A feladatsort írassa ki a <b><em>tesztfel.txt</em></b> állományba az alábbi formátumban! (Az első szám a helyes megoldásért járó pontszám, ezt követi a helyes válasz, majd a kérdés egy-egy szóközzel elválasztva.) Az állomány végére írassa ki a feladatsorra összesen adható pontszámot is!</br>
Például:
<pre>…
1 1526 Mikor volt a mohacsi vesz?
…
A feladatsorra osszesen 20 pont adhato.
</pre></li>
</ol>
<hr />
<h3>Források</h3>
<ul>
<li><a href="http://dload.oktatas.educatio.hu/erettsegi/feladatok_2013tavasz_emelt/e_infma_13maj_fl.pdf">Feladatlap</a>
<li><a href="https://www.oktatas.hu/bin/content/dload/erettsegi/feladatok_2013tavasz_emelt/e_infmafor_13maj_fl.zip">Forrásállományok</a>
</ul>

