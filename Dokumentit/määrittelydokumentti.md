* Mitä algoritmeja ja tietorakenteita toteutat työssäsi
A*, D* jos töiden ohella kerkeän

* Mitä ongelmaa ratkaiset ja miksi valitsit kyseiset algoritmit/tietorakenteet
Reitinetsimistä. D* tulee mukaan kuvioihin, jos on tarvetta selvittää reittihakua muuttuvassa ympäristössä. A*:lla joudutaan laskenta aloittamaan alusta, jos reitille ilmestyy este, kun taas D* osaa reagoida tähän paremmin. 

* Mitä syötteitä ohjelma saa ja miten näitä käytetään
Tällä hetkellä ei mitään. Kaikki on kovakoodattua. Myöhemmin ainakin taulukon koko, ja ehkä joku tekstifilu josta selviää esteiden liikkuminen.

* Tavoitteena olevat aika- ja tilavaativuudet (m.m. O-analyysit)
A* itsessään venyy pahimmassa tapauksessa O(2^n). En löytänyt vertailuja keskimääräisestä aikavaativuudesta eri tilanteissa, mutta tavoitteena O(n log n) keskimäärin.
Algoritmi tarvitsee tietorakenteeksi minimikekoa, joka toteutetaan normaalina binäärikekona, jonka aikavaativuudeksi tulee siis O(log n), lukuunottamatta find-miniä. Merge toiminnallisuutta ei tarvita.

* Lähteet
Tiran luentokalvot.
Wikipedian pseudokoodi A*:sta